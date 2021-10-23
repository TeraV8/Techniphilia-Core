package net.javaserver.techniphilia.core.common.item;

import net.javaserver.techniphilia.core.common.ModRegistry;
import net.minecraft.item.Item;

public class ItemAluminumDust extends Item {
    private static ItemAluminumDust instance = null;
    private ItemAluminumDust() {
        setRegistryName("techniphilia", "aluminum_dust");
        setUnlocalizedName("aluminum_dust");
        setCreativeTab(ModRegistry.getItemGroup());
    }
    public static synchronized ItemAluminumDust instance() {
        if (instance == null)
            instance = new ItemAluminumDust();
        return instance;
    }
}
