package org.aston.exercise;

import jdk.jfr.Description;
import org.aston.exercise.base.BaseTest;
import org.aston.exercise.common.Constant;
import org.aston.exercise.elements.Header;
import org.aston.exercise.elements.base.BaseElement;
import org.aston.exercise.pages.BasketPage;
import org.aston.exercise.pages.HomePage;
import org.aston.exercise.pages.base.BasePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.aston.exercise.common.Constant.Data.COUNT;

public class BasketTest extends BaseTest {
    protected BasePage basePage = PageFactory.initElements(driver, BasePage.class);
    protected HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    protected BasketPage basketPage = PageFactory.initElements(driver, BasketPage.class);
    protected Header header = PageFactory.initElements(driver, Header.class);
    protected SoftAssert softAssert = new SoftAssert();

    @Test
    @Description("Выбрать товары на главной странице и проверить их на соответствие в корзине")
    public void checkBasket() {
        basePage.open(Constant.Urls.WILDBERRIES_HOME_PAGE);
        homePage.addToBasket(COUNT);
        header.clickBasketButton();
        basketPage.wait(2000).readGoods();

        Assert.assertEquals(basketPage.getCount(), homePage.getCountOfSelected(), "Different counts");
        for (int i = 0; i < COUNT; i++) {
            softAssert.assertEquals(
                    basketPage.getGoodName(COUNT - i - 1),
                    homePage.getSelectedProductName(i),
                    "Different names"
            );
            softAssert.assertEquals(
                    basketPage.getGoodPrice(COUNT - i - 1),
                    homePage.getSelectedProductPrice(i),
                    "Different prices"
            );
        }

        softAssert.assertEquals(basketPage.getSum(), homePage.getSumOfSelected(), "Different sums");
        softAssert.assertAll();
    }
}
