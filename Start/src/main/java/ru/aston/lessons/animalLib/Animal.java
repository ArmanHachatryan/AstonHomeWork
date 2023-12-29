package ru.aston.lessons.animalLib;

public abstract class Animal {

    protected static int countAnimal;
    protected int runLimit;
    protected String name;
    protected int swimLimit;

    {
        countAnimal++;
    }

    public static int getCountAnimal() {
        return countAnimal;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);


}
