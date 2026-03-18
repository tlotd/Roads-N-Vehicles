package net.tlotd.roads_n_vehicles.compat.jade;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Vec2f;
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

    @Override
    public void appendTooltip(ITooltip tooltip, BlockAccessor accessor, IPluginConfig config) {
        if (accessor.getBlock().equals(ModBlocks.COMPUTER_ON)) {
            Optional<TlotdAPI.VideoGame> currentEntry = getAllVideoGames().stream().filter(e -> e.computerBlock() == accessor.getBlock() && e.gameID() == accessor.getBlockState().get(SCREEN)).findFirst();
            Item game = ModItems.GAME_CARTRIDGE_1;
            if (currentEntry.isPresent()) {
                Identifier signalId = currentEntry.get().signalItem();
                game = Registries.ITEM.get(signalId);
            }
            IElementHelper elements = tooltip.getElementHelper();
            IElement game_element = elements.item(new ItemStack(game), 0.5f).translate(new Vec2f(0, -1));
            tooltip.add(game_element);
            tooltip.append(Text.literal(" ").append(Text.translatable(game.getTranslationKey() + ".desc")));
        }
    }
    @Override
    public Identifier getUid() {
        return new Identifier(TLOTDRoadsnVehicles.MOD_ID, "computer");
    }
}