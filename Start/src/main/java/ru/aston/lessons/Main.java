package ru.aston.lessons;

import ru.aston.lessons.fruitSubClasses.Apple;
import ru.aston.lessons.fruitSubClasses.Orange;

public class Main {
    public static void main(String[] args) {
        int countFruit = 5;

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruitInBox(new Orange(), countFruit);
        System.out.println(orangeBox.getBoxWeight());

        Box<Apple> appleBox = new Box<>();
        appleBox.addFruitInBox(new Apple(), countFruit);
        System.out.println(appleBox.getBoxWeight());

        System.out.println(orangeBox.compare(appleBox));

        Box<Apple> appleBox_2 = new Box<>();
        appleBox_2.addFruitInBox(new Apple(), 10);
        System.out.println(appleBox_2.getBoxWeight());
        appleBox.transfer(appleBox_2);
        System.out.println(appleBox_2.getBoxWeight());
        System.out.println(appleBox.getBoxWeight());
    }
}
