package net.javaserver.techniphilia.core.config;

import net.minecraftforge.common.config.Config;

@Config(modid = "techniphilia",
        name = "techniphilia/worldgen/core")
public class WorldGenConfig {
    public static int copperVeinSizeMin = 4;
    public static int copperVeinSizeMax = 10;
    public static int copperVeinsPerChunk = 12;
    public static int copperVeinMinY = 6;
    public static int copperVeinMaxY = 56;
    public static int tinVeinSizeMin = 2;
    public static int tinVeinSizeMax = 8;
    public static int tinVeinsPerChunk = 8;
    public static int tinVeinMinY = 20;
    public static int tinVeinMaxY = 52;
    public static int bauxiteVeinSizeMin = 3;
    public static int bauxiteVeinSizeMax = 8;
    public static int bauxiteVeinsPerChunk = 4;
    public static int bauxiteVeinMinY = 6;
    public static int bauxiteVeinMaxY = 28;
    public static int cryoliteVeinSizeMin = 2;
    public static int cryoliteVeinSizeMax = 6;
    public static int cryoliteVeinsPerChunk = 12;
    public static int cryoliteVeinMinY = 36;
    public static int cryoliteVeinMaxY = 70;
}
