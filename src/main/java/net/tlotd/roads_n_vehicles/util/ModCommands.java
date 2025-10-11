package net.tlotd.roads_n_vehicles.util;

import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.command.argument.GameProfileArgumentType;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.tlotd.roads_n_vehicles.compat.CompatModsCheck;
import net.tlotd.roads_n_vehicles.world.CustomTextureManager;

import java.util.Collection;
import java.util.Map;
import java.util.UUID;

public class ModCommands {
    public static void registerCommands() {
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
            if (!CompatModsCheck.TLOTD) {
                dispatcher.register(CommandManager.literal("roads_n_vehicles")
                        .then(CommandManager.literal("textureID")
                                .then(CommandManager.literal("get")
                                        .executes(ctx -> {
                                            ServerCommandSource source = ctx.getSource();
                                            ServerPlayerEntity player = source.getPlayer();
                                            if (player == null) {
                                                source.sendError(Text.literal("You must be a player to use this without arguments."));
                                                return 0;
                                            }
                                            CustomTextureManager manager = CustomTextureManager.get(source.getServer());
                                            int id = manager.getTexture(player.getUuid());
                                            if (id >= 0) {
                                                source.sendFeedback(() ->
                                                        Text.literal("Your custom texture ID is ").append(Text.literal(String.valueOf(id)).formatted(Formatting.AQUA)), false);
                                            } else {
                                                source.sendFeedback(() -> Text.literal("You don’t have a custom texture ID assigned."), false);
                                            }
                                            return 1;
                                        })
                                        .then(CommandManager.argument("player", GameProfileArgumentType.gameProfile())
                                                .executes(ctx -> {
                                                    ServerCommandSource source = ctx.getSource();
                                                    Collection<GameProfile> profiles = GameProfileArgumentType.getProfileArgument(ctx, "player");
                                                    CustomTextureManager manager = CustomTextureManager.get(source.getServer());
                                                    for (GameProfile profile : profiles) {
                                                        int id = manager.getTexture(profile.getId());
                                                        if (id >= 0) {
                                                            source.sendFeedback(() ->
                                                                    Text.literal("🎨 ").append(Text.literal(profile.getName() + " → ID " + id)
                                                                            .formatted(Formatting.AQUA)), false);
                                                        } else {
                                                            source.sendFeedback(() ->
                                                                    Text.literal(profile.getName() + " has no assigned texture ID."), false);
                                                        }
                                                    }
                                                    return 1;
                                                })
                                        )
                                )
                                .then(CommandManager.literal("set")
                                        .requires(source -> source.hasPermissionLevel(2))
                                        .then(CommandManager.argument("player", GameProfileArgumentType.gameProfile())
                                                .then(CommandManager.argument("id", IntegerArgumentType.integer(0, 127))
                                                        .executes(ctx -> {
                                                            ServerCommandSource source = ctx.getSource();
                                                            Collection<GameProfile> profiles = GameProfileArgumentType.getProfileArgument(ctx, "player");
                                                            int id = IntegerArgumentType.getInteger(ctx, "id");
                                                            CustomTextureManager manager = CustomTextureManager.get(source.getServer());
                                                            for (GameProfile profile : profiles) {
                                                                manager.setTexture(profile.getId(), id);
                                                            }
                                                            source.sendFeedback(() ->
                                                                    Text.literal("Set custom texture ID to " + id + " for " + profiles.size() + " player(s)."), true);
                                                            return 1;
                                                        })
                                                )
                                        )
                                )
                                .then(CommandManager.literal("list")
                                        .requires(source -> source.hasPermissionLevel(2))
                                        .executes(ctx -> {
                                            ServerCommandSource source = ctx.getSource();
                                            CustomTextureManager manager = CustomTextureManager.get(source.getServer());
                                            Map<UUID, Integer> skins = manager.getAll();
                                            if (skins.isEmpty()) {
                                                source.sendFeedback(() -> Text.literal("No custom texture IDs have been assigned yet."), false);
                                                return 1;
                                            }
                                            source.sendFeedback(() -> Text.literal("Assigned custom texture IDs:").formatted(Formatting.GOLD), false);
                                            MinecraftServer server = source.getServer();
                                            for (Map.Entry<UUID, Integer> entry : skins.entrySet()) {
                                                String name = server.getUserCache().getByUuid(entry.getKey())
                                                        .map(GameProfile::getName)
                                                        .orElse(entry.getKey().toString());
                                                source.sendFeedback(() ->
                                                                Text.literal("- " + name + ": ").append(Text.literal(String.valueOf(entry.getValue())).formatted(Formatting.AQUA)),
                                                        false);
                                            }
                                            return 1;
                                        })
                                )
                                .then(CommandManager.literal("remove")
                                        .requires(source -> source.hasPermissionLevel(2))
                                        .then(CommandManager.argument("player", GameProfileArgumentType.gameProfile())
                                                .executes(ctx -> {
                                                    ServerCommandSource source = ctx.getSource();
                                                    Collection<GameProfile> profiles = GameProfileArgumentType.getProfileArgument(ctx, "player");
                                                    CustomTextureManager manager = CustomTextureManager.get(source.getServer());
                                                    int[] removedCount = {0};
                                                    for (GameProfile profile : profiles) {
                                                        if (manager.removeTexture(profile.getId())) {
                                                            removedCount[0]++;
                                                            source.sendFeedback(
                                                                    () -> Text.literal("Removed custom texture ID for " + profile.getName() + "."),
                                                                    true
                                                            );
                                                        } else {
                                                            source.sendFeedback(
                                                                    () -> Text.literal(profile.getName() + " had no custom texture ID assigned."),
                                                                    false
                                                            );
                                                        }
                                                    }
                                                    if (removedCount[0] == 0) {
                                                        source.sendFeedback(() -> Text.literal("No entries were removed."), false);
                                                    } else if (removedCount[0] > 1) {
                                                        int finalCount = removedCount[0];
                                                        source.sendFeedback(
                                                                () -> Text.literal("Removed " + finalCount + " player entries."),
                                                                true
                                                        );
                                                    }
                                                    return 1;
                                                })
                                        )
                                )
                        )
                );
            }
        });
    }
}