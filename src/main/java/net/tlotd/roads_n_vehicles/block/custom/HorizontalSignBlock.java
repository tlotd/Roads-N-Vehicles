package net.tlotd.roads_n_vehicles.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class HorizontalSignBlock extends SignBlock {

    public HorizontalSignBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(FACING, Direction.NORTH).setValue(WATERLOGGED, false));
    }

    public static final VoxelShape BASE_SHAPE = Block.box(7, 0, 7, 9, 16, 9);

    public static final VoxelShape WEST_SHAPE = Shapes.or(
            Block.box(9, 9, 0, 10, 15, 16),
            BASE_SHAPE
    );
    public static final VoxelShape NORTH_SHAPE = Shapes.or(
            Block.box(0, 9, 9, 16, 15, 10),
            BASE_SHAPE
    );
    public static final VoxelShape EAST_SHAPE = Shapes.or(
            Block.box(6, 9, 0, 7, 15, 16),
            BASE_SHAPE
    );
    public static final VoxelShape SOUTH_SHAPE = Shapes.or(
            Block.box(0, 9, 6, 16, 15, 7),
            BASE_SHAPE
    );

    public @NotNull VoxelShape getShape(net.minecraft.world.level.block.state.BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
        return getVoxelShape(blockState, NORTH_SHAPE, SOUTH_SHAPE, WEST_SHAPE, EAST_SHAPE, BASE_SHAPE);
    }
}