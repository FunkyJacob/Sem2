package snacks;

import java.util.Random;

public class Limb extends Snack
{
    private Types type;

    public Limb()
    {
        Random random = new Random();
        Types[] types = Types.values();
        this.type = types[random.nextInt(types.length)];
    }

    public Limb(Types type)
    {
        this.type = type;
    }

    public Types getType()
    {
        return type;
    }

    public enum Types
    {
        Finger, Foot, Hand, Heel, Knee, Toe
    }
}
