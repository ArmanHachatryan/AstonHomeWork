package ru.aston.lessons.geometricLib.Interfaces;

public interface ShapeArea {
    default double calculateArea() {
        throw new UnsupportedOperationException("calculateArea should be overridden");
    }
}
