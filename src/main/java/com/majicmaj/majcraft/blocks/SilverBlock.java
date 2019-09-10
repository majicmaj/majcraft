package com.majicmaj.majcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class SilverBlock extends Block{
	
	public SilverBlock() {
		super(Properties.create(Material.IRON)
				.sound(SoundType.METAL)
				.hardnessAndResistance(2.0f)
				.lightValue(14)
		);
		setRegistryName("silverblock");
	}
}
