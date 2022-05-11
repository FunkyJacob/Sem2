package Opgave4;

public class ElVare extends Vare{

    public ElVare(int pris, String navn) {
        super(pris, navn);
    }

    @Override
    public double beregnMoms() {
        if (getPris()*1.3 <= 3)
            return getPris()+3;
        return getPris()*1.3;
    }
}
