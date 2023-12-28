package ru.aston.lessons.animalLib;

public final class Bowl {

    private static int food;

    private Bowl() {
    }

    public static int getFood() {
        return food;
    }

    public static boolean increase(int num) {
        food = food + num;
        return true;
    }

    public static boolean decrease(int num) {
        if (num > food) {
            return false;
        }
        food = food - num;
        return true;
    }
}
