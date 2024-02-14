package org.aston.exercise.elements.base;

import org.aston.exercise.utils.common.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaseElement {

    protected WebDriver driver = Driver.getInstance();
    protected final By locator;
    protected final String name;

    public BaseElement(By locator, String name) {
        this.locator = locator;
        this.name = name;
    }

    public String getText() {
        return driver.findElement(locator).getText();
    }

    public String getTextFromAttribute(String attributeName) {
        return driver.findElement(locator).getAttribute(attributeName);
    }

    public String getElementName() {
        return name;
    }

    public boolean isDisplayed() {
        return driver.findElement(locator).isDisplayed();
    }

    public boolean isEnabled() {
        return driver.findElement(locator).isDisplayed();
    }

    public void click() {
        driver.findElement(locator).click();
    }
}
