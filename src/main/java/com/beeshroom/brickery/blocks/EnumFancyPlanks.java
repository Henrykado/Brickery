package com.beeshroom.brickery.blocks;

import net.minecraft.block.material.MapColor;
import net.minecraft.util.IStringSerializable;

public enum EnumFancyPlanks implements IStringSerializable {

    OAK(0, "oak", "parquet"),
    SPRUCE(1, "spruce", "basket-weave"),
    BIRCH(2, "birch", "checkered"),
    JUNGLE(3, "jungle", "diagonal"),
    ACACIA(4, "acacia", "herringbone"),
    DARK_OAK(5, "dark_oak", "laminate");

    public String name, type;
    public int ID;

    EnumFancyPlanks(int ID, String name, String type) {
        this.name = name;
        this.ID = ID;
        this.type = type;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getID() {
        return ID;
    }

}