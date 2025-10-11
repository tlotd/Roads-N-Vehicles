package net.tlotd.roads_n_vehicles.mixin.client;

import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.util.Identifier;
import net.tlotd.roads_n_vehicles.compat.CompatModsCheck;
import net.tlotd.roads_n_vehicles.util.CapeManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AbstractClientPlayerEntity.class)
public abstract class AbstractClientPlayerEntityMixin {
    @Inject(method = "getCapeTexture", at = @At("HEAD"), cancellable = true)
    private void overrideCapeTexture(CallbackInfoReturnable<Identifier> cir) {
        if (!CompatModsCheck.TLOTD) {
            AbstractClientPlayerEntity player = (AbstractClientPlayerEntity) (Object) this;
            Identifier customCape = CapeManager.getCape(player.getUuidAsString());
            if (customCape != null) {
                cir.setReturnValue(customCape);
            }
        }
    }
}