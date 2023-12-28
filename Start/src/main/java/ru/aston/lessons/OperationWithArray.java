package ru.aston.lessons;

public final class OperationWithArray {
    private OperationWithArray() {
    }

    public static void logicalNegation(int[] array) {
        int N = array.length;
        for (int i = 0; i < N; i++) {
            array[i] = array[i] == 0 ? 1 : 0;
        }
    }

    public static void fill(int[] array) {
        int N = array.length;
        for (int i = 0; i < N; i++) {
            array[i] = i + 1;
        }
    }

    public static int[] getAndFillArray(int length, int initialValue) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    public static void increaseSmallNumbers(int[] array) {
        int N = array.length;
        for (int i = 0; i < N; i++) {
            if (array[i] < 6) array[i] *= 2;
        }
    }

    public static void fillDiagonals(int[][] a) {
        int N = a.length - 1;
        for (int i = 0; i <= N; i++) {
            a[i][i] = 1;
            a[i][N - i] = 1;
        }

    }

    public static void printArray(int[] a) {
        for (var item : a) {
            System.out.print(item + ",");
        }
        System.out.println();
    }

    public static void printArray(int[][] a) {
        for (int[] ints : a) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(ints[j]);
            }
            System.out.println();
        }
    }

}
