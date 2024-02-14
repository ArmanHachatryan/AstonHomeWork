package org.aston.exercise.pageObjects.base;

import org.aston.exercise.utils.common.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.aston.exercise.utils.constants.Constant.TimeoutVariable.EXPLICIT_WAIT;

public class BaseObject {
    public WebElement waitElementIsVisible(WebElement element) {
        new WebDriverWait(Driver.getInstance(), Duration.ofSeconds(EXPLICIT_WAIT))
                .until(ExpectedConditions.visibilityOf(element));
        return element;
    }
}
