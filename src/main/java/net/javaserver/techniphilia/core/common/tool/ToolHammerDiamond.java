package net.javaserver.techniphilia.core.common.tool;

import net.javaserver.techniphilia.core.common.ModRegistry;

public class ToolHammerDiamond extends ToolHammer {
    private static ToolHammerDiamond instance = null;
    private ToolHammerDiamond() {
        super(ToolMaterial.DIAMOND);
        setRegistryName("techniphilia", "hammer_diamond");
        setUnlocalizedName("hammer_diamond");
        setCreativeTab(ModRegistry.getItemGroup());
    }
    public static synchronized ToolHammerDiamond instance() {
        if (instance == null)
            instance = new ToolHammerDiamond();
        return instance;
    }
}
