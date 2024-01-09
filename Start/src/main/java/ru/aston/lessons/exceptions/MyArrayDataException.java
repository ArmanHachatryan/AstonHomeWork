package ru.aston.lessons.exceptions;

public class MyArrayDataException extends Exception {
    private final int rowIndex;
    private final int columnIndex;

    public MyArrayDataException(String message, int rowIndex, int columnIndex) {
        super(message);
        this.rowIndex = rowIndex;
        this.columnIndex = columnIndex;
    }

    public String getIndex() {
        return "[" + rowIndex + "]" + "[" + columnIndex + "]";
    }
}
