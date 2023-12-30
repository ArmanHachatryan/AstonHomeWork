package ru.aston.lessons.geometricLib.Interfaces;

public interface ShapePerimeter {
    default double calculatePerimeter() {
        throw new UnsupportedOperationException("calculatePerimeter should be overridden");
    }
}
