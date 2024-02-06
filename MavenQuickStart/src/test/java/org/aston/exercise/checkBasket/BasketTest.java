package org.aston.exercise.checkBasket;

import org.aston.exercise.base.BaseTest;
import org.aston.exercise.constants.Constant;
import org.testng.annotations.Test;

public class BasketTest extends BaseTest {
    @Test
    public void checkIsRedirectToListing() {
        basePage.open(Constant.Urls.WILDBERRIES_HOME_PAGE);

        homePage
                .enterData()
                .click();
    }
}
