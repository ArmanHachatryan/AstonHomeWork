package org.aston.exercise.utils.common;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

import static org.aston.exercise.utils.common.Config.PLATFORM_AND_BROWSER;
import static org.aston.exercise.utils.constants.Constant.TimeoutVariable.IMPLICIT_WAIT;

public class Singlton {
    private static Singlton instance;
    private static WebDriver driver;

    private Singlton() {
    }

    public static WebDriver getInstance() {
        if (instance == null) {
            instance = new Singlton();
        }
        return instance.createDriver();
    }

    private WebDriver createDriver() {
        if (driver == null) {
            switch (PLATFORM_AND_BROWSER) {
                case "win_chrome":
                    driver = new ChromeDriver();
                    break;
                case "win_firefox":
                    driver = new FirefoxDriver();
                    break;
                default:
                    Assertions.fail("Incorrect platform or browser name: " + PLATFORM_AND_BROWSER);
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT));
        }
        return driver;
    }
}
