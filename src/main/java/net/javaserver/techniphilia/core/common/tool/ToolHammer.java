package net.javaserver.techniphilia.core.common.tool;

import java.util.Collections;
import net.minecraft.item.ItemTool;

public class ToolHammer extends ItemTool {
    // tool stuff
    ToolHammer(ToolMaterial m) {
        super(2.5F, -3.2F, m, Collections.EMPTY_SET);
    }
}
