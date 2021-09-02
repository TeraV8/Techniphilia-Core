package net.javaserver.techniphilia.core.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class BlockCopper extends Block {
    private static BlockCopper instance = null;
    private static ItemBlock itemBlock = null;
    private BlockCopper() {
        super(Material.ROCK, MapColor.DIRT);
        setRegistryName("techniphilia","copper_block");
        setUnlocalizedName("copper_block");
        setCreativeTab(ModRegistry.getItemGroup());
    }
    public static synchronized BlockCopper instance() {
        if (instance == null) {
            instance = new BlockCopper();
        }
        return instance;
    }
    public static synchronized ItemBlock itemBlock() {
        if (itemBlock == null) {
            itemBlock = new ItemBlock(instance());
            itemBlock.setRegistryName("techniphilia", "copper_block");
        }
        return itemBlock;
    }
}
