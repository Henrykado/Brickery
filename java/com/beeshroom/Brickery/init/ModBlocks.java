package com.beeshroom.Brickery.init;

import java.util.ArrayList;
import java.util.List;

import com.beeshroom.Brickery.blocks.block_black_terra_brick;
import com.beeshroom.Brickery.blocks.block_blue_terra_brick;
import com.beeshroom.Brickery.blocks.block_brick_tile;
import com.beeshroom.Brickery.blocks.block_brown_terra_brick;
import com.beeshroom.Brickery.blocks.block_cyan_terra_brick;
import com.beeshroom.Brickery.blocks.block_gray_terra_brick;
import com.beeshroom.Brickery.blocks.block_green_terra_brick;
import com.beeshroom.Brickery.blocks.block_light_blue_terra_brick;
import com.beeshroom.Brickery.blocks.block_light_gray_terra_brick;
import com.beeshroom.Brickery.blocks.block_lime_terra_brick;
import com.beeshroom.Brickery.blocks.block_magenta_terra_brick;
import com.beeshroom.Brickery.blocks.block_orange_terra_brick;
import com.beeshroom.Brickery.blocks.block_pink_terra_brick;
import com.beeshroom.Brickery.blocks.block_purple_terra_brick;
import com.beeshroom.Brickery.blocks.block_red_terra_brick;
import com.beeshroom.Brickery.blocks.block_terra_brick;
import com.beeshroom.Brickery.blocks.block_white_terra_brick;
import com.beeshroom.Brickery.blocks.block_yellow_terra_brick;
import com.beeshroom.Brickery.blocks.blockcrackedbricks;
import com.beeshroom.Brickery.blocks.blockmixedcobble;
import com.beeshroom.Brickery.blocks.blockmossybricks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{

	public static final List<Block> BLOCKS = new ArrayList<Block>();

	public static final Block BLOCKMOSSYBRICKS = new blockmossybricks("blockmossybricks", Material.ROCK);
	public static final Block BLOCKCRACKEDBRICKS = new blockcrackedbricks("blockcrackedbricks", Material.ROCK);
	public static final Block BLOCKMIXEDCOBBLE = new blockmixedcobble("blockmixedcobble", Material.ROCK);
	public static final Block BLOCK_BRICK_TILE = new block_brick_tile("block_brick_tile", Material.ROCK);
	
	//terracotta
	public static final Block BLOCK_TERRA_BRICK = new block_terra_brick("block_terra_brick", Material.ROCK);
	public static final Block BLOCK_RED_TERRA_BRICK = new block_red_terra_brick("block_red_terra_brick", Material.ROCK);
	public static final Block BLOCK_ORANGE_TERRA_BRICK = new block_orange_terra_brick("block_orange_terra_brick", Material.ROCK);
	public static final Block BLOCK_YELLOW_TERRA_BRICK = new block_yellow_terra_brick("block_yellow_terra_brick", Material.ROCK);
	public static final Block BLOCK_LIME_TERRA_BRICK = new block_lime_terra_brick("block_lime_terra_brick", Material.ROCK);
	public static final Block BLOCK_GREEN_TERRA_BRICK = new block_green_terra_brick("block_green_terra_brick", Material.ROCK);
	public static final Block BLOCK_CYAN_TERRA_BRICK = new block_cyan_terra_brick("block_cyan_terra_brick", Material.ROCK);
	public static final Block BLOCK_LIGHT_BLUE__TERRA_BRICK = new block_light_blue_terra_brick("block_light_blue_terra_brick", Material.ROCK);
	public static final Block BLOCK_BLUE_TERRA_BRICK = new block_blue_terra_brick("block_blue_terra_brick", Material.ROCK);
	public static final Block BLOCK_PURPLE_TERRA_BRICK = new block_purple_terra_brick("block_purple_terra_brick", Material.ROCK);
	public static final Block BLOCK_MAGENTA_TERRA_BRICK = new block_magenta_terra_brick("block_magenta_terra_brick", Material.ROCK);
	public static final Block BLOCK_PINK_TERRA_BRICK = new block_pink_terra_brick("block_pink_terra_brick", Material.ROCK);
	public static final Block BLOCK_WHITE_TERRA_BRICK = new block_white_terra_brick("block_white_terra_brick", Material.ROCK);
	public static final Block BLOCK_LIGHT_GRAY_TERRA_BRICK = new block_light_gray_terra_brick("block_light_gray_terra_brick", Material.ROCK);
	public static final Block BLOCK_GRAY_TERRA_BRICK = new block_gray_terra_brick("block_gray_terra_brick", Material.ROCK);
	public static final Block BLOCK_BLACK_TERRA_BRICK = new block_black_terra_brick("block_black_terra_brick", Material.ROCK);
	public static final Block BLOCK_BROWN_TERRA_BRICK = new block_brown_terra_brick("block_brown_terra_brick", Material.ROCK);
	
	
	
	
	
	
	
}