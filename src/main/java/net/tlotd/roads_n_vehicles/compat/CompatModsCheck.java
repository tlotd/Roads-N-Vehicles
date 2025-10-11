package net.tlotd.roads_n_vehicles.compat;

import net.fabricmc.loader.api.FabricLoader;

public class CompatModsCheck {
    public static final boolean FORGE = FabricLoader.getInstance().isModLoaded("forge");
    public static final boolean FABRIC = FabricLoader.getInstance().isModLoaded("fabric");
    public static final boolean TLOTD = FabricLoader.getInstance().isModLoaded("tlotd");
}