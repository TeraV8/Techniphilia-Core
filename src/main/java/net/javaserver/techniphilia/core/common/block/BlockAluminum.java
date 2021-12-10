package net.javaserver.techniphilia.core.common.block;

import net.javaserver.techniphilia.core.common.ModRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class BlockAluminum extends Block {
    private static BlockAluminum instance = null;
    private static ItemBlock itemBlock = null;
    private BlockAluminum() {
        super(Material.ROCK, MapColor.CLAY);
        setRegistryName("techniphilia", "aluminum_block");
        setUnlocalizedName("aluminum_block");
        setHarvestLevel("pickaxe", 0);
        setHardness(0.5F);
        setCreativeTab(ModRegistry.getItemGroup());
    }
    public static synchronized BlockAluminum instance() {
        if (instance == null)
            instance = new BlockAluminum();
        return instance;
    }
    public static synchronized ItemBlock itemBlock() {
        if (itemBlock == null) {
            itemBlock = new ItemBlock(instance());
            itemBlock.setRegistryName("techniphilia", "aluminum_block");
        }
        return itemBlock;
    }
}
