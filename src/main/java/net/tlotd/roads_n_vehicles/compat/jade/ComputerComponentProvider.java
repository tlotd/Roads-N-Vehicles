package net.tlotd.roads_n_vehicles.compat.jade;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.Vec2;
import net.tlotd.api.TlotdAPI;
import net.tlotd.roads_n_vehicles.TLOTDRoadsnVehicles;
import net.tlotd.roads_n_vehicles.block.ModBlocks;
import net.tlotd.roads_n_vehicles.item.ModItems;
import snownee.jade.api.BlockAccessor;
import snownee.jade.api.IBlockComponentProvider;
import snownee.jade.api.ITooltip;
import snownee.jade.api.config.IPluginConfig;
import snownee.jade.api.ui.IElement;
import snownee.jade.api.ui.IElementHelper;

import java.util.Optional;

import static net.tlotd.api.TlotdAPI.getAllVideoGames;
import static net.tlotd.roads_n_vehicles.block.custom.ComputerBlock.SCREEN;

public enum ComputerComponentProvider implements IBlockComponentProvider {
    INSTANCE;

//    @Override
//    public void appendTooltip(ITooltip tooltip, BlockAccessor accessor, IPluginConfig config) {
//        if (accessor.getBlock().equals(ModBlocks.COMPUTER_ON)) {
//            Optional<TlotdAPI.VideoGame> currentEntry = getAllVideoGames().stream().filter(e -> e.computerBlock() == accessor.getBlock() && e.gameID() == accessor.getBlockState().get(SCREEN)).findFirst();
//            Item game = ModItems.GAME_CARTRIDGE_1;
//            if (currentEntry.isPresent()) {
//                ResourceLocation signalId = currentEntry.get().signalItem();
//                game = BuiltInRegistries.ITEM.get(signalId);
//            }
//            IElementHelper elements = tooltip.getElementHelper();
//            IElement game_element = elements.item(new ItemStack(game), 0.5f).translate(new Vec2(0, -1));
//            tooltip.add(game_element);
//            tooltip.append(Component.literal(" ").append(Component.translatable(game.getDescriptionId() + ".desc")));
//        }
//    }
    @Override
    public void appendTooltip(ITooltip iTooltip, BlockAccessor blockAccessor, IPluginConfig iPluginConfig) {
    }

    @Override
    public ResourceLocation getUid() {
        return new ResourceLocation(TLOTDRoadsnVehicles.MOD_ID, "computer");
    }
}