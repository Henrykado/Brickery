package com.beeshroom.brickery.blocks;

import com.beeshroom.brickery.Main;
import com.beeshroom.brickery.init.ModBlocks;
import com.beeshroom.brickery.init.ModItems;
import com.beeshroom.brickery.util.IHasModel;
import com.beeshroom.brickery.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BlockBase extends Block {

    public BlockBase(String name, Material material) {
        super(material);
        setCreativeTab(Main.CREATIVE_TAB);

        register(name);
    }

    public Block register(String name) {
    	   setTranslationKey(name);
        setRegistryName(Reference.MOD_ID, name);
        ForgeRegistries.BLOCKS.register(this);
        ForgeRegistries.ITEMS.register(new ItemBlock(this).setRegistryName(Reference.MOD_ID, name));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(new ResourceLocation(Reference.MOD_ID, name), "inventory"));
        return this;
    }

}