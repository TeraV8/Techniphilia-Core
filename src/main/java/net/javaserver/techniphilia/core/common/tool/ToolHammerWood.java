package net.javaserver.techniphilia.core.common.tool;

import net.javaserver.techniphilia.core.common.ModRegistry;
import net.minecraft.item.ItemTool;

public class ToolHammerWood extends ItemTool {
    private static ToolHammerWood instance = null;
    private ToolHammerWood() {
        super(0.5F, -3.2F, ToolMaterial.WOOD, null);
        setRegistryName("techniphilia", "hammer_wood");
        setUnlocalizedName("hammer_wood");
        setCreativeTab(ModRegistry.getItemGroup());
    }
    public static synchronized ToolHammerWood instance() {
        if (instance == null) instance = new ToolHammerWood();
        return instance;
    }
}
