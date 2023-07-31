package com.healthadvocate.android.glue;

import com.healthadvocate.android.utility.browserUtility;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class test  {

  /*  @Test
    public void test() throws Exception {
        WebElement searchElement = (WebElement) new WebDriverWait(browserUtility, Duration.ofSeconds(30)).until(
                ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Search Wikipedia")));

        searchElement.click();
        WebElement insertTextElement = (WebElement) new WebDriverWait(browserUtility, Duration.ofSeconds(30)).until(
                ExpectedConditions.elementToBeClickable(AppiumBy.id("org.wikipedia.alpha:id/search_src_text")));
        insertTextElement.sendKeys("BrowserStack");
        Thread.sleep(5000);

        List<WebElement> allProductsName = browserUtility.findElements(AppiumBy.className("android.widget.TextView"));
        Assert.assertTrue(allProductsName.size() > 0);
    }*/
}
