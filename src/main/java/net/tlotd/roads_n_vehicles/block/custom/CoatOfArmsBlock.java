package net.tlotd.roads_n_vehicles.block.custom;


import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.Fluids;
import net.tlotd.api.TlotdAPI;
import net.tlotd.roads_n_vehicles.compat.CompatModsCheck;

import java.util.List;

public class CoatOfArmsBlock extends SignBlock {

    public static final IntegerProperty COAT_OF_ARMS = IntegerProperty.create("coat_of_arms", 0, 127);
    public static final BooleanProperty CUSTOM = BooleanProperty.create("custom");

    private int getDefaultSkinFor(String uuid, boolean formerTLOTD) {
        return switch (uuid) {
            case "212aa6f5-69a9-47d9-9ad5-19b359744edf" -> 1;
            case "67148bd0-1a00-4bca-9d9e-ec246afbcf51" -> 2;
            case "53c68d22-726b-4a37-b92d-8d7c4670a87d" -> 3;
            case "ebcc701d-5e03-4e57-9279-1dd595f6a4d4" -> formerTLOTD ? 7 : 0;
            case "08c6cfba-40cd-43e2-a929-764e9fadc442" -> 9;
            case "d3018dca-9a16-43f0-8d72-19b93e33fa6b" -> 10;
            case "125cda9f-1a5b-40c5-b3a9-02c7988940f6" -> 13;
            case "75fcce95-16a1-417b-801d-04ebb925d56b" -> 15;
            case "8365d4fc-c514-4c2e-a4e5-cf39fb26b0f0" -> 19;
            default -> 0;
        };
    }

    public CoatOfArmsBlock(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(COAT_OF_ARMS, 0).setValue(CUSTOM, false).setValue(FACING, Direction.NORTH).setValue(WATERLOGGED, false));
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        int coat_of_arms = 0;
        boolean formerTLOTD = false;
        boolean custom = false;
        int customTextureId = 0;
        Player player = context.getPlayer();
        ServerLevel world = null;
        if (player != null && !context.getLevel().isClientSide() && player.getServer() != null) {
            world = player.getServer().getLevel(Level.OVERWORLD);
        }
        if (world != null) {
            if (CompatModsCheck.TLOTD) {
                custom = TlotdAPI.hasCustomTexture(world.getServer(), player.getUUID());
                customTextureId = TlotdAPI.getCustomTexture(world.getServer(), player.getUUID());
                formerTLOTD = TlotdAPI.formerTlotdRewards(player.getServer());
            }
            if (custom) {
                coat_of_arms = customTextureId;
            } else {
                coat_of_arms = getDefaultSkinFor(player.getUUID().toString(), formerTLOTD);
            }
        }
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection()).setValue(WATERLOGGED, context.getLevel().getFluidState(context.getClickedPos()).is(Fluids.WATER)).setValue(COAT_OF_ARMS, coat_of_arms).setValue(CUSTOM, custom);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, WATERLOGGED, COAT_OF_ARMS, CUSTOM);
    }

    public static final ResourceLocation DEFAULT_FONT_ID = ResourceLocation.fromNamespaceAndPath("minecraft", "default");
    public static final ResourceLocation PLAYERS_FONT_ID = ResourceLocation.fromNamespaceAndPath("roads-n-vehicles", "players");
    public static final ResourceLocation MODS_FONT_ID = ResourceLocation.fromNamespaceAndPath("roads-n-vehicles", "mods");

    @Override
    public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltip, TooltipFlag flag) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Component.translatable("block.roads-n-vehicles.town_sign.tooltip").withStyle(ChatFormatting.GRAY));
            tooltip.add(Component.translatable("block.roads-n-vehicles.town_sign.tooltip_2").withStyle(ChatFormatting.GRAY));
            tooltip.add(Component.literal(""));
            tooltip.add(Component.translatable("block.roads-n-vehicles.town_sign.ponder", Component.translatable("key.keyboard.shift").withStyle(ChatFormatting.WHITE)).withStyle(ChatFormatting.DARK_GRAY));
            Style style = this.getName().getStyle();
            tooltip.add(Component.translatable("block.roads-n-vehicles.town_sign.tooltip_shift").withStyle(ChatFormatting.GRAY));
            tooltip.add(Component.literal("\uE000").withStyle(style.withFont(PLAYERS_FONT_ID)).append(Component.literal(" TLOTD - Worldspawn").withStyle(style.withFont(DEFAULT_FONT_ID))));
            tooltip.add(Component.literal("\uE001").withStyle(style.withFont(PLAYERS_FONT_ID)).append(Component.literal(" Isla_Nublar - Drachenheide").withStyle(style.withFont(DEFAULT_FONT_ID))));
            tooltip.add(Component.literal("\uE002").withStyle(style.withFont(PLAYERS_FONT_ID)).append(Component.literal(" EinsDarki - Little Tokyo").withStyle(style.withFont(DEFAULT_FONT_ID))));
            if (CompatModsCheck.TLOTD && TlotdAPI.formerTlotdRewardsClient()) {
                tooltip.add(Component.literal("\uE006").withStyle(style.withFont(PLAYERS_FONT_ID)).append(Component.literal(" ISSO_21_ - Löwenburg").withStyle(style.withFont(DEFAULT_FONT_ID))));
                tooltip.add(Component.literal("\uE008").withStyle(style.withFont(PLAYERS_FONT_ID)).append(Component.literal(" Polarfoxtm - Zorkcrad").withStyle(style.withFont(DEFAULT_FONT_ID))));
            }
            tooltip.add(Component.literal("\uE009").withStyle(style.withFont(PLAYERS_FONT_ID)).append(Component.literal(" Salsafox - New California Republic").withStyle(style.withFont(DEFAULT_FONT_ID))));
            tooltip.add(Component.literal("\uE00E").withStyle(style.withFont(PLAYERS_FONT_ID)).append(Component.literal(" akashic_system - Firmament").withStyle(style.withFont(DEFAULT_FONT_ID))));
            tooltip.add(Component.literal("\uE012").withStyle(style.withFont(PLAYERS_FONT_ID)).append(Component.literal(" Jakx444 - New Haven").withStyle(style.withFont(DEFAULT_FONT_ID))));
        } else {
            tooltip.add(Component.translatable("block.roads-n-vehicles.town_sign.tooltip").withStyle(ChatFormatting.GRAY));
            tooltip.add(Component.translatable("block.roads-n-vehicles.town_sign.tooltip_2").withStyle(ChatFormatting.GRAY));
            tooltip.add(Component.literal(""));
            tooltip.add(Component.translatable("block.roads-n-vehicles.town_sign.ponder",Component.translatable("key.keyboard.shift").withStyle(ChatFormatting.GRAY)).withStyle(ChatFormatting.DARK_GRAY));
        }
        super.appendHoverText(stack, context, tooltip, flag);
    }
}