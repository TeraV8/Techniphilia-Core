package net.javaserver.techniphilia.core.config;

import net.javaserver.techniphilia.core.common.ModRegistry;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.Comment;

@Config(modid = ModRegistry.MOD_ID,
        name = "techniphilia/core")
public class TechniphiliaCoreConfig {
    public static WorldGen worldgen = new WorldGen();
    public static class WorldGen {
        @Comment("Set to false to disable Techniphilia world generation.")
        public boolean enableWorldGen = true;
        @Comment({
            "A list of dimension numbers to prevent Techniphilia ores from generating in.",
            "Use dimension IDs where ores wouldn't fit or already spawn, like Galacticraft Moon (-28)"
        })
        public int[] blacklistedOreDims = { -1, 1 };
    }
}
