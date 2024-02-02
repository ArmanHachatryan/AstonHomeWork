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
    @DisplayName("Проверить название указанного блока")
    void checkBlockTitle() {
        WebElement paySectionTitle = driver.findElement(By.xpath
                ("//div[@class='pay__wrapper']/h2")
        );

        assertEquals("Онлайн пополнение\nбез комиссии", paySectionTitle.getText());
    }

    @Test
    @DisplayName("Проверить наличие логотипов платёжных систем")
    void checkLogo() {
        List<WebElement> logos = driver.findElements(
                By.xpath("//div[@class='pay__partners']/.//img")
        );

        logos.forEach(p -> assertTrue(p.isDisplayed(), p.getAttribute("alt")));
    }

    @Test
    @DisplayName("Проверить работу ссылки «Подробнее о сервисе»")
    void checkLink() {
        String expectedLink = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";

        WebElement link = driver.findElement(
                By.xpath("//div[@class='pay__wrapper']/a")
        );

        assertTrue(link.isEnabled());
        assertTrue(link.isDisplayed());

        String linkPath = link.getAttribute("href");
        driver.get(linkPath);

        assertEquals(expectedLink, linkPath);
        assertEquals("Порядок оплаты и безопасность интернет платежей", driver.getTitle());
    }

    @Test
    @DisplayName("Проверить работу кнопки «Продолжить»")
    void checkForm() {
        final String PHONE_NUMBER = "297777777";
        final String SUM_PAY = "100";
        final String EMAIL = "test@mail.ru";

        driver.findElement(By.xpath("//input[@id='connection-phone']")).sendKeys(PHONE_NUMBER);
        driver.findElement(By.xpath("//input[@id='connection-sum']")).sendKeys(SUM_PAY);
        driver.findElement(By.xpath("//input[@id='connection-email']")).sendKeys(EMAIL);
        driver.findElement(By.xpath("//form[@id='pay-connection']/button")).click();;

        wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        WebElement iframe = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//iframe[@class='bepaid-iframe']")
        ));
        driver.switchTo().frame(iframe);

        WebElement paymentContainer = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@class='app-wrapper__content']")
        ));

        assertTrue(paymentContainer.isDisplayed());
    }
}
