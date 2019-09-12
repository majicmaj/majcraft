package com.majicmaj.majcraft.blocks;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.registries.ObjectHolder;

public class ModBlocks {

	@ObjectHolder("majcraft:silver_block")
	public static SilverBlock SILVERBLOCK;

	@ObjectHolder("majcraft:cold_iron_block")
	public static ColdIronBlock COLDIRONBLOCK;
	
	@ObjectHolder("majcraft:adamantine_block")
	public static AdamantineBlock ADAMANTINEBLOCK;
	
	@ObjectHolder("majcraft:artisian_station")
	public static ArtisianStation ARTISIANSTATION;
	
	@ObjectHolder("majcraft:artisitan_station")
	public static TileEntityType<ArtisianStationTile> ARTISIANSTATIONTILE;
}
