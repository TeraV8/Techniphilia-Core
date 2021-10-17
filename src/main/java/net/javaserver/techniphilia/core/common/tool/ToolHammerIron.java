package net.javaserver.techniphilia.core.common.tool;

import net.javaserver.techniphilia.core.common.ModRegistry;

public class ToolHammerIron extends ToolHammer {
    private static ToolHammerIron instance = null;
    private ToolHammerIron() {
        super(ToolMaterial.IRON);
        setRegistryName("techniphilia", "hammer_iron");
        setUnlocalizedName("hammer_iron");
        setCreativeTab(ModRegistry.getItemGroup());
    }
    public static synchronized ToolHammerIron instance() {
        if (instance == null)
            instance = new ToolHammerIron();
        return instance;
    }
}
