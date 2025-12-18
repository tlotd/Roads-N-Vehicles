package net.tlotd.roads_n_vehicles.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class VHSCassetteItem extends Item {

    public VHSCassetteItem(Item.Properties properties) {
        super(properties);
    }

    public static final ResourceLocation DEFAULT_FONT_ID = ResourceLocation.fromNamespaceAndPath("minecraft", "default");
    public static final ResourceLocation MODS_FONT_ID = ResourceLocation.fromNamespaceAndPath("roads-n-vehicles", "mods");

    public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltip, TooltipFlag flag) {
        tooltip.add(this.getDescription());
        if (flag.isCreative()){
            tooltip.add(Component.literal("\uE000").withStyle(style -> style.withFont(MODS_FONT_ID)).append(Component.literal(" TLOTD").withStyle(style -> style.withFont(DEFAULT_FONT_ID).withColor(ChatFormatting.WHITE))));
        }
    }

    public @NotNull Component getDescription() {
        return Component.translatable(this.getDescriptionId() + ".desc").withStyle(ChatFormatting.GRAY);
    }
}