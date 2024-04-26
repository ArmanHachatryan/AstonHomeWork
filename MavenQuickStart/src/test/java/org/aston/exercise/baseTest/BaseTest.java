package org.aston.exercise.baseTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.aston.exercise.pages.MainPage;
import org.aston.exercise.utils.DriverInstance;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected static AndroidDriver<AndroidElement> driver;


    @BeforeClass
    public static void setup() {
        driver = DriverInstance.getDriver();
    }

    @AfterClass
    public static void teardown() {
        DriverInstance.quit();
    }
}
