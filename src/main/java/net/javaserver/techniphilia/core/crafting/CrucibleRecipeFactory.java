package net.javaserver.techniphilia.core.crafting;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import net.javaserver.techniphilia.core.common.ModRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.common.crafting.IRecipeFactory;
import net.minecraftforge.common.crafting.JsonContext;

public class CrucibleRecipeFactory implements IRecipeFactory {
    @Override
    public IRecipe parse(JsonContext jc, JsonObject jo) {
        ModRegistry.logger.debug("Resolving techniphilia:crucible recipe");
        JsonElement object = jo.get("object");
        if (object == null) throw new JsonParseException("Recipe must include an object");
        Ingredient obj;
        if (object.isJsonPrimitive()) {
            // parse as single item ID
            Item resultItem = Item.getByNameOrId(object.getAsString());
            if (resultItem == null)
                throw new JsonParseException("Recipe object did not resolve to valid item");
            obj = Ingredient.fromItem(resultItem);
        } else if (object.isJsonObject()) {
            obj = CraftingHelper.getIngredient(object.getAsJsonObject(), jc);
        } else {
            throw new JsonParseException("Recipe object was not of valid JSON type");
        }
        JsonElement catalyst = jo.get("catalyst");
        if (object == null) throw new JsonParseException("Recipe must have a catalyst; otherwise it's a furnace recipe");
        Ingredient cat;
        if (catalyst.isJsonPrimitive()) {
            // parse as single item ID
            Item resultItem = Item.getByNameOrId(catalyst.getAsString());
            if (resultItem == null)
                throw new JsonParseException("Recipe catalyst did not resolve to valid item");
            cat = Ingredient.fromItem(resultItem);
        } else if (catalyst.isJsonObject()) {
            cat = CraftingHelper.getIngredient(catalyst.getAsJsonObject(), jc);
        } else {
            throw new JsonParseException("Recipe catalyst was not of valid JSON type");
        }
        JsonElement resultJson = jo.get("result");
        if (resultJson == null) throw new JsonParseException("Recipe must include result");
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
        return new CrucibleRecipe(obj, cat, result);
    }
}
