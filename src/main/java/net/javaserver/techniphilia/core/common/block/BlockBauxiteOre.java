package net.javaserver.techniphilia.core.common.block;

import net.javaserver.techniphilia.core.common.ModRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class BlockBauxiteOre extends Block {
    private static BlockBauxiteOre instance = null;
    private static ItemBlock itemBlock = null;
    private BlockBauxiteOre() {
        super(Material.ROCK, MapColor.RED);
        setRegistryName("techniphilia", "bauxite_ore");
        setUnlocalizedName("bauxite");
        setHarvestLevel("pickaxe", 2);
        setHardness(2.5F);
        setCreativeTab(ModRegistry.getItemGroup());
    }
    public static synchronized BlockBauxiteOre instance() {
        if (instance == null)
            instance = new BlockBauxiteOre();
        return instance;
    }
    public static synchronized ItemBlock itemBlock() {
        if (itemBlock == null) {
            itemBlock = new ItemBlock(instance());
            itemBlock.setRegistryName("techniphilia", "bauxite_ore");
        }
        return itemBlock;
    }
}
