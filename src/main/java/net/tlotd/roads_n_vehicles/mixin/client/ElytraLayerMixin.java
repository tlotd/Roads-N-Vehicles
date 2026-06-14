package net.tlotd.roads_n_vehicles.mixin.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.layers.ElytraLayer;
import net.minecraft.client.resources.PlayerSkin;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import net.tlotd.roads_n_vehicles.compat.CompatModsCheck;
import net.tlotd.roads_n_vehicles.util.CapeManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(ElytraLayer.class)
public abstract class ElytraLayerMixin {
    @Redirect(method = "render", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/resources/PlayerSkin;elytraTexture()Lnet/minecraft/resources/ResourceLocation;"))
    private ResourceLocation overrideElytraTexture(PlayerSkin skin, PoseStack poseStack, MultiBufferSource buffer, int light, LivingEntity entity, float f, float g, float h, float j, float k, float l) {
        if (!CompatModsCheck.TLOTD && entity instanceof AbstractClientPlayer player) {
            ResourceLocation custom = CapeManager.getCape(player.getStringUUID());
            if (custom != null) {
                return custom;
            }
        }
        return skin.elytraTexture();
    }
}