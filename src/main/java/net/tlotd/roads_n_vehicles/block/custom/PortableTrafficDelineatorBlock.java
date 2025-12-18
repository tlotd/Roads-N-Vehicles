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

public class PortableTrafficDelineatorBlock extends SignBlock {

    public PortableTrafficDelineatorBlock(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(FACING, Direction.NORTH).setValue(WATERLOGGED, false));
    }

    private static final VoxelShape Z_SHAPE = Shapes.or(
            Block.box(6, 0, 5, 10, 1, 11),
            Block.box(6, 1, 7.5, 10, 16, 8.5)
    );

    private static final VoxelShape X_SHAPE = Shapes.or(
            Block.box(5, 0, 6, 11, 1, 10),
            Block.box(7.5, 1, 6, 8.5, 16, 10)
    );

    protected @NotNull VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
        return getVoxelShape(blockState, Z_SHAPE, Z_SHAPE, X_SHAPE, X_SHAPE, Z_SHAPE);
    }
}