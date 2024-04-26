package org.aston.exercise.pages.basePage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.aston.exercise.utils.DriverInstance;

public class BasePage {
    protected AndroidDriver<AndroidElement> driver = DriverInstance.getDriver();
}
