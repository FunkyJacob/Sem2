package snacks;

import java.util.Random;

public class Pez extends Snack
{
    private Flavors flavor;

    public Pez()
    {
        Random random = new Random();
        Flavors[] flavors = Flavors.values();
        this.flavor = flavors[random.nextInt(flavors.length)];
    }

    public Pez(Flavors flavor)
    {
        this.flavor = flavor;
    }

    public Flavors getFlavor()
    {
        return flavor;
    }

    public enum Flavors
    {
        Banana, CandyCorn, Cherry, Grape, Lemon, Orange, Raspberry, Strawberry
    }
}
