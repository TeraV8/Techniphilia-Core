package net.javaserver.techniphilia.core.common.tool;

import net.javaserver.techniphilia.core.common.ModRegistry;

public class ToolHammerTin extends ToolHammer {
    private static ToolHammerTin instance = null;
    private ToolHammerTin() {
        super(ModRegistry.TIN_TOOL);
        setRegistryName("techniphilia", "hammer_tin");
        setUnlocalizedName("hammer_tin");
        setCreativeTab(ModRegistry.getItemGroup());
    }
    public static synchronized ToolHammerTin instance() {
        if (instance == null)
            instance = new ToolHammerTin();
        return instance;
    }
}
