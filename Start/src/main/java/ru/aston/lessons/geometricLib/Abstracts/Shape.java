package ru.aston.lessons.geometricLib.Abstracts;

import ru.aston.lessons.Color;

public abstract class Shape {
    public final Color backgroundColor;
    public final Color borderColor;

    public Shape(Color backgroundColor, Color borderColor) {
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
    }

    public abstract void getInfo();
}