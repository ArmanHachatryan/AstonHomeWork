package org.aston.exercise.pageObjects;

import org.aston.exercise.elements.TextElement;
import org.aston.exercise.pageObjects.base.BaseObject;
import org.aston.exercise.utils.common.Driver;
import org.openqa.selenium.By;

public class PaymentAlertObject extends BaseObject {
    private By iframeLocator = By.xpath("//iframe[@class='bepaid-iframe']");

    private By closeButtonLocator = By.xpath("//svg-icon[@class='header__close-icon']");

    private TextElement sumOnTitle = new TextElement(By.xpath("//p[contains(@class,'payment-amount')]"), "Sum BYN");

    public boolean assertSum(String sum) {
        switchToFrame(waitUntilVisibilityOf(iframeLocator));
        boolean result =  Double.parseDouble(sumOnTitle
                .getTextFromAttribute("innerText").split(" ")[0]) == Double.parseDouble(sum);
        driver.findElement(closeButtonLocator).click();
        switchToDefaultFrame();
        return result;
    }
}
