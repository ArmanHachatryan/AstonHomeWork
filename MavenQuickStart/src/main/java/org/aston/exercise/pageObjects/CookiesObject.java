package org.aston.exercise.pageObjects;

import org.aston.exercise.elements.ButtonElement;
import org.aston.exercise.pageObjects.base.BaseObject;
import org.openqa.selenium.By;

public class CookiesObject extends BaseObject {
    private ButtonElement acceptButtonElement = new ButtonElement(By.xpath("//button[@id='cookie-agree']"), "Accept");

    public void acceptCookies() {
        acceptButtonElement.click();
    }
}
