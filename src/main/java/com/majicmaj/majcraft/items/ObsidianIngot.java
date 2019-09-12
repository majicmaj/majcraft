package com.majicmaj.majcraft.items;

import com.majicmaj.majcraft.Majcraft;

import net.minecraft.item.Item;

public class ObsidianIngot extends Item{
	public ObsidianIngot() {
		super(new Item.Properties()
				.maxStackSize(64)
				.group(Majcraft.setup.itemGroup));
		setRegistryName("obsidian_ingot");
	}
}
