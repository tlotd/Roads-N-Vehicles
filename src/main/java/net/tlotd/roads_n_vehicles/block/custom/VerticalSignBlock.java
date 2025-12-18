package net.tlotd.roads_n_vehicles.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class VerticalSignBlock extends SignBlock {

    public VerticalSignBlock(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(FACING, Direction.NORTH).setValue(WATERLOGGED, false));
    }

    private static final VoxelShape BASE_SHAPE = Block.box(7, 0, 7, 9, 16, 9);

    private static final VoxelShape WEST_SHAPE = Shapes.or(
            Block.box(9, 1, 5, 10, 15, 11),
            BASE_SHAPE
    );
    private static final VoxelShape NORTH_SHAPE = Shapes.or(
            Block.box(5, 1, 9, 11, 15, 10),
            BASE_SHAPE
    );
    private static final VoxelShape EAST_SHAPE = Shapes.or(
            Block.box(6, 1, 5, 7, 15, 11),
            BASE_SHAPE
    );
    private static final VoxelShape SOUTH_SHAPE = Shapes.or(
            Block.box(5, 1, 6, 11, 15, 7),
            BASE_SHAPE
    );

    protected @NotNull VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
        return getVoxelShape(blockState, NORTH_SHAPE, SOUTH_SHAPE, WEST_SHAPE, EAST_SHAPE, BASE_SHAPE);
    }
}