package org.aston.exercise.pageObjects;

import org.aston.exercise.elements.LinkElement;
import org.aston.exercise.elements.LogoElement;
import org.aston.exercise.elements.TitleElement;
import org.aston.exercise.pageObjects.base.BaseObject;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class PayBlockObject extends BaseObject {
    private TitleElement title = new TitleElement(By.xpath("//div[@class='pay__wrapper']/h2"), "H2");
    private List<LogoElement> logos = new ArrayList<LogoElement>(
            List.of(
                    new LogoElement(By.xpath("//section/.//img[@alt='Visa']"), "Visa"),
                    new LogoElement(By.xpath("//section/.//img[@alt='Verified By Visa']"), "Verified By Visa"),
                    new LogoElement(By.xpath("//section/.//img[@alt='MasterCard']"), "MasterCard"),
                    new LogoElement(By.xpath("//section/.//img[@alt='MasterCard Secure Code']"), "MasterCard Secure Code"),
                    new LogoElement(By.xpath("//section/.//img[@alt='Белкарт']"), "Белкарт"),
                    new LogoElement(By.xpath("//section/.//img[@alt='МИР']"), "МИР")
            )
    );

    private LinkElement link = new LinkElement(By.xpath("//section[@class='pay']/.//a"), "More About Service");

    public boolean logoIsDisplayed(String name) {
        LogoElement logo = logos.stream().filter(p -> p.getElementName().equals(name)).findFirst().get();
        return logo.isDisplayed();
    }

    public boolean assertLinkText(String expected) {
        return expected.equals(link.getText());
    }

    public boolean linkIsDisplayed() {
        return link.isDisplayed();
    }

    public boolean linkIsEnabled() {
        return link.isEnabled();
    }

    public boolean assertTitleText(String expected) {
        return expected.equals(title.getText());
    }

    public void clickLink() {
        link.click();
    }
}
