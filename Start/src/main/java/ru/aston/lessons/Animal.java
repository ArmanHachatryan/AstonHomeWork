package ru.aston.lessons;

public abstract class Animal {

    protected int runLimit;

    protected int swimLimit;

    abstract void run(int distance);

    abstract void swim(int distance);
}
