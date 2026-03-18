package net.tlotd.roads_n_vehicles.compat.jade;

import net.tlotd.roads_n_vehicles.block.custom.ComputerBlock;
import net.tlotd.roads_n_vehicles.block.custom.LicensePlateBlock;
import net.tlotd.roads_n_vehicles.block.custom.TelevisionBlock;
import net.tlotd.roads_n_vehicles.block.custom.TrafficLightBlock;
import snownee.jade.api.IWailaClientRegistration;
import snownee.jade.api.IWailaCommonRegistration;
import snownee.jade.api.IWailaPlugin;
import snownee.jade.api.WailaPlugin;

@WailaPlugin
public class TLOTDRoadsnVehiclesJadeIntegration implements IWailaPlugin {

    @Override
    public void register(IWailaCommonRegistration registration) {
        //TODO register data providers
    }

    @Override
    public void registerClient(IWailaClientRegistration registration) {
        registration.registerBlockComponent(TelevisionComponentProvider.INSTANCE, TelevisionBlock.class);
        registration.registerBlockComponent(ComputerComponentProvider.INSTANCE, ComputerBlock.class);
        registration.registerBlockComponent(TrafficLightComponentProvider.INSTANCE, TrafficLightBlock.class);
        registration.registerBlockComponent(LicensePlateComponentProvider.INSTANCE, LicensePlateBlock.class);
    }
}