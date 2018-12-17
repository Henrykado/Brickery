package com.beeshroom.brickery.util.handlers;

import com.beeshroom.brickery.tileentity.TileEntityBrickFurnace;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler 
{
public static void registerTileEntities() 
{
	GameRegistry.registerTileEntity(TileEntityBrickFurnace.class, "brick_furnace");
}
}
