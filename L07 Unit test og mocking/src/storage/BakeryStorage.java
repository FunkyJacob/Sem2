package storage;

import model.Ingredient;
import java.util.HashMap;

public class BakeryStorage implements Storage {

    private HashMap<String, Ingredient> ingredients;

    @Override
    public Ingredient storeIngredient(Ingredient ingredient) {
        Ingredient ingredientStored = ingredients.get(ingredient.getName());
        if (ingredientStored != null) {
            ingredientStored.setAmount(ingredientStored.getAmount() + ingredient.getAmount());
            return ingredientStored;
        } else {
            ingredients.put(ingredient.getName(), ingredient);
            return ingredient;
        }
    }

    @Override
    public void collectIngredient(String name, int amount) {
        Ingredient ingredientStored = ingredients.get(name);
        if (ingredientStored != null) {
            ingredientStored.setAmount(ingredientStored.getAmount() - amount);
        } else {
            String message = String.format("No supply of '%s' in storage", name);
            throw new RuntimeException(message);
        }
    }
}
