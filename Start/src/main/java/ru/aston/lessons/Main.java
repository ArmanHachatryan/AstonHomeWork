package ru.aston.lessons;

import ru.aston.lessons.animalLib.Animal;
import ru.aston.lessons.animalLib.Cat;
import ru.aston.lessons.animalLib.Dog;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Cat("Барсик");

        Cat cat1 = new Cat("Пушистик");

        Dog dog1 = new Dog("Бобик");

        System.out.println(Cat.getCount());
        System.out.println(Dog.getCount());
        System.out.println(Cat.getCountAnimal());

        cat1.run(300);

        dog1.swim(5);

        animal.swim(40);

    }
}