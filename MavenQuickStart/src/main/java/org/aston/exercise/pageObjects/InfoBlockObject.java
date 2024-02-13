package org.aston.exercise.pageObjects;

import org.aston.exercise.elements.TitleElement;
import org.aston.exercise.pageObjects.base.BaseObject;
import org.openqa.selenium.By;

public class InfoBlockObject extends BaseObject {
    private TitleElement title = new TitleElement(By.xpath("//div/h3"), "Pay with bank Card");

    public boolean assertTitleText(String expected) {
        return expected.equals(title.getText());
    }
}
