package net.javaserver.techniphilia.core.common.item;

import net.javaserver.techniphilia.core.common.ModRegistry;
import net.minecraft.item.Item;

public class ItemTinIngot extends Item {
    private static ItemTinIngot instance = null;
    private ItemTinIngot() {
        setRegistryName("techniphilia", "tin_ingot");
        setUnlocalizedName("tin_ingot");
        setCreativeTab(ModRegistry.getItemGroup());
    }
    public static synchronized ItemTinIngot instance() {
        if (instance == null) {
            instance = new ItemTinIngot();
        }
        return instance;
    }
}
