package org.aston.exercise.elements.base;

import org.aston.exercise.utils.common.Singlton;
import org.openqa.selenium.By;

public class BaseElement {
    protected final By locator;
    protected final String name;

    public BaseElement(By locator, String name) {
        this.locator = locator;
        this.name = name;
    }

    public String getText() {
        return Singlton.getInstance().findElement(locator).getText();
    }
}
