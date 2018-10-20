package com.beeshroom.Brickery.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class block_pink_terra_brick extends BlockBase
{

	public block_pink_terra_brick (String name, Material material) 
	{
		super(name, material);

		setSoundType(SoundType.STONE);
		setHardness(2.0f);
		setResistance(21.0f);
		setHarvestLevel("pickaxe", 0);
		//setLightOpacity(1);
		//setBlockUnbreakable();
		//setLightLevel(0.0f);
		
	
		
		
	}

}
