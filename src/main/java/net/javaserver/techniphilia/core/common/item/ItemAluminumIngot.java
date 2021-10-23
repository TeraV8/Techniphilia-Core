package net.javaserver.techniphilia.core.common.item;

import net.javaserver.techniphilia.core.common.ModRegistry;
import net.minecraft.item.Item;

public class ItemAluminumIngot extends Item {
    private static ItemAluminumIngot instance = null;
    private ItemAluminumIngot() {
        setRegistryName("techniphilia", "aluminum_ingot");
        setUnlocalizedName("aluminum_ingot");
        setCreativeTab(ModRegistry.getItemGroup());
    }
    public static synchronized ItemAluminumIngot instance() {
        if (instance == null)
            instance = new ItemAluminumIngot();
        return instance;
    }
}
