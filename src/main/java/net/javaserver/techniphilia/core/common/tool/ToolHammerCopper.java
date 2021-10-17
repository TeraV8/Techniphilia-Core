package net.javaserver.techniphilia.core.common.tool;

import net.javaserver.techniphilia.core.common.ModRegistry;

public class ToolHammerCopper extends ToolHammer {
    private static ToolHammerCopper instance = null;
    private ToolHammerCopper() {
        super(ModRegistry.COPPER_TOOL);
        setRegistryName("techniphilia", "hammer_copper");
        setUnlocalizedName("hammer_copper");
        setCreativeTab(ModRegistry.getItemGroup());
    }
    public static synchronized ToolHammerCopper instance() {
        if (instance == null)
            instance = new ToolHammerCopper();
        return instance;
    }
}
