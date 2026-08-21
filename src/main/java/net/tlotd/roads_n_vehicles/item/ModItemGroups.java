package net.tlotd.roads_n_vehicles.item;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.ChatFormatting;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.FontDescription;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.tlotd.roads_n_vehicles.TLOTDRoadsnVehicles;
import net.tlotd.roads_n_vehicles.block.ModBlocks;
import net.tlotd.roads_n_vehicles.compat.CompatModsCheck;

public class ModItemGroups {

    public static final FontDescription.Resource DEFAULT_FONT_ID = new FontDescription.Resource(Identifier.fromNamespaceAndPath("minecraft", "default"));
    public static final FontDescription.Resource MODS_FONT_ID = new FontDescription.Resource(Identifier.fromNamespaceAndPath(TLOTDRoadsnVehicles.MOD_ID, "mods"));

    public static final ResourceKey<CreativeModeTab> TLOTD_4_ROADS_N_VEHICLES_GROUP_KEY = ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), Identifier.fromNamespaceAndPath(TLOTDRoadsnVehicles.MOD_ID, "4_items"));

    public static final CreativeModeTab TLOTD_4_ROADS_N_VEHICLES_GROUP = FabricCreativeModeTab.builder().title(Component.literal("\uE001 ").withStyle(style -> style.withFont(MODS_FONT_ID).withColor(ChatFormatting.WHITE)).append(Component.translatable("itemgroup.roads-n-vehicles.items").withStyle(style -> style.withFont(DEFAULT_FONT_ID)))).icon(() -> new ItemStack(ModBlocks.ROADWORKS_SIGN)).displayItems((parameters, output) -> {
        output.accept(ModBlocks.ASPHALT);
        output.accept(ModBlocks.ASPHALT_SLAB);
        output.accept(ModBlocks.ASPHALT_STAIRS);

        output.accept(ModBlocks.ASPHALT_LINE_MARKING_ARROW);
        output.accept(ModBlocks.ASPHALT_LINE_MARKING_STRAIGHT);
        output.accept(ModBlocks.ASPHALT_LINE_MARKING_CORNER);
        output.accept(ModBlocks.ASPHALT_LINE_MARKING_T_JUNCTION);
        output.accept(ModBlocks.ASPHALT_LINE_MARKING_CROSS);
        output.accept(ModBlocks.ASPHALT_SLAB_LINE_MARKING_ARROW);
        output.accept(ModBlocks.ASPHALT_SLAB_LINE_MARKING_STRAIGHT);
        output.accept(ModBlocks.ASPHALT_SLAB_LINE_MARKING_CORNER);
        output.accept(ModBlocks.ASPHALT_SLAB_LINE_MARKING_T_JUNCTION);
        output.accept(ModBlocks.ASPHALT_SLAB_LINE_MARKING_CROSS);

        output.accept(ModBlocks.ASPHALT_YELLOW_LINE_MARKING_ARROW);
        output.accept(ModBlocks.ASPHALT_YELLOW_LINE_MARKING_STRAIGHT);
        output.accept(ModBlocks.ASPHALT_YELLOW_LINE_MARKING_CORNER);
        output.accept(ModBlocks.ASPHALT_YELLOW_LINE_MARKING_T_JUNCTION);
        output.accept(ModBlocks.ASPHALT_YELLOW_LINE_MARKING_CROSS);
        output.accept(ModBlocks.ASPHALT_SLAB_YELLOW_LINE_MARKING_ARROW);
        output.accept(ModBlocks.ASPHALT_SLAB_YELLOW_LINE_MARKING_STRAIGHT);
        output.accept(ModBlocks.ASPHALT_SLAB_YELLOW_LINE_MARKING_CORNER);
        output.accept(ModBlocks.ASPHALT_SLAB_YELLOW_LINE_MARKING_T_JUNCTION);
        output.accept(ModBlocks.ASPHALT_SLAB_YELLOW_LINE_MARKING_CROSS);

        output.accept(ModBlocks.ASPHALT_DOUBLE_LINE_MARKING_STRAIGHT);
        output.accept(ModBlocks.ASPHALT_DOUBLE_LINE_MARKING_CORNER);
        output.accept(ModBlocks.ASPHALT_DOUBLE_LINE_MARKING_T_JUNCTION);
        output.accept(ModBlocks.ASPHALT_DOUBLE_LINE_MARKING_CROSS);
        output.accept(ModBlocks.ASPHALT_DOUBLE_YELLOW_LINE_MARKING_STRAIGHT);
        output.accept(ModBlocks.ASPHALT_DOUBLE_YELLOW_LINE_MARKING_CORNER);
        output.accept(ModBlocks.ASPHALT_DOUBLE_YELLOW_LINE_MARKING_T_JUNCTION);
        output.accept(ModBlocks.ASPHALT_DOUBLE_YELLOW_LINE_MARKING_CROSS);
        output.accept(ModBlocks.ASPHALT_DOUBLE_RED_LINE_MARKING_STRAIGHT);
        output.accept(ModBlocks.ASPHALT_DOUBLE_RED_LINE_MARKING_CORNER);
        output.accept(ModBlocks.ASPHALT_DOUBLE_RED_LINE_MARKING_T_JUNCTION);
        output.accept(ModBlocks.ASPHALT_DOUBLE_RED_LINE_MARKING_CROSS);

        output.accept(ModBlocks.MANHOLE_COVER);

        output.accept(ModBlocks.IRON_ROD);
        output.accept(ModBlocks.GUARDRAIL);
        output.accept(ModBlocks.GUARDRAIL_OUTER_CORNER);
        output.accept(ModBlocks.GUARDRAIL_INNER_CORNER);
        output.accept(ModBlocks.DELINEATOR);

        output.accept(ModBlocks.TOWN_SIGN);
        output.accept(ModBlocks.COAT_OF_ARMS);

        output.accept(ModBlocks.ROUND_SIGN);

        output.accept(ModBlocks.SPEED_LIMIT_10_SIGN);
        output.accept(ModBlocks.SPEED_LIMIT_20_SIGN);
        output.accept(ModBlocks.SPEED_LIMIT_30_SIGN);
        output.accept(ModBlocks.SPEED_LIMIT_40_SIGN);
        output.accept(ModBlocks.SPEED_LIMIT_50_SIGN);
        output.accept(ModBlocks.SPEED_LIMIT_60_SIGN);
        output.accept(ModBlocks.SPEED_LIMIT_70_SIGN);
        output.accept(ModBlocks.SPEED_LIMIT_80_SIGN);
        output.accept(ModBlocks.SPEED_LIMIT_90_SIGN);
        output.accept(ModBlocks.SPEED_LIMIT_100_SIGN);
        output.accept(ModBlocks.SPEED_LIMIT_110_SIGN);
        output.accept(ModBlocks.SPEED_LIMIT_120_SIGN);
        output.accept(ModBlocks.SPEED_LIMIT_130_SIGN);
        output.accept(ModBlocks.SPEED_LIMIT_140_SIGN);

        output.accept(ModBlocks.SPEED_LIMIT_10_END_SIGN);
        output.accept(ModBlocks.SPEED_LIMIT_20_END_SIGN);
        output.accept(ModBlocks.SPEED_LIMIT_30_END_SIGN);
        output.accept(ModBlocks.SPEED_LIMIT_40_END_SIGN);
        output.accept(ModBlocks.SPEED_LIMIT_50_END_SIGN);
        output.accept(ModBlocks.SPEED_LIMIT_60_END_SIGN);
        output.accept(ModBlocks.SPEED_LIMIT_70_END_SIGN);
        output.accept(ModBlocks.SPEED_LIMIT_80_END_SIGN);
        output.accept(ModBlocks.SPEED_LIMIT_90_END_SIGN);
        output.accept(ModBlocks.SPEED_LIMIT_100_END_SIGN);
        output.accept(ModBlocks.SPEED_LIMIT_110_END_SIGN);
        output.accept(ModBlocks.SPEED_LIMIT_120_END_SIGN);
        output.accept(ModBlocks.SPEED_LIMIT_130_END_SIGN);
        output.accept(ModBlocks.SPEED_LIMIT_140_END_SIGN);

        output.accept(ModBlocks.END_OF_ALL_PREVIOUSLY_SIGNED_RESTRICTIONS_SIGN);

        output.accept(ModBlocks.NO_VEHICLES_SIGN);
        output.accept(ModBlocks.NO_ENTRY_SIGN);
        output.accept(ModBlocks.MOTOR_VEHICLES_PROHIBITED_SIGN);
        output.accept(ModBlocks.PEDESTRIANS_PROHIBITED_SIGN);
        output.accept(ModBlocks.NO_OVERTAKING_SIGN);
        output.accept(ModBlocks.NO_HEAVY_OVERTAKING_SIGN);
        output.accept(ModBlocks.END_NO_OVERTAKING_SIGN);
        output.accept(ModBlocks.END_NO_HEAVY_OVERTAKING_SIGN);
        output.accept(ModBlocks.NO_STOPPING_SIGN);
        output.accept(ModBlocks.NO_PARKING_SIGN);
        output.accept(ModBlocks.SIDEWALK_SIGN);
        output.accept(ModBlocks.BUS_LANE_SIGN);
        output.accept(ModBlocks.SNOW_CHAINS_REQUIRED_SIGN);

        output.accept(ModBlocks.GO_STRAIGHT_SIGN);
        output.accept(ModBlocks.GO_LEFT_SIGN);
        output.accept(ModBlocks.GO_RIGHT_SIGN);
        output.accept(ModBlocks.TURN_LEFT_SIGN);
        output.accept(ModBlocks.TURN_RIGHT_SIGN);
        output.accept(ModBlocks.GO_STRAIGHT_OR_LEFT_SIGN);
        output.accept(ModBlocks.GO_STRAIGHT_OR_RIGHT_SIGN);
        output.accept(ModBlocks.GO_LEFT_OR_RIGHT_SIGN);
        output.accept(ModBlocks.PASS_LEFT_SIGN);
        output.accept(ModBlocks.PASS_RIGHT_SIGN);
        output.accept(ModBlocks.ROUNDABOUT_SIGN);
        output.accept(ModBlocks.ROUNDABOUT_FLIPPED_SIGN);
        output.accept(ModBlocks.NO_LEFT_TURN_SIGN);
        output.accept(ModBlocks.NO_RIGHT_TURN_SIGN);
        output.accept(ModBlocks.NO_U_TURN_SIGN);

        output.accept(ModBlocks.STOP_SIGN);
        output.accept(ModBlocks.YIELD_SIGN);
        output.accept(ModBlocks.YIELD_US_SIGN);
        output.accept(ModBlocks.DIAMOND_SIGN);
        output.accept(ModBlocks.PRIORITY_ROAD_SIGN);
        output.accept(ModBlocks.END_OF_PRIORITY_ROAD_SIGN);
        output.accept(ModBlocks.TURN_LEFT_US_SIGN);
        output.accept(ModBlocks.TURN_RIGHT_US_SIGN);
        output.accept(ModBlocks.NO_THROUGH_ROAD_US_SIGN);

        output.accept(ModBlocks.TRIANGLE_SIGN);
        output.accept(ModBlocks.RIGHT_OF_WAY_SIGN);
        output.accept(ModBlocks.PRIORITY_RIGHT_SIGN);
        output.accept(ModBlocks.DANGER_SIGN);
        output.accept(ModBlocks.ROADWORKS_SIGN);
        output.accept(ModBlocks.RAILROAD_CROSSING_SIGN);
        output.accept(ModBlocks.UNEVEN_ROAD_SIGN);
        output.accept(ModBlocks.ONCOMING_TRAFFIC_SIGN);
        output.accept(ModBlocks.ASCEND_SIGN);
        output.accept(ModBlocks.DECEND_SIGN);
        output.accept(ModBlocks.CURVE_LEFT_SIGN);
        output.accept(ModBlocks.CURVE_RIGHT_SIGN);
        output.accept(ModBlocks.DOUBLE_CURVE_LEFT_SIGN);
        output.accept(ModBlocks.DOUBLE_CURVE_RIGHT_SIGN);
        output.accept(ModBlocks.ROAD_NARROWING_SIGN);
        output.accept(ModBlocks.ROAD_NARROWING_LEFT_SIGN);
        output.accept(ModBlocks.ROAD_NARROWING_RIGHT_SIGN);
        output.accept(ModBlocks.WILD_ANIMALS_LEFT_SIGN);
        output.accept(ModBlocks.WILD_ANIMALS_RIGHT_SIGN);
        output.accept(ModBlocks.WILD_DINOSAURS_SIGN);

        output.accept(ModBlocks.TRAFFIC_SIGNALS_SIGN);
        output.accept(ModBlocks.PEDESTRIAN_CROSSING_LEFT_WARNING_SIGN);
        output.accept(ModBlocks.PEDESTRIAN_CROSSING_RIGHT_WARNING_SIGN);
        output.accept(ModBlocks.CROSSWIND_LEFT_SIGN);
        output.accept(ModBlocks.CROSSWIND_RIGHT_SIGN);
        output.accept(ModBlocks.ROCKFALL_LEFT_SIGN);
        output.accept(ModBlocks.ROCKFALL_RIGHT_SIGN);
        output.accept(ModBlocks.AIRCRAFT_LEFT_SIGN);
        output.accept(ModBlocks.AIRCRAFT_RIGHT_SIGN);
        output.accept(ModBlocks.AIRCSHIP_LEFT_SIGN);
        output.accept(ModBlocks.AIRCSHIP_RIGHT_SIGN);
        output.accept(ModBlocks.SLIPPERINESS_SIGN);
        output.accept(ModBlocks.ICY_ROAD_SIGN);
        output.accept(ModBlocks.GRITTY_ROAD_EDGE_SIGN);
        output.accept(ModBlocks.TRAFFIC_JAMS_SIGN);
        output.accept(ModBlocks.RIVERBANK_SIGN);

        output.accept(ModBlocks.SMALL_SQUARE_SIGN);
        output.accept(ModBlocks.PRIORITY_ROAD_LEFT_SIGN);
        output.accept(ModBlocks.PRIORITY_ROAD_RIGHT_SIGN);
        output.accept(ModBlocks.PRIORITY_ROAD_LEFT_STRAIGHT_SIGN);
        output.accept(ModBlocks.PRIORITY_ROAD_LEFT_STRAIGHT_NOT_RIGHT_SIGN);
        output.accept(ModBlocks.PRIORITY_ROAD_RIGHT_STRAIGHT_SIGN);
        output.accept(ModBlocks.PRIORITY_ROAD_RIGHT_STRAIGHT_NOT_LEFT_SIGN);
        output.accept(ModBlocks.PRIORITY_ROAD_LEFT_NOT_STRAIGHT_SIGN);
        output.accept(ModBlocks.PRIORITY_ROAD_LEFT_NOT_RIGHT_SIGN);
        output.accept(ModBlocks.PRIORITY_ROAD_RIGHT_NOT_STRAIGHT_SIGN);
        output.accept(ModBlocks.PRIORITY_ROAD_RIGHT_NOT_LEFT_SIGN);

        output.accept(ModBlocks.SQUARE_SIGN);
        output.accept(ModBlocks.DIRECTION_SIGN_LEFT_CURVE);
        output.accept(ModBlocks.DIRECTION_SIGN_RIGHT_CURVE);
        output.accept(ModBlocks.TUNNEL_SIGN);
        output.accept(ModBlocks.NO_THROUGH_ROAD_SIGN);
        output.accept(ModBlocks.PEDESTRIAN_CROSSING_LEFT_SIGN);
        output.accept(ModBlocks.PEDESTRIAN_CROSSING_RIGHT_SIGN);
        output.accept(ModBlocks.EXPRESSWAY_SIGN);
        output.accept(ModBlocks.MOTORWAY_SIGN);
        output.accept(ModBlocks.EXPRESSWAY_END_SIGN);
        output.accept(ModBlocks.MOTORWAY_END_SIGN);
        output.accept(ModBlocks.PARKING_SIGN);
        output.accept(ModBlocks.PARKING_GARAGE_SIGN);

        output.accept(ModBlocks.PRIORITY_OVER_ONCOMING_TRAFFIC_SIGN);
        output.accept(ModBlocks.GIVE_WAY_TO_ONCOMING_TRAFFIC_SIGN);

        output.accept(ModBlocks.NO_LEFT_TURN_US_SIGN);
        output.accept(ModBlocks.NO_RIGHT_TURN_US_SIGN);
        output.accept(ModBlocks.NO_U_TURN_US_SIGN);
        output.accept(ModBlocks.NO_ENTRY_US_SIGN);

        output.accept(ModBlocks.US_ROUTE_1_SIGN);
        output.accept(ModBlocks.US_ROUTE_2_SIGN);
        output.accept(ModBlocks.US_ROUTE_3_SIGN);
        output.accept(ModBlocks.US_ROUTE_4_SIGN);
        output.accept(ModBlocks.US_ROUTE_5_SIGN);
        output.accept(ModBlocks.US_ROUTE_6_SIGN);
        output.accept(ModBlocks.US_ROUTE_7_SIGN);
        output.accept(ModBlocks.US_ROUTE_8_SIGN);
        output.accept(ModBlocks.US_ROUTE_9_SIGN);

        output.accept(ModBlocks.SMALL_ROUTE_NUMBER_SIGN);
        output.accept(ModBlocks.SMALL_ROUTE_NUMBER_1_SIGN);
        output.accept(ModBlocks.SMALL_ROUTE_NUMBER_2_SIGN);
        output.accept(ModBlocks.SMALL_ROUTE_NUMBER_3_SIGN);
        output.accept(ModBlocks.SMALL_ROUTE_NUMBER_4_SIGN);
        output.accept(ModBlocks.SMALL_ROUTE_NUMBER_5_SIGN);
        output.accept(ModBlocks.SMALL_ROUTE_NUMBER_6_SIGN);
        output.accept(ModBlocks.SMALL_ROUTE_NUMBER_7_SIGN);
        output.accept(ModBlocks.SMALL_ROUTE_NUMBER_8_SIGN);
        output.accept(ModBlocks.SMALL_ROUTE_NUMBER_9_SIGN);
        output.accept(ModBlocks.SMALL_ROUTE_NUMBER_1_HIGHWAY_SIGN);
        output.accept(ModBlocks.SMALL_ROUTE_NUMBER_2_HIGHWAY_SIGN);
        output.accept(ModBlocks.SMALL_ROUTE_NUMBER_3_HIGHWAY_SIGN);
        output.accept(ModBlocks.SMALL_ROUTE_NUMBER_4_HIGHWAY_SIGN);
        output.accept(ModBlocks.SMALL_ROUTE_NUMBER_5_HIGHWAY_SIGN);
        output.accept(ModBlocks.SMALL_ROUTE_NUMBER_6_HIGHWAY_SIGN);
        output.accept(ModBlocks.SMALL_ROUTE_NUMBER_7_HIGHWAY_SIGN);
        output.accept(ModBlocks.SMALL_ROUTE_NUMBER_8_HIGHWAY_SIGN);
        output.accept(ModBlocks.SMALL_ROUTE_NUMBER_9_HIGHWAY_SIGN);

        output.accept(ModBlocks.HORIZONTAL_SIGN);
        output.accept(ModBlocks.ONE_WAY_STREET_SIGN_LEFT);
        output.accept(ModBlocks.ONE_WAY_STREET_SIGN_RIGHT);

        output.accept(ModBlocks.TALL_RECTANGULAR_SIGN);
        output.accept(ModBlocks.SPEED_LIMIT_US_5_SIGN);
        output.accept(ModBlocks.SPEED_LIMIT_US_10_SIGN);
        output.accept(ModBlocks.SPEED_LIMIT_US_15_SIGN);
        output.accept(ModBlocks.SPEED_LIMIT_US_20_SIGN);
        output.accept(ModBlocks.SPEED_LIMIT_US_25_SIGN);
        output.accept(ModBlocks.SPEED_LIMIT_US_30_SIGN);
        output.accept(ModBlocks.SPEED_LIMIT_US_35_SIGN);
        output.accept(ModBlocks.SPEED_LIMIT_US_40_SIGN);
        output.accept(ModBlocks.SPEED_LIMIT_US_45_SIGN);
        output.accept(ModBlocks.SPEED_LIMIT_US_50_SIGN);
        output.accept(ModBlocks.SPEED_LIMIT_US_55_SIGN);
        output.accept(ModBlocks.SPEED_LIMIT_US_60_SIGN);
        output.accept(ModBlocks.SPEED_LIMIT_US_65_SIGN);
        output.accept(ModBlocks.SPEED_LIMIT_US_70_SIGN);
        output.accept(ModBlocks.SPEED_LIMIT_US_75_SIGN);
        output.accept(ModBlocks.SPEED_LIMIT_US_80_SIGN);
        output.accept(ModBlocks.SPEED_LIMIT_US_85_SIGN);
        output.accept(ModBlocks.SPEED_LIMIT_US_90_SIGN);
        output.accept(ModBlocks.SPEED_LIMIT_US_95_SIGN);

        output.accept(ModBlocks.VERTICAL_SIGN);
        output.accept(ModBlocks.GUIDING_BEACON_SIGN_LEFT);
        output.accept(ModBlocks.GUIDING_BEACON_SIGN_RIGHT);
        output.accept(ModBlocks.GUIDING_BEACON_SIGN_MIDDLE);
        output.accept(ModBlocks.ANNOUNCEMENT_BEACON_RAILROAD_SIGN_SINGLE_STRIPED_LEFT);
        output.accept(ModBlocks.ANNOUNCEMENT_BEACON_RAILROAD_SIGN_DOUBLE_STRIPED_LEFT);
        output.accept(ModBlocks.ANNOUNCEMENT_BEACON_RAILROAD_SIGN_TRIPLE_STRIPED_LEFT);
        output.accept(ModBlocks.ANNOUNCEMENT_BEACON_RAILROAD_SIGN_SINGLE_STRIPED_RIGHT);
        output.accept(ModBlocks.ANNOUNCEMENT_BEACON_RAILROAD_SIGN_DOUBLE_STRIPED_RIGHT);
        output.accept(ModBlocks.ANNOUNCEMENT_BEACON_RAILROAD_SIGN_TRIPLE_STRIPED_RIGHT);
        output.accept(ModBlocks.ANNOUNCEMENT_BEACON_SIGN_SINGLE_STRIPED);
        output.accept(ModBlocks.ANNOUNCEMENT_BEACON_SIGN_DOUBLE_STRIPED);
        output.accept(ModBlocks.ANNOUNCEMENT_BEACON_SIGN_TRIPLE_STRIPED);
        output.accept(ModBlocks.ANNOUNCEMENT_BEACON_MOTORWAY_SIGN_SINGLE_STRIPED);
        output.accept(ModBlocks.ANNOUNCEMENT_BEACON_MOTORWAY_SIGN_DOUBLE_STRIPED);
        output.accept(ModBlocks.ANNOUNCEMENT_BEACON_MOTORWAY_SIGN_TRIPLE_STRIPED);

        output.accept(ModBlocks.RAILWAY_CROSSBUCK_SIGN);

        if (CompatModsCheck.TLOTD) {
            output.accept(ModItems.VHS_CASSETTE_1);
            output.accept(ModItems.GAME_CARTRIDGE_1);
        }

        output.accept(ModItems.ENGINE_V8_BIG_BLOCK);
        output.accept(ModItems.TRANSMISSION);
        output.accept(ModItems.LEATHER_SEAT);
        output.accept(ModItems.WHEEL);
        output.accept(ModItems.SUSPENSION);
        output.accept(ModItems.CHASSIS);
        output.accept(ModBlocks.LICENSE_PLATE);
        output.accept(ModBlocks.POLICE_LIGHTS);
        output.accept(ModItems.CAR_BODY_STALLION);
        output.accept(ModItems.CAR_BODY_FIRECHARGE);
        output.accept(ModItems.MUSCLE_CAR_STALLION);
        output.accept(ModItems.MUSCLE_CAR_FIRECHARGE);

        output.accept(ModBlocks.PORTABLE_TRAFFIC_DELINEATOR);
        output.accept(ModBlocks.PORTABLE_TRAFFIC_DELINEATOR_2);
        output.accept(ModBlocks.PORTABLE_TRAFFIC_DELINEATOR_3);
        output.accept(ModBlocks.PORTABLE_TRAFFIC_DELINEATOR_4);

        output.accept(ModBlocks.TRAFFIC_CONE);
        output.accept(ModBlocks.FIRE_HYDRANT);
        output.accept(ModBlocks.TRAFFIC_LIGHT);
        output.accept(ModBlocks.YELLOW_TRAFFIC_LIGHT);
        output.accept(ModBlocks.TRAFFIC_LIGHT_CONTROLLER);
        output.accept(ModBlocks.SPEED_CAMERA);
    }).build();

    public static void registerItemGroups() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TLOTD_4_ROADS_N_VEHICLES_GROUP_KEY, TLOTD_4_ROADS_N_VEHICLES_GROUP);
        TLOTDRoadsnVehicles.LOGGER.info("Registering Item Groups for " + TLOTDRoadsnVehicles.MOD_ID);
    }
}