package ru.aston.lessons;

public class Main {
    public static void main(String[] args) {

        System.out.println(OperationWithNumber.sumBetween10And20(5, 14)); //1

        OperationWithNumber.isPositiveOrNot(-4); //2

        System.out.println(OperationWithNumber.isNegative(-4)); //3

        OperationWithNumber.printStr("hey", 3); //4

        System.out.println(OperationWithYear.isLeap(1920)); //5

        int[] numbers = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 }; //6
        OperationWithArray.logicalNegation(numbers);
        OperationWithArray.printArray(numbers);

        int[] oneHundred = new int[100];  //7
        OperationWithArray.fill(oneHundred);
        OperationWithArray.printArray(oneHundred);

        int[] someNumbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}; //8
        OperationWithArray.increaseSmallNumbers(someNumbers);
        OperationWithArray.printArray(someNumbers);

        int[][] doubleArray = new int[5][5]; //9
        OperationWithArray.fillDiagonals(doubleArray);
        OperationWithArray.printArray(doubleArray);

        int[] myArray = OperationWithArray.fill(5, 3); //10
        OperationWithArray.printArray(myArray); //1
    }

}