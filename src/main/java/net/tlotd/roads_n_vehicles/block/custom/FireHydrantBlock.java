package net.tlotd.roads_n_vehicles.block.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class FireHydrantBlock extends SignBlock {

    public FireHydrantBlock(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(FACING, net.minecraft.core.Direction.NORTH).setValue(WATERLOGGED, false));
    }

    private static final net.minecraft.world.phys.shapes.VoxelShape BASE_SHAPE = Block.box(5, 0, 5, 11, 16, 11);

    public @NotNull net.minecraft.world.phys.shapes.VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, net.minecraft.core.BlockPos blockPos, CollisionContext collisionContext) {
        return BASE_SHAPE;
    }

    @Override
    public InteractionResult use(BlockState blockState, Level level, BlockPos blockPos, Player player, InteractionHand hand, BlockHitResult blockHitResult) {
        ItemStack itemStack = player.getItemInHand(hand);
        if (!itemStack.is(Items.BUCKET)) {
            return InteractionResult.PASS;
        }
        if (level.isClientSide()) {
            return InteractionResult.CONSUME;
        }
        itemStack.shrink(1);
        player.awardStat(Stats.ITEM_USED.get(Items.BUCKET));
        player.getCooldowns().addCooldown(Items.WATER_BUCKET, 1);
        player.getCooldowns().addCooldown(Items.BUCKET, 1);
        player.addItem(new ItemStack(Items.WATER_BUCKET));
        level.playSound(null, blockPos, SoundEvents.BUCKET_FILL, SoundSource.PLAYERS, 1.0F, 1.0F);
        return InteractionResult.SUCCESS;
    }

    @Override
    public void appendHoverText(net.minecraft.world.item.ItemStack itemStack, @Nullable BlockGetter blockGetter, List<Component> tooltip, TooltipFlag tooltipFlag) {
        tooltip.add(Component.empty());
        tooltip.add(Component.translatable("block.roads-n-vehicles.fire_hydrant.tooltip").withStyle(ChatFormatting.GRAY));
        tooltip.add(Component.literal(" ").append(Component.translatable("block.roads-n-vehicles.fire_hydrant.tooltip_2")).withStyle(ChatFormatting.BLUE));
        super.appendHoverText(itemStack, blockGetter, tooltip, tooltipFlag);
    }
}