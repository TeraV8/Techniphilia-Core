package net.javaserver.techniphilia.core.common;

import net.minecraft.item.Item;

public class ItemTinNugget extends Item {
    private static ItemTinNugget instance = null;
    private ItemTinNugget() {
        setRegistryName("techniphilia", "tin_nugget");
        setUnlocalizedName("tin_nugget");
        setCreativeTab(ModRegistry.getItemGroup());
    }
    public static synchronized ItemTinNugget instance() {
        if (instance == null) {
            instance = new ItemTinNugget();
        }
        return instance;
    }
}
