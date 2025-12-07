package net.tlotd.roads_n_vehicles.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.tlotd.roads_n_vehicles.TLOTDRoadsnVehicles;
import net.tlotd.roads_n_vehicles.entity.ModEntities;
import net.tlotd.roads_n_vehicles.item.custom.VHSCassetteItem;

public class ModItems {
    public static final Item MUSCLE_CAR_STALLION = registerItem("muscle_car_stallion", new SpawnEggItem(ModEntities.MUSCLE_CAR_STALLION, 0xffffff, 0xffffff, new FabricItemSettings()));
    public static final Item MUSCLE_CAR_FIRECHARGE = registerItem("muscle_car_firecharge", new SpawnEggItem(ModEntities.MUSCLE_CAR_FIRECHARGE, 0xffffff, 0xffffff, new FabricItemSettings()));
    public static final Item VHS_CASSETTE_1 = registerItem("vhs_cassette_1", new VHSCassetteItem(new FabricItemSettings().rarity(Rarity.RARE).maxCount(1)));
    public static final Item GAME_CARTRIDGE_1 = registerItem("game_cartridge_1", new VHSCassetteItem(new FabricItemSettings().rarity(Rarity.RARE).maxCount(1)));
    public static final Item ENGINE_V8_BIG_BLOCK = registerItem("engine_v8_big_block", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item TRANSMISSION = registerItem("transmission", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item LEATHER_SEAT = registerItem("leather_seat", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item WHEEL = registerItem("wheel", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item SUSPENSION = registerItem("suspension", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item CHASSIS = registerItem("chassis", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item CAR_BODY_STALLION = registerItem("car_body_stallion", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item CAR_BODY_FIRECHARGE = registerItem("car_body_firecharge", new Item(new FabricItemSettings().maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TLOTDRoadsnVehicles.MOD_ID, name), item);

    }

    public static void registerModItems() {
        TLOTDRoadsnVehicles.LOGGER.info("Registering Mod Items for " + TLOTDRoadsnVehicles.MOD_ID);
    }
}
