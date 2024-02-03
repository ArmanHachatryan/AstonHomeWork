package org.aston.exercise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class AppTest {
    WebDriver driver;
    WebDriverWait wait;
    final String PHONE_NUMBER = "297777777";
    final double SUM_PAY_DOUBLE = 100.0;
    final String SUM_PAY_STRING = String.valueOf(SUM_PAY_DOUBLE);
    final String EMAIL = "test@mail.ru";

    @BeforeAll
    static void setUpAll() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.mts.by/");
        driver.findElement(By.xpath("//button[@id='cookie-agree']")).click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    @AfterEach
    void tearDownAll() {
        driver.quit();
    }

    @Test
    @DisplayName("Проверить надписи в незаполненных полях")
    void checkInputText() {
        final String sumPlaceholder = "Сумма";
        final String emailPlaceholder = "E-mail для отправки чека";

        String phoneNumberText = getTextFromWebElement("//input[@id='connection-phone']",
                "placeholder");
        String sumText = getTextFromWebElement("//input[@id='connection-sum']",
                "placeholder");
        String emailText = getTextFromWebElement("//input[@id='connection-email']",
                "placeholder");

        assertAll(
                () -> assertEquals("Номер телефона", phoneNumberText,
                        "Номер телефона"),
                () -> assertEquals(sumPlaceholder, sumText, sumPlaceholder),
                () -> assertEquals(emailPlaceholder, emailText, emailPlaceholder)
        );

        String internetPhoneText = getTextFromWebElement("//input[@id='internet-phone']",
                "placeholder");
        String internetSum = getTextFromWebElement("//input[@id='internet-sum']",
                "placeholder");
        String internetEmail = getTextFromWebElement("//input[@id='internet-email']",
                "placeholder");

        assertAll(
                () -> assertEquals("Номер абонента", internetPhoneText, "Номер абонента"),
                () -> assertEquals(sumPlaceholder, internetSum, sumPlaceholder + 2),
                () -> assertEquals(emailPlaceholder, internetEmail, emailPlaceholder + 2)
        );

        String scoreInstalmentText = getTextFromWebElement("//input[@id='score-instalment']",
                "placeholder");
        String scoreInstalmentSum = getTextFromWebElement("//input[@id='instalment-sum']",
                "placeholder");
        String scoreInstalmentEmail = getTextFromWebElement("//input[@id='instalment-email']",
                "placeholder");

        assertAll(
                () -> assertEquals("Номер счета на 44", scoreInstalmentText, "Номер счета на 44"),
                () -> assertEquals(sumPlaceholder, scoreInstalmentSum, sumPlaceholder + 3),
                () -> assertEquals(emailPlaceholder, scoreInstalmentEmail, emailPlaceholder + 3)
        );

        String arrearsText = getTextFromWebElement("//input[@id='score-arrears']",
                "placeholder");
        String arrearsSum = getTextFromWebElement("//input[@id='arrears-sum']",
                "placeholder");
        String arrearsEmail = getTextFromWebElement("//input[@id='arrears-email']",
                "placeholder");

        assertAll(
                () -> assertEquals("Номер счета на 2073", arrearsText, "Номер счета на 2073"),
                () -> assertEquals(sumPlaceholder, arrearsSum, sumPlaceholder + 4),
                () -> assertEquals(emailPlaceholder, arrearsEmail, emailPlaceholder + 4)
        );
    }

    @Test
    @DisplayName("Проверить работу формы оплаты»")
    void checkPayForm() {
        inputDataInForm();
        switchFrame("//iframe[@class='bepaid-iframe']");
        Double actualAmountOnP = getDoubleFromWebElement(
                "//p[@class='header__payment-amount']", " ", 0);

        Double actualSumOnButton = getDoubleFromWebElement(
                "//div[@class='card-page__card']/button", " ", 1);

        String actualPhoneNumber = getTextFromWebElement(
                "//p[@class='header__payment-info']", "375", 1);

        String actualTextOfC_C_Number = getTextFromWebElement("//input[@id='cc-number']/..");
        String actualTextOfC_C_Exp = getTextFromWebElement("//input[@autocomplete='cc-exp']/..");
        String actualTextOfC_C_V = getTextFromWebElement("//input[@name='verification_value']/..");
        String actualTextOnPersonName = getTextFromWebElement("//input[@autocomplete='cc-name']/..");

        List<WebElement> actualLogos = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
                By.xpath("//input[@id='cc-number']/../following-sibling::div/.//img")
        ));

        assertAll(
                () -> assertEquals(SUM_PAY_DOUBLE, actualAmountOnP, "Сумма в <p> отличается"),
                () -> assertEquals(SUM_PAY_DOUBLE, actualSumOnButton, "Сумма на <button отличается"),
                () -> assertEquals(PHONE_NUMBER, actualPhoneNumber, "Номер отличается"),
                () -> assertEquals("Номер карты", actualTextOfC_C_Number, "Отличие Номер карты"),
                () -> assertEquals("Срок действия", actualTextOfC_C_Exp, "Отличие Срок действия"),
                () -> assertEquals("CVC", actualTextOfC_C_V, "Отличие CVC"),
                () -> assertEquals("Имя держателя (как на карте)", actualTextOnPersonName,
                        "Отличие Имя держателя"),
                () -> actualLogos.forEach(p -> assertTrue(p.isDisplayed(), "Логотипа нет"))
        );
    }

    public void switchFrame(String xpath) {
        WebElement iframe = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath(xpath)));
        driver.switchTo().frame(iframe);
    }

    public void inputDataInForm() {
        driver.findElement(By.xpath("//input[@id='connection-phone']")).sendKeys(PHONE_NUMBER);
        driver.findElement(By.xpath("//input[@id='connection-sum']")).sendKeys(SUM_PAY_STRING);
        driver.findElement(By.xpath("//input[@id='connection-email']")).sendKeys(EMAIL);
        driver.findElement(By.xpath("//form[@id='pay-connection']/button")).click();;
    }

    public String getTextFromWebElement(String xpath) {
         return driver.findElement(By.xpath(xpath))
                .getAttribute("innerText");
    }

    public String getTextFromWebElement(String xpath, String attributeName) {
        return driver.findElement(By.xpath(xpath))
                .getAttribute(attributeName);
    }

    public String getTextFromWebElement(String xpath, String regex, int index) {
        return driver.findElement(By.xpath(xpath))
                .getAttribute("innerText")
                .split(regex)[index];
    }

    public Double getDoubleFromWebElement(String xpath, String regex, int index) {
        return Double.parseDouble(driver.findElement(By.xpath(xpath))
                .getAttribute("innerText")
                .split(regex)[index]);
    }
}
