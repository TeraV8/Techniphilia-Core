package net.javaserver.techniphilia.core.crafting;

import net.javaserver.techniphilia.core.common.ModRegistry;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.ResourceLocation.Serializer;
import net.minecraft.world.World;
import net.minecraftforge.registries.IForgeRegistryEntry;

public class GrindingRecipe extends IForgeRegistryEntry.Impl<IRecipe> implements IRecipe {
    static final Serializer SERIALIZER = new Serializer();
    Ingredient input;
    ItemStack output;
    ResourceLocation registryName;
    GrindingRecipe(Ingredient input, ItemStack output) {
        ModRegistry.logger.debug("Instantiated net.javaserver.techniphilia.core.crafting.GrindingRecipe");
        this.input = input;
        this.output = output;
    }
    @Override
    public boolean matches(InventoryCrafting ic, World world) { // meh
        return false;
    }
    @Override
    public ItemStack getCraftingResult(InventoryCrafting ic) { // meh
        return ItemStack.EMPTY;
    }
    @Override
    public boolean canFit(int i, int i1) { // meh
        return false;
    }
    @Override
    public ItemStack getRecipeOutput() {
        return output;
    }
}
