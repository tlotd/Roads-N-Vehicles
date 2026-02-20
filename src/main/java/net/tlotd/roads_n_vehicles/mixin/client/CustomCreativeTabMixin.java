package net.tlotd.roads_n_vehicles.mixin.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screens.inventory.CreativeModeInventoryScreen;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.tlotd.roads_n_vehicles.item.ModItemGroups;
import net.tlotd.roads_n_vehicles.TLOTDRoadsnVehicles;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(CreativeModeInventoryScreen.class)
@Environment(EnvType.CLIENT)
public abstract class CustomCreativeTabMixin {

    @Shadow private static CreativeModeTab selectedTab;

    /* =======================
       Textures
       ======================= */

    @Unique private static final Identifier TAB_BG = Identifier.fromNamespaceAndPath(TLOTDRoadsnVehicles.MOD_ID, "textures/gui/container/creative_inventory/tab.png");
    @Unique private static final Identifier SCROLL = Identifier.fromNamespaceAndPath(TLOTDRoadsnVehicles.MOD_ID, "textures/gui/container/creative_inventory/scroller.png");
    @Unique private static final Identifier TAB_TOP_SELECTED = Identifier.fromNamespaceAndPath(TLOTDRoadsnVehicles.MOD_ID, "textures/gui/container/creative_inventory/tab_top_selected.png");
    @Unique private static final Identifier TAB_TOP_INACTIVE = Identifier.fromNamespaceAndPath(TLOTDRoadsnVehicles.MOD_ID, "textures/gui/container/creative_inventory/tab_top_inactive.png");
    @Unique private static final Identifier TAB_BOTTOM_SELECTED = Identifier.fromNamespaceAndPath(TLOTDRoadsnVehicles.MOD_ID, "textures/gui/container/creative_inventory/tab_bottom_selected.png");
    @Unique private static final Identifier TAB_BOTTOM_INACTIVE = Identifier.fromNamespaceAndPath(TLOTDRoadsnVehicles.MOD_ID, "textures/gui/container/creative_inventory/tab_bottom_inactive.png");

    /* =======================
       Background replacement
       ======================= */

    @Redirect(
            method = "renderBg",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/world/item/CreativeModeTab;getBackgroundTexture()Lnet/minecraft/resources/Identifier;"
            )
    )
    private Identifier mymod$replaceBackgroundTexture(CreativeModeTab tab) {
        if (tab == ModItemGroups.TLOTD_4_ROADS_N_VEHICLES_GROUP) {
            return TAB_BG;
        }
        return tab.getBackgroundTexture();
    }
}