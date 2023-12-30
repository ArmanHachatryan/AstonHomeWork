package ru.aston.lessons.animalLib.AnimalSubClasses;

import ru.aston.lessons.animalLib.Abstracts.Animal;
import ru.aston.lessons.animalLib.Bowl;

public class Cat extends Animal {
    private static int catCount;
    private boolean isFull;

    public Cat(String name) {
        this.name = name;
        this.runLimit = 200;
        this.isFull = false;
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }

    public boolean isFull() {
        return isFull;
    }

    public void eat(int count, Bowl bowl) {
        isFull = bowl.decrease(count);
    }

    public void run(int distance) {
        String result = (distance < runLimit)
                ? String.format("%s пробежал(а) %dм", name, distance)
                : String.format("%s не пробежал(а) %dм, ограничение: %dм", name, distance, runLimit);

        System.out.println(result);
    }

    @Override
    public void swim(int distance) {
        System.out.println("Коты не умеют плавать");
    }

    @Override
    public void getInfo() {
        System.out.printf(
                "Cat\n " +
                        "PetName: %s\n " +
                        "RunLimit: %s m\n " +
                        "SwimLimit: %s m\n " +
                        "isFull: %b%n"
                , name, runLimit, swimLimit, isFull
        );
    }
}
