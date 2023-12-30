package ru.aston.lessons.geometricLib.ShapeSubClasses;

import ru.aston.lessons.Color;
import ru.aston.lessons.geometricLib.Abstracts.Shape;
import ru.aston.lessons.geometricLib.Interfaces.ShapeArea;
import ru.aston.lessons.geometricLib.Interfaces.ShapePerimeter;

public class Rectangle extends Shape implements ShapePerimeter, ShapeArea {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB, Color backgroundColor, Color borderColor) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
    }

    @Override
    public double calculateArea() {
        return sideA * sideB;
    }

    @Override
    public double calculatePerimeter() {
        return (sideA + sideB) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", backgroundColor='" + backgroundColor + '\'' +
                ", borderColor='" + borderColor + '\'' +
                ", P='" + calculatePerimeter() + '\'' +
                ", S='" + calculateArea() + '\'' +
                '}';
    }
}
