package net.tlotd.roads_n_vehicles.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.tlotd.roads_n_vehicles.config.ModConfigs;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Objects;

public class CoatOfArmsBlock extends SignBlock {

    public static final IntProperty COAT_OF_ARMS = IntProperty.of("coat_of_arms", 0, 127);

    public CoatOfArmsBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH).with(WATERLOGGED, false).with(COAT_OF_ARMS, 0));
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        int coat_of_arms = 0;
        if (!Objects.requireNonNull(ctx.getPlayer()).isSneaking()) {
            switch (ctx.getPlayer().getUuid().toString()) {
                case "212aa6f5-69a9-47d9-9ad5-19b359744edf" -> {coat_of_arms = 1;}
                case "67148bd0-1a00-4bca-9d9e-ec246afbcf51" -> {coat_of_arms = 2;}
                case "53c68d22-726b-4a37-b92d-8d7c4670a87d" -> {coat_of_arms = 3;}

                case "ebcc701d-5e03-4e57-9279-1dd595f6a4d4" -> {if (ModConfigs.FORMER_TLOTD_REWARDS) {coat_of_arms = 7;}} //ISSO_21_

                case "08c6cfba-40cd-43e2-a929-764e9fadc442" -> {coat_of_arms = 9;}
                case "d3018dca-9a16-43f0-8d72-19b93e33fa6b" -> {coat_of_arms = 10;}

                case "125cda9f-1a5b-40c5-b3a9-02c7988940f6" -> {coat_of_arms = 13;}

                case "75fcce95-16a1-417b-801d-04ebb925d56b" -> {coat_of_arms = 15;}

                case "8365d4fc-c514-4c2e-a4e5-cf39fb26b0f0" -> {coat_of_arms = 19;}

                default -> {
                }
            }
        }
        return this.getDefaultState()
                .with(FACING, ctx.getHorizontalPlayerFacing())
                .with(WATERLOGGED, ctx.getWorld().getFluidState(ctx.getBlockPos()).isOf(Fluids.WATER))
                .with(COAT_OF_ARMS, coat_of_arms);
    }

    @Override
    public void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, WATERLOGGED, COAT_OF_ARMS);
    }

    public static final Identifier DEFAULT_FONT_ID = new Identifier("minecraft", "default");
    public static final Identifier PLAYERS_FONT_ID = new Identifier("roads-n-vehicles", "players");

    @Override
    public void appendTooltip(ItemStack stack, @Nullable BlockView world, List<Text> tooltip, TooltipContext options) {
        if (Screen.hasShiftDown()) {

            Style style = this.getName().getStyle();

            tooltip.add(Text.translatable("block.roads-n-vehicles.coat_of_arms.tooltip_shift").formatted(Formatting.GRAY));
            tooltip.add(Text.literal("\uE000").setStyle(style.withFont(PLAYERS_FONT_ID)).append(Text.literal(" TLOTD - Worldspawn").setStyle(style.withFont(DEFAULT_FONT_ID))));
            tooltip.add(Text.literal("\uE001").setStyle(style.withFont(PLAYERS_FONT_ID)).append(Text.literal(" Isla_Nublar - Drachenheide").setStyle(style.withFont(DEFAULT_FONT_ID))));
            tooltip.add(Text.literal("\uE002").setStyle(style.withFont(PLAYERS_FONT_ID)).append(Text.literal(" EinsDarki - Little Tokyo").setStyle(style.withFont(DEFAULT_FONT_ID))));

            tooltip.add(Text.literal("\uE008").setStyle(style.withFont(PLAYERS_FONT_ID)).append(Text.literal(" Polarfoxtm - Zorkcrad").setStyle(style.withFont(DEFAULT_FONT_ID))));
            tooltip.add(Text.literal("\uE009").setStyle(style.withFont(PLAYERS_FONT_ID)).append(Text.literal(" Salsafox - New California Republic").setStyle(style.withFont(DEFAULT_FONT_ID))));

            tooltip.add(Text.literal("\uE00E").setStyle(style.withFont(PLAYERS_FONT_ID)).append(Text.literal(" akashic_system - Firmament").setStyle(style.withFont(DEFAULT_FONT_ID))));

            tooltip.add(Text.literal("\uE012").setStyle(style.withFont(PLAYERS_FONT_ID)).append(Text.literal(" Jakx444 - New Haven").setStyle(style.withFont(DEFAULT_FONT_ID))));
        } else {
            tooltip.add(Text.translatable("block.roads-n-vehicles.coat_of_arms.tooltip").formatted(Formatting.GRAY));
            tooltip.add(Text.translatable("block.roads-n-vehicles.coat_of_arms.tooltip_2").formatted(Formatting.GRAY));
            tooltip.add(Text.literal("").append(Text.translatable("block.roads-n-vehicles.coat_of_arms.tooltip_3").formatted(Formatting.DARK_GRAY)).append(Text.translatable("key.keyboard.left.shift").formatted(Formatting.GRAY)).append(Text.translatable("block.roads-n-vehicles.coat_of_arms.tooltip_4").formatted(Formatting.DARK_GRAY)));
        }
        super.appendTooltip(stack, world, tooltip, options);
    }
}