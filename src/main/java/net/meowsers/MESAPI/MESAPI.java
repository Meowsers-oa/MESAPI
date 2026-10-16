package net.meowsers.MESAPI;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import org.slf4j.Logger;

@Mod(MESAPI.MODID)
public class MESAPI {
    public static final String MODID="mesapi";
    public static final Logger LOGGER=LogUtils.getLogger();

    public MESAPI(IEventBus bus,ModContainer container) {
        bus.addListener(this::creative);
        container.registerConfig(ModConfig.Type.LOCAL,Config.SPEC);
    }
    private void creative(BuildCreativeModeTabContentsEvent event) {

    }
}
