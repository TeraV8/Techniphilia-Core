package net.javaserver.techniphilia.core.common.item;

import net.javaserver.techniphilia.core.common.ModRegistry;
import net.minecraft.item.Item;

public class ItemCopperIngot extends Item {
    private static ItemCopperIngot instance = null;
    private ItemCopperIngot() {
        setRegistryName("techniphilia", "copper_ingot");
        setUnlocalizedName("copper_ingot");
        setCreativeTab(ModRegistry.getItemGroup());
    }
    public static synchronized ItemCopperIngot instance() {
        if (instance == null) {
            instance = new ItemCopperIngot();
        }
        return instance;
    }
}
