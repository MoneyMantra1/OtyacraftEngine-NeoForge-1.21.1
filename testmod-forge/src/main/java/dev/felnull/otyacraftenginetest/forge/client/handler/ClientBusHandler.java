package dev.felnull.otyacraftenginetest.forge.client.handler;

import dev.felnull.otyacraftenginetest.OtyacraftEngineTest;
import dev.felnull.otyacraftenginetest.client.OtyacraftEngineTestClient;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = OtyacraftEngineTest.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientBusHandler {
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        OtyacraftEngineTestClient.init();
    }
}
