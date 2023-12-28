package ru.aston.lessons.les;

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
