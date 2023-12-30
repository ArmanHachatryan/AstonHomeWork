package ru.aston.lessons.animalLib.AnimalSubClasses;

import ru.aston.lessons.animalLib.Abstracts.Animal;

public class Dog extends Animal {
    private static int dogCount;

    public Dog(String name) {
        this.name = name;
        this.swimLimit = 10;
        this.runLimit = 500;
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }

    @Override
    public void run(int distance) {
        String result = (distance < runLimit)
                ? String.format("%s пробежал(а) %dм", name, distance)
                : String.format("%s не пробежал(а) %dм, ограничение: %dм", name, distance, runLimit);

        System.out.println(result);
    }

    @Override
    public void swim(int distance) {
        String result = (distance < swimLimit)
                ? String.format("%s проплыл(а) %dм", name, distance)
                : String.format("%s не проплыл(а) %dм, ограничение: %dм", name, distance, runLimit);

        System.out.println(result);
    }

    @Override
    public void getInfo() {
        System.out.printf(
                this + "\n" +
                        "Кличка: %s\n" +
                        "Лимит по бегу: %s\n" +
                        "Лимит по плаванию: %s\n"
                , name, runLimit, swimLimit
        );
    }
}