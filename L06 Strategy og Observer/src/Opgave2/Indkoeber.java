package Opgave2;

public class Indkoeber implements Observer {
    private String navn;

    public Indkoeber(String navn) {
        this.navn = navn;
    }

    @Override
    public void update(Subject s) {
        BogTitel bt = (BogTitel) s;
        if (bt.getAntal() < 6 ){
            bt.indkoebTilLager(20);
        }

    }
}
