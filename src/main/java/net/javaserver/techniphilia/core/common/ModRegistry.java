package net.javaserver.techniphilia.core.common;

import net.javaserver.techniphilia.core.common.block.BlockCopperOre;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraftforge.common.util.EnumHelper;
import org.apache.logging.log4j.Logger;

public class ModRegistry {
    public static final String MOD_NAME = "Techniphilia Core";
    public static final String MOD_ID = "techniphilia-core";
    public static final String MOD_VERSION = "1.0.0.0";
    public static final ItemTool.ToolMaterial COPPER_TOOL = EnumHelper.addToolMaterial("COPPER", 1, 197, 5.0F, 1.6F, 8);
    public static final ItemTool.ToolMaterial TIN_TOOL = EnumHelper.addToolMaterial("TIN", 1, 164, 5.6F, 1.8F, 9);
    public static final ItemTool.ToolMaterial ALUMINUM_TOOL = EnumHelper.addToolMaterial("ALUMINUM", 2, 387, 6.5F, 2.4F, 16);
    public static final ItemTool.ToolMaterial BRONZE_TOOL = EnumHelper.addToolMaterial("BRONZE", 2, 213, 5.8F, 1.9F, 10);
    public static final ItemArmor.ArmorMaterial COPPER_ARMOR = EnumHelper.addArmorMaterial("COPPER", "copper", 197, new int[]{2,5,4,2}, 8, SoundEvents.BLOCK_ANVIL_LAND, 0);
    public static final ItemArmor.ArmorMaterial TIN_ARMOR = EnumHelper.addArmorMaterial("TIN", "tin", 164, new int[]{2,4,5,2}, 9, SoundEvents.BLOCK_ANVIL_LAND, 0);
    public static final ItemArmor.ArmorMaterial BRONZE_ARMOR = EnumHelper.addArmorMaterial("BRONZE", "bronze", 213, new int[]{2,6,5,2}, 10, SoundEvents.BLOCK_ANVIL_LAND, 0);
    public static final ItemArmor.ArmorMaterial ALUMINUM_ARMOR = EnumHelper.addArmorMaterial("ALUMINUM", "aluminum", 387, new int[]{3,7,5,3}, 16, SoundEvents.BLOCK_ANVIL_LAND, 1);
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
