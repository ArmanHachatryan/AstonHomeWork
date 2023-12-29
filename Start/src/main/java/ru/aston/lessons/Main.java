package ru.aston.lessons;

import ru.aston.lessons.animalLib.Bowl;
import ru.aston.lessons.animalLib.Cat;

public class Main {
    public static void main(String[] args) {

        Cat[] cats = {
                new Cat("Barsik"),
                new Cat("White"),
                new Cat("Red")
        };

        Bowl bowl = new Bowl(30);

        for (var cat : cats) {
            if (!cat.isFull()) {
                cat.eat(20, bowl);
                System.out.println(cat.getName() + " " + cat.isFull());
            }
        }

        bowl.increase(60);
    }
}