package net.javaserver.techniphilia.core.common.block;

import net.javaserver.techniphilia.core.common.ModRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class BlockTinOre extends Block {
    private static BlockTinOre instance = null;
    private static ItemBlock itemBlock = null;
    public static synchronized BlockTinOre instance() {
        if (instance == null) {
            BlockTinOre t = new BlockTinOre();
            instance = t;
        }
        return instance;
    }
    public static synchronized ItemBlock itemBlock() {
        if (itemBlock == null) {
            itemBlock = new ItemBlock(instance());
            itemBlock.setRegistryName("techniphilia", "tin_ore");
        }
        return itemBlock;
    }
    private BlockTinOre() {
        super(Material.ROCK, MapColor.ICE);
        setRegistryName("techniphilia", "tin_ore");
        setUnlocalizedName("tin_ore");
        setHarvestLevel("pickaxe", 1);
        setHardness(1.45F);
        setCreativeTab(ModRegistry.getItemGroup());
    }
}
