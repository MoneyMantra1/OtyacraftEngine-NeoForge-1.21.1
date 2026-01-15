package dev.felnull.otyacraftenginetest.forge;

import dev.architectury.platform.neoforge.EventBuses;
import dev.felnull.otyacraftenginetest.OtyacraftEngineTest;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(OtyacraftEngineTest.MODID)
public class OtyacraftEngineTestForge {
    public OtyacraftEngineTestForge() {
        EventBuses.registerModEventBus(OtyacraftEngineTest.MODID, FMLJavaModLoadingContext.get().getModEventBus());
        OtyacraftEngineTest.init();
    }
}
