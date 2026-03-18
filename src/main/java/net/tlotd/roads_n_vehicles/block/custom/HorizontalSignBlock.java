package net.tlotd.roads_n_vehicles.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class HorizontalSignBlock extends SignBlock {

    public HorizontalSignBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH).with(WATERLOGGED, false));
    }

    public static final VoxelShape BASE_SHAPE = Block.createCuboidShape(7, 0, 7, 9, 16, 9);

    public static final VoxelShape WEST_SHAPE = VoxelShapes.union(
            Block.createCuboidShape(9, 9, 0, 10, 15, 16),
            BASE_SHAPE
    );
    public static final VoxelShape NORTH_SHAPE = VoxelShapes.union(
            Block.createCuboidShape(0, 9, 9, 16, 15, 10),
            BASE_SHAPE
    );
    public static final VoxelShape EAST_SHAPE = VoxelShapes.union(
            Block.createCuboidShape(6, 9, 0, 7, 15, 16),
            BASE_SHAPE
    );
    public static final VoxelShape SOUTH_SHAPE = VoxelShapes.union(
            Block.createCuboidShape(0, 9, 6, 16, 15, 7),
            BASE_SHAPE
    );

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)) {
            case NORTH -> NORTH_SHAPE;
            case WEST -> WEST_SHAPE;
            case SOUTH -> SOUTH_SHAPE;
            case EAST -> EAST_SHAPE;
            default -> BASE_SHAPE;
        };
    }
}