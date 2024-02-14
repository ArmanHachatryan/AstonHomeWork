package org.aston.exercise.pageObjects;

import org.aston.exercise.elements.*;
import org.aston.exercise.pageObjects.base.BaseObject;
import org.aston.exercise.pages.HomePage;
import org.aston.exercise.pages.PaymentInfoPage;
import org.aston.exercise.utils.common.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class PayBlockObject extends BaseObject {
    private TitleElement title = new TitleElement(By.xpath("//section[@class='pay']/.//h2"), "H2");
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

    public PaymentForm paymentForm = new PaymentForm();

    public class PaymentForm extends BaseObject{
        private InputElement inputPhoneNumber = new InputElement(By.xpath("//input[@id='connection-phone']"), "PhoneNumber");
        private InputElement inputSum = new InputElement(By.xpath("//input[@id='connection-sum']"), "Sum");
        private InputElement inputEmail = new InputElement(By.xpath("//input[@id='connection-email']"), "Email");
        private ButtonElement btnSend = new ButtonElement(By.xpath("//form[@id='pay-connection']/button"), "Send");

        public PaymentForm sendKeys(String phoneNumber, String sum, String email) {
            paymentForm.inputPhoneNumber.sendKeys(phoneNumber);
            paymentForm.inputSum.sendKeys(sum);
            paymentForm.inputEmail.sendKeys(email);
            return new PaymentForm();
        }

        public PaymentAlertObject clickBtn() {
            paymentForm.btnSend.click();
            return new PaymentAlertObject();
        }
    }

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

    public PaymentInfoPage clickLink() {
        link.click();
        return PageFactory.initElements(Driver.getInstance(), PaymentInfoPage.class);
    }
}
