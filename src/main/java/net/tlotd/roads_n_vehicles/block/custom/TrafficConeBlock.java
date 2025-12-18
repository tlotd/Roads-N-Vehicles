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

public class TrafficConeBlock extends SignBlock {

    public TrafficConeBlock(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(FACING, Direction.NORTH).setValue(WATERLOGGED, false));
    }

    private static final VoxelShape BASE_SHAPE = Shapes.or(
            Block.box(7, 13, 7, 9, 16, 9),
            Block.box(6, 9, 6, 10, 13, 10),
            Block.box(5, 5, 5, 11, 9, 11),
            Block.box(4, 1, 4, 12, 5, 12),
            Block.box(2, 0, 2, 14, 1, 14)
    );

    protected @NotNull VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
        return BASE_SHAPE;
    }
}