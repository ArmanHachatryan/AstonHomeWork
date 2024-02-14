package org.aston.exercise.elements;

import org.aston.exercise.elements.base.BaseElement;
import org.openqa.selenium.By;

public class InputElement extends BaseElement {
    public InputElement(By locator, String name) {
        super(locator, name);
    }

    public void sendKeys(String keys){
        driver.findElement(locator).sendKeys(keys);
    }

}
