package net.tlotd.roads_n_vehicles.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.tlotd.roads_n_vehicles.TLOTDRoadsnVehicles;
import net.tlotd.roads_n_vehicles.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup TLOTD_ROADS_N_VEHICLES_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TLOTDRoadsnVehicles.MOD_ID, "items"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.roads-n-vehicles.items"))
                    .icon(() -> new ItemStack(ModBlocks.ROADWORKS_SIGN)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.ASPHALT);
                        entries.add(ModBlocks.ASPHALT_LINE_MARKING_ARROW);
                        entries.add(ModBlocks.ASPHALT_LINE_MARKING_STRAIGHT);
                        entries.add(ModBlocks.ASPHALT_LINE_MARKING_CORNER);
                        entries.add(ModBlocks.ASPHALT_LINE_MARKING_T_JUNCTION);
                        entries.add(ModBlocks.ASPHALT_LINE_MARKING_CROSS);

                        entries.add(ModBlocks.ASPHALT_SLAB);
                        entries.add(ModBlocks.ASPHALT_SLAB_LINE_MARKING_ARROW);
                        entries.add(ModBlocks.ASPHALT_SLAB_LINE_MARKING_STRAIGHT);
                        entries.add(ModBlocks.ASPHALT_SLAB_LINE_MARKING_CORNER);
                        entries.add(ModBlocks.ASPHALT_SLAB_LINE_MARKING_T_JUNCTION);
                        entries.add(ModBlocks.ASPHALT_SLAB_LINE_MARKING_CROSS);

                        entries.add(ModBlocks.ASPHALT_STAIRS);

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

                        entries.add(ModBlocks.STOP_SIGN);
                        entries.add(ModBlocks.YIELD_SIGN);
                        entries.add(ModBlocks.PRIORITY_ROAD_SIGN);
                        entries.add(ModBlocks.END_OF_PRIORITY_ROAD_SIGN);
                        entries.add(ModBlocks.DIAMOND_SIGN);

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

                        entries.add(ModBlocks.SQUARE_SIGN);
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

                        entries.add(ModItems.MUSCLE_CAR_KEYS);
                        entries.add(ModBlocks.LICENSE_PLATE);

                        entries.add(ModBlocks.GUARDRAIL);
                        entries.add(ModBlocks.GUARDRAIL_OUTER_CORNER);
                        entries.add(ModBlocks.GUARDRAIL_INNER_CORNER);

                        entries.add(ModBlocks.DELINEATOR);
                    }).build());

    public static void registerItemGroups(){
        TLOTDRoadsnVehicles.LOGGER.info("Registering Item Groups for " + TLOTDRoadsnVehicles.MOD_ID);
    }
}