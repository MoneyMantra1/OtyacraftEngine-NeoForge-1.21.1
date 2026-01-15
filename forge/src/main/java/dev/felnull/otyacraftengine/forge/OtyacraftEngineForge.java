package dev.felnull.otyacraftengine.forge;

import dev.architectury.platform.neoforge.EventBuses;
import dev.felnull.otyacraftengine.OtyacraftEngine;
import dev.felnull.otyacraftengine.forge.handler.CommonHandlerForge;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(OtyacraftEngine.MODID)
public class OtyacraftEngineForge {
    public OtyacraftEngineForge() {
        NeoForge.EVENT_BUS.register(CommonHandlerForge.class);
        EventBuses.registerModEventBus(OtyacraftEngine.MODID, FMLJavaModLoadingContext.get().getModEventBus());
        OtyacraftEngine.init();
    }
}
