package net.javaserver.techniphilia.core.common.item;

import net.javaserver.techniphilia.core.common.ModRegistry;
import net.minecraft.item.Item;

public class ItemBronzeIngot extends Item {
    private static ItemBronzeIngot instance = null;
    private ItemBronzeIngot() {
        setRegistryName("techniphilia", "bronze_ingot");
        setUnlocalizedName("bronze_ingot");
        setCreativeTab(ModRegistry.getItemGroup());
    }
    public static synchronized ItemBronzeIngot instance() {
        if (instance == null)
            instance = new ItemBronzeIngot();
        return instance;
    }
}
