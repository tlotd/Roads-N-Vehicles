package net.tlotd.roads_n_vehicles.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class LicensePlateBlock extends SignBlock {

    public static final BooleanProperty LOCKED = BooleanProperty.create("locked");

    public LicensePlateBlock(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(LOCKED, false).setValue(FACING, Direction.NORTH).setValue(WATERLOGGED, false));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, WATERLOGGED, LOCKED);
    }

    private static final VoxelShape WEST_SHAPE = Block.box(0, 6.375, 0, 0.5, 9.625, 16);
    private static final VoxelShape NORTH_SHAPE = Block.box(0, 6.375, 0, 16, 9.625, 0.5);
    private static final VoxelShape EAST_SHAPE = Block.box(15.5, 6.375, 0, 16, 9.625, 16);
    private static final VoxelShape SOUTH_SHAPE = Block.box(0, 6.375, 15.5, 16, 9.625, 16);

    public @NotNull VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
        return getVoxelShape(blockState, NORTH_SHAPE, SOUTH_SHAPE, WEST_SHAPE, EAST_SHAPE, NORTH_SHAPE);
    }
}