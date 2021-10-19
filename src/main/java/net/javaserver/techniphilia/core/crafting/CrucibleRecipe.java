package net.javaserver.techniphilia.core.crafting;

import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.world.World;
import net.minecraftforge.registries.IForgeRegistryEntry;

public class CrucibleRecipe extends IForgeRegistryEntry.Impl<IRecipe> implements IRecipe {
    Ingredient object;
    Ingredient catalyst;
    ItemStack output;
    int reactionTime;
    CrucibleRecipe(Ingredient object, Ingredient catalyst, ItemStack output, int reactionTime) {
        this.object = object;
        this.catalyst = catalyst;
        this.output = output;
        this.reactionTime = reactionTime;
    }
    @Override
    public boolean matches(InventoryCrafting ic, World world) { // meh
        return false;
    }
    @Override
    public ItemStack getCraftingResult(InventoryCrafting ic) { // meh
        return null;
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
