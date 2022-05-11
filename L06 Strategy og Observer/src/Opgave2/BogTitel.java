package Opgave2;

import java.util.ArrayList;
import java.util.List;

public class BogTitel implements Subject {
    private String titel;
    private int antal;

    private List<Observer> observers = new ArrayList<>();
    private List<Kunde> kundeList = new ArrayList<>();

    public BogTitel(String titel, int antal) {
        this.titel = titel;
        this.antal = antal;
    }

    public void addKunde(Kunde kunde){
        kundeList.add(kunde);
        kunde.bogTitelList.add(this);
    }

    public void removeKunde(Kunde kunde){
        kundeList.remove(kunde);
        kunde.bogTitelList.remove(this);
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public List<Kunde> getKundeList() {
        return kundeList;
    }

    public String getTitel() {
        return titel;
    }

    public int getAntal() {
        return antal;
    }

    public void indkoebTilLager(int antal){

    }

    public void etKoeb(Kunde kunde){
        addKunde(kunde);
        antal += -1;
        notifyObservers();

    }

    private void notifyObservers(){
        for (Observer observer : observers){
            observer.update(this);
        }
    }


    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void RemoveObserver(Observer o) {
        observers.remove(o);
    }
}
