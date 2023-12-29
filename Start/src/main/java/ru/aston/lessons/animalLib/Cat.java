package ru.aston.lessons.animalLib;

public class Cat extends Animal {

    private static int count;

    public Cat(String name) {
        this.name = name;
        this.swimLimit = 0;
        this.runLimit = 200;
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void run(int distance) {
        String result = (distance < runLimit) ? "Котик пробежал" : "Котик не смог пробежать";
        System.out.println(result + " " + runLimit);
    }

    @Override
    public void swim(int distance) {
        String result = (distance < swimLimit) ? "Котик проплыл" : "Котик не смог проплыть";
        System.out.println(result + " " + swimLimit);
    }
}
