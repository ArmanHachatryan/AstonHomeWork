package ru.aston.lessons.animalLib;

public class Bowl {

    private int food;

    public Bowl() {
    }

    public int getFood() {
        return food;
    }

    public boolean increase(int num) {
        food = food + num;
        return true;
    }

    public boolean decrease(int num) {
        if (num > food) {
            return false;
        }
        food = food - num;
        return true;
    }
}
