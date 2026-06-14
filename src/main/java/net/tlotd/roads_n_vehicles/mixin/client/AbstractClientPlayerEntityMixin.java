package net.tlotd.roads_n_vehicles.mixin.client;

import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.resources.ResourceLocation;
import net.tlotd.roads_n_vehicles.compat.CompatModsCheck;
import net.tlotd.roads_n_vehicles.util.CapeManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AbstractClientPlayer.class)
public abstract class AbstractClientPlayerEntityMixin {
    @Inject(method = "getCloakTextureLocation", at = @At("HEAD"), cancellable = true)
    private void overrideCapeTexture(CallbackInfoReturnable<ResourceLocation> cir) {
        if (!CompatModsCheck.TLOTD) {
            AbstractClientPlayer player = (AbstractClientPlayer)(Object)this;
            ResourceLocation cape = CapeManager.getCape(player.getStringUUID());
            if (cape != null) {
                cir.setReturnValue(cape);
            }
        }
    }

    @Inject(method = "getElytraTextureLocation", at = @At("HEAD"), cancellable = true)
    private void overrideElytraTexture(CallbackInfoReturnable<ResourceLocation> cir) {
        if (!CompatModsCheck.TLOTD) {
            AbstractClientPlayer player = (AbstractClientPlayer)(Object)this;
            ResourceLocation cape = CapeManager.getCape(player.getStringUUID());
            if (cape != null) {
                cir.setReturnValue(cape);
            }
        }
    }
}