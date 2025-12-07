package net.tlotd.roads_n_vehicles.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.tlotd.roads_n_vehicles.TLOTDRoadsnVehicles;
import net.tlotd.roads_n_vehicles.block.ModBlocks;
import net.tlotd.roads_n_vehicles.compat.CompatModsCheck;

public class ModItemGroups {

    public static final Identifier DEFAULT_FONT_ID = new Identifier("minecraft", "default");
    public static final Identifier MODS_FONT_ID = new Identifier("roads-n-vehicles", "mods");

    public static final ItemGroup TLOTD_4_ROADS_N_VEHICLES_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TLOTDRoadsnVehicles.MOD_ID, "4_items"),
            FabricItemGroup.builder().displayName(Text.literal("\uE001 ").styled(style -> style.withFont(MODS_FONT_ID).withFormatting(Formatting.WHITE)).append(Text.translatable("itemgroup.roads-n-vehicles.items").styled(style -> style.withFont(DEFAULT_FONT_ID))))
                    .icon(() -> new ItemStack(ModBlocks.ROADWORKS_SIGN)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.ASPHALT);
                        entries.add(ModBlocks.ASPHALT_SLAB);
                        entries.add(ModBlocks.ASPHALT_STAIRS);

                        entries.add(ModBlocks.ASPHALT_LINE_MARKING_ARROW);
                        entries.add(ModBlocks.ASPHALT_LINE_MARKING_STRAIGHT);
                        entries.add(ModBlocks.ASPHALT_LINE_MARKING_CORNER);
                        entries.add(ModBlocks.ASPHALT_LINE_MARKING_T_JUNCTION);
                        entries.add(ModBlocks.ASPHALT_LINE_MARKING_CROSS);
                        entries.add(ModBlocks.ASPHALT_SLAB_LINE_MARKING_ARROW);
                        entries.add(ModBlocks.ASPHALT_SLAB_LINE_MARKING_STRAIGHT);
                        entries.add(ModBlocks.ASPHALT_SLAB_LINE_MARKING_CORNER);
                        entries.add(ModBlocks.ASPHALT_SLAB_LINE_MARKING_T_JUNCTION);
                        entries.add(ModBlocks.ASPHALT_SLAB_LINE_MARKING_CROSS);

                        entries.add(ModBlocks.ASPHALT_YELLOW_LINE_MARKING_ARROW);
                        entries.add(ModBlocks.ASPHALT_YELLOW_LINE_MARKING_STRAIGHT);
                        entries.add(ModBlocks.ASPHALT_YELLOW_LINE_MARKING_CORNER);
                        entries.add(ModBlocks.ASPHALT_YELLOW_LINE_MARKING_T_JUNCTION);
                        entries.add(ModBlocks.ASPHALT_YELLOW_LINE_MARKING_CROSS);
                        entries.add(ModBlocks.ASPHALT_SLAB_YELLOW_LINE_MARKING_ARROW);
                        entries.add(ModBlocks.ASPHALT_SLAB_YELLOW_LINE_MARKING_STRAIGHT);
                        entries.add(ModBlocks.ASPHALT_SLAB_YELLOW_LINE_MARKING_CORNER);
                        entries.add(ModBlocks.ASPHALT_SLAB_YELLOW_LINE_MARKING_T_JUNCTION);
                        entries.add(ModBlocks.ASPHALT_SLAB_YELLOW_LINE_MARKING_CROSS);

                        entries.add(ModBlocks.ASPHALT_DOUBLE_LINE_MARKING_STRAIGHT);
                        entries.add(ModBlocks.ASPHALT_DOUBLE_LINE_MARKING_CORNER);
                        entries.add(ModBlocks.ASPHALT_DOUBLE_YELLOW_LINE_MARKING_STRAIGHT);
                        entries.add(ModBlocks.ASPHALT_DOUBLE_YELLOW_LINE_MARKING_CORNER);
                        entries.add(ModBlocks.ASPHALT_DOUBLE_RED_LINE_MARKING_STRAIGHT);
                        entries.add(ModBlocks.ASPHALT_DOUBLE_RED_LINE_MARKING_CORNER);

                        entries.add(ModBlocks.TOWN_SIGN);
                        entries.add(ModBlocks.COAT_OF_ARMS);

                        entries.add(ModBlocks.ROUND_SIGN);

                        entries.add(ModBlocks.SPEED_LIMIT_10_SIGN);
                        entries.add(ModBlocks.SPEED_LIMIT_20_SIGN);
                        entries.add(ModBlocks.SPEED_LIMIT_30_SIGN);
                        entries.add(ModBlocks.SPEED_LIMIT_40_SIGN);
                        entries.add(ModBlocks.SPEED_LIMIT_50_SIGN);
                        entries.add(ModBlocks.SPEED_LIMIT_60_SIGN);
                        entries.add(ModBlocks.SPEED_LIMIT_70_SIGN);
                        entries.add(ModBlocks.SPEED_LIMIT_80_SIGN);
                        entries.add(ModBlocks.SPEED_LIMIT_90_SIGN);
                        entries.add(ModBlocks.SPEED_LIMIT_100_SIGN);
                        entries.add(ModBlocks.SPEED_LIMIT_110_SIGN);
                        entries.add(ModBlocks.SPEED_LIMIT_120_SIGN);
                        entries.add(ModBlocks.SPEED_LIMIT_130_SIGN);
                        entries.add(ModBlocks.SPEED_LIMIT_140_SIGN);

                        entries.add(ModBlocks.SPEED_LIMIT_10_END_SIGN);
                        entries.add(ModBlocks.SPEED_LIMIT_20_END_SIGN);
                        entries.add(ModBlocks.SPEED_LIMIT_30_END_SIGN);
                        entries.add(ModBlocks.SPEED_LIMIT_40_END_SIGN);
                        entries.add(ModBlocks.SPEED_LIMIT_50_END_SIGN);
                        entries.add(ModBlocks.SPEED_LIMIT_60_END_SIGN);
                        entries.add(ModBlocks.SPEED_LIMIT_70_END_SIGN);
                        entries.add(ModBlocks.SPEED_LIMIT_80_END_SIGN);
                        entries.add(ModBlocks.SPEED_LIMIT_90_END_SIGN);
                        entries.add(ModBlocks.SPEED_LIMIT_100_END_SIGN);
                        entries.add(ModBlocks.SPEED_LIMIT_110_END_SIGN);
                        entries.add(ModBlocks.SPEED_LIMIT_120_END_SIGN);
                        entries.add(ModBlocks.SPEED_LIMIT_130_END_SIGN);
                        entries.add(ModBlocks.SPEED_LIMIT_140_END_SIGN);

                        entries.add(ModBlocks.END_OF_ALL_PREVIOUSLY_SIGNED_RESTRICTIONS_SIGN);

                        entries.add(ModBlocks.NO_VEHICLES_SIGN);
                        entries.add(ModBlocks.NO_ENTRY_SIGN);

                        entries.add(ModBlocks.NO_STOPPING_SIGN);
                        entries.add(ModBlocks.NO_PARKING_SIGN);

                        entries.add(ModBlocks.GO_STRAIGHT_SIGN);
                        entries.add(ModBlocks.GO_LEFT_SIGN);
                        entries.add(ModBlocks.GO_RIGHT_SIGN);
                        entries.add(ModBlocks.TURN_LEFT_SIGN);
                        entries.add(ModBlocks.TURN_RIGHT_SIGN);
                        entries.add(ModBlocks.GO_STRAIGHT_OR_LEFT_SIGN);
                        entries.add(ModBlocks.GO_STRAIGHT_OR_RIGHT_SIGN);
                        entries.add(ModBlocks.GO_LEFT_OR_RIGHT_SIGN);
                        entries.add(ModBlocks.PASS_LEFT_SIGN);
                        entries.add(ModBlocks.PASS_RIGHT_SIGN);
                        entries.add(ModBlocks.ROUNDABOUT_SIGN);
                        entries.add(ModBlocks.ROUNDABOUT_FLIPPED_SIGN);
                        entries.add(ModBlocks.NO_LEFT_TURN_SIGN);
                        entries.add(ModBlocks.NO_RIGHT_TURN_SIGN);
                        entries.add(ModBlocks.NO_U_TURN_SIGN);

                        entries.add(ModBlocks.STOP_SIGN);
                        entries.add(ModBlocks.YIELD_SIGN);
                        entries.add(ModBlocks.YIELD_US_SIGN);
                        entries.add(ModBlocks.DIAMOND_SIGN);
                        entries.add(ModBlocks.PRIORITY_ROAD_SIGN);
                        entries.add(ModBlocks.END_OF_PRIORITY_ROAD_SIGN);
                        entries.add(ModBlocks.TURN_LEFT_US_SIGN);
                        entries.add(ModBlocks.TURN_RIGHT_US_SIGN);
                        entries.add(ModBlocks.NO_THROUGH_ROAD_US_SIGN);

                        entries.add(ModBlocks.TRIANGLE_SIGN);
                        entries.add(ModBlocks.RIGHT_OF_WAY_SIGN);
                        entries.add(ModBlocks.PRIORITY_RIGHT_SIGN);
                        entries.add(ModBlocks.DANGER_SIGN);
                        entries.add(ModBlocks.ROADWORKS_SIGN);
                        entries.add(ModBlocks.RAILROAD_CROSSING_SIGN);
                        entries.add(ModBlocks.UNEVEN_ROAD_SIGN);
                        entries.add(ModBlocks.ONCOMING_TRAFFIC_SIGN);
                        entries.add(ModBlocks.ASCEND_SIGN);
                        entries.add(ModBlocks.DECEND_SIGN);
                        entries.add(ModBlocks.CURVE_LEFT_SIGN);
                        entries.add(ModBlocks.CURVE_RIGHT_SIGN);
                        entries.add(ModBlocks.DOUBLE_CURVE_LEFT_SIGN);
                        entries.add(ModBlocks.DOUBLE_CURVE_RIGHT_SIGN);
                        entries.add(ModBlocks.ROAD_NARROWING_SIGN);
                        entries.add(ModBlocks.ROAD_NARROWING_LEFT_SIGN);
                        entries.add(ModBlocks.ROAD_NARROWING_RIGHT_SIGN);
                        entries.add(ModBlocks.WILD_ANIMALS_LEFT_SIGN);
                        entries.add(ModBlocks.WILD_ANIMALS_RIGHT_SIGN);
                        entries.add(ModBlocks.WILD_DINOSAURS_SIGN);

                        entries.add(ModBlocks.SQUARE_SIGN);
                        entries.add(ModBlocks.DIRECTION_SIGN_LEFT_CURVE);
                        entries.add(ModBlocks.DIRECTION_SIGN_RIGHT_CURVE);
                        entries.add(ModBlocks.NO_THROUGH_ROAD_SIGN);
                        entries.add(ModBlocks.PEDESTRIAN_CROSSING_LEFT_SIGN);
                        entries.add(ModBlocks.PEDESTRIAN_CROSSING_RIGHT_SIGN);
                        entries.add(ModBlocks.EXPRESSWAY_SIGN);
                        entries.add(ModBlocks.MOTORWAY_SIGN);
                        entries.add(ModBlocks.EXPRESSWAY_END_SIGN);
                        entries.add(ModBlocks.MOTORWAY_END_SIGN);
                        entries.add(ModBlocks.PARKING_SIGN);
                        entries.add(ModBlocks.PARKING_GARAGE_SIGN);

                        entries.add(ModBlocks.PRIORITY_OVER_ONCOMING_TRAFFIC_SIGN);
                        entries.add(ModBlocks.GIVE_WAY_TO_ONCOMING_TRAFFIC_SIGN);

                        entries.add(ModBlocks.NO_LEFT_TURN_US_SIGN);
                        entries.add(ModBlocks.NO_RIGHT_TURN_US_SIGN);
                        entries.add(ModBlocks.NO_U_TURN_US_SIGN);
                        entries.add(ModBlocks.NO_ENTRY_US_SIGN);

                        entries.add(ModBlocks.US_ROUTE_1_SIGN);
                        entries.add(ModBlocks.US_ROUTE_2_SIGN);
                        entries.add(ModBlocks.US_ROUTE_3_SIGN);
                        entries.add(ModBlocks.US_ROUTE_4_SIGN);
                        entries.add(ModBlocks.US_ROUTE_5_SIGN);
                        entries.add(ModBlocks.US_ROUTE_6_SIGN);
                        entries.add(ModBlocks.US_ROUTE_7_SIGN);
                        entries.add(ModBlocks.US_ROUTE_8_SIGN);
                        entries.add(ModBlocks.US_ROUTE_9_SIGN);

                        entries.add(ModBlocks.TALL_RECTANGULAR_SIGN);
                        entries.add(ModBlocks.SPEED_LIMIT_US_5_SIGN);
                        entries.add(ModBlocks.SPEED_LIMIT_US_10_SIGN);
                        entries.add(ModBlocks.SPEED_LIMIT_US_15_SIGN);
                        entries.add(ModBlocks.SPEED_LIMIT_US_20_SIGN);
                        entries.add(ModBlocks.SPEED_LIMIT_US_25_SIGN);
                        entries.add(ModBlocks.SPEED_LIMIT_US_30_SIGN);
                        entries.add(ModBlocks.SPEED_LIMIT_US_35_SIGN);
                        entries.add(ModBlocks.SPEED_LIMIT_US_40_SIGN);
                        entries.add(ModBlocks.SPEED_LIMIT_US_45_SIGN);
                        entries.add(ModBlocks.SPEED_LIMIT_US_50_SIGN);
                        entries.add(ModBlocks.SPEED_LIMIT_US_55_SIGN);
                        entries.add(ModBlocks.SPEED_LIMIT_US_60_SIGN);
                        entries.add(ModBlocks.SPEED_LIMIT_US_65_SIGN);
                        entries.add(ModBlocks.SPEED_LIMIT_US_70_SIGN);
                        entries.add(ModBlocks.SPEED_LIMIT_US_75_SIGN);
                        entries.add(ModBlocks.SPEED_LIMIT_US_80_SIGN);
                        entries.add(ModBlocks.SPEED_LIMIT_US_85_SIGN);
                        entries.add(ModBlocks.SPEED_LIMIT_US_90_SIGN);
                        entries.add(ModBlocks.SPEED_LIMIT_US_95_SIGN);

                        entries.add(ModBlocks.VERTICAL_SIGN);
                        entries.add(ModBlocks.GUIDING_BEACON_SIGN_LEFT);
                        entries.add(ModBlocks.GUIDING_BEACON_SIGN_RIGHT);
                        entries.add(ModBlocks.GUIDING_BEACON_SIGN_MIDDLE);
                        entries.add(ModBlocks.ANNOUNCEMENT_BEACON_RAILROAD_SIGN_SINGLE_STRIPED_LEFT);
                        entries.add(ModBlocks.ANNOUNCEMENT_BEACON_RAILROAD_SIGN_DOUBLE_STRIPED_LEFT);
                        entries.add(ModBlocks.ANNOUNCEMENT_BEACON_RAILROAD_SIGN_TRIPLE_STRIPED_LEFT);
                        entries.add(ModBlocks.ANNOUNCEMENT_BEACON_RAILROAD_SIGN_SINGLE_STRIPED_RIGHT);
                        entries.add(ModBlocks.ANNOUNCEMENT_BEACON_RAILROAD_SIGN_DOUBLE_STRIPED_RIGHT);
                        entries.add(ModBlocks.ANNOUNCEMENT_BEACON_RAILROAD_SIGN_TRIPLE_STRIPED_RIGHT);
                        entries.add(ModBlocks.ANNOUNCEMENT_BEACON_SIGN_SINGLE_STRIPED);
                        entries.add(ModBlocks.ANNOUNCEMENT_BEACON_SIGN_DOUBLE_STRIPED);
                        entries.add(ModBlocks.ANNOUNCEMENT_BEACON_SIGN_TRIPLE_STRIPED);
                        entries.add(ModBlocks.ANNOUNCEMENT_BEACON_MOTORWAY_SIGN_SINGLE_STRIPED);
                        entries.add(ModBlocks.ANNOUNCEMENT_BEACON_MOTORWAY_SIGN_DOUBLE_STRIPED);
                        entries.add(ModBlocks.ANNOUNCEMENT_BEACON_MOTORWAY_SIGN_TRIPLE_STRIPED);

                        entries.add(ModBlocks.RAILWAY_CROSSBUCK_SIGN);

                        if (CompatModsCheck.TLOTD) {
                            entries.add(ModItems.VHS_CASSETTE_1);
                            entries.add(ModItems.GAME_CARTRIDGE_1);
                        }

                        entries.add(ModItems.ENGINE_V8_BIG_BLOCK);
                        entries.add(ModItems.TRANSMISSION);
                        entries.add(ModItems.LEATHER_SEAT);
                        entries.add(ModItems.WHEEL);
                        entries.add(ModItems.SUSPENSION);
                        entries.add(ModItems.CHASSIS);
                        entries.add(ModBlocks.LICENSE_PLATE);
                        entries.add(ModItems.CAR_BODY_STALLION);
                        entries.add(ModItems.CAR_BODY_FIRECHARGE);
                        entries.add(ModItems.MUSCLE_CAR_STALLION);
                        entries.add(ModItems.MUSCLE_CAR_FIRECHARGE);

                        entries.add(ModBlocks.GUARDRAIL);
                        entries.add(ModBlocks.GUARDRAIL_OUTER_CORNER);
                        entries.add(ModBlocks.GUARDRAIL_INNER_CORNER);

                        entries.add(ModBlocks.DELINEATOR);

                        entries.add(ModBlocks.PORTABLE_TRAFFIC_DELINEATOR);
                        entries.add(ModBlocks.PORTABLE_TRAFFIC_DELINEATOR_2);
                        entries.add(ModBlocks.PORTABLE_TRAFFIC_DELINEATOR_3);
                        entries.add(ModBlocks.PORTABLE_TRAFFIC_DELINEATOR_4);

                        entries.add(ModBlocks.TRAFFIC_CONE);
                        entries.add(ModBlocks.TRAFFIC_LIGHT);
                        entries.add(ModBlocks.YELLOW_TRAFFIC_LIGHT);
                        entries.add(ModBlocks.TRAFFIC_LIGHT_CONTROLLER);

                        entries.add(ModBlocks.FIRE_HYDRANT);
                    }).build());

    public static void registerItemGroups(){
        TLOTDRoadsnVehicles.LOGGER.info("Registering Item Groups for " + TLOTDRoadsnVehicles.MOD_ID);
    }
}