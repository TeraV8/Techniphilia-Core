package net.javaserver.techniphilia.core.common;

import net.minecraft.item.Item;

public class ItemCopperNugget extends Item {
    private static ItemCopperNugget instance = null;
    private ItemCopperNugget() {
        setRegistryName("techniphilia","copper_nugget");
        setUnlocalizedName("copper_nugget");
        setCreativeTab(ModRegistry.getItemGroup());
    }
    public static synchronized ItemCopperNugget instance() {
        if (instance == null)
            instance = new ItemCopperNugget();
        return instance;
    }
}
