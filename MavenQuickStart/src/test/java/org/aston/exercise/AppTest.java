package org.aston.exercise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.A;
import org.checkerframework.checker.units.qual.K;
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;


public class AppTest
{
    static WebDriver driver;
    WebDriverWait wait;

    @BeforeAll
    static void setUpAll() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://www.mts.by/");
        driver.findElement(By.xpath("//*[@id=\"cookie-agree\"]")).click();
    }

    @AfterAll
    static void tearDownAll() {
        driver.quit();
    }

    @Test
    @DisplayName("Проверить название указанного блока")
    void checkBlockTitle() {
        WebElement paySectionTitle = driver.findElement(By.xpath
                ("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/h2")
        );

        assertEquals("Онлайн пополнение\nбез комиссии", paySectionTitle.getText());
    }

    @Test
    @DisplayName("Проверить наличие логотипов платёжных систем")
    void checkLogo() {
        List<WebElement> logos = driver.findElements(
                By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li/img")
        );

        logos.forEach(p -> assertTrue(p.isDisplayed(), p.getAttribute("alt")));
    }

    @Test
    @DisplayName("Проверить работу ссылки «Подробнее о сервисе»")
    void checkLink() {
        WebElement link = driver.findElement(
                By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/a")
        );

        assertTrue(link.isEnabled());
        assertTrue(link.isDisplayed());

        String linkPath = link.getAttribute("href");
        String expectedLink = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";

        assertEquals(expectedLink, linkPath);

        driver.get(linkPath);
        assertEquals("Порядок оплаты и безопасность интернет платежей", driver.getTitle());
    }

    @Test
    @DisplayName("Проверить работу кнопки «Продолжить»")
    void checkForm() {
        final String PHONE_NUMBER = "297777777";
        final String SUM_PAY = "100";
        final String EMAIL = "test@mail.ru";

        WebElement inputPhoneNumber = driver.findElement(By.xpath("//*[@id=\"connection-phone\"]"));
        WebElement inputSumPay = driver.findElement(By.xpath("//*[@id=\"connection-sum\"]"));
        WebElement inputEmail = driver.findElement(By.xpath("//*[@id=\"connection-email\"]"));
        WebElement buttonNext = driver.findElement(By.xpath("//*[@id=\"pay-connection\"]/button"));

        inputPhoneNumber.sendKeys(PHONE_NUMBER);
        inputSumPay.sendKeys(SUM_PAY);
        inputEmail.sendKeys(EMAIL);

        buttonNext.click();


        wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        WebElement iframe = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[@class='bepaid-iframe']")));
        driver.switchTo().frame(iframe);

        WebElement paymentContainer = driver.findElement(By.xpath("//input[@id='cc-number']"));
        assertTrue(paymentContainer.isDisplayed());
        paymentContainer.sendKeys(Keys.ESCAPE);

        driver.switchTo().parentFrame();
    }
}
