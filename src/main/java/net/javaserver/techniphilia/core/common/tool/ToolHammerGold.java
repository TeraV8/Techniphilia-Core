package net.javaserver.techniphilia.core.common.tool;

import net.javaserver.techniphilia.core.common.ModRegistry;

public class ToolHammerGold extends ToolHammer {
    private static ToolHammerGold instance = null;
    private ToolHammerGold() {
        super(ToolMaterial.GOLD);
        setRegistryName("techniphilia", "hammer_gold");
        setUnlocalizedName("hammer_gold");
        setCreativeTab(ModRegistry.getItemGroup());
    }
    public static synchronized ToolHammerGold instance() {
        if (instance == null)
            instance = new ToolHammerGold();
        return instance;
    }
}
