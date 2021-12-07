package net.javaserver.techniphilia.core.common.item;

import net.javaserver.techniphilia.core.common.ModRegistry;
import net.minecraft.item.Item;

public class ItemBronzeDust extends Item {
    private static ItemBronzeDust instance = null;
    private ItemBronzeDust() {
        setRegistryName("techniphilia", "bronze_dust");
        setUnlocalizedName("bronze_dust");
        setCreativeTab(ModRegistry.getItemGroup());
    }
    public static synchronized ItemBronzeDust instance() {
        if (instance == null)
            instance = new ItemBronzeDust();
        return instance;
    }
}
