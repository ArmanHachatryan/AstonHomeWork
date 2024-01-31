package ru.aston.lessons.fruitSubClasses;

import ru.aston.lessons.Fruit;

public class Apple extends Fruit {
    private static final double WEIGHT = 1.0;

    @Override
    public double getWeight() {
        return WEIGHT;
    }
}
