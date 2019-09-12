package com.majicmaj.majcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class ArtisianStation extends Block{
	
	public ArtisianStation() {
		super(Properties.create(Material.WOOD)
				.sound(SoundType.WOOD)
				.hardnessAndResistance(2.5f)
				//.lightValue(14)
				.harvestLevel(1)
				.harvestTool(ToolType.PICKAXE)
		);
		setRegistryName("artisian_station");
	}
}
