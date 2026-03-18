package net.tlotd.roads_n_vehicles.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.tlotd.api.TlotdAPI;
import net.tlotd.roads_n_vehicles.compat.CompatModsCheck;
import net.tlotd.roads_n_vehicles.networking.ClientTextureCache;
import net.tlotd.roads_n_vehicles.world.CustomTextureManager;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Objects;

public class CoatOfArmsBlock extends SignBlock {

    public static final IntProperty COAT_OF_ARMS = IntProperty.of("coat_of_arms", 0, 127);
    public static final BooleanProperty CUSTOM = BooleanProperty.of("custom");

    private int getDefaultSkinFor(String uuid, boolean formerTLOTD) {
        return switch (uuid) {
            case "212aa6f5-69a9-47d9-9ad5-19b359744edf" -> 1;
            case "67148bd0-1a00-4bca-9d9e-ec246afbcf51" -> 2;
            case "53c68d22-726b-4a37-b92d-8d7c4670a87d" -> 3;
            case "ebcc701d-5e03-4e57-9279-1dd595f6a4d4" -> formerTLOTD ? 7 : 0; //ISSO_21_
            case "08c6cfba-40cd-43e2-a929-764e9fadc442" -> formerTLOTD ? 9 : 0; //Polarfoxtm
            case "d3018dca-9a16-43f0-8d72-19b93e33fa6b" -> 10;
            case "125cda9f-1a5b-40c5-b3a9-02c7988940f6" -> 13;
            case "75fcce95-16a1-417b-801d-04ebb925d56b" -> 15;
            case "8365d4fc-c514-4c2e-a4e5-cf39fb26b0f0" -> 19;
            default -> 0;
        };
    }

