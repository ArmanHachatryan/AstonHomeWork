package org.aston.exercise.elements.base;

import org.openqa.selenium.WebDriver;

public class BaseElement {
    protected WebDriver driver;

    public BaseElement(WebDriver driver) {
        this.driver = driver;
    }
}
