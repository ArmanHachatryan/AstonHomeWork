package ru.aston.lessons;

public final class OperationWithArray {
    private OperationWithArray() {}

    public static void logicalNegation(int[] a){
        int N = a.length;
        for (int i = 0; i < N; i++) {
            switch (a[i]) {
                case (0):
                    a[i] = 1;
                    break;
                case (1):
                    a[i] = 0;
                    break;
            }
        }
    }

    public static void fill(int[] a){
        int N = a.length;
        for (int i = 0; i < N; i++){
            a[i] = i + 1;
        }
    }

    public static int[] fill(int len, int initialValue){
        int[] array = new int[len];
        for (int i = 0; i < len; i++){
            array[i] = initialValue;
        }
        return array;
    }

    public static void increaseSmallNumbers(int[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            if (a[i] < 6) a[i] *= 2;
        }
    }

    public static void fillDiagonals(int[][] a){
        int N = a.length -1;
        for (int i = 0; i <= N;i++){
            a[i][i] = 1;
            a[i][N-i] = 1;
        }

    }

    public static void printArray(int[] a){
        for (var item: a) {
            System.out.print(item + ",");
        }
        System.out.println();
    }

    public static void printArray(int[][] a){
        for (int[] ints : a) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(ints[j]);
            }
            System.out.println();
        }
    }

}
