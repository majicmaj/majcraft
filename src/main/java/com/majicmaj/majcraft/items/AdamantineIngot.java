package com.majicmaj.majcraft.items;

import com.majicmaj.majcraft.Majcraft;

import net.minecraft.item.Item;

public class AdamantineIngot extends Item{
	public AdamantineIngot() {
		super(new Item.Properties()
				.maxStackSize(64)
				.group(Majcraft.setup.itemGroup));
		setRegistryName("adamantine_ingot");
	}
}
