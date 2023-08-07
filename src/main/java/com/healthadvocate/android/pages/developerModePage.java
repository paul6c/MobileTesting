package com.healthadvocate.android.pages;

import com.healthadvocate.android.base.basePage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class developerModePage extends basePage {



    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView[1]")
    private WebElement APIdropdown;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView[2]")
    private WebElement PortalUrlDropdown;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]")
    private WebElement StagingAPI;

    public developerModePage clickAPIdropdown(){
        WebElement button = wait.until(ExpectedConditions.visibilityOf(APIdropdown));
        button.click();
        return this;
    }
    public developerModePage clickPortaUrlDropdown(){
        WebElement button = wait.until(ExpectedConditions.visibilityOf(PortalUrlDropdown));
        button.click();
        return this;
    }

    public developerModePage selectStaging(){
        WebElement staging = wait.until(ExpectedConditions.visibilityOf(StagingAPI));
        return this;
    }
}
