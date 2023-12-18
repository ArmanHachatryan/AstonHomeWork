package ru.aston.lessons;

public final class MyMethods {
    private MyMethods () {}
    public static void printWord(String word){
        System.out.println(word);
    }

    public static void printThreeWords(String[] words){
        for (var word: words) {
            System.out.println(word);
        }
    }

    public static void checkSumSign(double a, double b) {
        if ((a+b) >= 0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor(double value){
        if (value <= 0) {
            System.out.println("Красный");
        }
        else if (value <= 100){
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumber(double a, double b) {
        if (a >= b) System.out.println("a >= b");
        else System.out.println("a < b");
    }
}
