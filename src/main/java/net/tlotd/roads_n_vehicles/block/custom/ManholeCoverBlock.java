package net.tlotd.roads_n_vehicles.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.Half;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ManholeCoverBlock extends TrapDoorBlock {

    protected static final VoxelShape OPEN_TOP_SHAPE_MANHOLE = Block.box(0.0F, 15.0F, 0.0F, 16.0F, 16.0F, 16.0F);
    protected static final VoxelShape OPEN_BOTTOM_SHAPE_MANHOLE = Block.box(0.0F, 7.0F, 0.0F, 16.0F, 8.0F, 16.0F);

    public ManholeCoverBlock(Properties properties, BlockSetType blockSetType) {
        super(properties, blockSetType);
    }

    @Override
    public VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
        return blockState.getValue(HALF) == Half.TOP ? OPEN_TOP_SHAPE_MANHOLE : OPEN_BOTTOM_SHAPE_MANHOLE;
    }

    @Override
    public VoxelShape getCollisionShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
        if (!blockState.getValue(OPEN)) {
            return blockState.getValue(HALF) == Half.TOP ? OPEN_TOP_SHAPE_MANHOLE : OPEN_BOTTOM_SHAPE_MANHOLE;
        }
        else return Block.box(0F, 0F, 0F, 0F, 0F, 0F);
    }
}