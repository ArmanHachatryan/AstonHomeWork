package org.aston.exercise.base;

import org.aston.exercise.common.CommonActions;
import org.aston.exercise.common.Config;
import org.aston.exercise.elements.base.BaseElement;
import org.aston.exercise.elements.header.Header;
import org.aston.exercise.pages.base.BasePage;
import org.aston.exercise.pages.basket.BasketPage;
import org.aston.exercise.pages.home.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.asserts.SoftAssert;

public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = PageFactory.initElements(driver, BasePage.class);
    protected HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    protected BasketPage basketPage = PageFactory.initElements(driver, BasketPage.class);
    protected BaseElement baseElement = PageFactory.initElements(driver, BaseElement.class);
    protected Header header = PageFactory.initElements(driver, Header.class);
    protected SoftAssert softAssert = new SoftAssert();

    @AfterSuite(alwaysRun = true)
    public void close() {
        if (Config.QUIT_BROWSER) {
            driver.quit();
        }
    }
}
