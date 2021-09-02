package net.javaserver.techniphilia.core.common;

import net.minecraft.item.Item;

public class ItemCopperDust extends Item {
    private static ItemCopperDust instance = null;
    private ItemCopperDust() {
        setRegistryName("techniphilia","copper_dust");
        setUnlocalizedName("copper_dust");
        setCreativeTab(ModRegistry.getItemGroup());
    }
    public static synchronized ItemCopperDust instance() {
        if (instance == null) {
            instance = new ItemCopperDust();
        }
        return instance;
    }
}
