package ru.aston.lessons;

public final class OperationWithYear {
    private OperationWithYear() {
    }

    public static boolean isLeap(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}
