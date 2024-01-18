package ru.aston.lessons;

import ru.aston.lessons.fruitSubClasses.Orange;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Box<T extends Fruit> {

    private final Collection<T> fruits = new ArrayList<>();

    public void addFruitInBox(T fruit, int count) {
        for (int i = 0; i < count; i++) {
            fruits.add(fruit);
        }
    }

    public double getBoxWeight() {
        return fruits.stream().mapToDouble(Fruit::getFruitWeight).sum();
    }

    public boolean compare(Box<?> fruitBox) {
        return this.getBoxWeight() == fruitBox.getBoxWeight();
    }

    public void transfer(Box<T> anotherBox) {
        anotherBox.fruits.addAll(this.fruits);
        this.fruits.clear();
    }
}
