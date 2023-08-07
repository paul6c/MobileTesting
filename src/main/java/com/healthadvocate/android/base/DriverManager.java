package com.healthadvocate.android.base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverManager {

    private static final ThreadLocal<AppiumDriver> driver = new ThreadLocal<>();
    public static AppiumDriver getDriver(){ return driver.get();}
    public static void setDriver(AppiumDriver driver1){ driver.set(driver1);}


    public static void initializeDriver() throws MalformedURLException {
        AppiumDriver driver;

        String userName = "paulcuezon_UsbVy2";
        String accessKey = "2E7KCmD7keop1kC8omxq";


        MutableCapabilities capabilities = new UiAutomator2Options();

        System.out.println(capabilities.getCapability("platformName"));
        URL url = new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub");
        driver = new AndroidDriver(url,capabilities);

        setDriver(driver);
    }
}
