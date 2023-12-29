package ru.aston.lessons.animalLib;

public abstract class Animal {

    private static int countAnimal;
    protected String name;
    protected int runLimit;
    protected int swimLimit;

    {
        System.out.println("Block Animal");
        countAnimal++;
    }

    public static int getCountAnimal() {
        return countAnimal;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);
}
