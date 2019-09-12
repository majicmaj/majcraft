package com.majicmaj.majcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class AdamantineBlock extends Block{
	
	public AdamantineBlock() {
		super(Properties.create(Material.IRON)
				.sound(SoundType.METAL)
				.hardnessAndResistance(5.0f)
				//.lightValue(14)
				.harvestLevel(2)
				.harvestTool(ToolType.PICKAXE)
		);
		setRegistryName("adamantine_block");
	}
}
