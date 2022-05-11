package test.model;

import model.Ingredient;
import model.Ingredient.Unit;
import model.Recipe;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class RecipeTest {

    private Recipe recipe;
    private Ingredient ingredient;

    @BeforeEach
    public void setUpBeforeEach() {
        this.recipe = new Recipe("Chocolate chip cookies", 10);
        this.ingredient = null;
    }

    @Test
    @Order(1)
    public void test_Recipe_addIngredient_addsExistingIngredient() {

        // Arrange
        ingredient = new Ingredient("Butter", Unit.GRAM, 120);

        // Act
        recipe.addIngredient(ingredient);

        // Assert
        assertSame(ingredient, recipe.getIngredients().get(0));
    }

    @Test
    @Order(2)
    public void test_Recipe_createIngredient_createsNewIngredient() {

        // Arrange
        String name = "Butter";
        Unit unit = Unit.GRAM;
        int amount = 120;

        // Act
        ingredient = recipe.createIngredient(name, unit, amount);

        // Assert
        assertEquals(name, ingredient.getName());
        assertEquals(unit, ingredient.getUnit());
        assertEquals(amount, ingredient.getAmount());
    }

    @Test
    @Order(3)
    public void test_Recipe_createIngredient_addsNewIngredient() {

        // Arrange
        String name = "Butter";
        Unit unit = Unit.GRAM;
        int amount = 120;

        // Act
        ingredient = recipe.createIngredient(name, unit, amount);

        // Assert
        assertSame(ingredient, recipe.getIngredients().get(0));
    }
}




