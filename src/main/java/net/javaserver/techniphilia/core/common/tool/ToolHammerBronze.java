package net.javaserver.techniphilia.core.common.tool;

import net.javaserver.techniphilia.core.common.ModRegistry;

public class ToolHammerBronze extends ToolHammer {
    private static ToolHammerBronze instance = null;
    private ToolHammerBronze() {
        super(ModRegistry.BRONZE_TOOL);
        setRegistryName("techniphilia", "hammer_bronze");
        setUnlocalizedName("hammer_bronze");
        setCreativeTab(ModRegistry.getItemGroup());
    }
    public static synchronized ToolHammerBronze instance() {
        if (instance == null)
            instance = new ToolHammerBronze();
        return instance;
    }
}
