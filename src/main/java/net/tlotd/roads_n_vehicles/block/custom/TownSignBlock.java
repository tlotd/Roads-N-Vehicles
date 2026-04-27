package net.tlotd.roads_n_vehicles.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.tlotd.roads_n_vehicles.block.custom.entity.TownSignBlockEntity;
import net.tlotd.roads_n_vehicles.item.custom.TownSignBlockItem;
import org.jetbrains.annotations.NotNull;

public class TownSignBlock extends SignBlock implements EntityBlock {

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

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new TownSignBlockEntity(pos, state);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult blockHitResult) {
        ItemStack stack = player.getItemInHand(hand);
        if (stack.is(Items.HONEYCOMB) && !state.getValue(LOCKED)) {
            if (!level.isClientSide) {
                level.setBlock(pos, state.setValue(LOCKED, true), 3);
                if (!player.isCreative()) {
                    stack.shrink(1);
                }
                player.awardStat(Stats.ITEM_USED.get(Items.HONEYCOMB));
                level.playSound(null, pos, SoundEvents.HONEYCOMB_WAX_ON, SoundSource.PLAYERS, 1.0F, 1.0F);
            }
            return InteractionResult.sidedSuccess(level.isClientSide);
        }
        if (stack.is(Items.NAME_TAG) && stack.hasCustomHoverName()) {
            if (!level.isClientSide) {
                BlockEntity be = level.getBlockEntity(pos);
                if (be instanceof TownSignBlockEntity sign) {
                    String raw = stack.getHoverName().getString();
                    String normalized = TownSignBlockItem.normalize(raw);
                    if (state.getValue(LOCKED) || normalized.equals(sign.getText())) {
                        level.playSound(null, pos, SoundEvents.WAXED_SIGN_INTERACT_FAIL, SoundSource.PLAYERS, 1.0F, 1.0F);
                        return InteractionResult.PASS;
                    }
                    sign.setText(normalized);
                    player.awardStat(Stats.ITEM_USED.get(Items.NAME_TAG));
                    level.playSound(null, pos, SoundEvents.ANVIL_USE, SoundSource.BLOCKS, 0.5f, 1.0f);
                }
            }
            return InteractionResult.sidedSuccess(level.isClientSide);
        }
        return InteractionResult.PASS;
    }
}