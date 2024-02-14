package org.aston.exercise.checkPayBlock;

import org.aston.exercise.base.BaseTest;
import org.aston.exercise.pageObjects.PayBlockObject;
import org.aston.exercise.pages.HomePage;
import org.aston.exercise.pages.PaymentInfoPage;
import org.aston.exercise.utils.common.Driver;
import org.aston.exercise.utils.constants.Constant;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.aston.exercise.utils.constants.Constant.UserData.*;

public class PayBlockTest extends BaseTest {
    @Test
    @DisplayName("Проверить название указанного блока")
    public void checkTitleTest() {
        Assertions.assertTrue(homePage.payBlockObject.assertTitleText("Онлайн пополнение\nбез комиссии"));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "Visa", "Verified By Visa", "MasterCard",
            "MasterCard Secure Code", "Белкарт", "МИР"
    })
    @DisplayName("Проверить наличие логотипов платёжных систем")
    public void checkLogoTest(String logoName) {
        Assertions.assertTrue(homePage.payBlockObject.logoIsDisplayed(logoName));
    }

    @Test
    @DisplayName("Проверить работу ссылки «Подробнее о сервисе»")
    public void checkLinkTest() {
        Assertions.assertAll(
                () -> Assertions.assertTrue(homePage.payBlockObject.assertLinkText("Подробнее о сервисе")),
                () -> Assertions.assertTrue(homePage.payBlockObject.linkIsDisplayed()),
                () -> Assertions.assertTrue(homePage.payBlockObject.linkIsEnabled())
        );
        Assertions.assertTrue(homePage.payBlockObject.clickLink()
                .infoBlockObject.assertTitleText("Оплата банковской картой"));
        PaymentInfoPage.goBack();
    }

    @Test
    @DisplayName("Проверить работу кнопки «Продолжить»")
    public void checkFormTest() {
        boolean result = homePage.payBlockObject.paymentForm
                .sendKeys(PHONE_NUMBER, SUM_PAY, EMAIL)
                .clickBtn().assertSum(SUM_PAY);

        Assertions.assertTrue(result);

    }
}
