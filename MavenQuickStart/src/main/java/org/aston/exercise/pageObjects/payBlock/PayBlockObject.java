package org.aston.exercise.pageObjects.payBlock;

import org.aston.exercise.elements.base.BaseElement;
import org.aston.exercise.elements.title.TitleElement;
import org.aston.exercise.pageObjects.base.BaseObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PayBlockObject extends BaseObject {
    private TitleElement title = new TitleElement(By.xpath("//div[@class='pay__wrapper']/h2"), "h2Title");

    public String getTextFromTitle() {
        return title.getText();
    }
}
