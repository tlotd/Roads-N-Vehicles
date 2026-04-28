package net.tlotd.roads_n_vehicles.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.tlotd.roads_n_vehicles.block.custom.entity.TownSignBlockEntity;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class TownSignBlockItem extends BlockItem {

    public TownSignBlockItem(Block block, Properties properties) {
        super(block, properties);
    }

    public static String normalize(String input) {
        if (input == null || input.isBlank()) {
            return "Rename|The Sign";
        }
        if (!input.contains("|")) {
            return input + "|Minecraft";
        }
        return input;
    }

    @Override
    protected boolean updateCustomBlockEntityTag(BlockPos pos, Level level, Player player, ItemStack stack, BlockState state) {
        BlockEntity be = level.getBlockEntity(pos);
        if (be instanceof TownSignBlockEntity sign) {
            String raw = stack.has(DataComponents.CUSTOM_NAME) ? stack.getHoverName().getString() : null;
            sign.setText(normalize(raw));
        }
        return super.updateCustomBlockEntityTag(pos, level, player, stack, state);
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext tooltipContext, List<Component> tooltip, TooltipFlag tooltipFlag) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Component.translatable("block.roads-n-vehicles.town_sign.ponder", Component.translatable("key.keyboard.shift").withStyle(ChatFormatting.WHITE)).withStyle(ChatFormatting.DARK_GRAY));
            tooltip.add(Component.translatable("block.roads-n-vehicles.town_sign.ponder_1").withStyle(ChatFormatting.GRAY));
            tooltip.add(Component.translatable("block.roads-n-vehicles.town_sign.ponder_2").withStyle(ChatFormatting.GRAY));
            tooltip.add(Component.translatable("block.roads-n-vehicles.town_sign.ponder_3").withStyle(ChatFormatting.GRAY));
            tooltip.add(Component.translatable("block.roads-n-vehicles.town_sign.ponder_4").withStyle(ChatFormatting.WHITE).append(Component.literal("|").withStyle(ChatFormatting.GRAY)).append(Component.translatable("block.roads-n-vehicles.town_sign.ponder_5").withStyle(ChatFormatting.WHITE)));
        } else {
            tooltip.add(Component.translatable("block.roads-n-vehicles.town_sign.ponder", Component.translatable("key.keyboard.shift").withStyle(ChatFormatting.GRAY)).withStyle(ChatFormatting.DARK_GRAY));
        }
        tooltip.add(Component.empty());
        tooltip.add(Component.translatable("block.roads-n-vehicles.town_sign.tooltip").withStyle(ChatFormatting.GRAY));
        String raw = stack.has(DataComponents.CUSTOM_NAME) ? stack.getHoverName().getString() : null;
        String normalized = normalize(raw);
        String[] parts = normalized.split("\\|", 2);
        String top = parts.length > 0 ? parts[0] : "";
        String bottom = parts.length > 1 ? parts[1] : "";
        int dLength = Math.max(top.length(), bottom.length());
        String dashes = "-".repeat(dLength);
        tooltip.add(Component.translatable(dashes).withStyle(ChatFormatting.DARK_GRAY));
        tooltip.add(Component.literal(top).withStyle(ChatFormatting.WHITE));
        tooltip.add(Component.literal(bottom).withStyle(ChatFormatting.WHITE));
        tooltip.add(Component.translatable(dashes).withStyle(ChatFormatting.DARK_GRAY));
        super.appendHoverText(stack, tooltipContext, tooltip, tooltipFlag);
    }
}