package ru.aston.lessons;

public abstract class Fruit {
    protected double weight;

    public double getFruitWeight() {
        return weight;
    }

    public Fruit(double weight) {
        this.weight = weight;
    }
}
