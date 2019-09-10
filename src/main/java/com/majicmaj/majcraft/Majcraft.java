package com.majicmaj.majcraft;

import java.util.logging.Logger;

import org.apache.logging.log4j.LogManager;

import com.majicmaj.majcraft.setup.ClientProxy;
import com.majicmaj.majcraft.setup.IProxy;
import com.majicmaj.majcraft.setup.ServerProxy;

import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistryEntry;

@Mod("majcraft")
public class Majcraft {
	public static IProxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new ServerProxy());
	public static final Logger LOGGER = (Logger) LogManager.getLogger();
	
	public Majcraft() {
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
	}
	
	private void setup(final FMLCommonSetupEvent event) {
		// Do setup stuff
	}
	
	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents {
		@SubscribeEvent
		public static void onBlockRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
			
		}
	}
}
   