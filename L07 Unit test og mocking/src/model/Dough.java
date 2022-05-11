package model;

public class Dough {

    private Recipe recipe;
    private int pieces;
    private Cookie[] cookies;

    public Dough(Recipe recipe) {
        this.recipe = recipe;
        this.pieces = recipe.getPieces();
        this.cookies = new Cookie[pieces];
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public int getPieces() {
        return pieces;
    }

    public Cookie[] getCookies() {
        return cookies;
    }

    public Cookie createCookie() {
        Cookie cookie;
        if (pieces > 0) {
            cookie = new Cookie(this);
            cookies[recipe.getPieces() - pieces] = cookie;
            pieces--;
        } else {
            throw new RuntimeException(String.format("No dough left"));
        }
        return cookie;
    }
}
