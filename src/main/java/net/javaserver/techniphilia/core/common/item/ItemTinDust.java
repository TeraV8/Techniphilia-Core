package net.javaserver.techniphilia.core.common.item;

import net.javaserver.techniphilia.core.common.ModRegistry;
import net.minecraft.item.Item;

public class ItemTinDust extends Item {
    private static ItemTinDust instance = null;
    private ItemTinDust() {
        setRegistryName("techniphilia", "tin_dust");
        setUnlocalizedName("tin_dust");
        setCreativeTab(ModRegistry.getItemGroup());
    }
    public static synchronized ItemTinDust instance() {
        if (instance == null) {
            instance = new ItemTinDust();
        }
        return instance;
    }
}
