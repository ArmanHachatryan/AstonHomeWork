package ru.aston.lessons;

public final class MyMethods1 {
    private MyMethods1() {}

    public static boolean SumBetween10And20(int a, int b){
        int sum = a + b;
        return (10 <= sum) && (sum <= 20);
    }

}
