package net.tlotd.roads_n_vehicles.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RedstoneTorchBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.redstone.Orientation;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.tlotd.roads_n_vehicles.block.enum_property.PoliceLightsPart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PoliceLightsBlock extends SignBlock {

    public static final BooleanProperty LIT = RedstoneTorchBlock.LIT;
    public static final EnumProperty<PoliceLightsPart> PART = EnumProperty.create("part", PoliceLightsPart.class);

    public PoliceLightsBlock(Properties properties) {
        super(properties);
        registerDefaultState(stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(PART, PoliceLightsPart.CENTER).setValue(LIT, false).setValue(WATERLOGGED, false));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, PART, LIT, WATERLOGGED);
    }

    @Override
    protected void neighborChanged(BlockState blockState, Level level, BlockPos blockPos, Block block, @Nullable Orientation orientation, boolean bl) {
        if (!level.isClientSide()) {
            boolean bl2 = blockState.getValue(LIT);
            if (bl2 != level.hasNeighborSignal(blockPos) && blockState.getValue(PART).equals(PoliceLightsPart.CENTER)) {
                if (bl2) {
                    level.scheduleTick(blockPos, this, 4);
                } else {
                    level.setBlock(blockPos, blockState.cycle(LIT), 2);
                }
            }
        }
    }

    @Override
    public void tick(BlockState blockState, ServerLevel serverLevel, BlockPos blockPos, RandomSource randomSource) {
        if (blockState.getValue(LIT) && blockState.getValue(PART).equals(PoliceLightsPart.CENTER) && !serverLevel.hasNeighborSignal(blockPos)) {
            serverLevel.setBlock(blockPos, blockState.cycle(LIT), 2);
        }
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        Direction facing = context.getHorizontalDirection();
        Level level = context.getLevel();
        BlockPos centerPos = context.getClickedPos();
        BlockPos leftPos = centerPos.relative(facing.getCounterClockWise());
        BlockPos rightPos = centerPos.relative(facing.getClockWise());
        if (!level.getBlockState(leftPos).canBeReplaced(context)) {
            return null;
        }
        if (!level.getBlockState(rightPos).canBeReplaced(context)) {
            return null;
        }
        return defaultBlockState()
                .setValue(FACING, facing)
                .setValue(PART, PoliceLightsPart.CENTER)
                .setValue(LIT, false)
                .setValue(WATERLOGGED, level.getFluidState(centerPos).getType() == Fluids.WATER);
    }

    @Override
    public void setPlacedBy(Level level, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack stack) {
        if (level.isClientSide()) {
            return;
        }
        Direction facing = state.getValue(FACING);
        BlockPos leftPos = pos.relative(facing.getCounterClockWise());
        BlockPos rightPos = pos.relative(facing.getClockWise());
        BlockState leftState = defaultBlockState()
                .setValue(FACING, facing)
                .setValue(PART, PoliceLightsPart.LEFT)
                .setValue(WATERLOGGED, level.getFluidState(leftPos).getType() == Fluids.WATER);
        BlockState rightState = defaultBlockState()
                .setValue(FACING, facing)
                .setValue(PART, PoliceLightsPart.RIGHT)
                .setValue(WATERLOGGED, level.getFluidState(rightPos).getType() == Fluids.WATER);
        level.setBlock(leftPos, leftState, Block.UPDATE_CLIENTS);
        level.setBlock(rightPos, rightState, Block.UPDATE_CLIENTS);
        level.sendBlockUpdated(pos, state, state, Block.UPDATE_ALL);
    }

    @Override
    protected void affectNeighborsAfterRemoval(BlockState blockState, ServerLevel serverLevel, BlockPos blockPos, boolean bl) {
        destroyOtherParts(serverLevel, blockPos, blockState);
        super.affectNeighborsAfterRemoval(blockState, serverLevel, blockPos, bl);
    }

    private void destroyOtherParts(Level level, BlockPos pos, BlockState state) {
        BlockPos centerPos = getCenterPos(pos, state);
        Direction facing = state.getValue(FACING);
        BlockPos leftPos = centerPos.relative(facing.getCounterClockWise());
        BlockPos rightPos = centerPos.relative(facing.getClockWise());
        removeIfPart(level, leftPos, pos);
        removeIfPart(level, centerPos, pos);
        removeIfPart(level, rightPos, pos);
    }

    private void removeIfPart(Level level, BlockPos targetPos, BlockPos removedPos) {
        if (targetPos.equals(removedPos)) {
            return;
        }
        BlockState state = level.getBlockState(targetPos);
        if (state.getBlock() == this) {
            level.setBlock(
                    targetPos,
                    Blocks.AIR.defaultBlockState(),
                    Block.UPDATE_ALL
            );
        }
    }

    private BlockPos getCenterPos(BlockPos pos, BlockState state) {
        Direction facing = state.getValue(FACING);
        return switch (state.getValue(PART)) {
            case CENTER -> pos;
            case LEFT -> pos.relative(facing.getClockWise());
            case RIGHT -> pos.relative(facing.getCounterClockWise());
        };
    }

    private static final VoxelShape Z_SHAPE = Block.box(-14, 0, 4, 30, 5, 12);
    private static final VoxelShape Z_SHAPE_2 = Block.box(2, 0, 4, 46, 5, 12);
    private static final VoxelShape Z_SHAPE_3 = Block.box(-30, 0, 4, 14, 5, 12);
    private static final VoxelShape X_SHAPE = Block.box(4, 0, -14, 12, 5, 30);
    private static final VoxelShape X_SHAPE_2 = Block.box(4, 0, 2, 12, 5, 46);
    private static final VoxelShape X_SHAPE_3 = Block.box(4, 0, -30, 12, 5, 14);
    private static final VoxelShape NO_SHAPE = Block.box(0, 0, 0, 0, 0, 0);

    public @NotNull VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
        if (blockState.getValue(PART).equals(PoliceLightsPart.RIGHT)) {
            switch (blockState.getValue(FACING)) {
                case NORTH -> {
                    return Z_SHAPE_3;
                }
                case SOUTH -> {
                    return Z_SHAPE_2;
                }
                case EAST -> {
                    return X_SHAPE_3;
                }
                case WEST -> {
                    return X_SHAPE_2;
                }
                default -> {
                    return NO_SHAPE;
                }
            }
        } else if (blockState.getValue(PART).equals(PoliceLightsPart.LEFT)) {
            switch (blockState.getValue(FACING)) {
                case NORTH -> {
                    return Z_SHAPE_2;
                }
                case SOUTH -> {
                    return Z_SHAPE_3;
                }
                case EAST -> {
                    return X_SHAPE_2;
                }
                case WEST -> {
                    return X_SHAPE_3;
                }
                default -> {
                    return NO_SHAPE;
                }
            }
        } else {
            switch (blockState.getValue(FACING)) {
                case NORTH, SOUTH -> {
                    return Z_SHAPE;
                }
                case WEST, EAST -> {
                    return X_SHAPE;
                }
                default -> {
                    return NO_SHAPE;
                }
            }
        }
    }
}