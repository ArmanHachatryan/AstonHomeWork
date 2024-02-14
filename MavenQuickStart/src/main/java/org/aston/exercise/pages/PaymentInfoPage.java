package org.aston.exercise.pages;

import org.aston.exercise.pageObjects.InfoBlockObject;
import org.aston.exercise.pages.base.BasePage;
import org.aston.exercise.utils.common.Driver;
import org.openqa.selenium.support.PageFactory;

public class PaymentInfoPage extends BasePage {
    public InfoBlockObject infoBlockObject = PageFactory.initElements(Driver.getInstance(), InfoBlockObject.class);
}
