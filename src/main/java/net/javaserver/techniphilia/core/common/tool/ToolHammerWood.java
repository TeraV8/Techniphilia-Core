package net.javaserver.techniphilia.core.common.tool;

import net.minecraft.item.ItemTool;

public class ToolHammerWood extends ItemTool {
    private static ToolHammerWood instance = null;
    private ToolHammerWood() {
        super(1.5F, 0.8F, ToolMaterial.WOOD, null);
    }
    public static synchronized ToolHammerWood instance() {
        if (instance == null) instance = new ToolHammerWood();
        return instance;
    }
}
