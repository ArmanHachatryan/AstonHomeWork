package org.aston.exercise.pages;

import org.aston.exercise.pageObjects.CookiesObject;
import org.aston.exercise.pageObjects.PayBlockObject;
import org.aston.exercise.pages.base.BasePage;

public class HomePage extends BasePage {
    public static PayBlockObject payBlockObject = new PayBlockObject();
    public static CookiesObject cookiesObject = new CookiesObject();
}
