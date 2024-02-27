package org.aston.exercise.base;

import org.aston.exercise.common.CommonActions;
import org.aston.exercise.common.Constant;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;


public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();


    @AfterSuite(alwaysRun = true)
    public void close() {
        if (Constant.Config.QUIT_BROWSER) {
            driver.quit();
        }
    }
}
