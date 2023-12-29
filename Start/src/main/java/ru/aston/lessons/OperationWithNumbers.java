package ru.aston.lessons;

public final class OperationWithNumbers {

    private OperationWithNumbers() {
    }

    public static void checkSumSign(int a, int b) {
        String result = ((a + b) >= 0) ? "Сумма положительная" : "Сумма отрицательная";
        System.out.println(result);
    }

    public static void compareNumber(int a, int b) {
        String result = (a >= b) ? "a >= b" : "a < b";
        System.out.println(result);
    }
}
