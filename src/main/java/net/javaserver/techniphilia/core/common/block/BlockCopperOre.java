package net.javaserver.techniphilia.core.common.block;

import net.javaserver.techniphilia.core.common.ModRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class BlockCopperOre extends Block {
    private static BlockCopperOre instance = null;
    private static ItemBlock itemBlock = null;
    public static synchronized BlockCopperOre instance() {
        if (instance == null) {
            BlockCopperOre t = new BlockCopperOre();
            instance = t;
        }
        return instance;
    }
    public static synchronized ItemBlock itemBlock() {
        if (itemBlock == null) {
            itemBlock = new ItemBlock(instance());
            itemBlock.setRegistryName("techniphilia", "copper_ore");
        }
        return itemBlock;
    }
    private BlockCopperOre() {
        super(Material.ROCK, MapColor.DIRT);
        setRegistryName("techniphilia", "copper_ore");
        setUnlocalizedName("copper_ore");
        setHarvestLevel("pickaxe", 1);
        setHardness(1.5F);
        setCreativeTab(ModRegistry.getItemGroup());
    }
}
