package ru.aston.lessons.animalLib;

public class Bowl {

    private int foodCount;

    public Bowl(int foodCount) {
        this.foodCount = foodCount;
    }

    public int getFoodCount() {
        return foodCount;
    }

    public boolean increase(int foodCount) {
        this.foodCount += foodCount;
        return true;
    }

    public boolean decrease(int foodCount) {
        boolean result = false;
        if (foodCount < this.foodCount) {
            this.foodCount -= foodCount;
            result = true;
        }
        return result;
    }
}
