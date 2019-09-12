package com.majicmaj.majcraft.items;

import com.majicmaj.majcraft.Majcraft;

import net.minecraft.item.Item;

public class ColdIronIngot extends Item{
	public ColdIronIngot() {
		super(new Item.Properties()
				.maxStackSize(64)
				.group(Majcraft.setup.itemGroup));
		setRegistryName("cold_iron_ingot");
	}
}
