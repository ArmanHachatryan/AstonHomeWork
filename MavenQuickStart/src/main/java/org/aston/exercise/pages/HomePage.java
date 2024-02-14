package org.aston.exercise.pages;

import org.aston.exercise.pageObjects.PayBlockObject;
import org.aston.exercise.pageObjects.PaymentAlertObject;
import org.aston.exercise.pages.base.BasePage;
import org.aston.exercise.utils.common.Driver;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    public PayBlockObject payBlockObject = PageFactory.initElements(Driver.getInstance(), PayBlockObject.class);
    public PaymentAlertObject paymentAlertObject = PageFactory.initElements(Driver.getInstance(), PaymentAlertObject.class);
}
