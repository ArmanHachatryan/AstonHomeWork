package ru.aston.lessons.animalLib;

public class Cat extends Animal {

    private static int count;

    public Cat(String name) {
        this.name = name;
        this.runLimit = 200;
        count++;
    }

    public static int getCount() {
        return count;
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
}
