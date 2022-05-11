package Opgave4;

public abstract class Vare {
//Dette er en abstact klasse

    private int pris;
    private String navn;

    public Vare(int pris, String navn) {
        this.pris = pris;
        this.navn = navn;
    }

    public int getPris() {
        return pris;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    @Override
    public String toString() {
        return "Vare: " +
                "pris = " + pris +
                " navn = " + navn;
    }

    public abstract double beregnMoms();
   //Denne metode nedarves og laves i hver underklasse
}
