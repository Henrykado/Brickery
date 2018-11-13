package com.beeshroom.brickery.init;

import com.beeshroom.brickery.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.EnumDyeColor;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber
public class ModBlocks {

    public static final List<Block> BLOCKS = new ArrayList<>();

    public static final Block BLOCKMOSSYBRICKS = new BlockBase("mossy_bricks", Material.ROCK);
    public static final Block BLOCKCRACKEDBRICKS = new BlockBase("cracked_bricks", Material.ROCK);
    public static final Block BLOCKMIXEDCOBBLE = new BlockBase("mixed_cobble", Material.ROCK);
    public static final Block BLOCK_BRICK_TILE = new BlockBase("brick_tile", Material.ROCK);
    public static final Block BLOCK_DIRTY_BRICKS = new BlockBase("dirty_bricks", Material.ROCK);

    public static Block[] TERRACOTTA_BRICKS = new Block[16];
    public static Block[] FANCY_PLANKS = new Block[6];

    static {
        for (EnumDyeColor color : EnumDyeColor.values()) {
            TERRACOTTA_BRICKS[color.getMetadata()] = new BlockTerracottaBrick(color);
        }
        for(EnumFancyPlanks fancyPlanks : EnumFancyPlanks.values()) {
            FANCY_PLANKS[fancyPlanks.getID()] = new BlockFancyPlanks(fancyPlanks);
        }
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {

    }

}