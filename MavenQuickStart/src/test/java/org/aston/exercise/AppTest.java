package org.aston.exercise;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest
{
    AndroidDriver<AndroidElement> driver = null;

    public void initialize() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 7 Pro");
        capabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\winne\\Downloads\\Calculator_8.4.1 (520193683)_Apkpure.apk");

        capabilities.setCapability(MobileCapabilityType.NO_RESET,true);
        try {
            driver = new AndroidDriver<>(new
                    URL("http://127.0.0.1:4723/wd/hub"),capabilities);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void checkCalculate() {
        initialize();
        driver.findElementById("com.google.android.calculator:id/digit_3").click();

        driver.findElementById("com.google.android.calculator:id/op_add").click();
        driver.findElementById("com.google.android.calculator:id/digit_9").click();

        driver.findElementById("com.google.android.calculator:id/eq").click();
        assertEquals("12", driver.findElementById("com.google.android.calculator:id/result_final").getText());
    }
}
