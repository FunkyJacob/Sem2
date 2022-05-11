package controller;

import model.Cookie;
import model.Dough;
import model.Recipe;
import storage.Storage;

public class BakeryController implements Controller {

    private Storage storage;

    public BakeryController(Storage storage) {
        this.storage = storage;
    }

    public BakeryController() {
    }

    @Override
    public Dough prepareDough(Recipe recipe) {
        Dough dough = new Dough(recipe);
        recipe.getIngredients().forEach(i -> storage.collectIngredient(i.getName(), i.getAmount()));
        return dough;
    }

    @Override
    public Cookie[] makeCookies(Dough dough) {
        int pieces = dough.getPieces();
        Cookie[] cookies = new Cookie[pieces];
        for (int i = 0; i < pieces; i++) {
            Cookie cookie = dough.createCookie();
            cookie.bake();
            cookies[i] = cookie;
        }
        return cookies;
    }
}
