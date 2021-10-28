package net.javaserver.techniphilia.core.common.tool;

import net.javaserver.techniphilia.core.common.ModRegistry;

public class ToolHammerAluminum extends ToolHammer {
    private static ToolHammerAluminum instance = null;
    private ToolHammerAluminum() {
        super(ModRegistry.ALUMINUM_TOOL);
        setRegistryName("techniphilia", "hammer_aluminum");
        setUnlocalizedName("hammer_aluminum");
        setCreativeTab(ModRegistry.getItemGroup());
    }
    public static synchronized ToolHammerAluminum instance() {
        if (instance == null)
            instance = new ToolHammerAluminum();
        return instance;
    }
}
