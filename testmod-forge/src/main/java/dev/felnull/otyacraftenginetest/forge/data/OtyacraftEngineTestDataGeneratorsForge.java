package dev.felnull.otyacraftenginetest.forge.data;

import dev.felnull.otyacraftengine.forge.data.CrossDataGeneratorAccesses;
import dev.felnull.otyacraftenginetest.OtyacraftEngineTest;
import dev.felnull.otyacraftenginetest.data.OtyacraftEngineTestDataGenerators;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;

@Mod.EventBusSubscriber(modid = OtyacraftEngineTest.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class OtyacraftEngineTestDataGeneratorsForge {
    @SubscribeEvent
    public static void onDataGen(GatherDataEvent event) {
        OtyacraftEngineTestDataGenerators.init(CrossDataGeneratorAccesses.create(event));
    }
}
