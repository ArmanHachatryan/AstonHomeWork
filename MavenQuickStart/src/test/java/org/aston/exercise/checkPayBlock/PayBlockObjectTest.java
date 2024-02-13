package org.aston.exercise.checkPayBlock;

import org.aston.exercise.base.BaseTest;
import org.aston.exercise.pages.base.BasePage;
import org.aston.exercise.pages.homePage.HomePage;
import org.aston.exercise.utils.constants.Constant;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PayBlockObjectTest extends BaseTest {
    @Test
    @DisplayName("Проверить название указанного блока")
    public void checkTitleTest() {
        BasePage.open(Constant.Urls.MTS_BY);
        String text = HomePage.payBlockObject.getTextFromTitle();
        System.out.println(text);
    }
}
