package ru.aston.lessons.client;

import ru.aston.lessons.Animal;
import ru.aston.lessons.Cat;
import ru.aston.lessons.Dog;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat();

        cat.run(30);

        Dog dog = new Dog();

        dog.swim(145);


    }
}