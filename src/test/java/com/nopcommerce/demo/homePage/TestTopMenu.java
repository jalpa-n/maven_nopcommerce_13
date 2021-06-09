package com.nopcommerce.demo.homePage;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTopMenu extends TestBase {
    HomePage homePage = new HomePage();


    @Test
    public void selectMenuAndClick(){

        String expectedText = homePage.selectMenu("Computers");
        String actualText = homePage.getActualText();
        Assert.assertEquals(expectedText,actualText);

    }


}