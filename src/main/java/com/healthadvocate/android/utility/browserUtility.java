package com.healthadvocate.android.utility;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.MutableCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class browserUtility {
/*    public AppiumDriver driver;

    public void setUp() throws Exception {
        MutableCapabilities capabilities = new UiAutomator2Options();
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
    }

    public void tearDown() throws Exception {
        driver.quit();
    }*/

    public static AndroidDriver getAndroidDriver() throws MalformedURLException {
        AndroidDriver androidDriver = null;

        try {
            MutableCapabilities capabilities = new UiAutomator2Options();
            androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        }catch (MalformedURLException e){
            e.printStackTrace();
        }
        return androidDriver;
    }
}
