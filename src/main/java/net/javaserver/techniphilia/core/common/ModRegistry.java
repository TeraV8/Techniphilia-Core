package net.javaserver.techniphilia.core.common;

import net.javaserver.techniphilia.core.common.block.BlockCopperOre;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraftforge.common.util.EnumHelper;
import org.apache.logging.log4j.Logger;

public class ModRegistry {
    public static final String MOD_NAME = "Techniphilia Core";
    public static final String MOD_ID = "techniphilia-core";
    public static final String MOD_VERSION = "0.5.17.10";
    public static final ItemTool.ToolMaterial COPPER_TOOL = EnumHelper.addToolMaterial("COPPER", 1, 197, 5.0F, 1.6F, 8);
    public static final ItemTool.ToolMaterial TIN_TOOL = EnumHelper.addToolMaterial("TIN", 1, 164, 5.6F, 1.8F, 9);
    public static final ItemTool.ToolMaterial ALUMINUM_TOOL = EnumHelper.addToolMaterial("ALUMINUM", 2, 387, 6.5F, 2.4F, 16);
    public static Logger logger;
    private static ModItemGroup itemGroup = null;
    private ModRegistry() {}
    public static synchronized CreativeTabs getItemGroup() {
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
