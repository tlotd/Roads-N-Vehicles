package net.tlotd.roads_n_vehicles.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CarItem extends Item {

    private final EntityType<?> type;

    public CarItem(EntityType<?> type, Properties properties) {
        super(properties);
        this.type = type;
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        if (level.isClientSide) return InteractionResult.SUCCESS;
        BlockPos clickedPos = context.getClickedPos();
        BlockPos spawnPos = clickedPos.relative(context.getClickedFace());
        Entity entity = type.create(level);
        if (entity == null) return InteractionResult.FAIL;
        double spawnX = spawnPos.getX() + 0.5;
        double spawnZ = spawnPos.getZ() + 0.5;
        double spawnY = getPlacementY(level, spawnPos, entity);
        entity.setPos(spawnX, spawnY, spawnZ);
        if (!level.noCollision(entity, entity.getBoundingBox())) {
            return InteractionResult.FAIL;
        }
        Player player = context.getPlayer();
        float yaw = Mth.wrapDegrees(player.getYRot());
        entity.setYRot(yaw);
        entity.setYBodyRot(yaw);
        entity.setYHeadRot(yaw);
        level.addFreshEntity(entity);
        level.gameEvent(null, GameEvent.ENTITY_PLACE, spawnPos);
        if (!context.getPlayer().getAbilities().instabuild) {
            context.getItemInHand().shrink(1);
        }
        return InteractionResult.SUCCESS;
    }

    private double getPlacementY(Level level, BlockPos pos, Entity entity) {
        BlockPos below = pos.below();
        BlockState stateBelow = level.getBlockState(below);
        VoxelShape shape = stateBelow.getCollisionShape(level, below);
        if (shape.isEmpty() || shape.bounds().getYsize() <= 0.0) {
            return pos.getY();
        }
        if (!shape.isEmpty()) {
            return below.getY() + shape.max(Direction.Axis.Y);
        }
        return pos.getY();
    }

    @Override
    public void appendHoverText(ItemStack itemStack, TooltipContext tooltipContext, List<Component> tooltip, TooltipFlag tooltipFlag) {
        tooltip.add(Component.translatable("item.roads-n-vehicles.muscle_car.broken.tooltip").withStyle(ChatFormatting.RED));
        super.appendHoverText(itemStack, tooltipContext, tooltip, tooltipFlag);
    }
}