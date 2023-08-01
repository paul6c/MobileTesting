package com.healthadvocate.android.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class developerModePage {

    AndroidDriver driver;

    public developerModePage(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @AndroidBy(className = "android.widget.ImageView")
    WebElement dropdown;

    public void clickDropdown(){
        dropdown.click();
    }
}
