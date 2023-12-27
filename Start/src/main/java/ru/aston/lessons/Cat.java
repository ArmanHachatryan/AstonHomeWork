package ru.aston.lessons;

public class Cat extends Animal {

    public Cat() {
        runLimit = 200;
        swimLimit = 0;
    }

    @Override
    void run(int distance) {
        if (distance <= runLimit)
            System.out.println("Good");
    }

    @Override
    void swim(int distance) {
        System.out.println(swimLimit);
    }
}
