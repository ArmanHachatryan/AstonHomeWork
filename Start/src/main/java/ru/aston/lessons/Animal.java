package ru.aston.lessons;

public class Animal {

    protected static int count = 0;
    protected int runLimit;
    protected int swimLimit;

    protected Animal() {
        count++;
    }

    public static void getCountAnimal() {
        System.out.println(count);
    }

    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println(this + " can do it");
        } else {
            System.out.println(this + " can't do it");
        }
    }

    public void swim(int distance) {
        if (distance <= swimLimit) {
            System.out.println(this + " can do it");
        } else {
            System.out.println(this + " can't do it");
        }
    }

    public void changeLimits(int runLimit, int swimLimit) {
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
    }
}
