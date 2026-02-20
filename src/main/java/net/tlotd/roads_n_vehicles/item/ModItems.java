package net.tlotd.roads_n_vehicles.item;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.tlotd.roads_n_vehicles.TLOTDRoadsnVehicles;
import net.tlotd.roads_n_vehicles.item.custom.VHSCassetteItem;

import java.util.function.Function;

public class ModItems {
    //public static final Item MUSCLE_CAR_STALLION = registerItem("muscle_car_stallion", new SpawnEggItem(ModEntities.MUSCLE_CAR_STALLION, 0xffffff, 0xffffff, props));
    //public static final Item MUSCLE_CAR_FIRECHARGE = registerItem("muscle_car_firecharge", new SpawnEggItem(ModEntities.MUSCLE_CAR_FIRECHARGE, 0xffffff, 0xffffff, props));
    public static final Item MUSCLE_CAR_STALLION = registerItem("muscle_car_stallion", props -> new Item(props.stacksTo(1)));
    public static final Item MUSCLE_CAR_FIRECHARGE = registerItem("muscle_car_firecharge", props -> new Item(props.stacksTo(1)));
    public static final Item VHS_CASSETTE_1 = registerItem("vhs_cassette_1", props -> new VHSCassetteItem(props.rarity(Rarity.RARE).stacksTo(1)));
    public static final Item GAME_CARTRIDGE_1 = registerItem("game_cartridge_1", props -> new VHSCassetteItem(props.rarity(Rarity.RARE).stacksTo(1)));
    public static final Item ENGINE_V8_BIG_BLOCK = registerItem("engine_v8_big_block", props -> new Item(props.stacksTo(1)));
    public static final Item TRANSMISSION = registerItem("transmission", props -> new Item(props.stacksTo(1)));
    public static final Item LEATHER_SEAT = registerItem("leather_seat", props -> new Item(props.stacksTo(1)));
    public static final Item WHEEL = registerItem("wheel", props -> new Item(props.stacksTo(1)));
    public static final Item SUSPENSION = registerItem("suspension", props -> new Item(props.stacksTo(1)));
    public static final Item CHASSIS = registerItem("chassis", props -> new Item(props.stacksTo(1)));
    public static final Item CAR_BODY_STALLION = registerItem("car_body_stallion", props -> new Item(props.stacksTo(1)));
    public static final Item CAR_BODY_FIRECHARGE = registerItem("car_body_firecharge", props -> new Item(props.stacksTo(1)));

    private static Item registerItem(String name, Function<Item.Properties, Item> factory) {
        ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(TLOTDRoadsnVehicles.MOD_ID, name));
        Item item = factory.apply(new Item.Properties().setId(key));
        return Registry.register(BuiltInRegistries.ITEM, key.identifier(), item);
    }

    public static void registerModItems() {
        TLOTDRoadsnVehicles.LOGGER.info("Registering Mod Items for " + TLOTDRoadsnVehicles.MOD_ID);
    }
}