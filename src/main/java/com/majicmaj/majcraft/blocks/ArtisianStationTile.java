package com.majicmaj.majcraft.blocks;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.ItemStackHandler;

import static com.majicmaj.majcraft.blocks.ModBlocks.ARTISIANSTATIONTILE;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class ArtisianStationTile extends TileEntity implements ITickableTileEntity {

	private ItemStackHandler handler;
	
	public ArtisianStationTile() {
		super(ARTISIANSTATIONTILE);
	}

	@Override
	public void tick() {
	}
	
	@Override
	public void read(CompoundNBT tag) {
		CompoundNBT invTag = tag.getCompound("inv");
		getHandler().deserializeNBT(invTag);
		super.read(tag);
	}
	
	@Override
	public CompoundNBT write(CompoundNBT tag) {
		CompoundNBT compound = getHandler().serializeNBT();
		tag.put("inv", compound);
		return super.write(tag);
	}
	
	private ItemStackHandler getHandler() {
		if (handler == null) {
			handler = new ItemStackHandler(1);
		}
		return handler;
	}
	
	   @Nonnull
	   @Override
	   public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side) {
	        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
	            return LazyOptional.of(() -> (T) getHandler());
	        }
	        return super.getCapability(cap, side);
	}
}

