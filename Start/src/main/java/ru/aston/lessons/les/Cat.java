package ru.aston.lessons.les;

public class Cat extends Animal {

    private static int countCat;

    public Cat() {
        countCat++;
        runLimit = 200;
        swimLimit = 0;
    }

    public static void getCountCat() {
        System.out.println(countCat);
    }

    @Override
    public String toString() {
        return "Cat";
    }
}
