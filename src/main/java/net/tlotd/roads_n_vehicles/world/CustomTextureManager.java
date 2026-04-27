package net.tlotd.roads_n_vehicles.world;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.Tag;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.saveddata.SavedData;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class CustomTextureManager extends SavedData {
    private final Map<UUID, Integer> textureMap = new HashMap<>();
    public static final String DATA_NAME = "TLOTD_RnV_Textures";
    public static CustomTextureManager get(MinecraftServer server) {
        ServerLevel overworld = server.overworld();
        return overworld.getDataStorage().computeIfAbsent(
                CustomTextureManager::load,
                CustomTextureManager::new,
                DATA_NAME
        );
    }
    public static CustomTextureManager load(CompoundTag tag) {
        CustomTextureManager manager = new CustomTextureManager();
        ListTag list = tag.getList("Textures", Tag.TAG_COMPOUND);
        for (int i = 0; i < list.size(); i++) {
            CompoundTag nbt = list.getCompound(i);
            UUID uuid = nbt.getUUID("Player");
            int texture = nbt.getInt("Texture");
            manager.textureMap.put(uuid, texture);
        }
        return manager;
    }

    @Override
    public CompoundTag save(CompoundTag tag) {
        ListTag list = new ListTag();
        for (Map.Entry<UUID, Integer> entry : textureMap.entrySet()) {
            CompoundTag textureData = new CompoundTag();
            textureData.putUUID("Player", entry.getKey());
            textureData.putInt("Texture", entry.getValue());
            list.add(textureData);
        }
        tag.put("Textures", list);
        return tag;
    }

    public void setTexture(UUID player, int textureId) {
        textureMap.put(player, textureId);
        setDirty();
    }

    public int getTexture(UUID player) {
        return textureMap.getOrDefault(player, -1);
    }

    public Map<UUID, Integer> getAll() {
        return Collections.unmodifiableMap(textureMap);
    }

    public boolean removeTexture(UUID player) {
        if (textureMap.remove(player) != null) {
            setDirty();
            return true;
        }
        return false;
    }

    public boolean hasTexture(UUID player) {
        return textureMap.containsKey(player);
    }
}