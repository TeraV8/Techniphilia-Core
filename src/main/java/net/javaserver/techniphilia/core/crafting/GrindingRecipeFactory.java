package net.javaserver.techniphilia.core.crafting;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import net.javaserver.techniphilia.core.common.ModRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.common.crafting.*;

public class GrindingRecipeFactory implements IRecipeFactory {
    @Override
    public IRecipe parse(JsonContext jc, JsonObject jo) {
        ModRegistry.logger.debug("Resolving techniphilia:grinding recipe");
        JsonElement ingredient = jo.get("ingredient");
        if (ingredient == null) throw new JsonParseException("Recipe must include ingredient");
        Ingredient input;
        if (ingredient.isJsonPrimitive()) {
            // parse as single item ID
            Item resultItem = Item.getByNameOrId(ingredient.getAsString());
            if (resultItem == null)
                throw new JsonParseException("Recipe ingredient did not resolve to valid item");
            input = Ingredient.fromItem(resultItem);
        } else if (ingredient.isJsonObject()) {
            input = CraftingHelper.getIngredient(ingredient.getAsJsonObject(), jc);
        } else {
            throw new JsonParseException("Recipe ingredient was not of valid JSON type");
        }
        JsonElement resultJson = jo.get("result");
        if (resultJson == null) throw new JsonParseException("Recipe must include grinding result");
        ItemStack result;
        if (resultJson.isJsonPrimitive()) {
            // parse as single item ID
            Item resultItem = Item.getByNameOrId(resultJson.getAsString());
            if (resultItem == null)
                throw new JsonParseException("Recipe result did not resolve to valid item");
            result = new ItemStack(resultItem);
        } else if (resultJson.isJsonObject()) {
            result = CraftingHelper.getItemStack(resultJson.getAsJsonObject(), jc);
        } else {
            throw new JsonParseException("Recipe result was not of valid JSON type");
        }
        return new GrindingRecipe(input, result);
    }
    // hey put something here
}
