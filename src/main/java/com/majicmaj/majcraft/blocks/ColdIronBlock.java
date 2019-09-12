package com.majicmaj.majcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class ColdIronBlock extends Block{
	
	public ColdIronBlock() {
		super(Properties.create(Material.IRON)
				.sound(SoundType.METAL)
				.hardnessAndResistance(5.0f)
				//.lightValue(14)
				.harvestLevel(1)
				.harvestTool(ToolType.PICKAXE)
		);
		setRegistryName("cold_iron_block");
	}
}
