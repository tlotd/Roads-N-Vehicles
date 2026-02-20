package net.tlotd.roads_n_vehicles.block;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.tlotd.roads_n_vehicles.TLOTDRoadsnVehicles;
import net.tlotd.roads_n_vehicles.block.custom.*;
import net.tlotd.roads_n_vehicles.block.custom.SignBlock;
import net.tlotd.roads_n_vehicles.item.custom.TooltipBlockItem;

import java.util.function.Function;

public class ModBlocks {

    public static final Block ASPHALT = registerBlock("asphalt", props -> new Block(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F)));
    public static final Block ASPHALT_SLAB = registerBlock("asphalt_slab", props -> new SlabBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F)));
    public static final Block ASPHALT_STAIRS = registerBlock("asphalt_stairs", props -> new StairBlock(ModBlocks.ASPHALT.defaultBlockState(), props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F)));

    public static final Block ASPHALT_LINE_MARKING_ARROW = registerBlock("asphalt_line_marking_arrow", props -> new GlazedTerracottaBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F)));
    public static final Block ASPHALT_LINE_MARKING_STRAIGHT = registerBlock("asphalt_line_marking_straight", props -> new GlazedTerracottaBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F)));
    public static final Block ASPHALT_LINE_MARKING_CORNER = registerBlock("asphalt_line_marking_corner", props -> new GlazedTerracottaBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F)));
    public static final Block ASPHALT_LINE_MARKING_T_JUNCTION = registerBlock("asphalt_line_marking_t-junction", props -> new GlazedTerracottaBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F)));
    public static final Block ASPHALT_LINE_MARKING_CROSS = registerBlock("asphalt_line_marking_cross", props -> new Block(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F)));
    public static final Block ASPHALT_SLAB_LINE_MARKING_ARROW = registerBlock("asphalt_slab_line_marking_arrow", props -> new RotatableSlabBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F)));
    public static final Block ASPHALT_SLAB_LINE_MARKING_STRAIGHT= registerBlock("asphalt_slab_line_marking_straight", props -> new RotatableSlabBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F)));
    public static final Block ASPHALT_SLAB_LINE_MARKING_CORNER = registerBlock("asphalt_slab_line_marking_corner", props -> new RotatableSlabBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F)));
    public static final Block ASPHALT_SLAB_LINE_MARKING_T_JUNCTION = registerBlock("asphalt_slab_line_marking_t-junction", props -> new RotatableSlabBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F)));
    public static final Block ASPHALT_SLAB_LINE_MARKING_CROSS = registerBlock("asphalt_slab_line_marking_cross", props -> new SlabBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F)));

    public static final Block ASPHALT_YELLOW_LINE_MARKING_ARROW = registerBlock("asphalt_yellow_line_marking_arrow", props -> new GlazedTerracottaBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F)));
    public static final Block ASPHALT_YELLOW_LINE_MARKING_STRAIGHT = registerBlock("asphalt_yellow_line_marking_straight", props -> new GlazedTerracottaBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F)));
    public static final Block ASPHALT_YELLOW_LINE_MARKING_CORNER = registerBlock("asphalt_yellow_line_marking_corner", props -> new GlazedTerracottaBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F)));
    public static final Block ASPHALT_YELLOW_LINE_MARKING_T_JUNCTION = registerBlock("asphalt_yellow_line_marking_t-junction", props -> new GlazedTerracottaBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F)));
    public static final Block ASPHALT_YELLOW_LINE_MARKING_CROSS = registerBlock("asphalt_yellow_line_marking_cross", props -> new Block(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F)));
    public static final Block ASPHALT_SLAB_YELLOW_LINE_MARKING_ARROW = registerBlock("asphalt_slab_yellow_line_marking_arrow", props -> new RotatableSlabBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F)));
    public static final Block ASPHALT_SLAB_YELLOW_LINE_MARKING_STRAIGHT= registerBlock("asphalt_slab_yellow_line_marking_straight", props -> new RotatableSlabBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F)));
    public static final Block ASPHALT_SLAB_YELLOW_LINE_MARKING_CORNER = registerBlock("asphalt_slab_yellow_line_marking_corner", props -> new RotatableSlabBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F)));
    public static final Block ASPHALT_SLAB_YELLOW_LINE_MARKING_T_JUNCTION = registerBlock("asphalt_slab_yellow_line_marking_t-junction", props -> new RotatableSlabBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F)));
    public static final Block ASPHALT_SLAB_YELLOW_LINE_MARKING_CROSS = registerBlock("asphalt_slab_yellow_line_marking_cross", props -> new SlabBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F)));

    public static final Block ASPHALT_DOUBLE_LINE_MARKING_STRAIGHT = registerBlock("asphalt_double_line_marking_straight", props -> new GlazedTerracottaBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F)));
    public static final Block ASPHALT_DOUBLE_LINE_MARKING_CORNER = registerBlock("asphalt_double_line_marking_corner", props -> new GlazedTerracottaBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F)));
    public static final Block ASPHALT_DOUBLE_YELLOW_LINE_MARKING_STRAIGHT = registerBlock("asphalt_double_yellow_line_marking_straight", props -> new GlazedTerracottaBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F)));
    public static final Block ASPHALT_DOUBLE_YELLOW_LINE_MARKING_CORNER = registerBlock("asphalt_double_yellow_line_marking_corner", props -> new GlazedTerracottaBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F)));
    public static final Block ASPHALT_DOUBLE_RED_LINE_MARKING_STRAIGHT = registerBlock("asphalt_double_red_line_marking_straight", props -> new GlazedTerracottaBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F)));
    public static final Block ASPHALT_DOUBLE_RED_LINE_MARKING_CORNER = registerBlock("asphalt_double_red_line_marking_corner", props -> new GlazedTerracottaBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F)));

    public static final Block TOWN_SIGN = registerTooltipBlock("town_sign", props -> new TownSignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()),1);
    public static final Block COAT_OF_ARMS = registerTooltipBlock("coat_of_arms", props -> new CoatOfArmsBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()),1);
    public static final Block LICENSE_PLATE = registerTooltipBlock("license_plate", props -> new LicensePlateBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noCollision().noOcclusion()),2);

    public static final Block ROUND_SIGN = registerBlock("round_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));

    public static final Block SPEED_LIMIT_10_SIGN = registerBlock("speed_limit_10_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block SPEED_LIMIT_20_SIGN = registerBlock("speed_limit_20_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block SPEED_LIMIT_30_SIGN = registerBlock("speed_limit_30_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block SPEED_LIMIT_40_SIGN = registerBlock("speed_limit_40_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block SPEED_LIMIT_50_SIGN = registerBlock("speed_limit_50_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block SPEED_LIMIT_60_SIGN = registerBlock("speed_limit_60_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block SPEED_LIMIT_70_SIGN = registerBlock("speed_limit_70_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block SPEED_LIMIT_80_SIGN = registerBlock("speed_limit_80_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block SPEED_LIMIT_90_SIGN = registerBlock("speed_limit_90_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block SPEED_LIMIT_100_SIGN = registerBlock("speed_limit_100_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block SPEED_LIMIT_110_SIGN = registerBlock("speed_limit_110_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block SPEED_LIMIT_120_SIGN = registerBlock("speed_limit_120_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block SPEED_LIMIT_130_SIGN = registerBlock("speed_limit_130_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block SPEED_LIMIT_140_SIGN = registerBlock("speed_limit_140_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));

    public static final Block SPEED_LIMIT_10_END_SIGN = registerBlock("speed_limit_10_end_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block SPEED_LIMIT_20_END_SIGN = registerBlock("speed_limit_20_end_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block SPEED_LIMIT_30_END_SIGN = registerBlock("speed_limit_30_end_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block SPEED_LIMIT_40_END_SIGN = registerBlock("speed_limit_40_end_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block SPEED_LIMIT_50_END_SIGN = registerBlock("speed_limit_50_end_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block SPEED_LIMIT_60_END_SIGN = registerBlock("speed_limit_60_end_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block SPEED_LIMIT_70_END_SIGN = registerBlock("speed_limit_70_end_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block SPEED_LIMIT_80_END_SIGN = registerBlock("speed_limit_80_end_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block SPEED_LIMIT_90_END_SIGN = registerBlock("speed_limit_90_end_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block SPEED_LIMIT_100_END_SIGN = registerBlock("speed_limit_100_end_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block SPEED_LIMIT_110_END_SIGN = registerBlock("speed_limit_110_end_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block SPEED_LIMIT_120_END_SIGN = registerBlock("speed_limit_120_end_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block SPEED_LIMIT_130_END_SIGN = registerBlock("speed_limit_130_end_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block SPEED_LIMIT_140_END_SIGN = registerBlock("speed_limit_140_end_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));

    public static final Block END_OF_ALL_PREVIOUSLY_SIGNED_RESTRICTIONS_SIGN = registerBlock("end_of_all_previously_signed_restrictions_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));

    public static final Block NO_VEHICLES_SIGN = registerBlock("no_vehicles_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block NO_ENTRY_SIGN = registerBlock("no_entry_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));

    public static final Block NO_STOPPING_SIGN = registerBlock("no_stopping_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block NO_PARKING_SIGN = registerBlock("no_parking_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));

    public static final Block GO_STRAIGHT_SIGN = registerBlock("go_straight_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block GO_LEFT_SIGN = registerBlock("go_left_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block GO_RIGHT_SIGN = registerBlock("go_right_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block TURN_LEFT_SIGN = registerBlock("turn_left_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block TURN_RIGHT_SIGN = registerBlock("turn_right_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block GO_STRAIGHT_OR_LEFT_SIGN = registerBlock("go_straight_or_left_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block GO_STRAIGHT_OR_RIGHT_SIGN = registerBlock("go_straight_or_right_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block GO_LEFT_OR_RIGHT_SIGN = registerBlock("go_left_or_right_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block PASS_LEFT_SIGN = registerBlock("pass_left_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block PASS_RIGHT_SIGN = registerBlock("pass_right_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block ROUNDABOUT_SIGN = registerBlock("roundabout_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block ROUNDABOUT_FLIPPED_SIGN = registerBlock("roundabout_flipped_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));

    public static final Block NO_LEFT_TURN_SIGN = registerBlock("no_left_turn_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block NO_RIGHT_TURN_SIGN = registerBlock("no_right_turn_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block NO_U_TURN_SIGN = registerBlock("no_u_turn_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));

    public static final Block STOP_SIGN = registerBlock("stop_sign", props -> new BigSignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));

    public static final Block YIELD_SIGN = registerBlock("yield_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block YIELD_US_SIGN = registerBlock("yield_us_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));

    public static final Block DIAMOND_SIGN = registerBlock("diamond_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block PRIORITY_ROAD_SIGN = registerBlock("priority_road_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block END_OF_PRIORITY_ROAD_SIGN = registerBlock("end_of_priority_road_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block TURN_LEFT_US_SIGN = registerBlock("turn_left_us_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block TURN_RIGHT_US_SIGN = registerBlock("turn_right_us_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block NO_THROUGH_ROAD_US_SIGN = registerBlock("no_through_road_us_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));

    public static final Block TRIANGLE_SIGN = registerBlock("triangle_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block RIGHT_OF_WAY_SIGN = registerBlock("right_of_way_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block PRIORITY_RIGHT_SIGN = registerBlock("priority_right_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block DANGER_SIGN = registerBlock("danger_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block ROADWORKS_SIGN = registerBlock("roadworks_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block RAILROAD_CROSSING_SIGN = registerBlock("railroad_crossing_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block UNEVEN_ROAD_SIGN = registerBlock("uneven_road_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block ONCOMING_TRAFFIC_SIGN = registerBlock("oncoming_traffic_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block ASCEND_SIGN = registerBlock("ascent_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block DECEND_SIGN = registerBlock("decent_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block CURVE_LEFT_SIGN = registerBlock("curve_left_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block CURVE_RIGHT_SIGN = registerBlock("curve_right_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block DOUBLE_CURVE_LEFT_SIGN = registerBlock("double_curve_left_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block DOUBLE_CURVE_RIGHT_SIGN = registerBlock("double_curve_right_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block ROAD_NARROWING_SIGN = registerBlock("road_narrowing_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block ROAD_NARROWING_LEFT_SIGN = registerBlock("road_narrowing_left_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block ROAD_NARROWING_RIGHT_SIGN = registerBlock("road_narrowing_right_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block WILD_ANIMALS_LEFT_SIGN = registerBlock("wild_animals_left_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block WILD_ANIMALS_RIGHT_SIGN = registerBlock("wild_animals_right_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block WILD_DINOSAURS_SIGN = registerBlock("wild_dinosaurs_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));

    public static final Block SQUARE_SIGN = registerBlock("square_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block DIRECTION_SIGN_LEFT_CURVE = registerBlock("direction_sign_left_curve", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block DIRECTION_SIGN_RIGHT_CURVE = registerBlock("direction_sign_right_curve", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block NO_THROUGH_ROAD_SIGN = registerBlock("no_through_road_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block PEDESTRIAN_CROSSING_LEFT_SIGN = registerBlock("pedestrian_crossing_left_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block PEDESTRIAN_CROSSING_RIGHT_SIGN = registerBlock("pedestrian_crossing_right_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block EXPRESSWAY_SIGN = registerBlock("expressway_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block MOTORWAY_SIGN = registerBlock("motorway_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block EXPRESSWAY_END_SIGN = registerBlock("expressway_end_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block MOTORWAY_END_SIGN = registerBlock("motorway_end_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block PARKING_SIGN = registerBlock("parking_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block PARKING_GARAGE_SIGN = registerBlock("parking_garage_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));

    public static final Block PRIORITY_OVER_ONCOMING_TRAFFIC_SIGN = registerBlock("priority_over_oncoming_traffic_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block GIVE_WAY_TO_ONCOMING_TRAFFIC_SIGN = registerBlock("give_way_to_oncoming_traffic_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));

    public static final Block NO_LEFT_TURN_US_SIGN = registerBlock("no_left_turn_us_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block NO_RIGHT_TURN_US_SIGN = registerBlock("no_right_turn_us_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block NO_U_TURN_US_SIGN = registerBlock("no_u_turn_us_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block NO_ENTRY_US_SIGN = registerBlock("no_entry_us_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));

    public static final Block US_ROUTE_1_SIGN = registerBlock("us_route_1_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block US_ROUTE_2_SIGN = registerBlock("us_route_2_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block US_ROUTE_3_SIGN = registerBlock("us_route_3_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block US_ROUTE_4_SIGN = registerBlock("us_route_4_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block US_ROUTE_5_SIGN = registerBlock("us_route_5_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block US_ROUTE_6_SIGN = registerBlock("us_route_6_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block US_ROUTE_7_SIGN = registerBlock("us_route_7_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block US_ROUTE_8_SIGN = registerBlock("us_route_8_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block US_ROUTE_9_SIGN = registerBlock("us_route_9_sign", props -> new SignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));

    public static final Block TALL_RECTANGULAR_SIGN = registerBlock("tall_rectangular_sign", props -> new TallRectangularSignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block SPEED_LIMIT_US_5_SIGN = registerBlock("speed_limit_us_5_sign", props -> new TallRectangularSignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block SPEED_LIMIT_US_10_SIGN = registerBlock("speed_limit_us_10_sign", props -> new TallRectangularSignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block SPEED_LIMIT_US_15_SIGN = registerBlock("speed_limit_us_15_sign", props -> new TallRectangularSignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block SPEED_LIMIT_US_20_SIGN = registerBlock("speed_limit_us_20_sign", props -> new TallRectangularSignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block SPEED_LIMIT_US_25_SIGN = registerBlock("speed_limit_us_25_sign", props -> new TallRectangularSignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block SPEED_LIMIT_US_30_SIGN = registerBlock("speed_limit_us_30_sign", props -> new TallRectangularSignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block SPEED_LIMIT_US_35_SIGN = registerBlock("speed_limit_us_35_sign", props -> new TallRectangularSignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block SPEED_LIMIT_US_40_SIGN = registerBlock("speed_limit_us_40_sign", props -> new TallRectangularSignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block SPEED_LIMIT_US_45_SIGN = registerBlock("speed_limit_us_45_sign", props -> new TallRectangularSignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block SPEED_LIMIT_US_50_SIGN = registerBlock("speed_limit_us_50_sign", props -> new TallRectangularSignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block SPEED_LIMIT_US_55_SIGN = registerBlock("speed_limit_us_55_sign", props -> new TallRectangularSignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block SPEED_LIMIT_US_60_SIGN = registerBlock("speed_limit_us_60_sign", props -> new TallRectangularSignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block SPEED_LIMIT_US_65_SIGN = registerBlock("speed_limit_us_65_sign", props -> new TallRectangularSignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block SPEED_LIMIT_US_70_SIGN = registerBlock("speed_limit_us_70_sign", props -> new TallRectangularSignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block SPEED_LIMIT_US_75_SIGN = registerBlock("speed_limit_us_75_sign", props -> new TallRectangularSignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block SPEED_LIMIT_US_80_SIGN = registerBlock("speed_limit_us_80_sign", props -> new TallRectangularSignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block SPEED_LIMIT_US_85_SIGN = registerBlock("speed_limit_us_85_sign", props -> new TallRectangularSignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block SPEED_LIMIT_US_90_SIGN = registerBlock("speed_limit_us_90_sign", props -> new TallRectangularSignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block SPEED_LIMIT_US_95_SIGN = registerBlock("speed_limit_us_95_sign", props -> new TallRectangularSignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));

    public static final Block VERTICAL_SIGN = registerBlock("vertical_sign", props -> new VerticalSignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block GUIDING_BEACON_SIGN_LEFT = registerBlock("guiding_beacon_sign_left", props -> new VerticalSignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block GUIDING_BEACON_SIGN_RIGHT = registerBlock("guiding_beacon_sign_right", props -> new VerticalSignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block GUIDING_BEACON_SIGN_MIDDLE = registerBlock("guiding_beacon_sign_middle", props -> new VerticalSignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block ANNOUNCEMENT_BEACON_RAILROAD_SIGN_SINGLE_STRIPED_LEFT = registerBlock("announcement_beacon_railroad_sign_single_striped_left", props -> new VerticalSignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block ANNOUNCEMENT_BEACON_RAILROAD_SIGN_DOUBLE_STRIPED_LEFT = registerBlock("announcement_beacon_railroad_sign_double_striped_left", props -> new VerticalSignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block ANNOUNCEMENT_BEACON_RAILROAD_SIGN_TRIPLE_STRIPED_LEFT = registerBlock("announcement_beacon_railroad_sign_triple_striped_left", props -> new VerticalSignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block ANNOUNCEMENT_BEACON_RAILROAD_SIGN_SINGLE_STRIPED_RIGHT = registerBlock("announcement_beacon_railroad_sign_single_striped_right", props -> new VerticalSignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block ANNOUNCEMENT_BEACON_RAILROAD_SIGN_DOUBLE_STRIPED_RIGHT = registerBlock("announcement_beacon_railroad_sign_double_striped_right", props -> new VerticalSignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block ANNOUNCEMENT_BEACON_RAILROAD_SIGN_TRIPLE_STRIPED_RIGHT = registerBlock("announcement_beacon_railroad_sign_triple_striped_right", props -> new VerticalSignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block ANNOUNCEMENT_BEACON_SIGN_SINGLE_STRIPED = registerBlock("announcement_beacon_sign_single_striped", props -> new VerticalSignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block ANNOUNCEMENT_BEACON_SIGN_DOUBLE_STRIPED = registerBlock("announcement_beacon_sign_double_striped", props -> new VerticalSignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block ANNOUNCEMENT_BEACON_SIGN_TRIPLE_STRIPED = registerBlock("announcement_beacon_sign_triple_striped", props -> new VerticalSignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block ANNOUNCEMENT_BEACON_MOTORWAY_SIGN_SINGLE_STRIPED = registerBlock("announcement_beacon_motorway_sign_single_striped", props -> new VerticalSignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block ANNOUNCEMENT_BEACON_MOTORWAY_SIGN_DOUBLE_STRIPED = registerBlock("announcement_beacon_motorway_sign_double_striped", props -> new VerticalSignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Block ANNOUNCEMENT_BEACON_MOTORWAY_SIGN_TRIPLE_STRIPED = registerBlock("announcement_beacon_motorway_sign_triple_striped", props -> new VerticalSignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));

    public static final Block RAILWAY_CROSSBUCK_SIGN = registerBlock("railway_crossbuck_sign", props -> new RailwayCrossbuckSignBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));

    public static final Block GUARDRAIL = registerBlock("guardrail", props -> new GuardrailBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));

    public static final Block GUARDRAIL_OUTER_CORNER = registerBlock("guardrail_outer_corner", props -> new OuterGuardrailCornerBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));

    public static final Block GUARDRAIL_INNER_CORNER = registerBlock("guardrail_inner_corner", props -> new InnerGuardrailCornerBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));

    public static final Block DELINEATOR = registerBlock("delineator", props -> new DelineatorBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));

    public static final Block TRAFFIC_CONE = registerBlock("traffic_cone", props -> new TrafficConeBlock(props.mapColor(MapColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(2.0F, 3.0F)));

    public static final Block PORTABLE_TRAFFIC_DELINEATOR = registerBlock("portable_traffic_delineator_with_amber_flashing_light", props -> new PortableTrafficDelineatorBlock(props.mapColor(MapColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(2.0F, 3.0F)));
    public static final Block PORTABLE_TRAFFIC_DELINEATOR_2 = registerBlock("portable_traffic_delineator_with_amber_flashing_light_2", props -> new PortableTrafficDelineatorBlock(props.mapColor(MapColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(2.0F, 3.0F)));
    public static final Block PORTABLE_TRAFFIC_DELINEATOR_3 = registerBlock("portable_traffic_delineator_with_amber_flashing_light_3", props -> new PortableTrafficDelineatorBlock(props.mapColor(MapColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(2.0F, 3.0F)));
    public static final Block PORTABLE_TRAFFIC_DELINEATOR_4 = registerBlock("portable_traffic_delineator_with_amber_flashing_light_4", props -> new PortableTrafficDelineatorBlock(props.mapColor(MapColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(2.0F, 3.0F)));

    public static final Block TRAFFIC_LIGHT = registerBlock("traffic_light", props -> new TrafficLightBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F)));
    public static final Block YELLOW_TRAFFIC_LIGHT = registerBlock("yellow_traffic_light", props -> new TrafficLightBlock(props.mapColor(MapColor.COLOR_YELLOW).requiresCorrectToolForDrops().strength(2.0F, 3.0F)));
    public static final Block TRAFFIC_LIGHT_CONTROLLER = registerTooltipBlock("traffic_light_controller", props -> new TrafficLightControllerBlock(props.mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F)),0);

    public static final Block FIRE_HYDRANT = registerBlock("fire_hydrant", props -> new FireHydrantBlock(props.mapColor(MapColor.COLOR_RED).requiresCorrectToolForDrops().strength(2.0F, 3.0F)));

    public static final Block TELEVISION = registerBlockWithoutItem("television", props -> new TelevisionBlock(props.mapColor(MapColor.COLOR_BLACK).requiresCorrectToolForDrops().strength(2.0F, 2.0F)));
    public static final Block TELEVISION_ON = registerBlockWithoutItem("television_on", props -> new TelevisionBlock(props.mapColor(MapColor.COLOR_BLACK).requiresCorrectToolForDrops().strength(2.0F, 2.0F).lightLevel((blockStatex) -> 15)));
    public static final Block TELEVISION_GAME = registerBlockWithoutItem("television_game", props -> new TelevisionBlock(props.mapColor(MapColor.COLOR_BLACK).requiresCorrectToolForDrops().strength(2.0F, 2.0F).lightLevel((blockStatex) -> 15)));

    public static final Block COMPUTER_ON = registerBlockWithoutItem("computer_on", props -> new ComputerBlock(props.mapColor(MapColor.QUARTZ).requiresCorrectToolForDrops().strength(2.0F, 2.0F).lightLevel((blockStatex) -> 15)));

    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> factory) {
        ResourceKey<Block> blockKey = ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(TLOTDRoadsnVehicles.MOD_ID, name));
        ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(TLOTDRoadsnVehicles.MOD_ID, name));
        Block block = factory.apply(BlockBehaviour.Properties.of().setId(blockKey));
        Registry.register(BuiltInRegistries.BLOCK, blockKey.identifier(), block);
        Registry.register(BuiltInRegistries.ITEM, itemKey.identifier(), new BlockItem(block, new Item.Properties().setId(itemKey).useBlockDescriptionPrefix()));
        return block;
    }

    private static Block registerTooltipBlock(String name, Function<BlockBehaviour.Properties, Block> factory, int tooltip) {
        ResourceKey<Block> blockKey = ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(TLOTDRoadsnVehicles.MOD_ID, name));
        ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(TLOTDRoadsnVehicles.MOD_ID, name));
        Block block = factory.apply(BlockBehaviour.Properties.of().setId(blockKey));
        Registry.register(BuiltInRegistries.BLOCK, blockKey.identifier(), block);
        Registry.register(BuiltInRegistries.ITEM, itemKey.identifier(), new TooltipBlockItem(block, new Item.Properties().setId(itemKey), tooltip));
        return block;
    }

    private static Block registerBlockWithoutItem(String name, Function<BlockBehaviour.Properties, Block> factory) {
        ResourceKey<Block> blockKey = ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(TLOTDRoadsnVehicles.MOD_ID, name));
        Block block = factory.apply(BlockBehaviour.Properties.of().setId(blockKey));
        return Registry.register(BuiltInRegistries.BLOCK, blockKey.identifier(), block);
    }

    public static void registerModBlocks() {
        TLOTDRoadsnVehicles.LOGGER.info(
                "Registering Mod Blocks for " + TLOTDRoadsnVehicles.MOD_ID
        );
    }
}