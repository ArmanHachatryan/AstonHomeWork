package ru.aston.lessons;

public class Main {
    public static void main(String[] args) {
        printThreeWords();

        checkSumSign();

        printColor();

        compareNumber();
    }

    public static void printThreeWords(){
        System.out.println("Orange\nBanana\nApple");
    }

    public static void checkSumSign() {
        int a, b;
        a = 5;
        b = -10;
        if ((a+b) >= 0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor(){
        var value = 100;
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

    public static void compareNumber() {
        int a,b;
        a = 5;
        b = 3;

        if (a >= b) System.out.println("a >= b");
        else System.out.println("a < b");
    }

}