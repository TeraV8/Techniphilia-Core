package net.javaserver.techniphilia.core.common.item;

import net.javaserver.techniphilia.core.common.ModRegistry;
import net.minecraft.item.Item;

public class ItemBronzeNugget extends Item {
    private static ItemBronzeNugget instance = null;
    private ItemBronzeNugget() {
        setRegistryName("techniphilia", "bronze_nugget");
        setUnlocalizedName("bronze_nugget");
        setCreativeTab(ModRegistry.getItemGroup());
    }
    public static synchronized ItemBronzeNugget instance() {
        if (instance == null)
            instance = new ItemBronzeNugget();
        return instance;
    }
}
