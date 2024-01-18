package ru.aston.lessons;

import ru.aston.lessons.fruitSubClasses.Apple;
import ru.aston.lessons.fruitSubClasses.Orange;

public class Main {
    public static void main(String[] args) {
        double orangeWeight = 1.5;
        double appleWeight = 1.0;
        int countFruit = 5;

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruitInBox(new Orange(orangeWeight), countFruit);
        System.out.println(orangeBox.getBoxWeight());

        Box<Apple> appleBox = new Box<>();
        appleBox.addFruitInBox(new Apple(appleWeight), countFruit);
        System.out.println(appleBox.getBoxWeight());

        System.out.println(orangeBox.compare(appleBox));

        Box<Apple> appleBox_2 = new Box<>();
        appleBox_2.addFruitInBox(new Apple(appleWeight), 10);
        System.out.println(appleBox_2.getBoxWeight());
        appleBox.transfer(appleBox_2);
        System.out.println(appleBox_2.getBoxWeight());
        System.out.println(appleBox.getBoxWeight());
    }
}
