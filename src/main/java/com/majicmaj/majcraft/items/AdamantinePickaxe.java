package com.majicmaj.majcraft.items;

import com.majicmaj.majcraft.Majcraft;
import com.majicmaj.majcraft.blocks.ModBlocks;

import net.minecraft.block.material.Material;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.TieredItem;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.common.ToolType;

public class AdamantinePickaxe extends PickaxeItem{
	public AdamantinePickaxe() {
		super(new IItemTier() {
			
			@Override
			public Ingredient getRepairMaterial() {
				return null;
			}
			
			@Override
			public int getMaxUses() {
				return 556;
			}
			
			@Override
			public int getHarvestLevel() {
				return 3;
			}
			
			@Override
			public int getEnchantability() {
				return 5;
			}
			
			@Override
			public float getEfficiency() {
				return 6;
			}
			
			@Override
			public float getAttackDamage() {
				return 6;
			}
		},
				1,
				1.0f,
				new Item.Properties()
				.addToolType(ToolType.PICKAXE, 2)
				.maxStackSize(1)
				.group(Majcraft.setup.itemGroup));
		
		setRegistryName("adamantine_pickaxe");
	}
}
