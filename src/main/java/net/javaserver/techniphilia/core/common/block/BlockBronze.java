package net.javaserver.techniphilia.core.common.block;

import net.javaserver.techniphilia.core.common.ModRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class BlockBronze extends Block {
    private static BlockBronze instance = null;
    private static ItemBlock itemBlock = null;
    private BlockBronze() {
        super(Material.ROCK, MapColor.ORANGE_STAINED_HARDENED_CLAY);
        setRegistryName("techniphilia", "bronze_block");
        setUnlocalizedName("bronze_block");
        setCreativeTab(ModRegistry.getItemGroup());
    }
    public static synchronized BlockBronze instance() {
        if (instance == null)
            instance = new BlockBronze();
        return instance;
    }
    public static synchronized ItemBlock itemBlock() {
        if (itemBlock == null) {
            itemBlock = new ItemBlock(instance());
            itemBlock.setRegistryName("techniphilia", "bronze_block");
        }
        return itemBlock;
    }
}
