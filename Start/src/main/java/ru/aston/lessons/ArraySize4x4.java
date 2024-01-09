package ru.aston.lessons;

import ru.aston.lessons.exceptions.MyArrayDataException;
import ru.aston.lessons.exceptions.MyArraySizeException;

public class ArraySize4x4 {
    private static int sum;
    private final static int SIZE = 4;

    private ArraySize4x4() {
    }

    public static int getSum(String[][] array) throws MyArraySizeException, MyArrayDataException {
        checkSize(array);

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (!isNumeric(array[i][j])) {
                    throw new MyArrayDataException("Can't convert to int", i, j);
                }
                sum += Integer.parseInt(array[i][j]);
            }
        }

        return sum;
    }

    private static void checkSize(String[][] array) throws MyArraySizeException {
        int row = array.length;
        int column = array[0].length;

        if (row > SIZE || column > SIZE) {
            throw new MyArraySizeException("Array was bigger than 4x4", row, column);
        }
        if (row < SIZE || column < SIZE) {
            throw new MyArraySizeException("Array was smaller than 4x4", row, column);
        }
    }

    private static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
