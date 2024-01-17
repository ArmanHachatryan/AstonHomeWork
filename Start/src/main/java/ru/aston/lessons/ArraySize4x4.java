package ru.aston.lessons;

import ru.aston.lessons.exceptions.MyArrayDataException;
import ru.aston.lessons.exceptions.MyArraySizeException;

public class ArraySize4x4 {

    public static int calculateSumFromArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int row = array.length;
        int column = array[0].length;
        final int SIZE = 4;
        int sum = 0;

        if (row > SIZE || column > SIZE) {
            throw new MyArraySizeException("Array was bigger than 4x4", row, column);
        }
        if (row < SIZE || column < SIZE) {
            throw new MyArraySizeException("Array was smaller than 4x4", row, column);
        }

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Can't convert to int", i, j);
                }
            }
        }

        return sum;
    }
}
