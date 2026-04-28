package net.tlotd.roads_n_vehicles.util;

import com.mojang.blaze3d.platform.NativeImage;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.AbstractTexture;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.resources.ResourceLocation;

import java.io.InputStream;
import java.net.URL;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CapeManager {

        private static final Minecraft MC = Minecraft.getInstance();
        private static final Map<String, ResourceLocation> CAPE_CACHE = new ConcurrentHashMap<>();
        private static final Map<String, Long> CACHE_TIME = new ConcurrentHashMap<>();
        private static final Set<String> PENDING = ConcurrentHashMap.newKeySet();
        private static final long CACHE_TTL = TimeUnit.MINUTES.toMillis(10);
        private static final ResourceLocation NO_CAPE = ResourceLocation.fromNamespaceAndPath("tlotd", "no_cape");
        private static final ExecutorService EXECUTOR = Executors.newCachedThreadPool();
        private static final String BASE_URL = "https://tlotd.net/minecraft/capes/";

        public static ResourceLocation getCape(String uuid) {
            if (uuid == null || uuid.isEmpty()) return null;
            long now = System.currentTimeMillis();
            ResourceLocation cached = CAPE_CACHE.get(uuid);
            if (cached != null) {
                if (now - CACHE_TIME.getOrDefault(uuid, 0L) < CACHE_TTL) {
                    return cached == NO_CAPE ? null : cached;
                }
            }
            requestCape(uuid);
            return null;
        }

        public static void requestCape(String uuid) {
            if (uuid == null || uuid.isEmpty()) return;
            if (PENDING.contains(uuid)) return;
            if (CAPE_CACHE.containsKey(uuid)) return;
            PENDING.add(uuid);
            EXECUTOR.submit(() -> fetchCape(uuid));
        }
        private static void fetchCape(String uuid) {
            String url = BASE_URL + uuid + ".png";
            try (InputStream stream = new URL(url).openStream()) {
                NativeImage image = NativeImage.read(stream);
                AbstractTexture texture = new DynamicTexture(image);
                ResourceLocation id = ResourceLocation.fromNamespaceAndPath("test", "cape/" + uuid.replace("-", ""));
                MC.execute(() -> {
                    try {
                        MC.getTextureManager().register(id, texture);
                        CAPE_CACHE.put(uuid, id);
                        CACHE_TIME.put(uuid, System.currentTimeMillis());
                    } catch (Exception e) {
                        CAPE_CACHE.put(uuid, NO_CAPE);
                        CACHE_TIME.put(uuid, System.currentTimeMillis());
                    } finally {
                        PENDING.remove(uuid);
                    }
                });

            } catch (Exception e) {
                CAPE_CACHE.put(uuid, NO_CAPE);
                CACHE_TIME.put(uuid, System.currentTimeMillis());
                PENDING.remove(uuid);
            }
        }

        public static void clearCache() {
            CAPE_CACHE.clear();
            CACHE_TIME.clear();
            PENDING.clear();
        }
    }