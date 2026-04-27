package net.tlotd.roads_n_vehicles.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class ComputerBlock extends SignBlock {

    public static final IntegerProperty SCREEN = IntegerProperty.create("screen", 0, 127);
    public static final BooleanProperty MENU = BooleanProperty.create("menu");

    public ComputerBlock(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(SCREEN, 0).setValue(MENU, false).setValue(FACING, Direction.NORTH).setValue(WATERLOGGED, false));
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext blockPlaceContext) {
        BlockPos blockPos = blockPlaceContext.getClickedPos();
        Direction direction = blockPlaceContext.getHorizontalDirection();
        FluidState fluidState = blockPlaceContext.getLevel().getFluidState(blockPos);
        assert blockPlaceContext.getPlayer() != null;
        return this.defaultBlockState().setValue(SCREEN, 0).setValue(MENU, false).setValue(FACING, direction).setValue(WATERLOGGED, fluidState.getType() == Fluids.WATER);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, WATERLOGGED, SCREEN, MENU);
    }

    private static final VoxelShape WEST_SHAPE = Shapes.or(
            Block.box(0, 0, 0, 12, 13, 16),
            Block.box(12.5, 0, 0, 16, 1, 16)
    );
    private static final VoxelShape NORTH_SHAPE = Shapes.or(
            Block.box(0, 0, 0, 16, 13, 12),
            Block.box(0, 0, 12.5, 16, 1, 16)
    );
    private static final VoxelShape EAST_SHAPE = Shapes.or(
            Block.box(4, 0, 0, 16, 13, 16),
            Block.box(0, 0, 0, 3.5, 1, 16)
    );
    private static final VoxelShape SOUTH_SHAPE = Shapes.or(
            Block.box(0, 0, 4, 16, 13, 16),
            Block.box(0, 0, 0, 16, 1, 3.5)
    );

    public @NotNull VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
        return getVoxelShape(blockState, NORTH_SHAPE, SOUTH_SHAPE, WEST_SHAPE, EAST_SHAPE, NORTH_SHAPE);
    }
}
