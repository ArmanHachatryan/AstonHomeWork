package org.aston.exercise.checkPayBlock;

import org.aston.exercise.base.BaseTest;
import org.aston.exercise.pages.HomePage;
import org.aston.exercise.pages.PaymentInfoPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PayBlockTest extends BaseTest {
    @Test
    @DisplayName("Проверить название указанного блока")
    public void checkTitleTest() {
        Assertions.assertTrue(HomePage.payBlockObject.assertTitleText("Онлайн пополнение\nбез комиссии"));
    }

    @DisplayName("Проверить наличие логотипов платёжных систем")
    @ParameterizedTest
    @ValueSource(strings = {
            "Visa", "Verified By Visa", "MasterCard",
            "MasterCard Secure Code", "Белкарт", "МИР"
    })
    public void checkLogoTest(String logoName) {
        Assertions.assertTrue(HomePage.payBlockObject.logoIsDisplayed(logoName));
    }

    @Test
    @DisplayName("Проверить работу ссылки «Подробнее о сервисе»")
    public void checkLinkTest() {
        Assertions.assertAll(
                () -> Assertions.assertTrue(HomePage.payBlockObject.assertLinkText("Подробнее о сервисе")),
                () -> Assertions.assertTrue(HomePage.payBlockObject.linkIsDisplayed()),
                () -> Assertions.assertTrue(HomePage.payBlockObject.linkIsEnabled())
        );

        HomePage.payBlockObject.clickLink();
        Assertions.assertTrue(PaymentInfoPage.infoBlockObject.assertTitleText("Оплата банковской картой"));
        PaymentInfoPage.goBack();
    }
}
