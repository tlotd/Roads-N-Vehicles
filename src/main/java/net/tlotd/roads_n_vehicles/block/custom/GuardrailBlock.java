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

public class GuardrailBlock extends SignBlock {

    public GuardrailBlock(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(FACING, Direction.NORTH).setValue(WATERLOGGED, false));
    }

    private static final VoxelShape BASE_SHAPE = Block.box(7, 0, 7, 9, 16, 9);

    private static final VoxelShape WEST_SHAPE = Shapes.or(
            Block.box(9, 7, 0, 13, 16, 16),
            BASE_SHAPE
    );
    private static final VoxelShape NORTH_SHAPE = Shapes.or(
            Block.box(0, 7, 9, 16, 16, 13),
            BASE_SHAPE
    );
    private static final VoxelShape EAST_SHAPE = Shapes.or(
            Block.box(3, 7, 0, 7, 16, 16),
            BASE_SHAPE
    );
    private static final VoxelShape SOUTH_SHAPE = Shapes.or(
            Block.box(0, 7, 3, 16, 16, 7),
            BASE_SHAPE
    );

    protected @NotNull VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
        return getVoxelShape(blockState, NORTH_SHAPE, SOUTH_SHAPE, WEST_SHAPE, EAST_SHAPE, BASE_SHAPE);
    }
}