package net.tlotd.roads_n_vehicles.config;

import com.mojang.datafixers.util.Pair;
import net.tlotd.roads_n_vehicles.TLOTDRoadsnVehicles;

public class ModConfigs {
    public static SimpleConfig CONFIG;
    private static ModConfigProvider configs;

    public static boolean FORMER_TLOTD_REWARDS;

    public static void registerConfigs() {
        configs = new ModConfigProvider();
        createConfigs();

        CONFIG = SimpleConfig.of(TLOTDRoadsnVehicles.MOD_ID + "_config").provider(configs).request();

        assignConfigs();
    }

    private static void createConfigs() {
        configs.addKeyValuePair(new Pair<>("formerTlotdRewards", false), "boolean");
    }

    private static void assignConfigs() {
        FORMER_TLOTD_REWARDS = CONFIG.getOrDefault("formerTlotdRewards", false);

        System.out.println("All " + configs.getConfigsList().size() + " " + TLOTDRoadsnVehicles.MOD_ID + " configs have been set properly");
    }
}
