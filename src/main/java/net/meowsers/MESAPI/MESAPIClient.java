package net.meowsers.MESAPI;

import net.meowsers.MESAPI.api.MachineRegistration;
import net.meowsers.MESAPI.client.MachineScreen;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

@Mod(value=MESAPI.MODID,dist=Dist.CLIENT)
public class MESAPIClient {
    public MESAPIClient(ModContainer container,IEventBus bus) {
        container.registerExtensionPoint(IConfigScreenFactory.class,ConfigurationScreen::new);
        bus.addListener(this::screens);
    }
    private void screens(RegisterMenuScreensEvent event) {
        for (var handle:MachineRegistration.allMachines()) if (handle.hasAutomaticScreen()) event.register(handle.menuType(),MachineScreen::new);
    }
}
