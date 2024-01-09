package ru.aston.lessons.exceptions;

public class MyArraySizeException extends Exception {
    private final int row;
    private final int column;

    public MyArraySizeException(String message, int row, int column) {
        super(message);
        this.row = row;
        this.column = column;
    }

    public String getArraySize() {
        return row + "x" + column;
    }
}
