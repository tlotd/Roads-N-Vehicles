package net.tlotd.roads_n_vehicles.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.tlotd.roads_n_vehicles.TLOTDRoadsnVehicles;
import net.tlotd.roads_n_vehicles.block.custom.*;
import net.tlotd.roads_n_vehicles.block.custom.SignBlock;

public class ModBlocks {

    public static final Block ASPHALT = registerBlock("asphalt",
            new Block(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F)));
    public static final Block ASPHALT_SLAB = registerBlock("asphalt_slab",
            new SlabBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F)));
    public static final Block ASPHALT_STAIRS = registerBlock("asphalt_stairs",
            new StairsBlock(ModBlocks.ASPHALT.getDefaultState(), FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F)));

    public static final Block ASPHALT_LINE_MARKING_ARROW = registerBlock("asphalt_line_marking_arrow",
            new GlazedTerracottaBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F)));
    public static final Block ASPHALT_LINE_MARKING_STRAIGHT = registerBlock("asphalt_line_marking_straight",
            new GlazedTerracottaBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F)));
    public static final Block ASPHALT_LINE_MARKING_CORNER = registerBlock("asphalt_line_marking_corner",
            new GlazedTerracottaBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F)));
    public static final Block ASPHALT_LINE_MARKING_T_JUNCTION = registerBlock("asphalt_line_marking_t-junction",
            new GlazedTerracottaBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F)));
    public static final Block ASPHALT_LINE_MARKING_CROSS = registerBlock("asphalt_line_marking_cross",
            new Block(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F)));
    public static final Block ASPHALT_SLAB_LINE_MARKING_ARROW = registerBlock("asphalt_slab_line_marking_arrow",
            new RotatableSlabBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F)));
    public static final Block ASPHALT_SLAB_LINE_MARKING_STRAIGHT= registerBlock("asphalt_slab_line_marking_straight",
            new RotatableSlabBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F)));
    public static final Block ASPHALT_SLAB_LINE_MARKING_CORNER = registerBlock("asphalt_slab_line_marking_corner",
            new RotatableSlabBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F)));
    public static final Block ASPHALT_SLAB_LINE_MARKING_T_JUNCTION = registerBlock("asphalt_slab_line_marking_t-junction",
            new RotatableSlabBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F)));
    public static final Block ASPHALT_SLAB_LINE_MARKING_CROSS = registerBlock("asphalt_slab_line_marking_cross",
            new SlabBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F)));

    public static final Block ASPHALT_YELLOW_LINE_MARKING_ARROW = registerBlock("asphalt_yellow_line_marking_arrow",
            new GlazedTerracottaBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F)));
    public static final Block ASPHALT_YELLOW_LINE_MARKING_STRAIGHT = registerBlock("asphalt_yellow_line_marking_straight",
            new GlazedTerracottaBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F)));
    public static final Block ASPHALT_YELLOW_LINE_MARKING_CORNER = registerBlock("asphalt_yellow_line_marking_corner",
            new GlazedTerracottaBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F)));
    public static final Block ASPHALT_YELLOW_LINE_MARKING_T_JUNCTION = registerBlock("asphalt_yellow_line_marking_t-junction",
            new GlazedTerracottaBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F)));
    public static final Block ASPHALT_YELLOW_LINE_MARKING_CROSS = registerBlock("asphalt_yellow_line_marking_cross",
            new Block(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F)));
    public static final Block ASPHALT_SLAB_YELLOW_LINE_MARKING_ARROW = registerBlock("asphalt_slab_yellow_line_marking_arrow",
            new RotatableSlabBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F)));
    public static final Block ASPHALT_SLAB_YELLOW_LINE_MARKING_STRAIGHT= registerBlock("asphalt_slab_yellow_line_marking_straight",
            new RotatableSlabBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F)));
    public static final Block ASPHALT_SLAB_YELLOW_LINE_MARKING_CORNER = registerBlock("asphalt_slab_yellow_line_marking_corner",
            new RotatableSlabBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F)));
    public static final Block ASPHALT_SLAB_YELLOW_LINE_MARKING_T_JUNCTION = registerBlock("asphalt_slab_yellow_line_marking_t-junction",
            new RotatableSlabBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F)));
    public static final Block ASPHALT_SLAB_YELLOW_LINE_MARKING_CROSS = registerBlock("asphalt_slab_yellow_line_marking_cross",
            new SlabBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F)));

    public static final Block ASPHALT_DOUBLE_LINE_MARKING_STRAIGHT = registerBlock("asphalt_double_line_marking_straight",
            new GlazedTerracottaBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F)));
    public static final Block ASPHALT_DOUBLE_LINE_MARKING_CORNER = registerBlock("asphalt_double_line_marking_corner",
            new GlazedTerracottaBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F)));
    public static final Block ASPHALT_DOUBLE_YELLOW_LINE_MARKING_STRAIGHT = registerBlock("asphalt_double_yellow_line_marking_straight",
            new GlazedTerracottaBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F)));
    public static final Block ASPHALT_DOUBLE_YELLOW_LINE_MARKING_CORNER = registerBlock("asphalt_double_yellow_line_marking_corner",
            new GlazedTerracottaBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F)));
    public static final Block ASPHALT_DOUBLE_RED_LINE_MARKING_STRAIGHT = registerBlock("asphalt_double_red_line_marking_straight",
            new GlazedTerracottaBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F)));
    public static final Block ASPHALT_DOUBLE_RED_LINE_MARKING_CORNER = registerBlock("asphalt_double_red_line_marking_corner",
            new GlazedTerracottaBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F)));

    public static final Block TOWN_SIGN = registerBlock("town_sign",
            new TownSignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));

    public static final Block COAT_OF_ARMS = registerBlock("coat_of_arms",
            new CoatOfArmsBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));

    public static final Block LICENSE_PLATE = registerBlock("license_plate",
            new LicensePlateBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).collidable(false).nonOpaque()));

    public static final Block ROUND_SIGN = registerBlock("round_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));

    public static final Block SPEED_LIMIT_10_SIGN = registerBlock("speed_limit_10_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block SPEED_LIMIT_20_SIGN = registerBlock("speed_limit_20_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block SPEED_LIMIT_30_SIGN = registerBlock("speed_limit_30_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block SPEED_LIMIT_40_SIGN = registerBlock("speed_limit_40_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block SPEED_LIMIT_50_SIGN = registerBlock("speed_limit_50_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block SPEED_LIMIT_60_SIGN = registerBlock("speed_limit_60_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block SPEED_LIMIT_70_SIGN = registerBlock("speed_limit_70_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block SPEED_LIMIT_80_SIGN = registerBlock("speed_limit_80_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block SPEED_LIMIT_90_SIGN = registerBlock("speed_limit_90_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block SPEED_LIMIT_100_SIGN = registerBlock("speed_limit_100_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block SPEED_LIMIT_110_SIGN = registerBlock("speed_limit_110_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block SPEED_LIMIT_120_SIGN = registerBlock("speed_limit_120_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block SPEED_LIMIT_130_SIGN = registerBlock("speed_limit_130_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block SPEED_LIMIT_140_SIGN = registerBlock("speed_limit_140_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));

    public static final Block SPEED_LIMIT_10_END_SIGN = registerBlock("speed_limit_10_end_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block SPEED_LIMIT_20_END_SIGN = registerBlock("speed_limit_20_end_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block SPEED_LIMIT_30_END_SIGN = registerBlock("speed_limit_30_end_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block SPEED_LIMIT_40_END_SIGN = registerBlock("speed_limit_40_end_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block SPEED_LIMIT_50_END_SIGN = registerBlock("speed_limit_50_end_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block SPEED_LIMIT_60_END_SIGN = registerBlock("speed_limit_60_end_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block SPEED_LIMIT_70_END_SIGN = registerBlock("speed_limit_70_end_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block SPEED_LIMIT_80_END_SIGN = registerBlock("speed_limit_80_end_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block SPEED_LIMIT_90_END_SIGN = registerBlock("speed_limit_90_end_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block SPEED_LIMIT_100_END_SIGN = registerBlock("speed_limit_100_end_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block SPEED_LIMIT_110_END_SIGN = registerBlock("speed_limit_110_end_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block SPEED_LIMIT_120_END_SIGN = registerBlock("speed_limit_120_end_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block SPEED_LIMIT_130_END_SIGN = registerBlock("speed_limit_130_end_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block SPEED_LIMIT_140_END_SIGN = registerBlock("speed_limit_140_end_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));

    public static final Block END_OF_ALL_PREVIOUSLY_SIGNED_RESTRICTIONS_SIGN = registerBlock("end_of_all_previously_signed_restrictions_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));

    public static final Block NO_VEHICLES_SIGN = registerBlock("no_vehicles_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block NO_ENTRY_SIGN = registerBlock("no_entry_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));

    public static final Block NO_STOPPING_SIGN = registerBlock("no_stopping_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block NO_PARKING_SIGN = registerBlock("no_parking_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));

    public static final Block GO_STRAIGHT_SIGN = registerBlock("go_straight_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block GO_LEFT_SIGN = registerBlock("go_left_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block GO_RIGHT_SIGN = registerBlock("go_right_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block TURN_LEFT_SIGN = registerBlock("turn_left_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block TURN_RIGHT_SIGN = registerBlock("turn_right_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block GO_STRAIGHT_OR_LEFT_SIGN = registerBlock("go_straight_or_left_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block GO_STRAIGHT_OR_RIGHT_SIGN = registerBlock("go_straight_or_right_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block GO_LEFT_OR_RIGHT_SIGN = registerBlock("go_left_or_right_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block PASS_LEFT_SIGN = registerBlock("pass_left_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block PASS_RIGHT_SIGN = registerBlock("pass_right_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block ROUNDABOUT_SIGN = registerBlock("roundabout_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block ROUNDABOUT_FLIPPED_SIGN = registerBlock("roundabout_flipped_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));

    public static final Block NO_LEFT_TURN_SIGN = registerBlock("no_left_turn_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block NO_RIGHT_TURN_SIGN = registerBlock("no_right_turn_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block NO_U_TURN_SIGN = registerBlock("no_u_turn_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));

    public static final Block STOP_SIGN = registerBlock("stop_sign",
            new BigSignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));

    public static final Block YIELD_SIGN = registerBlock("yield_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block YIELD_US_SIGN = registerBlock("yield_us_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));

    public static final Block DIAMOND_SIGN = registerBlock("diamond_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block PRIORITY_ROAD_SIGN = registerBlock("priority_road_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block END_OF_PRIORITY_ROAD_SIGN = registerBlock("end_of_priority_road_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block TURN_LEFT_US_SIGN = registerBlock("turn_left_us_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block TURN_RIGHT_US_SIGN = registerBlock("turn_right_us_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block NO_THROUGH_ROAD_US_SIGN = registerBlock("no_through_road_us_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));

    public static final Block TRIANGLE_SIGN = registerBlock("triangle_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block RIGHT_OF_WAY_SIGN = registerBlock("right_of_way_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block PRIORITY_RIGHT_SIGN = registerBlock("priority_right_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block DANGER_SIGN = registerBlock("danger_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block ROADWORKS_SIGN = registerBlock("roadworks_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block RAILROAD_CROSSING_SIGN = registerBlock("railroad_crossing_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block UNEVEN_ROAD_SIGN = registerBlock("uneven_road_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block ONCOMING_TRAFFIC_SIGN = registerBlock("oncoming_traffic_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block ASCEND_SIGN = registerBlock("ascent_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block DECEND_SIGN = registerBlock("decent_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block CURVE_LEFT_SIGN = registerBlock("curve_left_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block CURVE_RIGHT_SIGN = registerBlock("curve_right_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block DOUBLE_CURVE_LEFT_SIGN = registerBlock("double_curve_left_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block DOUBLE_CURVE_RIGHT_SIGN = registerBlock("double_curve_right_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block ROAD_NARROWING_SIGN = registerBlock("road_narrowing_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block ROAD_NARROWING_LEFT_SIGN = registerBlock("road_narrowing_left_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block ROAD_NARROWING_RIGHT_SIGN = registerBlock("road_narrowing_right_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));

    public static final Block SQUARE_SIGN = registerBlock("square_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block NO_THROUGH_ROAD_SIGN = registerBlock("no_through_road_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block PEDESTRIAN_CROSSING_LEFT_SIGN = registerBlock("pedestrian_crossing_left_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block PEDESTRIAN_CROSSING_RIGHT_SIGN = registerBlock("pedestrian_crossing_right_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block EXPRESSWAY_SIGN = registerBlock("expressway_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block MOTORWAY_SIGN = registerBlock("motorway_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block EXPRESSWAY_END_SIGN = registerBlock("expressway_end_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block MOTORWAY_END_SIGN = registerBlock("motorway_end_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block PARKING_SIGN = registerBlock("parking_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block PARKING_GARAGE_SIGN = registerBlock("parking_garage_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));

    public static final Block PRIORITY_OVER_ONCOMING_TRAFFIC_SIGN = registerBlock("priority_over_oncoming_traffic_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block GIVE_WAY_TO_ONCOMING_TRAFFIC_SIGN = registerBlock("give_way_to_oncoming_traffic_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));

    public static final Block NO_LEFT_TURN_US_SIGN = registerBlock("no_left_turn_us_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block NO_RIGHT_TURN_US_SIGN = registerBlock("no_right_turn_us_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block NO_U_TURN_US_SIGN = registerBlock("no_u_turn_us_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block NO_ENTRY_US_SIGN = registerBlock("no_entry_us_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));

    public static final Block US_ROUTE_1_SIGN = registerBlock("us_route_1_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block US_ROUTE_2_SIGN = registerBlock("us_route_2_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block US_ROUTE_3_SIGN = registerBlock("us_route_3_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block US_ROUTE_4_SIGN = registerBlock("us_route_4_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block US_ROUTE_5_SIGN = registerBlock("us_route_5_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block US_ROUTE_6_SIGN = registerBlock("us_route_6_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block US_ROUTE_7_SIGN = registerBlock("us_route_7_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block US_ROUTE_8_SIGN = registerBlock("us_route_8_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block US_ROUTE_9_SIGN = registerBlock("us_route_9_sign",
            new SignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));


    public static final Block TALL_RECTANGULAR_SIGN = registerBlock("tall_rectangular_sign",
            new TallRectangularSignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block SPEED_LIMIT_US_5_SIGN = registerBlock("speed_limit_us_5_sign",
            new TallRectangularSignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block SPEED_LIMIT_US_10_SIGN = registerBlock("speed_limit_us_10_sign",
            new TallRectangularSignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block SPEED_LIMIT_US_15_SIGN = registerBlock("speed_limit_us_15_sign",
            new TallRectangularSignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block SPEED_LIMIT_US_20_SIGN = registerBlock("speed_limit_us_20_sign",
            new TallRectangularSignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block SPEED_LIMIT_US_25_SIGN = registerBlock("speed_limit_us_25_sign",
            new TallRectangularSignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block SPEED_LIMIT_US_30_SIGN = registerBlock("speed_limit_us_30_sign",
            new TallRectangularSignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block SPEED_LIMIT_US_35_SIGN = registerBlock("speed_limit_us_35_sign",
            new TallRectangularSignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block SPEED_LIMIT_US_40_SIGN = registerBlock("speed_limit_us_40_sign",
            new TallRectangularSignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block SPEED_LIMIT_US_45_SIGN = registerBlock("speed_limit_us_45_sign",
            new TallRectangularSignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block SPEED_LIMIT_US_50_SIGN = registerBlock("speed_limit_us_50_sign",
            new TallRectangularSignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block SPEED_LIMIT_US_55_SIGN = registerBlock("speed_limit_us_55_sign",
            new TallRectangularSignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block SPEED_LIMIT_US_60_SIGN = registerBlock("speed_limit_us_60_sign",
            new TallRectangularSignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block SPEED_LIMIT_US_65_SIGN = registerBlock("speed_limit_us_65_sign",
            new TallRectangularSignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block SPEED_LIMIT_US_70_SIGN = registerBlock("speed_limit_us_70_sign",
            new TallRectangularSignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block SPEED_LIMIT_US_75_SIGN = registerBlock("speed_limit_us_75_sign",
            new TallRectangularSignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block SPEED_LIMIT_US_80_SIGN = registerBlock("speed_limit_us_80_sign",
            new TallRectangularSignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block SPEED_LIMIT_US_85_SIGN = registerBlock("speed_limit_us_85_sign",
            new TallRectangularSignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block SPEED_LIMIT_US_90_SIGN = registerBlock("speed_limit_us_90_sign",
            new TallRectangularSignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block SPEED_LIMIT_US_95_SIGN = registerBlock("speed_limit_us_95_sign",
            new TallRectangularSignBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));

    public static final Block GUARDRAIL = registerBlock("guardrail",
            new GuardrailBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));

    public static final Block GUARDRAIL_OUTER_CORNER = registerBlock("guardrail_outer_corner",
            new OuterGuardrailCornerBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));

    public static final Block GUARDRAIL_INNER_CORNER = registerBlock("guardrail_inner_corner",
            new InnerGuardrailCornerBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));

    public static final Block DELINEATOR = registerBlock("delineator",
            new DelineatorBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));

    public static final Block TRAFFIC_CONE = registerBlock("traffic_cone",
            new TrafficConeBlock(FabricBlockSettings.create().mapColor(MapColor.ORANGE).requiresTool().strength(2.0F, 3.0F)));

    public static final Block PORTABLE_TRAFFIC_DELINEATOR = registerBlock("portable_traffic_delineator_with_amber_flashing_light",
            new PortableTrafficDelineatorBlock(FabricBlockSettings.create().mapColor(MapColor.ORANGE).requiresTool().strength(2.0F, 3.0F)));
    public static final Block PORTABLE_TRAFFIC_DELINEATOR_2 = registerBlock("portable_traffic_delineator_with_amber_flashing_light_2",
            new PortableTrafficDelineatorBlock(FabricBlockSettings.create().mapColor(MapColor.ORANGE).requiresTool().strength(2.0F, 3.0F)));
    public static final Block PORTABLE_TRAFFIC_DELINEATOR_3 = registerBlock("portable_traffic_delineator_with_amber_flashing_light_3",
            new PortableTrafficDelineatorBlock(FabricBlockSettings.create().mapColor(MapColor.ORANGE).requiresTool().strength(2.0F, 3.0F)));
    public static final Block PORTABLE_TRAFFIC_DELINEATOR_4 = registerBlock("portable_traffic_delineator_with_amber_flashing_light_4",
            new PortableTrafficDelineatorBlock(FabricBlockSettings.create().mapColor(MapColor.ORANGE).requiresTool().strength(2.0F, 3.0F)));

    public static final Block TRAFFIC_LIGHT = registerBlock("traffic_light",
            new TrafficLightBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F)));
    public static final Block YELLOW_TRAFFIC_LIGHT = registerBlock("yellow_traffic_light",
            new TrafficLightBlock(FabricBlockSettings.create().mapColor(MapColor.YELLOW).requiresTool().strength(2.0F, 3.0F)));
    public static final Block TRAFFIC_LIGHT_CONTROLLER = registerBlock("traffic_light_controller",
            new TrafficLightControllerBlock(FabricBlockSettings.create().mapColor(MapColor.GRAY).requiresTool().strength(2.0F, 3.0F)));

    public static final Block FIRE_HYDRANT = registerBlock("fire_hydrant",
            new FireHydrantBlock(FabricBlockSettings.create().mapColor(MapColor.RED).requiresTool().strength(2.0F, 3.0F)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TLOTDRoadsnVehicles.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(TLOTDRoadsnVehicles.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        TLOTDRoadsnVehicles.LOGGER.info("Registering ModBlocks for " + TLOTDRoadsnVehicles.MOD_ID);
    }
}