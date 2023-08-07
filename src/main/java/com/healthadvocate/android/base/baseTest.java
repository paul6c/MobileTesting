package com.healthadvocate.android.base;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.sql.Driver;

public class baseTest {

    @BeforeTest
    public void beforeTest() throws MalformedURLException {
        DriverManager.initializeDriver();
        System.out.println("Running ... ");
    }

    @AfterTest
    public void quit(){
        if(DriverManager.getDriver() != null){
            DriverManager.getDriver().quit();
        }
    }
}
