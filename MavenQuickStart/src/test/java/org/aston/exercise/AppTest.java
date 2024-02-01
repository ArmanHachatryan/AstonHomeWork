package org.aston.exercise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class AppTest {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeAll
    static void setUpAll() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://www.mts.by/");
        driver.findElement(By.xpath("//button[@id='cookie-agree']")).click();
    }

    @AfterEach
    void tearDownAll() {
        driver.quit();
    }

    @Test
    @DisplayName("Проверить работу формы оплаты»")
    void checkPayForm() {
        final String PHONE_NUMBER = "297777777";
        final double SUM_PAY_DOUBLE = 100.0;
        final String SUM_PAY_STRING = String.valueOf(SUM_PAY_DOUBLE);
        final String EMAIL = "test@mail.ru";

        driver.findElement(By.xpath("//input[@id='connection-phone']")).sendKeys(PHONE_NUMBER);
        driver.findElement(By.xpath("//input[@id='connection-sum']")).sendKeys(SUM_PAY_STRING);
        driver.findElement(By.xpath("//input[@id='connection-email']")).sendKeys(EMAIL);
        driver.findElement(By.xpath("//form[@id='pay-connection']/button")).click();;

        wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        WebElement iframe = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[@class='bepaid-iframe']")));
        driver.switchTo().frame(iframe);

        Double actualAmountOnP = Double.parseDouble(driver.findElement(By.xpath("//p[@class='header__payment-amount']"))
                .getAttribute("innerText")
                .split(" ")[0]);

        Double actualSumOnButton = Double.parseDouble(driver.findElement(By.xpath("//div[@class='card-page__card']/button"))
                .getAttribute("innerText")
                .split(" ")[1]);

        String actualPhoneNumber = driver.findElement(By.xpath("//p[@class='header__payment-info']"))
                .getAttribute("innerText")
                .split("375")[1];

        assertEquals(SUM_PAY_DOUBLE, actualAmountOnP);
        assertEquals(SUM_PAY_DOUBLE, actualSumOnButton);
        assertEquals(PHONE_NUMBER, actualPhoneNumber);
    }
}
