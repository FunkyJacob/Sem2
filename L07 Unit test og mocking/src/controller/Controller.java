package controller;

import model.Cookie;
import model.Dough;
import model.Recipe;

public interface Controller {

    Dough prepareDough(Recipe recipe);

    Cookie[] makeCookies(Dough dough);
}
