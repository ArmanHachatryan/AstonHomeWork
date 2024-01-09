package ru.aston.lessons;

import ru.aston.lessons.exceptions.MyArrayDataException;
import ru.aston.lessons.exceptions.MyArraySizeException;

public class Main {
    public static void main(String[] args) {
        String[][] strArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
        };

        try {
            System.out.println(ArraySize4x4.getSum(strArray));
        } catch (MyArraySizeException ex) {
            System.out.println(ex.getMessage() + " your array was " + ex.getArraySize());
        } catch (MyArrayDataException ex) {
            System.out.println(ex.getMessage() + " " + ex.getIndex());
        }
    }
}