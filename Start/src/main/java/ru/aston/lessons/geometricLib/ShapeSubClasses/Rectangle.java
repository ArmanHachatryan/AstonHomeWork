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
    public void getInfo() {
        System.out.printf(
                "Rectangle {" +
                        "sideA = %.2f" +
                        ", sideB = %.2f" +
                        ", backgroundColor = %s" +
                        ", borderColor = %s" +
                        ", P = %.3f" +
                        ", S = %.3f" +
                        "}\n"
                , sideA, sideB, backgroundColor, borderColor, calculatePerimeter(), calculateArea()
        );
    }
}
