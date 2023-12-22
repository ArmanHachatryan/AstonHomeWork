package ru.aston.lessons;

public final class OperationWithNumbers {

    private OperationWithNumbers() {}

    public static void checkSumSign(int a, int b) {
        if ( (a + b) >= 0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void compareNumber(int a, int b) {
        if (a >= b) System.out.println("a >= b");
        else System.out.println("a < b");
    }
}
