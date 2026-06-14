package net.tlotd.roads_n_vehicles.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class SpeedCameraBlock extends SignBlock {

    public SpeedCameraBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(FACING, Direction.NORTH).setValue(WATERLOGGED, false));
    }

    private static final VoxelShape BASE_SHAPE = Block.box(1, 13, 1, 15, 14, 15);

    private static final VoxelShape WEST_SHAPE = Shapes.or(
            Block.box(2, 0, 2, 13, 13, 14),
            BASE_SHAPE
    );
    private static final VoxelShape NORTH_SHAPE = Shapes.or(
            Block.box(2, 0, 2, 14, 13, 13),

            BASE_SHAPE
    );
    private static final VoxelShape EAST_SHAPE = Shapes.or(
            Block.box(3, 0, 2, 14, 13, 14),
            BASE_SHAPE
    );
    private static final VoxelShape SOUTH_SHAPE = Shapes.or(
            Block.box(2, 0, 3, 14, 13, 14),
            BASE_SHAPE
    );

    public @NotNull VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
        return getVoxelShape(blockState, NORTH_SHAPE, SOUTH_SHAPE, WEST_SHAPE, EAST_SHAPE, BASE_SHAPE);
    }
}