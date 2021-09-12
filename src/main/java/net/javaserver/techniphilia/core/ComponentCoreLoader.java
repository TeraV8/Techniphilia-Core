package net.javaserver.techniphilia.core;

import java.util.Random;
import net.javaserver.techniphilia.core.common.*;
import net.javaserver.techniphilia.core.config.TechniphiliaCoreConfig;
import net.javaserver.techniphilia.core.config.WorldGenConfig;
import net.minecraft.block.Block;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.registries.IForgeRegistry;

@Mod(modid = net.javaserver.techniphilia.core.common.ModRegistry.MOD_ID,
        name = net.javaserver.techniphilia.core.common.ModRegistry.MOD_NAME,
        version = net.javaserver.techniphilia.core.common.ModRegistry.MOD_VERSION)
@Mod.EventBusSubscriber
public class ComponentCoreLoader implements IWorldGenerator {
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModRegistry.logger = event.getModLog();
        ModRegistry.logger.info("TechniphiliaCore: preinit");
        GameRegistry.addSmelting(BlockCopperOre.itemBlock(), new ItemStack(ItemCopperIngot.instance()), 0.8F);
        GameRegistry.addSmelting(BlockTinOre.itemBlock(), new ItemStack(ItemTinIngot.instance()), 0.9F);
        GameRegistry.addSmelting(ItemCopperDust.instance(), new ItemStack(ItemCopperIngot.instance()), 0);
        GameRegistry.addSmelting(ItemTinDust.instance(), new ItemStack(ItemTinIngot.instance()), 0);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        ModRegistry.logger.info("Hello blocky world!");
        GameRegistry.registerWorldGenerator(this, 3);
        //net.javaserver.techniphilia.core.common.ModRegistry.getItemGroup();
    }
    
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        IForgeRegistry<Block> registry = event.getRegistry();
        registry.register(BlockCopperOre.instance());
        OreDictionary.registerOre("oreCopper", BlockCopperOre.instance());
        registry.register(BlockTinOre.instance());
        OreDictionary.registerOre("oreTin", BlockTinOre.instance());
        registry.register(BlockCopper.instance());
        OreDictionary.registerOre("blockCopper", BlockCopper.instance());
        registry.register(BlockTin.instance());
        OreDictionary.registerOre("blockTin", BlockTin.instance());
    }
    
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();
        registry.register(BlockCopperOre.itemBlock());
        OreDictionary.registerOre("oreCopper", BlockCopperOre.itemBlock());
        registry.register(BlockTinOre.itemBlock());
        OreDictionary.registerOre("oreTin", BlockTinOre.itemBlock());
        registry.register(ItemCopperIngot.instance());
        OreDictionary.registerOre("ingotCopper", ItemCopperIngot.instance());
        registry.register(ItemTinIngot.instance());
        OreDictionary.registerOre("ingotTin", ItemTinIngot.instance());
        registry.register(ItemCopperNugget.instance());
        OreDictionary.registerOre("nuggetCopper", ItemCopperNugget.instance());
        registry.register(ItemTinNugget.instance());
        OreDictionary.registerOre("nuggetTin", ItemTinNugget.instance());
        registry.register(BlockCopper.itemBlock());
        OreDictionary.registerOre("blockCopper", BlockCopper.itemBlock());
        registry.register(BlockTin.itemBlock());
        OreDictionary.registerOre("blockTin", BlockTin.itemBlock());
        registry.register(ItemCopperDust.instance());
        OreDictionary.registerOre("dustCopper", ItemCopperDust.instance());
        registry.register(ItemTinDust.instance());
        OreDictionary.registerOre("dustTin", ItemTinDust.instance());
    }
    
    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event) {
        //registerRender(net.minecraftforge.registries.RegistryManager.ACTIVE.getRegistry(Item.class).getValue(new ResourceLocation("techniphilia", "copper_ore")));
        registerRender(BlockCopperOre.itemBlock());
        registerRender(BlockTinOre.itemBlock());
        registerRender(ItemCopperIngot.instance());
        registerRender(ItemTinIngot.instance());
        registerRender(ItemCopperNugget.instance());
        registerRender(ItemTinNugget.instance());
        registerRender(BlockCopper.itemBlock());
        registerRender(BlockTin.itemBlock());
        registerRender(ItemCopperDust.instance());
        registerRender(ItemTinDust.instance());
    }
    
    public static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "normal"));
    }

    @Override
    public void generate(Random random, int cx, int cz, World world, IChunkGenerator icg, IChunkProvider icp) {
        if (!TechniphiliaCoreConfig.worldgen.enableWorldGen) return;
        int dimension = world.provider.getDimension();
        for (int bldim : TechniphiliaCoreConfig.worldgen.blacklistedOreDims) {
            if (dimension == bldim) {
                // this dimension is blacklisted
                return;
            }
        }
        // copper time
        WorldGenMinable ore = new WorldGenMinable(BlockCopperOre.instance().getDefaultState(),
                                                    WorldGenConfig.copperVeinSizeMin + random.nextInt(WorldGenConfig.copperVeinSizeMax - WorldGenConfig.copperVeinSizeMin),
                                                    BlockMatcher.forBlock(Blocks.STONE));
        for (int i = 0; i < WorldGenConfig.copperVeinsPerChunk; i++) {
            int x = cx * 16 + random.nextInt(16);
            int y = WorldGenConfig.copperVeinMinY + random.nextInt(WorldGenConfig.copperVeinMaxY - WorldGenConfig.copperVeinMinY);
            int z = cz * 16 + random.nextInt(16);
            ore.generate(world, random, new BlockPos(x,y,z));
        }
        // tin o'clock
        ore = new WorldGenMinable(BlockTinOre.instance().getDefaultState(),
                                    WorldGenConfig.tinVeinSizeMin + random.nextInt(WorldGenConfig.tinVeinSizeMax - WorldGenConfig.tinVeinSizeMin),
                                    BlockMatcher.forBlock(Blocks.STONE));
        for (int i = 0; i < WorldGenConfig.tinVeinsPerChunk; i++) {
            int x = cx * 16 + random.nextInt(16);
            int y = WorldGenConfig.tinVeinMinY + random.nextInt(WorldGenConfig.tinVeinMaxY - WorldGenConfig.tinVeinMinY);
            int z = cz * 16 + random.nextInt(16);
            ore.generate(world, random, new BlockPos(x,y,z));
        }
    }
}
