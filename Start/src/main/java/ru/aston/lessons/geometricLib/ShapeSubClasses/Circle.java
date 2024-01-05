package ru.aston.lessons.geometricLib.ShapeSubClasses;

import ru.aston.lessons.Color;
import ru.aston.lessons.geometricLib.Abstracts.Shape;
import ru.aston.lessons.geometricLib.Interfaces.ShapeArea;
import ru.aston.lessons.geometricLib.Interfaces.ShapePerimeter;

public class Circle extends Shape implements ShapePerimeter, ShapeArea {
    private final double radius;

    public Circle(double radius, Color backgroundColor, Color borderColor) {
        super(backgroundColor, borderColor);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void getInfo() {
        System.out.printf(
                "Circle {" +
                        "radius = %.2f" +
                        ", backgroundColor = %s" +
                        ", borderColor = %s" +
                        ", P = %.3f" +
                        ", S = %.3f" +
                        "}\n"
                , radius, backgroundColor, borderColor, calculatePerimeter(), calculateArea()
        );
    }
}
