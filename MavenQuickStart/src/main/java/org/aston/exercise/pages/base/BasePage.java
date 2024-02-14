package org.aston.exercise.pages.base;

import org.aston.exercise.pageObjects.CookiesObject;
import org.aston.exercise.utils.common.Driver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public static void open(String url) {
        Driver.getInstance().get(url);
    }

    public static void goBack() {
        Driver.getInstance().navigate().back();
    }

    public static CookiesObject cookiesObject = PageFactory.initElements(Driver.getInstance(), CookiesObject.class);
}
