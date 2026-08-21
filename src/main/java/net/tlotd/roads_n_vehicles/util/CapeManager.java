package net.tlotd.roads_n_vehicles.util;

import com.mojang.blaze3d.platform.NativeImage;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.core.ClientAsset;
import net.minecraft.resources.Identifier;

import java.io.InputStream;
import java.net.URI;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public final class CapeManager {

    private static final Minecraft MC = Minecraft.getInstance();
    private static final Map<String, ClientAsset.Texture> CAPE_CACHE = new ConcurrentHashMap<>();
    private static final Map<String, Long> CACHE_TIME = new ConcurrentHashMap<>();
    private static final Set<String> PENDING = ConcurrentHashMap.newKeySet();
    private static final long CACHE_TTL = TimeUnit.MINUTES.toMillis(10);
    private static final String BASE_URL = "https://tlotd.net/api/minecraft/cape/";
    private static final ExecutorService EXECUTOR = Executors.newCachedThreadPool();

    private CapeManager() {
    }

    public static ClientAsset.Texture getCape(UUID uuid) {
        if (uuid == null) {
            return null;
        }
        String uuidString = uuid.toString();
        long now = System.currentTimeMillis();
        ClientAsset.Texture cached = CAPE_CACHE.get(uuidString);
        if (cached != null) {
            if (now - CACHE_TIME.getOrDefault(uuidString, 0L) < CACHE_TTL) {
                return cached;
            }
            CAPE_CACHE.remove(uuidString);
            CACHE_TIME.remove(uuidString);
        }
        requestCape(uuid);
        return null;
    }

    public static void requestCape(UUID uuid) {
        if (uuid == null) {
            return;
        }
        String uuidString = uuid.toString();
        if (PENDING.contains(uuidString)) {
            return;
        }
        if (CAPE_CACHE.containsKey(uuidString)) {
            return;
        }
        PENDING.add(uuidString);
        EXECUTOR.submit(() -> fetchCape(uuid));
    }

    private static void fetchCape(UUID uuid) {
        String uuidString = uuid.toString();
        String url = BASE_URL + uuidString;
        try (InputStream stream = URI.create(url).toURL().openStream()) {
            NativeImage image = NativeImage.read(stream);
            Identifier id = Identifier.fromNamespaceAndPath("tlotd", "cape/" + uuidString.replace("-", ""));
            ClientAsset.DownloadedTexture texture = new ClientAsset.DownloadedTexture(id, url);
            MC.execute(() -> {
                try {
                    DynamicTexture dynamicTexture = new DynamicTexture(texture.texturePath()::toString, image);
                    MC.getTextureManager().register(texture.texturePath(), dynamicTexture);
                    CAPE_CACHE.put(uuidString, texture);
                    CACHE_TIME.put(uuidString, System.currentTimeMillis());
                } catch (Exception e) {
                    image.close();
                    e.printStackTrace();
                } finally {
                    PENDING.remove(uuidString);
                }
            });

        } catch (Exception e) {
            PENDING.remove(uuidString);
            e.printStackTrace();
        }
    }

    public static void clearCache() {
        CAPE_CACHE.clear();
        CACHE_TIME.clear();
        PENDING.clear();
    }
}