package test.controller;

import controller.BakeryController;
import controller.Controller;
import model.Cookie;
import model.Dough;
import model.Ingredient.Unit;
import model.Recipe;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import storage.Storage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class BakeryControllerTest {

    private Controller bakeryController;
    private Storage mockedStorage;
    private Recipe recipe;
    private Dough mockedDough;

    @BeforeEach
    public void setUpBeforeEach() {
        this.recipe = new Recipe("Chocolate chip cookies", 10);
    }

    @Test
    public void test_BakeryController_prepareDough_callsCollectIngredient() {

        // Arrange
        mockedStorage = mock(Storage.class);
        bakeryController = new BakeryController(mockedStorage);
        recipe.createIngredient("Butter", Unit.GRAM, 120);
        recipe.createIngredient("Sugar", Unit.GRAM, 150);
        recipe.createIngredient("Egg", Unit.PCS, 1);

        // Act
        bakeryController.prepareDough(recipe);

        // Assert
        verify(mockedStorage).collectIngredient("Butter", 120);
        verify(mockedStorage).collectIngredient("Sugar", 150);
        verify(mockedStorage).collectIngredient("Egg", 1);
    }

    @Test
    public void test_BakeryController_makeCookies_usesAllDoughPieces() {

        // Arrange
        bakeryController = new BakeryController();
        mockedDough = mock(Dough.class);
        when(mockedDough.createCookie()).thenReturn(new Cookie(mockedDough));
        when(mockedDough.getPieces()).thenReturn(1, 5, 10);

        // Act
        Cookie[] cookiesFrom1pc = bakeryController.makeCookies(mockedDough);
        Cookie[] cookiesFrom5pcs = bakeryController.makeCookies(mockedDough);
        Cookie[] cookiesFrom10pcs = bakeryController.makeCookies(mockedDough);

        // Assert
        assertEquals(1, cookiesFrom1pc.length);
        assertEquals(5, cookiesFrom5pcs.length);
        assertEquals(10, cookiesFrom10pcs.length);
    }
}