package org.aston.exercise.pages.home;

import org.aston.exercise.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    private final By locator = By.id("locator");
    private final By btnlocator = By.id("btnlocator");

    public HomePage enterData() {
        driver.findElement(locator);
        return this;
    }

    public HomePage click() {
        WebElement btn = driver.findElement(btnlocator);
        waitElementIsVisible(btn).click();
        return this;
    }
}
