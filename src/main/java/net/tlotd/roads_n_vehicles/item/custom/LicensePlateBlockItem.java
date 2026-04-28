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
import net.tlotd.roads_n_vehicles.block.custom.entity.LicensePlateBlockEntity;
import net.tlotd.roads_n_vehicles.block.custom.entity.renderer.PlateGlyphs;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class LicensePlateBlockItem extends BlockItem {

    public LicensePlateBlockItem(Block block, Properties properties) {
        super(block, properties);
    }

    public static String normalize(String input) {
        if (input == null || input.isBlank()) {
            return "Rename Me";
        }
        input = PlateGlyphs.filterAllowed(input);
        return input;
    }

    private static String convert(String input) {
        return PlateGlyphs.convert(normalize(input), false);
    }

    @Override
    protected boolean updateCustomBlockEntityTag(BlockPos pos, Level level, Player player, ItemStack stack, BlockState state) {
        BlockEntity be = level.getBlockEntity(pos);
        if (be instanceof LicensePlateBlockEntity sign) {
            String raw = stack.has(DataComponents.CUSTOM_NAME) ? stack.getHoverName().getString() : null;
            sign.setText(normalize(raw));
        }
        return super.updateCustomBlockEntityTag(pos, level, player, stack, state);
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext tooltipContext, List<Component> tooltip, TooltipFlag tooltipFlag) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Component.translatable("block.roads-n-vehicles.license_plate.ponder", Component.translatable("key.keyboard.shift").withStyle(ChatFormatting.WHITE)).withStyle(ChatFormatting.DARK_GRAY));
            tooltip.add(Component.translatable("block.roads-n-vehicles.license_plate.ponder_1").withStyle(ChatFormatting.GRAY));
            tooltip.add(Component.translatable("block.roads-n-vehicles.license_plate.ponder_2").withStyle(ChatFormatting.GRAY));
            tooltip.add(Component.translatable("block.roads-n-vehicles.license_plate.ponder_3").withStyle(ChatFormatting.GRAY));
            tooltip.add(Component.translatable("block.roads-n-vehicles.license_plate.ponder_4").withStyle(ChatFormatting.GRAY));
            tooltip.add(Component.translatable("block.roads-n-vehicles.license_plate.ponder_5").withStyle(ChatFormatting.GRAY));
            tooltip.add(Component.translatable("block.roads-n-vehicles.license_plate.ponder_6").withStyle(ChatFormatting.WHITE));
            tooltip.add(Component.translatable("block.roads-n-vehicles.license_plate.dashes").withStyle(ChatFormatting.GRAY));
            tooltip.add(Component.translatable("block.roads-n-vehicles.license_plate.ponder_7").withStyle(ChatFormatting.WHITE));
            tooltip.add(Component.translatable("block.roads-n-vehicles.license_plate.dashes").withStyle(ChatFormatting.GRAY));
        } else {
            tooltip.add(Component.translatable("block.roads-n-vehicles.license_plate.ponder", Component.translatable("key.keyboard.shift").withStyle(ChatFormatting.GRAY)).withStyle(ChatFormatting.DARK_GRAY));
        }
        tooltip.add(Component.empty());
        tooltip.add(Component.translatable("block.roads-n-vehicles.license_plate.tooltip").withStyle(ChatFormatting.GRAY));
        String raw = stack.has(DataComponents.CUSTOM_NAME) ? stack.getHoverName().getString() : null;
        String converted = convert(raw);
        String dashes = "-".repeat(converted.length());
        tooltip.add(Component.translatable(dashes).withStyle(ChatFormatting.DARK_GRAY));
        tooltip.add(Component.literal(converted).withStyle(ChatFormatting.WHITE));
        tooltip.add(Component.literal(dashes).withStyle(ChatFormatting.DARK_GRAY));
        super.appendHoverText(stack, tooltipContext, tooltip, tooltipFlag);
    }
}