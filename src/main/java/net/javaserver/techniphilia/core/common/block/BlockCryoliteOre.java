package net.javaserver.techniphilia.core.common.block;

import net.javaserver.techniphilia.core.common.ModRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class BlockCryoliteOre extends Block {
    private static BlockCryoliteOre instance = null;
    private static ItemBlock itemBlock = null;
    private BlockCryoliteOre() {
        super(Material.ROCK, MapColor.RED);
        setRegistryName("techniphilia", "cryolite_ore");
        setUnlocalizedName("cryolite");
        setHarvestLevel("pickaxe", 2);
        setHardness(2.7F);
        setCreativeTab(ModRegistry.getItemGroup());
    }
    public static synchronized BlockCryoliteOre instance() {
        if (instance == null)
            instance = new BlockCryoliteOre();
        return instance;
    }
    public static synchronized ItemBlock itemBlock() {
        if (itemBlock == null) {
            itemBlock = new ItemBlock(instance());
            itemBlock.setRegistryName("techniphilia", "cryolite_ore");
        }
        return itemBlock;
    }
}
