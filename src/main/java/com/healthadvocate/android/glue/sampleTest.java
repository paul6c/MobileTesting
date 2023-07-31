package com.healthadvocate.android.glue;

import com.healthadvocate.android.pages.OrganizationPage;
import com.healthadvocate.android.utility.*;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;

import java.net.MalformedURLException;

public class sampleTest {

    @Test
    public void test() throws MalformedURLException {
        AndroidDriver driver = browserUtility.getAndroidDriver();

        OrganizationPage op = new OrganizationPage(driver);
        op.clickElement();

    }
}
