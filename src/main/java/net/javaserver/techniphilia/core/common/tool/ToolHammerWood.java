package net.javaserver.techniphilia.core.common.tool;

import net.javaserver.techniphilia.core.common.ModRegistry;

public class ToolHammerWood extends ToolHammer {
    private static ToolHammerWood instance = null;
    private ToolHammerWood() {
        super(ToolMaterial.WOOD);
        setRegistryName("techniphilia", "hammer_wood");
        setUnlocalizedName("hammer_wood");
        setCreativeTab(ModRegistry.getItemGroup());
    }
    public static synchronized ToolHammerWood instance() {
        if (instance == null) instance = new ToolHammerWood();
        return instance;
    }
}
