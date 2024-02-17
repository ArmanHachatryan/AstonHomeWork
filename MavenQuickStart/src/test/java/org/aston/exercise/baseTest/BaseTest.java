package org.aston.exercise.baseTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.aston.exercise.pages.MainPage;
import org.aston.exercise.utils.DriverInstance;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.support.PageFactory;

import java.nio.file.Path;

public class BaseTest {
    protected static AndroidDriver<AndroidElement> driver;
    protected MainPage mainPage = PageFactory.initElements(driver, MainPage.class);

    @BeforeAll
    public static void setup() {
        driver = DriverInstance.getDriver();
    }

    @AfterAll
    public static void teardown() {
        DriverInstance.quit();
    }
}
