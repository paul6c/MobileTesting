package com.healthadvocate.android.pages;

import com.healthadvocate.android.pages.BasePage.basePage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import org.openqa.selenium.WebElement;

public class OrganizationPage extends basePage {

    public OrganizationPage(AndroidDriver driver){
        super(driver);
    }

    @AndroidBy(id = "Search Wikipedia")
    private WebElement searchElement;

    @AndroidBy(id = "org.wikipedia.alpha:id/search_src_text")
    private WebElement insertTextElement;

    public void clickElement(){
        searchElement.click();
    }

}
