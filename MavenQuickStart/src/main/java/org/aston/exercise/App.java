package org.aston.exercise;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println(calcFactorial(5));
    }

    public static long calcFactorial(int number) {
        if (number < 1) return 1;
        return number * calcFactorial(number - 1);
    }
}
