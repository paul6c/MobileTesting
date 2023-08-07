package com.healthadvocate.android.test;

import com.healthadvocate.android.base.basePage;
import com.healthadvocate.android.base.baseTest;
import com.healthadvocate.android.pages.developerModePage;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;

public class developerPage extends baseTest {

    @Test
    public void testOne(){
        developerModePage dmp = new developerModePage();
        dmp.clickAPIdropdown();
        dmp.selectStaging();
        dmp.clickPortaUrlDropdown();
    }

}
