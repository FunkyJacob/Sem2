package model;

public class Ingredient {

    private String name;
    private Unit unit;
    private int amount;
    public Ingredient(String name, Unit unit, int amount) {
        this.name = name;
        this.unit = unit;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public Unit getUnit() {
        return unit;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public enum Unit {GRAM, TSP, PCS}
}
