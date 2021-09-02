package net.javaserver.techniphilia.core.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class BlockTin extends Block {
    private static BlockTin instance = null;
    private static ItemBlock itemBlock = null;
    private BlockTin() {
        super(Material.ROCK, MapColor.ICE);
        setRegistryName("techniphilia","tin_block");
        setUnlocalizedName("tin_block");
        setCreativeTab(ModRegistry.getItemGroup());
    }
    public static synchronized BlockTin instance() {
        if (instance == null) {
            instance = new BlockTin();
        }
        return instance;
    }
    public static synchronized ItemBlock itemBlock() {
        if (itemBlock == null) {
            itemBlock = new ItemBlock(instance());
            itemBlock.setRegistryName("techniphilia", "tin_block");
        }
        return itemBlock;
    }
}
