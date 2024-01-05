package ru.aston.lessons.animalLib.Abstracts;

public abstract class Animal {

    private static int countAnimal;
    protected String name;
    protected int runLimit;
    protected int swimLimit;

    public Animal(String name) {
        this.name = name;
        countAnimal++;
    }

    public static int getCountAnimal() {
        return countAnimal;
    }

    public String getName() {
        return name;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);

    public abstract void getInfo();
}
