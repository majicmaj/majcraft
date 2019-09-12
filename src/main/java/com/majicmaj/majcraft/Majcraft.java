package com.majicmaj.majcraft;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.majicmaj.majcraft.blocks.AdamantineBlock;
import com.majicmaj.majcraft.blocks.ArtisianStation;
import com.majicmaj.majcraft.blocks.ColdIronBlock;
import com.majicmaj.majcraft.blocks.ModBlocks;
import com.majicmaj.majcraft.blocks.SilverBlock;
import com.majicmaj.majcraft.items.AdamantineIngot;
import com.majicmaj.majcraft.items.ColdIronIngot;
import com.majicmaj.majcraft.items.ObsidianIngot;
import com.majicmaj.majcraft.items.SilverIngot;
import com.majicmaj.majcraft.setup.ClientProxy;
import com.majicmaj.majcraft.setup.IProxy;
import com.majicmaj.majcraft.setup.ModSetup;
import com.majicmaj.majcraft.setup.ServerProxy;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("majcraft")
public class Majcraft {
	
	public static IProxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new ServerProxy());
	
	public static final Logger LOGGER = (Logger) LogManager.getLogger();
	
	public static ModSetup setup = new ModSetup();
	
	// enumerate guis
	public enum GUI_ENUM 
	{
		ARTISIANSTATION
	}
	
	public Majcraft() {
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
	}
	
	private void setup(final FMLCommonSetupEvent event) {
		setup.init();
		proxy.init();
	}
	
	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents {
		@SubscribeEvent
		public static void onBlockRegistry(final RegistryEvent.Register<Block> event) {
			event.getRegistry().register(new SilverBlock());
			event.getRegistry().register(new ColdIronBlock());
			event.getRegistry().register(new AdamantineBlock());
			event.getRegistry().register(new ArtisianStation());
		}
		
		@SubscribeEvent
		public static void onItemRegistry(final RegistryEvent.Register<Item> event) {
			Item.Properties properties = new Item.Properties()
					.group(setup.itemGroup);
			event.getRegistry().register(new BlockItem(ModBlocks.SILVERBLOCK, properties).setRegistryName("silver_block"));
			event.getRegistry().register(new BlockItem(ModBlocks.COLDIRONBLOCK, properties).setRegistryName("cold_iron_block"));
			event.getRegistry().register(new BlockItem(ModBlocks.ADAMANTINEBLOCK, properties).setRegistryName("adamantine_block"));
			event.getRegistry().register(new BlockItem(ModBlocks.ARTISIANSTATION, properties).setRegistryName("artisian_station"));
			event.getRegistry().register(new SilverIngot());
			event.getRegistry().register(new ObsidianIngot());
			event.getRegistry().register(new ColdIronIngot());
			event.getRegistry().register(new AdamantineIngot());

		}
	}
}
   