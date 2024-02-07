package org.aston.exercise.base;

import org.aston.exercise.common.CommonActions;
import org.aston.exercise.common.Config;
import org.aston.exercise.pages.base.BasePage;
import org.aston.exercise.pages.home.HomePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = PageFactory.initElements(driver, BasePage.class);
    protected HomePage homePage = PageFactory.initElements(driver, HomePage.class);

    @AfterTest
    public void clearCookiesAndLocalStorage() {
        if (Config.CLEAR_COOKIES_AND_STORAGE)
        {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }

    @AfterSuite(alwaysRun = true)
    public void close() {
        if (Config.QUIT_BROWSER) {
            driver.quit();
        }
    }
}
