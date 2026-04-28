package net.tlotd.roads_n_vehicles.compat.jade;

import net.minecraft.resources.ResourceLocation;
import net.tlotd.roads_n_vehicles.TLOTDRoadsnVehicles;
import snownee.jade.api.BlockAccessor;
import snownee.jade.api.IBlockComponentProvider;
import snownee.jade.api.ITooltip;
import snownee.jade.api.config.IPluginConfig;

public enum TelevisionComponentProvider implements IBlockComponentProvider {
    INSTANCE;

//    @Override
//    public void appendTooltip(ITooltip tooltip, BlockAccessor accessor, IPluginConfig config) {
//        if (accessor.getBlock().equals(ModBlocks.TELEVISION_ON)) {
//            Optional<TlotdAPI.TelevisionSignal> currentEntry = getAllTelevisionSignals().stream().filter(e -> e.onBlock() == accessor.getBlock() && e.channel() == accessor.getBlockState().get(CHANNEL)).findFirst();
//            Item vhs = ModItems.VHS_CASSETTE_1;
//            if (currentEntry.isPresent()) {
//                ResourceLocation signalId = currentEntry.get().signalItem();
//                vhs = BuiltInRegistries.ITEM.get(signalId);
//            }
//            IElementHelper elements = tooltip.getElementHelper();
//            IElement vhs_element = elements.item(new ItemStack(vhs), 0.5f).translate(new Vec2(0, -1));
//            tooltip.add(vhs_element);
//            tooltip.append(Component.literal(" ").append(Component.translatable(vhs.getDescriptionId() + ".desc")));
//        } else if (accessor.getBlock().equals(ModBlocks.TELEVISION_GAME)) {
//            Optional<TlotdAPI.VideoGame> currentEntry = getAllVideoGames().stream().filter(e -> e.tvBlock() == accessor.getBlock() && e.gameID() == accessor.getBlockState().get(CHANNEL)).findFirst();
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
        return ResourceLocation.fromNamespaceAndPath(TLOTDRoadsnVehicles.MOD_ID, "television");
    }
}