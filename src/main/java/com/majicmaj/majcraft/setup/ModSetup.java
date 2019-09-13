package com.majicmaj.majcraft.setup;

import com.majicmaj.majcraft.blocks.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModSetup {
	
	public ItemGroup itemGroup = new ItemGroup("majcraft") {
			@Override
			public ItemStack createIcon() {
				return (new ItemStack(ModBlocks.SILVERBLOCK));
			}
		};
		public void init() {
			
		}
}
