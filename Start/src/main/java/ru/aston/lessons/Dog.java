package ru.aston.lessons;

public class Dog extends Animal {
    public Dog() {
        runLimit = 500;
        swimLimit = 10;
    }

    @Override
    public String toString() {
        return "Dog";
    }
}
