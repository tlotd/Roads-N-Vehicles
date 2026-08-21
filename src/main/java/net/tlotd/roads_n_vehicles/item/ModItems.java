package net.tlotd.roads_n_vehicles.item;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.tlotd.roads_n_vehicles.TLOTDRoadsnVehicles;
import net.tlotd.roads_n_vehicles.item.custom.CarItem;

import java.util.function.Function;

public class ModItems {
    public static final Item MUSCLE_CAR_STALLION = registerItem("muscle_car_stallion", CarItem::new, new Item.Properties());
    public static final Item MUSCLE_CAR_FIRECHARGE = registerItem("muscle_car_firecharge", CarItem::new, new Item.Properties());
    public static final Item VHS_CASSETTE_1 = registerItem("vhs_cassette_1", Item::new, new Item.Properties().stacksTo(1).rarity(Rarity.RARE));
    public static final Item GAME_CARTRIDGE_1 = registerItem("game_cartridge_1", Item::new, new Item.Properties().stacksTo(1).rarity(Rarity.RARE));
    public static final Item ENGINE_V8_BIG_BLOCK = registerItem("engine_v8_big_block", Item::new, new Item.Properties().stacksTo(1));
    public static final Item TRANSMISSION = registerItem("transmission", Item::new, new Item.Properties().stacksTo(1));
    public static final Item LEATHER_SEAT = registerItem("leather_seat", Item::new, new Item.Properties().stacksTo(1));
    public static final Item WHEEL = registerItem("wheel", Item::new, new Item.Properties().stacksTo(1));
    public static final Item SUSPENSION = registerItem("suspension", Item::new, new Item.Properties().stacksTo(1));
    public static final Item CHASSIS = registerItem("chassis", Item::new, new Item.Properties().stacksTo(1));
    public static final Item CAR_BODY_STALLION = registerItem("car_body_stallion", Item::new, new Item.Properties().stacksTo(1));
    public static final Item CAR_BODY_FIRECHARGE = registerItem("car_body_firecharge", Item::new, new Item.Properties().stacksTo(1));

    private static Item registerItem(String name, Function<Item.Properties, Item> factory, Item.Properties properties) {
        ResourceLocation id = ResourceLocation.fromNamespaceAndPath(TLOTDRoadsnVehicles.MOD_ID, name);
        ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, id);
        Item item = factory.apply(properties.setId(key));
        return Registry.register(BuiltInRegistries.ITEM, key, item);
    }

    public static void registerModItems() {
        TLOTDRoadsnVehicles.LOGGER.info("Registering Mod Items for " + TLOTDRoadsnVehicles.MOD_ID);
    }
}