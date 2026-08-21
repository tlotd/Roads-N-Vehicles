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
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class TownSignBlock extends SignBlock {

    public static final BooleanProperty LOCKED = BooleanProperty.create("locked");
    public static final BooleanProperty FANCY = BooleanProperty.create("fancy");

    public TownSignBlock(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(LOCKED, false).setValue(FANCY, false).setValue(FACING, Direction.NORTH).setValue(WATERLOGGED, false));
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        boolean fancy = false;
        if (context.getPlayer() != null) {
            fancy = context.getPlayer().isCrouching();
        }
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection()).setValue(WATERLOGGED, context.getLevel().getFluidState(context.getClickedPos()).is(Fluids.WATER)).setValue(FANCY, fancy);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, WATERLOGGED, LOCKED, FANCY);
    }

    private static final VoxelShape Z_SHAPE = Block.box(-2, 0, 7, 18, 14, 9);
    private static final VoxelShape X_SHAPE = Block.box(7, 0, -2, 9, 14, 18);

    public @NotNull VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
        return getVoxelShape(blockState, Z_SHAPE, Z_SHAPE, X_SHAPE, X_SHAPE, Z_SHAPE);
    }
}