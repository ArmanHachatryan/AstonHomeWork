package ru.aston.lessons.animalLib;

public class Dog extends Animal {

    private static int count;

    public Dog(String name) {
        this.name = name;
        this.swimLimit = 10;
        this.runLimit = 500;
        count++;
    }

    public static int getCount() {
        return count;
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
}