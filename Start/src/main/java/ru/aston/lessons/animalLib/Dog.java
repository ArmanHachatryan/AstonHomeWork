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
        String result = (distance < runLimit) ? "Бобик пробежал" : "Бобик не смог пробежать";
        System.out.println(result + " " + runLimit);
    }

    @Override
    public void swim(int distance) {
        String result = (distance < swimLimit) ? "Бобик проплыл" : "Бобик не смог проплыть";
        System.out.println(result + " " + swimLimit);
    }
}