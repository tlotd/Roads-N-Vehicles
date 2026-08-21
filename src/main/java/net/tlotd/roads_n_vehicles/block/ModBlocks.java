package net.tlotd.roads_n_vehicles.block;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;
import net.tlotd.roads_n_vehicles.TLOTDRoadsnVehicles;
import net.tlotd.roads_n_vehicles.block.custom.*;
import net.tlotd.roads_n_vehicles.block.custom.SignBlock;
import net.tlotd.roads_n_vehicles.item.custom.LicensePlateBlockItem;
import net.tlotd.roads_n_vehicles.item.custom.TownSignBlockItem;

import java.util.function.Function;

import static net.minecraft.world.level.block.Blocks.litBlockEmission;

public class ModBlocks {

    public static final Block ASPHALT = registerBlock("asphalt",
            Block::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F));
    public static final Block ASPHALT_SLAB = registerBlock("asphalt_slab",
            SlabBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F));
    public static final Block ASPHALT_STAIRS = registerBlock("asphalt_stairs",
            properties -> new StairBlock(ASPHALT.defaultBlockState(), properties), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F));

    public static final Block ASPHALT_LINE_MARKING_ARROW = registerBlock("asphalt_line_marking_arrow",
            GlazedTerracottaBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F));
    public static final Block ASPHALT_LINE_MARKING_STRAIGHT = registerBlock("asphalt_line_marking_straight",
            GlazedTerracottaBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F));
    public static final Block ASPHALT_LINE_MARKING_CORNER = registerBlock("asphalt_line_marking_corner",
            GlazedTerracottaBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F));
    public static final Block ASPHALT_LINE_MARKING_T_JUNCTION = registerBlock("asphalt_line_marking_t-junction",
            GlazedTerracottaBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F));
    public static final Block ASPHALT_LINE_MARKING_CROSS = registerBlock("asphalt_line_marking_cross",
            Block::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F));
    public static final Block ASPHALT_SLAB_LINE_MARKING_ARROW = registerBlock("asphalt_slab_line_marking_arrow",
            RotatableSlabBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F));
    public static final Block ASPHALT_SLAB_LINE_MARKING_STRAIGHT= registerBlock("asphalt_slab_line_marking_straight",
            RotatableSlabBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F));
    public static final Block ASPHALT_SLAB_LINE_MARKING_CORNER = registerBlock("asphalt_slab_line_marking_corner",
            RotatableSlabBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F));
    public static final Block ASPHALT_SLAB_LINE_MARKING_T_JUNCTION = registerBlock("asphalt_slab_line_marking_t-junction",
            RotatableSlabBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F));
    public static final Block ASPHALT_SLAB_LINE_MARKING_CROSS = registerBlock("asphalt_slab_line_marking_cross",
            SlabBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F));

    public static final Block ASPHALT_YELLOW_LINE_MARKING_ARROW = registerBlock("asphalt_yellow_line_marking_arrow",
            GlazedTerracottaBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F));
    public static final Block ASPHALT_YELLOW_LINE_MARKING_STRAIGHT = registerBlock("asphalt_yellow_line_marking_straight",
            GlazedTerracottaBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F));
    public static final Block ASPHALT_YELLOW_LINE_MARKING_CORNER = registerBlock("asphalt_yellow_line_marking_corner",
            GlazedTerracottaBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F));
    public static final Block ASPHALT_YELLOW_LINE_MARKING_T_JUNCTION = registerBlock("asphalt_yellow_line_marking_t-junction",
            GlazedTerracottaBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F));
    public static final Block ASPHALT_YELLOW_LINE_MARKING_CROSS = registerBlock("asphalt_yellow_line_marking_cross",
            Block::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F));
    public static final Block ASPHALT_SLAB_YELLOW_LINE_MARKING_ARROW = registerBlock("asphalt_slab_yellow_line_marking_arrow",
            RotatableSlabBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F));
    public static final Block ASPHALT_SLAB_YELLOW_LINE_MARKING_STRAIGHT= registerBlock("asphalt_slab_yellow_line_marking_straight",
            RotatableSlabBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F));
    public static final Block ASPHALT_SLAB_YELLOW_LINE_MARKING_CORNER = registerBlock("asphalt_slab_yellow_line_marking_corner",
            RotatableSlabBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F));
    public static final Block ASPHALT_SLAB_YELLOW_LINE_MARKING_T_JUNCTION = registerBlock("asphalt_slab_yellow_line_marking_t-junction",
            RotatableSlabBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F));
    public static final Block ASPHALT_SLAB_YELLOW_LINE_MARKING_CROSS = registerBlock("asphalt_slab_yellow_line_marking_cross",
            SlabBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F));

    public static final Block ASPHALT_DOUBLE_LINE_MARKING_STRAIGHT = registerBlock("asphalt_double_line_marking_straight",
            GlazedTerracottaBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F));
    public static final Block ASPHALT_DOUBLE_LINE_MARKING_CORNER = registerBlock("asphalt_double_line_marking_corner",
            GlazedTerracottaBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F));
    public static final Block ASPHALT_DOUBLE_LINE_MARKING_T_JUNCTION = registerBlock("asphalt_double_line_marking_t-junction",
            GlazedTerracottaBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F));
    public static final Block ASPHALT_DOUBLE_LINE_MARKING_CROSS = registerBlock("asphalt_double_line_marking_cross",
            Block::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F));
    public static final Block ASPHALT_DOUBLE_YELLOW_LINE_MARKING_STRAIGHT = registerBlock("asphalt_double_yellow_line_marking_straight",
            GlazedTerracottaBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F));
    public static final Block ASPHALT_DOUBLE_YELLOW_LINE_MARKING_CORNER = registerBlock("asphalt_double_yellow_line_marking_corner",
            GlazedTerracottaBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F));
    public static final Block ASPHALT_DOUBLE_YELLOW_LINE_MARKING_T_JUNCTION = registerBlock("asphalt_double_yellow_line_marking_t-junction",
            GlazedTerracottaBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F));
    public static final Block ASPHALT_DOUBLE_YELLOW_LINE_MARKING_CROSS = registerBlock("asphalt_double_yellow_line_marking_cross",
            Block::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F));
    public static final Block ASPHALT_DOUBLE_RED_LINE_MARKING_STRAIGHT = registerBlock("asphalt_double_red_line_marking_straight",
            GlazedTerracottaBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F));
    public static final Block ASPHALT_DOUBLE_RED_LINE_MARKING_CORNER = registerBlock("asphalt_double_red_line_marking_corner",
            GlazedTerracottaBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F));
    public static final Block ASPHALT_DOUBLE_RED_LINE_MARKING_T_JUNCTION = registerBlock("asphalt_double_red_line_marking_t-junction",
            GlazedTerracottaBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F));
    public static final Block ASPHALT_DOUBLE_RED_LINE_MARKING_CROSS = registerBlock("asphalt_double_red_line_marking_cross",
            Block::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F));

    public static final Block MANHOLE_COVER = registerBlock("manhole_cover",
            properties -> new ManholeCoverBlock(BlockSetType.STONE, properties), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).speedFactor(1.25F));

    public static final Block IRON_ROD = registerBlock("iron_rod",
            ModRodBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block GUARDRAIL = registerBlock("guardrail",
            GuardrailBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block GUARDRAIL_OUTER_CORNER = registerBlock("guardrail_outer_corner",
            OuterGuardrailCornerBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block GUARDRAIL_INNER_CORNER = registerBlock("guardrail_inner_corner",
            InnerGuardrailCornerBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block DELINEATOR = registerBlock("delineator",
            DelineatorBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());

    public static final Block TOWN_SIGN = registerTownSignBlock("town_sign",
            TownSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());

    public static final Block COAT_OF_ARMS = registerBlock("coat_of_arms",
            CoatOfArmsBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());

    public static final Block LICENSE_PLATE = registerLicensePlateBlock("license_plate",
            LicensePlateBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());

    public static final Block POLICE_LIGHTS = registerBlock("police_lights",
            PoliceLightsBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).lightLevel(litBlockEmission(15)).noOcclusion());

    public static final Block ROUND_SIGN = registerBlock("round_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());

    public static final Block SPEED_LIMIT_10_SIGN = registerBlock("speed_limit_10_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SPEED_LIMIT_20_SIGN = registerBlock("speed_limit_20_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SPEED_LIMIT_30_SIGN = registerBlock("speed_limit_30_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SPEED_LIMIT_40_SIGN = registerBlock("speed_limit_40_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SPEED_LIMIT_50_SIGN = registerBlock("speed_limit_50_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SPEED_LIMIT_60_SIGN = registerBlock("speed_limit_60_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SPEED_LIMIT_70_SIGN = registerBlock("speed_limit_70_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SPEED_LIMIT_80_SIGN = registerBlock("speed_limit_80_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SPEED_LIMIT_90_SIGN = registerBlock("speed_limit_90_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SPEED_LIMIT_100_SIGN = registerBlock("speed_limit_100_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SPEED_LIMIT_110_SIGN = registerBlock("speed_limit_110_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SPEED_LIMIT_120_SIGN = registerBlock("speed_limit_120_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SPEED_LIMIT_130_SIGN = registerBlock("speed_limit_130_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SPEED_LIMIT_140_SIGN = registerBlock("speed_limit_140_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());

    public static final Block SPEED_LIMIT_10_END_SIGN = registerBlock("speed_limit_10_end_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SPEED_LIMIT_20_END_SIGN = registerBlock("speed_limit_20_end_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SPEED_LIMIT_30_END_SIGN = registerBlock("speed_limit_30_end_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SPEED_LIMIT_40_END_SIGN = registerBlock("speed_limit_40_end_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SPEED_LIMIT_50_END_SIGN = registerBlock("speed_limit_50_end_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SPEED_LIMIT_60_END_SIGN = registerBlock("speed_limit_60_end_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SPEED_LIMIT_70_END_SIGN = registerBlock("speed_limit_70_end_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SPEED_LIMIT_80_END_SIGN = registerBlock("speed_limit_80_end_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SPEED_LIMIT_90_END_SIGN = registerBlock("speed_limit_90_end_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SPEED_LIMIT_100_END_SIGN = registerBlock("speed_limit_100_end_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SPEED_LIMIT_110_END_SIGN = registerBlock("speed_limit_110_end_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SPEED_LIMIT_120_END_SIGN = registerBlock("speed_limit_120_end_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SPEED_LIMIT_130_END_SIGN = registerBlock("speed_limit_130_end_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SPEED_LIMIT_140_END_SIGN = registerBlock("speed_limit_140_end_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());

    public static final Block END_OF_ALL_PREVIOUSLY_SIGNED_RESTRICTIONS_SIGN = registerBlock("end_of_all_previously_signed_restrictions_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());

    public static final Block NO_VEHICLES_SIGN = registerBlock("no_vehicles_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block NO_ENTRY_SIGN = registerBlock("no_entry_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block MOTOR_VEHICLES_PROHIBITED_SIGN = registerBlock("motor_vehicles_prohibited_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block PEDESTRIANS_PROHIBITED_SIGN = registerBlock("pedestrians_prohibited_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block NO_OVERTAKING_SIGN = registerBlock("no_overtaking_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block NO_HEAVY_OVERTAKING_SIGN = registerBlock("no_heavy_overtaking_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block END_NO_OVERTAKING_SIGN = registerBlock("end_no_overtaking_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block END_NO_HEAVY_OVERTAKING_SIGN = registerBlock("end_no_heavy_overtaking_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block NO_STOPPING_SIGN = registerBlock("no_stopping_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block NO_PARKING_SIGN = registerBlock("no_parking_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SIDEWALK_SIGN = registerBlock("sidewalk_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block BUS_LANE_SIGN = registerBlock("bus_lane_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SNOW_CHAINS_REQUIRED_SIGN = registerBlock("snow_chains_required_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block GO_STRAIGHT_SIGN = registerBlock("go_straight_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block GO_LEFT_SIGN = registerBlock("go_left_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block GO_RIGHT_SIGN = registerBlock("go_right_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block TURN_LEFT_SIGN = registerBlock("turn_left_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block TURN_RIGHT_SIGN = registerBlock("turn_right_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block GO_STRAIGHT_OR_LEFT_SIGN = registerBlock("go_straight_or_left_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block GO_STRAIGHT_OR_RIGHT_SIGN = registerBlock("go_straight_or_right_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block GO_LEFT_OR_RIGHT_SIGN = registerBlock("go_left_or_right_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block PASS_LEFT_SIGN = registerBlock("pass_left_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block PASS_RIGHT_SIGN = registerBlock("pass_right_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block ROUNDABOUT_SIGN = registerBlock("roundabout_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block ROUNDABOUT_FLIPPED_SIGN = registerBlock("roundabout_flipped_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());

    public static final Block NO_LEFT_TURN_SIGN = registerBlock("no_left_turn_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block NO_RIGHT_TURN_SIGN = registerBlock("no_right_turn_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block NO_U_TURN_SIGN = registerBlock("no_u_turn_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());

    public static final Block STOP_SIGN = registerBlock("stop_sign",
            BigSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());

    public static final Block YIELD_SIGN = registerBlock("yield_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block YIELD_US_SIGN = registerBlock("yield_us_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());

    public static final Block DIAMOND_SIGN = registerBlock("diamond_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block PRIORITY_ROAD_SIGN = registerBlock("priority_road_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block END_OF_PRIORITY_ROAD_SIGN = registerBlock("end_of_priority_road_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block TURN_LEFT_US_SIGN = registerBlock("turn_left_us_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block TURN_RIGHT_US_SIGN = registerBlock("turn_right_us_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block NO_THROUGH_ROAD_US_SIGN = registerBlock("no_through_road_us_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());

    public static final Block TRIANGLE_SIGN = registerBlock("triangle_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block RIGHT_OF_WAY_SIGN = registerBlock("right_of_way_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block PRIORITY_RIGHT_SIGN = registerBlock("priority_right_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block DANGER_SIGN = registerBlock("danger_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block ROADWORKS_SIGN = registerBlock("roadworks_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block RAILROAD_CROSSING_SIGN = registerBlock("railroad_crossing_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block UNEVEN_ROAD_SIGN = registerBlock("uneven_road_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block ONCOMING_TRAFFIC_SIGN = registerBlock("oncoming_traffic_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block ASCEND_SIGN = registerBlock("ascent_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block DECEND_SIGN = registerBlock("decent_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block CURVE_LEFT_SIGN = registerBlock("curve_left_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block CURVE_RIGHT_SIGN = registerBlock("curve_right_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block DOUBLE_CURVE_LEFT_SIGN = registerBlock("double_curve_left_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block DOUBLE_CURVE_RIGHT_SIGN = registerBlock("double_curve_right_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block ROAD_NARROWING_SIGN = registerBlock("road_narrowing_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block ROAD_NARROWING_LEFT_SIGN = registerBlock("road_narrowing_left_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block ROAD_NARROWING_RIGHT_SIGN = registerBlock("road_narrowing_right_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block WILD_ANIMALS_LEFT_SIGN = registerBlock("wild_animals_left_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block WILD_ANIMALS_RIGHT_SIGN = registerBlock("wild_animals_right_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block WILD_DINOSAURS_SIGN = registerBlock("wild_dinosaurs_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());

    public static final Block TRAFFIC_SIGNALS_SIGN = registerBlock("traffic_signals_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block PEDESTRIAN_CROSSING_LEFT_WARNING_SIGN = registerBlock("pedestrian_crossing_left_warning_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block PEDESTRIAN_CROSSING_RIGHT_WARNING_SIGN = registerBlock("pedestrian_crossing_right_warning_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block CROSSWIND_LEFT_SIGN = registerBlock("crosswind_left_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block CROSSWIND_RIGHT_SIGN = registerBlock("crosswind_right_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block ROCKFALL_LEFT_SIGN = registerBlock("rockfall_left_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block ROCKFALL_RIGHT_SIGN = registerBlock("rockfall_right_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block AIRCRAFT_LEFT_SIGN = registerBlock("aircraft_left_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block AIRCRAFT_RIGHT_SIGN = registerBlock("aircraft_right_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block AIRCSHIP_LEFT_SIGN = registerBlock("airship_left_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block AIRCSHIP_RIGHT_SIGN = registerBlock("airship_right_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SLIPPERINESS_SIGN = registerBlock("slipperiness_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block ICY_ROAD_SIGN = registerBlock("icy_road_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block GRITTY_ROAD_EDGE_SIGN = registerBlock("gritty_road_edge_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block TRAFFIC_JAMS_SIGN = registerBlock("traffic_jams_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block RIVERBANK_SIGN = registerBlock("riverbank_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());

    public static final Block SMALL_SQUARE_SIGN = registerBlock("small_square_sign",
            SmallSquareSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block PRIORITY_ROAD_LEFT_SIGN = registerBlock("priority_road_left_sign",
            SmallSquareSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block PRIORITY_ROAD_RIGHT_SIGN = registerBlock("priority_road_right_sign",
            SmallSquareSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block PRIORITY_ROAD_LEFT_STRAIGHT_SIGN = registerBlock("priority_road_left_straight_sign",
            SmallSquareSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block PRIORITY_ROAD_LEFT_STRAIGHT_NOT_RIGHT_SIGN = registerBlock("priority_road_left_straight_not_right_sign",
            SmallSquareSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block PRIORITY_ROAD_RIGHT_STRAIGHT_SIGN = registerBlock("priority_road_right_straight_sign",
            SmallSquareSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block PRIORITY_ROAD_RIGHT_STRAIGHT_NOT_LEFT_SIGN = registerBlock("priority_road_right_straight_not_left_sign",
            SmallSquareSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block PRIORITY_ROAD_LEFT_NOT_STRAIGHT_SIGN = registerBlock("priority_road_left_not_straight_sign",
            SmallSquareSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block PRIORITY_ROAD_LEFT_NOT_RIGHT_SIGN = registerBlock("priority_road_left_not_right_sign",
            SmallSquareSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block PRIORITY_ROAD_RIGHT_NOT_STRAIGHT_SIGN = registerBlock("priority_road_right_not_straight_sign",
            SmallSquareSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block PRIORITY_ROAD_RIGHT_NOT_LEFT_SIGN = registerBlock("priority_road_right_not_left_sign",
            SmallSquareSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());

    public static final Block SQUARE_SIGN = registerBlock("square_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block DIRECTION_SIGN_LEFT_CURVE = registerBlock("direction_sign_left_curve",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block DIRECTION_SIGN_RIGHT_CURVE = registerBlock("direction_sign_right_curve",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block TUNNEL_SIGN = registerBlock("tunnel_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block NO_THROUGH_ROAD_SIGN = registerBlock("no_through_road_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block PEDESTRIAN_CROSSING_LEFT_SIGN = registerBlock("pedestrian_crossing_left_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block PEDESTRIAN_CROSSING_RIGHT_SIGN = registerBlock("pedestrian_crossing_right_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block EXPRESSWAY_SIGN = registerBlock("expressway_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block MOTORWAY_SIGN = registerBlock("motorway_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block EXPRESSWAY_END_SIGN = registerBlock("expressway_end_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block MOTORWAY_END_SIGN = registerBlock("motorway_end_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block PARKING_SIGN = registerBlock("parking_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block PARKING_GARAGE_SIGN = registerBlock("parking_garage_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());

    public static final Block PRIORITY_OVER_ONCOMING_TRAFFIC_SIGN = registerBlock("priority_over_oncoming_traffic_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block GIVE_WAY_TO_ONCOMING_TRAFFIC_SIGN = registerBlock("give_way_to_oncoming_traffic_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());

    public static final Block NO_LEFT_TURN_US_SIGN = registerBlock("no_left_turn_us_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block NO_RIGHT_TURN_US_SIGN = registerBlock("no_right_turn_us_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block NO_U_TURN_US_SIGN = registerBlock("no_u_turn_us_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block NO_ENTRY_US_SIGN = registerBlock("no_entry_us_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());

    public static final Block US_ROUTE_1_SIGN = registerBlock("us_route_1_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block US_ROUTE_2_SIGN = registerBlock("us_route_2_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block US_ROUTE_3_SIGN = registerBlock("us_route_3_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block US_ROUTE_4_SIGN = registerBlock("us_route_4_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block US_ROUTE_5_SIGN = registerBlock("us_route_5_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block US_ROUTE_6_SIGN = registerBlock("us_route_6_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block US_ROUTE_7_SIGN = registerBlock("us_route_7_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block US_ROUTE_8_SIGN = registerBlock("us_route_8_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block US_ROUTE_9_SIGN = registerBlock("us_route_9_sign",
            SignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());

    public static final Block SMALL_ROUTE_NUMBER_SIGN = registerBlock("small_route_number_sign",
            SmallRouteNumberSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SMALL_ROUTE_NUMBER_1_SIGN = registerBlock("small_route_number_1_sign",
            SmallRouteNumberSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SMALL_ROUTE_NUMBER_2_SIGN = registerBlock("small_route_number_2_sign",
            SmallRouteNumberSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SMALL_ROUTE_NUMBER_3_SIGN = registerBlock("small_route_number_3_sign",
            SmallRouteNumberSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SMALL_ROUTE_NUMBER_4_SIGN = registerBlock("small_route_number_4_sign",
            SmallRouteNumberSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SMALL_ROUTE_NUMBER_5_SIGN = registerBlock("small_route_number_5_sign",
            SmallRouteNumberSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SMALL_ROUTE_NUMBER_6_SIGN = registerBlock("small_route_number_6_sign",
            SmallRouteNumberSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SMALL_ROUTE_NUMBER_7_SIGN = registerBlock("small_route_number_7_sign",
            SmallRouteNumberSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SMALL_ROUTE_NUMBER_8_SIGN = registerBlock("small_route_number_8_sign",
            SmallRouteNumberSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SMALL_ROUTE_NUMBER_9_SIGN = registerBlock("small_route_number_9_sign",
            SmallRouteNumberSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SMALL_ROUTE_NUMBER_1_HIGHWAY_SIGN = registerBlock("small_route_number_1_highway_sign",
            SmallRouteNumberSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SMALL_ROUTE_NUMBER_2_HIGHWAY_SIGN = registerBlock("small_route_number_2_highway_sign",
            SmallRouteNumberSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SMALL_ROUTE_NUMBER_3_HIGHWAY_SIGN = registerBlock("small_route_number_3_highway_sign",
            SmallRouteNumberSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SMALL_ROUTE_NUMBER_4_HIGHWAY_SIGN = registerBlock("small_route_number_4_highway_sign",
            SmallRouteNumberSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SMALL_ROUTE_NUMBER_5_HIGHWAY_SIGN = registerBlock("small_route_number_5_highway_sign",
            SmallRouteNumberSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SMALL_ROUTE_NUMBER_6_HIGHWAY_SIGN = registerBlock("small_route_number_6_highway_sign",
            SmallRouteNumberSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SMALL_ROUTE_NUMBER_7_HIGHWAY_SIGN = registerBlock("small_route_number_7_highway_sign",
            SmallRouteNumberSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SMALL_ROUTE_NUMBER_8_HIGHWAY_SIGN = registerBlock("small_route_number_8_highway_sign",
            SmallRouteNumberSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SMALL_ROUTE_NUMBER_9_HIGHWAY_SIGN = registerBlock("small_route_number_9_highway_sign",
            SmallRouteNumberSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());

    public static final Block HORIZONTAL_SIGN = registerBlock("horizontal_sign",
            HorizontalSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block ONE_WAY_STREET_SIGN_LEFT = registerBlock("one-way_street_sign_left",
            HorizontalSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block ONE_WAY_STREET_SIGN_RIGHT = registerBlock("one-way_street_sign_right",
            HorizontalSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());

    public static final Block TALL_RECTANGULAR_SIGN = registerBlock("tall_rectangular_sign",
            TallRectangularSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SPEED_LIMIT_US_5_SIGN = registerBlock("speed_limit_us_5_sign",
            TallRectangularSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SPEED_LIMIT_US_10_SIGN = registerBlock("speed_limit_us_10_sign",
            TallRectangularSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SPEED_LIMIT_US_15_SIGN = registerBlock("speed_limit_us_15_sign",
            TallRectangularSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SPEED_LIMIT_US_20_SIGN = registerBlock("speed_limit_us_20_sign",
            TallRectangularSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SPEED_LIMIT_US_25_SIGN = registerBlock("speed_limit_us_25_sign",
            TallRectangularSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SPEED_LIMIT_US_30_SIGN = registerBlock("speed_limit_us_30_sign",
            TallRectangularSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SPEED_LIMIT_US_35_SIGN = registerBlock("speed_limit_us_35_sign",
            TallRectangularSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SPEED_LIMIT_US_40_SIGN = registerBlock("speed_limit_us_40_sign",
            TallRectangularSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SPEED_LIMIT_US_45_SIGN = registerBlock("speed_limit_us_45_sign",
            TallRectangularSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SPEED_LIMIT_US_50_SIGN = registerBlock("speed_limit_us_50_sign",
            TallRectangularSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SPEED_LIMIT_US_55_SIGN = registerBlock("speed_limit_us_55_sign",
            TallRectangularSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SPEED_LIMIT_US_60_SIGN = registerBlock("speed_limit_us_60_sign",
            TallRectangularSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SPEED_LIMIT_US_65_SIGN = registerBlock("speed_limit_us_65_sign",
            TallRectangularSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SPEED_LIMIT_US_70_SIGN = registerBlock("speed_limit_us_70_sign",
            TallRectangularSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SPEED_LIMIT_US_75_SIGN = registerBlock("speed_limit_us_75_sign",
            TallRectangularSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SPEED_LIMIT_US_80_SIGN = registerBlock("speed_limit_us_80_sign",
            TallRectangularSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SPEED_LIMIT_US_85_SIGN = registerBlock("speed_limit_us_85_sign",
            TallRectangularSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SPEED_LIMIT_US_90_SIGN = registerBlock("speed_limit_us_90_sign",
            TallRectangularSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block SPEED_LIMIT_US_95_SIGN = registerBlock("speed_limit_us_95_sign",
            TallRectangularSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());

    public static final Block VERTICAL_SIGN = registerBlock("vertical_sign",
            VerticalSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block GUIDING_BEACON_SIGN_LEFT = registerBlock("guiding_beacon_sign_left",
            VerticalSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block GUIDING_BEACON_SIGN_RIGHT = registerBlock("guiding_beacon_sign_right",
            VerticalSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block GUIDING_BEACON_SIGN_MIDDLE = registerBlock("guiding_beacon_sign_middle",
            VerticalSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block ANNOUNCEMENT_BEACON_RAILROAD_SIGN_SINGLE_STRIPED_LEFT = registerBlock("announcement_beacon_railroad_sign_single_striped_left",
            VerticalSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block ANNOUNCEMENT_BEACON_RAILROAD_SIGN_DOUBLE_STRIPED_LEFT = registerBlock("announcement_beacon_railroad_sign_double_striped_left",
            VerticalSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block ANNOUNCEMENT_BEACON_RAILROAD_SIGN_TRIPLE_STRIPED_LEFT = registerBlock("announcement_beacon_railroad_sign_triple_striped_left",
            VerticalSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block ANNOUNCEMENT_BEACON_RAILROAD_SIGN_SINGLE_STRIPED_RIGHT = registerBlock("announcement_beacon_railroad_sign_single_striped_right",
            VerticalSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block ANNOUNCEMENT_BEACON_RAILROAD_SIGN_DOUBLE_STRIPED_RIGHT = registerBlock("announcement_beacon_railroad_sign_double_striped_right",
            VerticalSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block ANNOUNCEMENT_BEACON_RAILROAD_SIGN_TRIPLE_STRIPED_RIGHT = registerBlock("announcement_beacon_railroad_sign_triple_striped_right",
            VerticalSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block ANNOUNCEMENT_BEACON_SIGN_SINGLE_STRIPED = registerBlock("announcement_beacon_sign_single_striped",
            VerticalSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block ANNOUNCEMENT_BEACON_SIGN_DOUBLE_STRIPED = registerBlock("announcement_beacon_sign_double_striped",
            VerticalSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block ANNOUNCEMENT_BEACON_SIGN_TRIPLE_STRIPED = registerBlock("announcement_beacon_sign_triple_striped",
            VerticalSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block ANNOUNCEMENT_BEACON_MOTORWAY_SIGN_SINGLE_STRIPED = registerBlock("announcement_beacon_motorway_sign_single_striped",
            VerticalSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block ANNOUNCEMENT_BEACON_MOTORWAY_SIGN_DOUBLE_STRIPED = registerBlock("announcement_beacon_motorway_sign_double_striped",
            VerticalSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());
    public static final Block ANNOUNCEMENT_BEACON_MOTORWAY_SIGN_TRIPLE_STRIPED = registerBlock("announcement_beacon_motorway_sign_triple_striped",
            VerticalSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());

    public static final Block RAILWAY_CROSSBUCK_SIGN = registerBlock("railway_crossbuck_sign",
            RailwayCrossbuckSignBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());

    public static final Block TRAFFIC_CONE = registerBlock("traffic_cone",
            TrafficConeBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(2.0F, 3.0F));

    public static final Block FIRE_HYDRANT = registerBlock("fire_hydrant",
            FireHydrantBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).requiresCorrectToolForDrops().strength(2.0F, 3.0F));

    public static final Block PORTABLE_TRAFFIC_DELINEATOR = registerBlock("portable_traffic_delineator_with_amber_flashing_light",
            PortableTrafficDelineatorBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(2.0F, 3.0F));
    public static final Block PORTABLE_TRAFFIC_DELINEATOR_2 = registerBlock("portable_traffic_delineator_with_amber_flashing_light_2",
            PortableTrafficDelineatorBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(2.0F, 3.0F));
    public static final Block PORTABLE_TRAFFIC_DELINEATOR_3 = registerBlock("portable_traffic_delineator_with_amber_flashing_light_3",
            PortableTrafficDelineatorBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(2.0F, 3.0F));
    public static final Block PORTABLE_TRAFFIC_DELINEATOR_4 = registerBlock("portable_traffic_delineator_with_amber_flashing_light_4",
            PortableTrafficDelineatorBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(2.0F, 3.0F));

    public static final Block TRAFFIC_LIGHT = registerBlock("traffic_light",
            TrafficLightBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F));
    public static final Block YELLOW_TRAFFIC_LIGHT = registerBlock("yellow_traffic_light",
            TrafficLightBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).requiresCorrectToolForDrops().strength(2.0F, 3.0F));
    public static final Block TRAFFIC_LIGHT_CONTROLLER = registerBlock("traffic_light_controller",
            TrafficLightControllerBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2.0F, 3.0F));

    public static final Block SPEED_CAMERA = registerBlock("speed_camera",
            SpeedCameraBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion());

    public static final Block TELEVISION = registerBlockWithoutItem("television",
            TelevisionBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).requiresCorrectToolForDrops().strength(2.0F, 2.0F));
    public static final Block TELEVISION_ON = registerBlockWithoutItem("television_on",
            TelevisionBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).requiresCorrectToolForDrops().strength(2.0F, 2.0F).lightLevel((blockStatex) -> 10));
    public static final Block TELEVISION_GAME = registerBlockWithoutItem("television_game",
            TelevisionBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).requiresCorrectToolForDrops().strength(2.0F, 2.0F).lightLevel((blockStatex) -> 10));

    public static final Block COMPUTER_ON = registerBlockWithoutItem("computer_on",
            ComputerBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.QUARTZ).requiresCorrectToolForDrops().strength(2.0F, 2.0F).lightLevel((blockStatex) -> 10));

    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties properties) {
        Identifier id = Identifier.fromNamespaceAndPath(TLOTDRoadsnVehicles.MOD_ID, name);
        ResourceKey<Block> blockKey = ResourceKey.create(Registries.BLOCK, id);
        Block block = factory.apply(properties.setId(blockKey));
        ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, id);
        BlockItem blockItem = new BlockItem(block, new Item.Properties().setId(itemKey).useBlockDescriptionPrefix());
        Registry.register(BuiltInRegistries.ITEM, itemKey, blockItem);
        return Registry.register(BuiltInRegistries.BLOCK, blockKey, block);
    }

    private static Block registerTownSignBlock(String name, Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties properties) {
        Identifier id = Identifier.fromNamespaceAndPath(TLOTDRoadsnVehicles.MOD_ID, name);
        ResourceKey<Block> blockKey = ResourceKey.create(Registries.BLOCK, id);
        Block block = factory.apply(properties.setId(blockKey));
        ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, id);
        BlockItem blockItem = new TownSignBlockItem(block, new Item.Properties().setId(itemKey).useBlockDescriptionPrefix());
        Registry.register(BuiltInRegistries.ITEM, itemKey, blockItem);
        return Registry.register(BuiltInRegistries.BLOCK, blockKey, block);
    }

    private static Block registerLicensePlateBlock(String name, Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties properties) {
        Identifier id = Identifier.fromNamespaceAndPath(TLOTDRoadsnVehicles.MOD_ID, name);
        ResourceKey<Block> blockKey = ResourceKey.create(Registries.BLOCK, id);
        Block block = factory.apply(properties.setId(blockKey));
        ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, id);
        BlockItem blockItem = new LicensePlateBlockItem(block, new Item.Properties().setId(itemKey).useBlockDescriptionPrefix());
        Registry.register(BuiltInRegistries.ITEM, itemKey, blockItem);
        return Registry.register(BuiltInRegistries.BLOCK, blockKey, block);
    }

    private static Block registerBlockWithoutItem(String name, Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties properties) {
        Identifier id = Identifier.fromNamespaceAndPath(TLOTDRoadsnVehicles.MOD_ID, name);
        ResourceKey<Block> blockKey = ResourceKey.create(Registries.BLOCK, id);
        Block block = factory.apply(properties.setId(blockKey));
        return Registry.register(BuiltInRegistries.BLOCK, blockKey, block);
    }

    public static void registerModBlocks() {
        TLOTDRoadsnVehicles.LOGGER.info("Registering ModBlocks for " + TLOTDRoadsnVehicles.MOD_ID);
    }
}