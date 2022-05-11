package storage;

import model.Ingredient;

public interface Storage {

    Ingredient storeIngredient(Ingredient ingredient);

    void collectIngredient(String name, int amount);
}
