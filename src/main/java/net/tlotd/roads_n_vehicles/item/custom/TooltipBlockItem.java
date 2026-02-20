package net.tlotd.roads_n_vehicles.item.custom;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.FontDescription;
import net.minecraft.network.chat.Style;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.level.block.Block;
import net.tlotd.api.TlotdAPI;
import net.tlotd.roads_n_vehicles.compat.CompatModsCheck;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.glfw.GLFW;

import java.util.function.Consumer;

public class TooltipBlockItem extends BlockItem {
    private final Integer integer;

    public TooltipBlockItem(Block block, Properties properties, Integer integer) {
        super(block, properties);
        this.integer = integer;
    }

    public static final FontDescription DEFAULT_FONT =
            new FontDescription.Resource(Identifier.withDefaultNamespace("default"));
    public static final FontDescription PLAYERS_FONT =
            new FontDescription.Resource(Identifier.fromNamespaceAndPath("roads-n-vehicles", "players"));
    public static final FontDescription MODS_FONT =
            new FontDescription.Resource(Identifier.fromNamespaceAndPath("roads-n-vehicles", "mods"));

    @Override
    @SuppressWarnings("deprecation")
    public void appendHoverText(@NotNull ItemStack itemStack, @NotNull TooltipContext tooltipContext, @NotNull TooltipDisplay tooltipDisplay, @NotNull Consumer<Component> consumer, @NotNull TooltipFlag tooltipFlag) {
        if (this.integer == 0) {
            consumer.accept(Component.empty());
            consumer.accept(Component.translatable("block.roads-n-vehicles.traffic_light_controller.tooltip").withStyle(ChatFormatting.GRAY));
            consumer.accept(Component.translatable("block.roads-n-vehicles.traffic_light_controller.tooltip_2").withStyle(ChatFormatting.GRAY));
            consumer.accept(Component.literal(" ").append(Component.translatable("block.roads-n-vehicles.traffic_light_controller.tooltip_3")).withStyle(ChatFormatting.BLUE));
            consumer.accept(Component.literal(" ").append(Component.translatable("block.roads-n-vehicles.traffic_light_controller.tooltip_4")).withStyle(ChatFormatting.BLUE));
            consumer.accept(Component.literal(" ").append(Component.translatable("block.roads-n-vehicles.traffic_light_controller.tooltip_5")).withStyle(ChatFormatting.BLUE));
            consumer.accept(Component.literal(" ").append(Component.translatable("block.roads-n-vehicles.traffic_light_controller.tooltip_6")).withStyle(ChatFormatting.BLUE));
        } else if (this.integer == 1) {
            if (InputConstants.isKeyDown(Minecraft.getInstance().getWindow(), GLFW.GLFW_KEY_LEFT_SHIFT)) {
                consumer.accept(Component.translatable("block.roads-n-vehicles.town_sign.tooltip").withStyle(ChatFormatting.GRAY));
                consumer.accept(Component.translatable("block.roads-n-vehicles.town_sign.tooltip_2").withStyle(ChatFormatting.GRAY));
                consumer.accept(Component.empty());
                consumer.accept(Component.translatable("block.roads-n-vehicles.town_sign.ponder", Component.translatable("key.keyboard.shift").withStyle(ChatFormatting.WHITE)).withStyle(ChatFormatting.DARK_GRAY));
                Style style = this.getName().getStyle();
                consumer.accept(Component.translatable("block.roads-n-vehicles.town_sign.tooltip_shift").withStyle(ChatFormatting.GRAY));
                consumer.accept(Component.literal("\uE000").withStyle(style.withFont(PLAYERS_FONT)).append(Component.literal(" TLOTD - Worldspawn").withStyle(style.withFont(DEFAULT_FONT))));
                consumer.accept(Component.literal("\uE001").withStyle(style.withFont(PLAYERS_FONT)).append(Component.literal(" Isla_Nublar - Drachenheide").withStyle(style.withFont(DEFAULT_FONT))));
                consumer.accept(Component.literal("\uE002").withStyle(style.withFont(PLAYERS_FONT)).append(Component.literal(" EinsDarki - Little Tokyo").withStyle(style.withFont(DEFAULT_FONT))));
                if (CompatModsCheck.TLOTD && TlotdAPI.formerTlotdRewardsClient()) {
                    consumer.accept(Component.literal("\uE006").withStyle(style.withFont(PLAYERS_FONT)).append(Component.literal(" ISSO_21_ - Löwenburg").withStyle(style.withFont(DEFAULT_FONT))));
                    consumer.accept(Component.literal("\uE008").withStyle(style.withFont(PLAYERS_FONT)).append(Component.literal(" Polarfoxtm - Zorkcrad").withStyle(style.withFont(DEFAULT_FONT))));
                }
                consumer.accept(Component.literal("\uE009").withStyle(style.withFont(PLAYERS_FONT)).append(Component.literal(" Salsafox - New California Republic").withStyle(style.withFont(DEFAULT_FONT))));
                consumer.accept(Component.literal("\uE00E").withStyle(style.withFont(PLAYERS_FONT)).append(Component.literal(" akashic_system - Firmament").withStyle(style.withFont(DEFAULT_FONT))));
                consumer.accept(Component.literal("\uE012").withStyle(style.withFont(PLAYERS_FONT)).append(Component.literal(" Jakx444 - New Haven").withStyle(style.withFont(DEFAULT_FONT))));
            } else {
                consumer.accept(Component.translatable("block.roads-n-vehicles.town_sign.tooltip").withStyle(ChatFormatting.GRAY));
                consumer.accept(Component.translatable("block.roads-n-vehicles.town_sign.tooltip_2").withStyle(ChatFormatting.GRAY));
                consumer.accept(Component.empty());
                consumer.accept(Component.translatable("block.roads-n-vehicles.town_sign.ponder", Component.translatable("key.keyboard.shift").withStyle(ChatFormatting.GRAY)).withStyle(ChatFormatting.DARK_GRAY));
            }
        } else if (this.integer == 2) {
            if (InputConstants.isKeyDown(Minecraft.getInstance().getWindow(), GLFW.GLFW_KEY_LEFT_SHIFT)) {
                consumer.accept(Component.translatable("block.roads-n-vehicles.license_plate.tooltip").withStyle(ChatFormatting.GRAY));
                consumer.accept(Component.translatable("block.roads-n-vehicles.license_plate.tooltip_2").withStyle(ChatFormatting.GRAY));
                consumer.accept(Component.literal(""));
                consumer.accept(Component.translatable("block.roads-n-vehicles.license_plate.ponder", Component.translatable("key.keyboard.shift").withStyle(ChatFormatting.WHITE)).withStyle(ChatFormatting.DARK_GRAY));
                Style style = this.getName().getStyle();
                consumer.accept(Component.translatable("block.roads-n-vehicles.license_plate.tooltip_shift").withStyle(ChatFormatting.GRAY));
                consumer.accept(Component.literal("\uE000").withStyle(style.withFont(PLAYERS_FONT)).append(Component.literal(" TLOTD").withStyle(style.withFont(DEFAULT_FONT))));
                consumer.accept(Component.literal("\uE001").withStyle(style.withFont(PLAYERS_FONT)).append(Component.literal(" Isla_Nublar").withStyle(style.withFont(DEFAULT_FONT))));
                consumer.accept(Component.literal("\uE002").withStyle(style.withFont(PLAYERS_FONT)).append(Component.literal(" EinsDarki").withStyle(style.withFont(DEFAULT_FONT))));
                if (CompatModsCheck.TLOTD && TlotdAPI.formerTlotdRewardsClient()) {
                    consumer.accept(Component.literal("\uE003").withStyle(style.withFont(PLAYERS_FONT)).append(Component.literal(" AliaSophie").withStyle(style.withFont(DEFAULT_FONT))));
                    consumer.accept(Component.literal("\uE004").withStyle(style.withFont(PLAYERS_FONT)).append(Component.literal(" Teneba").withStyle(style.withFont(DEFAULT_FONT))));
                }
                consumer.accept(Component.literal("\uE005").withStyle(style.withFont(PLAYERS_FONT)).append(Component.literal(" Alex1666").withStyle(style.withFont(DEFAULT_FONT))));
                if (CompatModsCheck.TLOTD && TlotdAPI.formerTlotdRewardsClient()) {
                    consumer.accept(Component.literal("\uE006").withStyle(style.withFont(PLAYERS_FONT)).append(Component.literal(" ISSO_21_").withStyle(style.withFont(DEFAULT_FONT))));
                    consumer.accept(Component.literal("\uE007").withStyle(style.withFont(PLAYERS_FONT)).append(Component.literal(" Akitorlp").withStyle(style.withFont(DEFAULT_FONT))));
                    consumer.accept(Component.literal("\uE008").withStyle(style.withFont(PLAYERS_FONT)).append(Component.literal(" Polarfoxtm").withStyle(style.withFont(DEFAULT_FONT))));
                }
                consumer.accept(Component.literal("\uE009").withStyle(style.withFont(PLAYERS_FONT)).append(Component.literal(" Salsafox").withStyle(style.withFont(DEFAULT_FONT))));
                if (CompatModsCheck.TLOTD && TlotdAPI.formerTlotdRewardsClient()) {
                    consumer.accept(Component.literal("\uE00A").withStyle(style.withFont(PLAYERS_FONT)).append(Component.literal(" VANDAGR").withStyle(style.withFont(DEFAULT_FONT))));
                }
                consumer.accept(Component.literal("\uE00B").withStyle(style.withFont(PLAYERS_FONT)).append(Component.literal(" TLOTDShido").withStyle(style.withFont(DEFAULT_FONT))));
                consumer.accept(Component.literal("\uE00C").withStyle(style.withFont(PLAYERS_FONT)).append(Component.literal(" nischi2612").withStyle(style.withFont(DEFAULT_FONT))));
                consumer.accept(Component.literal("\uE00D").withStyle(style.withFont(PLAYERS_FONT)).append(Component.literal(" SK_Chuuya").withStyle(style.withFont(DEFAULT_FONT))));
                consumer.accept(Component.literal("\uE00E").withStyle(style.withFont(PLAYERS_FONT)).append(Component.literal(" akashic_system").withStyle(style.withFont(DEFAULT_FONT))));
                consumer.accept(Component.literal("\uE00F").withStyle(style.withFont(PLAYERS_FONT)).append(Component.literal(" MagicKVO").withStyle(style.withFont(DEFAULT_FONT))));
                consumer.accept(Component.literal("\uE010").withStyle(style.withFont(PLAYERS_FONT)).append(Component.literal(" TheVexTv").withStyle(style.withFont(DEFAULT_FONT))));
                consumer.accept(Component.literal("\uE011").withStyle(style.withFont(PLAYERS_FONT)).append(Component.literal(" Glamin").withStyle(style.withFont(DEFAULT_FONT))));
                consumer.accept(Component.literal("\uE012").withStyle(style.withFont(PLAYERS_FONT)).append(Component.literal(" Jakx444").withStyle(style.withFont(DEFAULT_FONT))));
                if (CompatModsCheck.TLOTD && TlotdAPI.formerTlotdRewardsClient()) {
                    consumer.accept(Component.literal("\uE013").withStyle(style.withFont(PLAYERS_FONT)).append(Component.literal(" GenosseNeuro").withStyle(style.withFont(DEFAULT_FONT))));
                }
                consumer.accept(Component.literal("\uE014").withStyle(style.withFont(PLAYERS_FONT)).append(Component.literal(" Red_ice").withStyle(style.withFont(DEFAULT_FONT))));
            } else {
                consumer.accept(Component.translatable("block.roads-n-vehicles.license_plate.tooltip").withStyle(ChatFormatting.GRAY));
                consumer.accept(Component.translatable("block.roads-n-vehicles.license_plate.tooltip_2").withStyle(ChatFormatting.GRAY));
                consumer.accept(Component.literal(""));
                consumer.accept(Component.translatable("block.roads-n-vehicles.license_plate.ponder",Component.translatable("key.keyboard.shift").withStyle(ChatFormatting.GRAY)).withStyle(ChatFormatting.DARK_GRAY));
            }
        }
    }
}
