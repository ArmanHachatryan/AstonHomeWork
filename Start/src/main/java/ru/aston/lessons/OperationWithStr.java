package ru.aston.lessons;

public final class OperationWithStr {
    private OperationWithStr() {
    }

    public static void printThreeWords() {
        System.out.println("Banana\nOrange\nApple");
    }

    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }


}
