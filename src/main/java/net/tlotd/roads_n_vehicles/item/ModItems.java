package net.tlotd.roads_n_vehicles.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.tlotd.roads_n_vehicles.TLOTDRoadsnVehicles;
import net.tlotd.roads_n_vehicles.entity.ModEntities;

public class ModItems {
    public static final Item MUSCLE_CAR_KEYS = registerItem("muscle_car_keys", new SpawnEggItem(ModEntities.MUSCLE_CAR, 0xffffff, 0xffffff, new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TLOTDRoadsnVehicles.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TLOTDRoadsnVehicles.LOGGER.info("Registering Mod Items for " + TLOTDRoadsnVehicles.MOD_ID);
    }
}
