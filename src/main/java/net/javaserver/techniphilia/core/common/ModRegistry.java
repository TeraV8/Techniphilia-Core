package net.javaserver.techniphilia.core.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import org.apache.logging.log4j.Logger;

public class ModRegistry {
    public static final String MOD_NAME = "Techniphilia Core";
    public static final String MOD_ID = "techniphilia-core";
    public static final String MOD_VERSION = "0.5.10.7";
    public static Logger logger;
    private static ModItemGroup itemGroup = null;
    private ModRegistry() {}
    public static CreativeTabs getItemGroup() {
        if (itemGroup == null) {
            itemGroup = new ModItemGroup();
        }
        return itemGroup;
    }
    private static class ModItemGroup extends CreativeTabs {
        private ModItemGroup() {
            super("techniphiliaCoreBase");
        }
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(BlockCopperOre.instance());
        }
    }
}
