package net.tlotd.roads_n_vehicles.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import org.jetbrains.annotations.NotNull;

public class RotatableSlabBlock extends SlabBlock {

    public static final MapCodec<RotatableSlabBlock> CODEC = simpleCodec(RotatableSlabBlock::new);
    public @NotNull MapCodec<RotatableSlabBlock> codec() {
        return CODEC;
    }

    public static final EnumProperty<@NotNull Direction> FACING = BlockStateProperties.HORIZONTAL_FACING;

    public RotatableSlabBlock(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(FACING, Direction.NORTH).setValue(TYPE, SlabType.BOTTOM).setValue(WATERLOGGED, false));
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext blockPlaceContext) {
        BlockPos blockPos = blockPlaceContext.getClickedPos();
        Direction direction = blockPlaceContext.getHorizontalDirection().getOpposite();
        BlockState blockState = blockPlaceContext.getLevel().getBlockState(blockPos);
        if (blockState.is(this)) {
            return blockState.setValue(FACING, direction).setValue(TYPE, SlabType.DOUBLE).setValue(WATERLOGGED, false);
        } else {
            FluidState fluidState = blockPlaceContext.getLevel().getFluidState(blockPos);
            BlockState blockState2 = this.defaultBlockState().setValue(FACING, direction).setValue(TYPE, SlabType.BOTTOM).setValue(WATERLOGGED, fluidState.getType() == Fluids.WATER);
            return direction != Direction.DOWN && (direction == Direction.UP || !(blockPlaceContext.getClickLocation().y - (double)blockPos.getY() > (double)0.5F)) ? blockState2 : blockState2.setValue(TYPE, SlabType.TOP);
        }
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, @NotNull BlockState> builder) {
        builder.add(FACING, TYPE, WATERLOGGED);
    }
}