package com.majicmaj.majcraft.items;

import com.majicmaj.majcraft.Majcraft;

import net.minecraft.item.Item;

public class SilverIngot extends Item{
	public SilverIngot() {
		super(new Item.Properties()
				.maxStackSize(64)
				.group(Majcraft.setup.itemGroup));
		setRegistryName("silver_ingot");
	}
}
