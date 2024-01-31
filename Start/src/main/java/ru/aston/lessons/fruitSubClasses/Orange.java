package ru.aston.lessons.fruitSubClasses;

import ru.aston.lessons.Fruit;

public class Orange extends Fruit {
    private static final double WEIGHT = 1.5;

    @Override
    public double getWeight() {
        return WEIGHT;
    }
}
