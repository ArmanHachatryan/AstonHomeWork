package ru.aston.lessons.geometricLib.ShapeSubClasses;

import ru.aston.lessons.COLOR;
import ru.aston.lessons.geometricLib.Abstracts.Shape;
import ru.aston.lessons.geometricLib.Interfaces.ShapeArea;
import ru.aston.lessons.geometricLib.Interfaces.ShapePerimeter;

public class Triangle extends Shape implements ShapePerimeter, ShapeArea {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC, COLOR backgroundCOLOR, COLOR borderCOLOR) {
        super(backgroundCOLOR, borderCOLOR);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculateArea() {
        double p = calculatePerimeter() / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public void getInfo() {
        System.out.printf(
                "Triangle {" +
                        "sideA = %.2f" +
                        ", sideB = %.2f" +
                        ", sideC = %.2f" +
                        ", backgroundColor = %s" +
                        ", borderColor = %s" +
                        ", P = %.3f" +
                        ", S = %.3f" +
                        "}\n"
                , sideA, sideB, sideC, backgroundCOLOR, borderCOLOR, calculatePerimeter(), calculateArea()
        );
    }
}
