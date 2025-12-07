package net.tlotd.roads_n_vehicles.item.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.MutableText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class VHSCassetteItem extends Item {

    public VHSCassetteItem(Settings settings) {
        super(settings);
    }

    public static final Identifier DEFAULT_FONT_ID = new Identifier("minecraft", "default");
    public static final Identifier MODS_FONT_ID = new Identifier("vulpes-tinea", "mods");

    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(this.getDescription().formatted(Formatting.GRAY));
        if (context.isCreative()){
            Style style = this.getName().getStyle();
            tooltip.add(Text.literal("\uE000").setStyle(style.withFont(MODS_FONT_ID)).append(Text.literal(" TLOTD").setStyle(style.withFont(DEFAULT_FONT_ID).withFormatting(Formatting.GRAY))));
        }
    }

    public MutableText getDescription() {
        return Text.translatable(this.getTranslationKey() + ".desc");
    }
}