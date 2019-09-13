package com.majicmaj.majcraft.blocks;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.registries.ObjectHolder;

public class ModBlocks {

	@ObjectHolder("majcraft:silver_block")
	public static SilverBlock SILVERBLOCK;
	//Ores
	@ObjectHolder("majcraft:silver_ore")
	public static SilverOre SILVERORE;
	@ObjectHolder("majcraft:cold_iron_ore")
	public static ColdIronOre COLDIRONORE;
	@ObjectHolder("majcraft:adamantine_ore")
	public static AdamantineOre ADAMANTINEORE;
	
	//Blocks
	@ObjectHolder("majcraft:cold_iron_block")
	public static ColdIronBlock COLDIRONBLOCK;
	@ObjectHolder("majcraft:adamantine_block")
	public static AdamantineBlock ADAMANTINEBLOCK;
	@ObjectHolder("majcraft:artisian_station")
	public static ArtisianStation ARTISIANSTATION;
	
	//Tiles
	@ObjectHolder("majcraft:artisian_station")
	public static TileEntityType<ArtisianStationTile> ARTISIANSTATIONTILE;
}
