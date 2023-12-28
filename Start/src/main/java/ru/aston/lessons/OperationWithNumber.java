package ru.aston.lessons;

public final class OperationWithNumber {
    private OperationWithNumber() {
    }

    public static boolean sumBetween10And20(int a, int b) {
        int sum = a + b;
        return (10 <= sum) && (sum <= 20);
    }

    public static void isPositiveOrNot(int a) {
        if (a < 0) System.out.println("Отрицательное");
        else System.out.println("Положительное");
    }

    public static boolean isNegative(int a) {
        return a < 0;
    }

    public static void printStr(String text, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(text);
        }
    }
}
