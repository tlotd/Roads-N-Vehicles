package net.tlotd.roads_n_vehicles.block.custom;

import net.minecraft.block.*;
import net.minecraft.block.enums.BlockHalf;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class ManholeCoverBlock extends TrapdoorBlock {
    public ManholeCoverBlock(Settings settings, BlockSetType blockSetType) {
        super(settings, blockSetType);
    }

    protected static final VoxelShape OPEN_TOP_SHAPE_MANHOLE = Block.createCuboidShape(0.0F, 15.0F, 0.0F, 16.0F, 16.0F, 16.0F);
    protected static final VoxelShape OPEN_BOTTOM_SHAPE_MANHOLE = Block.createCuboidShape(0.0F, 7.0F, 0.0F, 16.0F, 8.0F, 16.0F);

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return state.get(HALF) == BlockHalf.TOP ? OPEN_TOP_SHAPE_MANHOLE : OPEN_BOTTOM_SHAPE_MANHOLE;
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        if (!state.get(OPEN)) {
            return state.get(HALF) == BlockHalf.TOP ? OPEN_TOP_SHAPE_MANHOLE : OPEN_BOTTOM_SHAPE_MANHOLE;
        }
        else return Block.createCuboidShape(0F, 0F, 0F, 0F, 0F, 0F);
    }
}