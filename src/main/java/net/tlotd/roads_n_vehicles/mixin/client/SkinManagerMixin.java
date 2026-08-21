package net.tlotd.roads_n_vehicles.mixin.client;

import com.mojang.authlib.minecraft.MinecraftProfileTextures;
import net.minecraft.client.resources.SkinManager;
import net.minecraft.core.ClientAsset;
import net.minecraft.world.entity.player.PlayerSkin;
import net.tlotd.roads_n_vehicles.util.CapeManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@Mixin(SkinManager.class)
public abstract class SkinManagerMixin {

    @Inject(method = "registerTextures", at = @At("RETURN"), cancellable = true)
    private void replaceCape(UUID uuid, MinecraftProfileTextures textures, CallbackInfoReturnable<CompletableFuture<PlayerSkin>> cir) {
        CompletableFuture<PlayerSkin> original = cir.getReturnValue();
        cir.setReturnValue(original.thenApply(playerSkin -> {
            ClientAsset.Texture customCape = CapeManager.getCape(uuid);
            if (customCape == null) {
                return playerSkin;
            }
            return new PlayerSkin(playerSkin.body(), customCape, customCape, playerSkin.model(), playerSkin.secure());
        }));
    }
}