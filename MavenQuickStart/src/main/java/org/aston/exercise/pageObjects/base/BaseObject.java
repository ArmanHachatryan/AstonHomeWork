package org.aston.exercise.pageObjects.base;

import org.aston.exercise.utils.common.Driver;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;

import static org.aston.exercise.utils.constants.Constant.TimeoutVariable.EXPLICIT_WAIT;

public class BaseObject {
    protected WebDriver driver = Driver.getInstance();
    protected Actions builder;

    public WebElement waitElementIsVisible(WebElement element) {
        new WebDriverWait(Driver.getInstance(), Duration.ofSeconds(EXPLICIT_WAIT))
                .until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public WebElement waitUntilVisibilityOf(By locator) {
        return new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT))
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void switchToFrame(WebElement frame){
        driver.switchTo().frame(frame);
    }

    public void switchToDefaultFrame() {
        driver.switchTo().defaultContent();
    }

    public void closeAlert() {
        builder = new Actions(driver);
        builder.sendKeys(Keys.ESCAPE).build().perform();
    }
}