    public CoatOfArmsBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH).with(WATERLOGGED, false).with(CUSTOM, false).with(COAT_OF_ARMS, 0));
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        int coat_of_arms = 0;
        boolean formerTLOTD = false;
        PlayerEntity player = ctx.getPlayer();
        ServerWorld world = null;
        boolean custom = false;
        int customTextureId;
        if (player != null && !ctx.getWorld().isClient && player.getServer() != null) {
            world = player.getServer().getOverworld();
        }
        if (world != null) {
            if (CompatModsCheck.TLOTD) {
                custom = TlotdAPI.hasCustomTexture(ctx.getWorld().getServer(), Objects.requireNonNull(ctx.getPlayer()).getUuid());
                customTextureId = TlotdAPI.getCustomTexture(ctx.getWorld().getServer(), Objects.requireNonNull(ctx.getPlayer()).getUuid());
                formerTLOTD = TlotdAPI.formerTlotdRewards(player.getServer());
            } else {
                CustomTextureManager manager = CustomTextureManager.get(player.getServer());
                custom = manager.hasTexture(player.getUuid());
                customTextureId = manager.getTexture(player.getUuid());
            }
            if (custom) {
                coat_of_arms = customTextureId;
            } else {
                coat_of_arms = getDefaultSkinFor(player.getUuidAsString(), formerTLOTD);
            }
        }
        return this.getDefaultState()
                .with(FACING, ctx.getHorizontalPlayerFacing())
                .with(WATERLOGGED, ctx.getWorld().getFluidState(ctx.getBlockPos()).isOf(Fluids.WATER))
                .with(COAT_OF_ARMS, coat_of_arms)
                .with(CUSTOM, custom);
    }

    @Override
    public void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, WATERLOGGED, COAT_OF_ARMS, CUSTOM);
    }

    public static final Identifier DEFAULT_FONT_ID = new Identifier("minecraft", "default");
    public static final Identifier PLAYERS_FONT_ID = new Identifier("roads-n-vehicles", "players");
    public static final Identifier MODS_FONT_ID = new Identifier("roads-n-vehicles", "mods");

    @Override
    public void appendTooltip(ItemStack stack, @Nullable BlockView world, List<Text> tooltip, TooltipContext options) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("block.roads-n-vehicles.coat_of_arms.tooltip").formatted(Formatting.GRAY));
            tooltip.add(Text.translatable("block.roads-n-vehicles.coat_of_arms.tooltip_2").formatted(Formatting.GRAY));
            tooltip.add(Text.literal(""));
            tooltip.add(Text.translatable("block.roads-n-vehicles.license_plate.ponder", Text.translatable("key.keyboard.shift").formatted(Formatting.WHITE)).formatted(Formatting.DARK_GRAY));
            Style style = this.getName().getStyle();
            tooltip.add(Text.translatable("block.roads-n-vehicles.coat_of_arms.tooltip_shift").formatted(Formatting.GRAY));
            tooltip.add(Text.literal("\uE000").setStyle(style.withFont(PLAYERS_FONT_ID)).append(Text.literal(" TLOTD - Worldspawn").setStyle(style.withFont(DEFAULT_FONT_ID))));
            tooltip.add(Text.literal("\uE001").setStyle(style.withFont(PLAYERS_FONT_ID)).append(Text.literal(" Isla_Nublar - Drachenheide").setStyle(style.withFont(DEFAULT_FONT_ID))));
            tooltip.add(Text.literal("\uE002").setStyle(style.withFont(PLAYERS_FONT_ID)).append(Text.literal(" EinsDarki - Little Tokyo").setStyle(style.withFont(DEFAULT_FONT_ID))));
            if (CompatModsCheck.TLOTD) {
                if (TlotdAPI.formerTlotdRewardsClient()) {
                    tooltip.add(Text.literal("\uE006").setStyle(style.withFont(PLAYERS_FONT_ID)).append(Text.literal(" ISSO_21_ - Löwenburg").setStyle(style.withFont(DEFAULT_FONT_ID))));
                    tooltip.add(Text.literal("\uE008").setStyle(style.withFont(PLAYERS_FONT_ID)).append(Text.literal(" Polarfoxtm - Zorkcrad").setStyle(style.withFont(DEFAULT_FONT_ID))));
                }
            }
            tooltip.add(Text.literal("\uE009").setStyle(style.withFont(PLAYERS_FONT_ID)).append(Text.literal(" Salsafox - New California Republic").setStyle(style.withFont(DEFAULT_FONT_ID))));
            tooltip.add(Text.literal("\uE00E").setStyle(style.withFont(PLAYERS_FONT_ID)).append(Text.literal(" akashic_system - Firmament").setStyle(style.withFont(DEFAULT_FONT_ID))));
            tooltip.add(Text.literal("\uE012").setStyle(style.withFont(PLAYERS_FONT_ID)).append(Text.literal(" Jakx444 - New Haven").setStyle(style.withFont(DEFAULT_FONT_ID))));
            tooltip.add(Text.translatable("block.roads-n-vehicles.coat_of_arms.tooltip_custom").formatted(Formatting.GRAY));
            MinecraftClient client = MinecraftClient.getInstance();
            if (client.player != null && client.getServer() != null) {
                if (CompatModsCheck.TLOTD) {
                    if (!TlotdAPI.getClientTextures().isEmpty()) {
                        TlotdAPI.getClientTextures().forEach((uuid, entry) -> tooltip.add(Text.literal("\uE000 ").setStyle(style.withFont(MODS_FONT_ID)).append(Text.literal(entry.getPlayerName()).setStyle(style.withFont(DEFAULT_FONT_ID)))));
                    } else {
                        tooltip.add(Text.literal("...").formatted(Formatting.DARK_GRAY));
                    }
                } else {
                    if (!ClientTextureCache.TEXTURES.isEmpty()) {
                        ClientTextureCache.TEXTURES.forEach((uuid, entry) -> tooltip.add(Text.literal("\uE001 ").setStyle(style.withFont(MODS_FONT_ID)).append(Text.literal(entry.playerName).setStyle(style.withFont(DEFAULT_FONT_ID)))));
                    } else {
                        tooltip.add(Text.literal("...").formatted(Formatting.DARK_GRAY));
                    }
                }
            }
        } else {
            tooltip.add(Text.translatable("block.roads-n-vehicles.coat_of_arms.tooltip").formatted(Formatting.GRAY));
            tooltip.add(Text.translatable("block.roads-n-vehicles.coat_of_arms.tooltip_2").formatted(Formatting.GRAY));
            tooltip.add(Text.literal(""));
            tooltip.add(Text.translatable("block.roads-n-vehicles.license_plate.ponder", Text.translatable("key.keyboard.shift").formatted(Formatting.GRAY)).formatted(Formatting.DARK_GRAY));
        }
        super.appendTooltip(stack, world, tooltip, options);
    }
}