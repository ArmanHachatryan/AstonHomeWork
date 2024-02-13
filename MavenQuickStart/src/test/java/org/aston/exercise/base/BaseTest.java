package org.aston.exercise.base;

import org.aston.exercise.pages.base.BasePage;
import org.aston.exercise.pages.HomePage;
import org.aston.exercise.utils.common.Singlton;
import org.aston.exercise.utils.constants.Constant;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;


import static org.aston.exercise.utils.common.Config.QUIT_BROWSER;

public class BaseTest {
    @BeforeAll
    public static void setup() {
        BasePage.open(Constant.Urls.MTS_BY);
        HomePage.cookiesObject.acceptCookies();
    }

    @AfterAll
    public static void teardown() {
        if (QUIT_BROWSER) {
            Singlton.getInstance().quit();
        }
    }
}
