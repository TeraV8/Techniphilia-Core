package net.javaserver.techniphilia.core.common.tool;

import net.javaserver.techniphilia.core.common.ModRegistry;

public class ToolHammerStone extends ToolHammer {
    private static ToolHammerStone instance = null;
    private ToolHammerStone() {
        super(ToolMaterial.STONE);
        setRegistryName("techniphilia", "hammer_stone");
        setUnlocalizedName("hammer_stone");
        setCreativeTab(ModRegistry.getItemGroup());
    }
    public static synchronized ToolHammerStone instance() {
        if (instance == null)
            instance = new ToolHammerStone();
        return instance;
    }
}
