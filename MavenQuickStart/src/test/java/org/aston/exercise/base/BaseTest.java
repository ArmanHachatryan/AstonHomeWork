package org.aston.exercise.base;

import org.aston.exercise.pages.HomePage;
import org.aston.exercise.pages.PaymentInfoPage;
import org.aston.exercise.pages.base.BasePage;
import org.aston.exercise.utils.common.Driver;
import org.aston.exercise.utils.constants.Constant;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.support.PageFactory;


import static org.aston.exercise.utils.common.Config.QUIT_BROWSER;

public class BaseTest {
    protected HomePage homePage = PageFactory.initElements(Driver.getInstance(), HomePage.class);

    @BeforeAll
    public static void setup() {
        BasePage.open(Constant.Urls.MTS_BY);
        BasePage.cookiesObject.acceptCookies();
    }

    @AfterAll
    public static void teardown() {
        if (QUIT_BROWSER) {
            Driver.getInstance().quit();
        }
    }
}
