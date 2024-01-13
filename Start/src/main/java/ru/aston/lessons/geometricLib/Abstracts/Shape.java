package ru.aston.lessons.geometricLib.Abstracts;

import ru.aston.lessons.COLOR;

public abstract class Shape {
    public final COLOR backgroundCOLOR;
    public final COLOR borderCOLOR;

    public Shape(COLOR backgroundCOLOR, COLOR borderCOLOR) {
        this.backgroundCOLOR = backgroundCOLOR;
        this.borderCOLOR = borderCOLOR;
    }

    public abstract void getInfo();
}