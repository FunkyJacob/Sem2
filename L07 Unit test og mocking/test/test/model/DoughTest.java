package test.model;

import model.Cookie;
import model.Dough;
import model.Recipe;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoughTest {

    @Test
    public void test_Dough_createCookie_addsNewCookies() {

        // Arrange
        int pieces = 10;
        Recipe recipe = new Recipe("Chocolate chip cookies", pieces);
        Dough dough = new Dough(recipe);

        // Act
        Cookie[] createdCookies = new Cookie[pieces];
        for (int i = 0; i < pieces; i++) {
            createdCookies[i] = dough.createCookie();
        }

        // Assert
        assertArrayEquals(createdCookies, dough.getCookies());
    }

    @Test
    public void test_Dough_createCookie_throwsException() {

        // Arrange
        int pieces = 10;
        Recipe recipe = new Recipe("Chocolate chip cookies", pieces);
        Dough dough = new Dough(recipe);
        for (int i = 0; i < pieces; i++) {
            dough.createCookie();
        }

        // Act & Assert
        Exception exception = assertThrows(RuntimeException.class, () -> {
            dough.createCookie();
        });
        assertTrue(exception.getMessage().contains("No dough left"));
    }
}