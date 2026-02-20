package net.tlotd.roads_n_vehicles.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.FontDescription;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class VHSCassetteItem extends Item {

    public VHSCassetteItem(Item.Properties properties) {
        super(properties);
    }

    public static final FontDescription DEFAULT_FONT =
            new FontDescription.Resource(Identifier.withDefaultNamespace("default"));
    public static final FontDescription MODS_FONT =
            new FontDescription.Resource(Identifier.fromNamespaceAndPath("roads-n-vehicles", "mods"));

    @Override
    @SuppressWarnings("deprecation")
    public void appendHoverText(@NotNull ItemStack itemStack, @NotNull TooltipContext tooltipContext, @NotNull TooltipDisplay tooltipDisplay, Consumer<Component> consumer, TooltipFlag tooltipFlag) {
        consumer.accept(this.getDescription());
        if (tooltipFlag.isCreative()){
            consumer.accept(Component.literal("\uE000").withStyle(style -> style.withFont(MODS_FONT)).append(Component.literal(" TLOTD").withStyle(style -> style.withFont(DEFAULT_FONT).withColor(ChatFormatting.WHITE))));
        }
    }

    public @NotNull Component getDescription() {
        return Component.translatable(this.getDescriptionId() + ".desc").withStyle(ChatFormatting.GRAY);
    }
}