package net.javaserver.techniphilia.core.common.item;

import net.javaserver.techniphilia.core.common.ModRegistry;
import net.minecraft.item.Item;

public class ItemAluminumNugget extends Item {
    private static ItemAluminumNugget instance = null;
    private ItemAluminumNugget() {
        setRegistryName("techniphilia", "aluminum_nugget");
        setUnlocalizedName("aluminum_nugget");
        setCreativeTab(ModRegistry.getItemGroup());
    }
    public static synchronized ItemAluminumNugget instance() {
        if (instance == null)
            instance = new ItemAluminumNugget();
        return instance;
    }
}
