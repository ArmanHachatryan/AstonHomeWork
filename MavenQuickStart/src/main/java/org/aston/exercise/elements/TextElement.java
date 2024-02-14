package org.aston.exercise.elements;

import org.aston.exercise.elements.base.BaseElement;
import org.openqa.selenium.By;

public class TextElement extends BaseElement {
    public TextElement(By locator, String name) {
        super(locator, name);
    }
}
