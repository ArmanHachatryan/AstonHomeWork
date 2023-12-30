package ru.aston.lessons;

import ru.aston.lessons.animalLib.AnimalSubClasses.Cat;
import ru.aston.lessons.animalLib.AnimalSubClasses.Dog;
import ru.aston.lessons.animalLib.Bowl;
import ru.aston.lessons.geometricLib.Abstracts.Shape;
import ru.aston.lessons.geometricLib.ShapeSubClasses.Circle;
import ru.aston.lessons.geometricLib.ShapeSubClasses.Rectangle;
import ru.aston.lessons.geometricLib.ShapeSubClasses.Triangle;

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
                cat.getInfo();
                System.out.println();
            }
        }

        Dog dog = new Dog("Rex");
        dog.getInfo();

        Shape[] shapes = {
                new Rectangle(5, 4, Color.Red, Color.Green),
                new Triangle(6, 9, 4, Color.White, Color.Yellow),
                new Circle(10, Color.Black, Color.Purple)
        };

        for (var shape : shapes) {
            System.out.println(shape);
        }
    }
}