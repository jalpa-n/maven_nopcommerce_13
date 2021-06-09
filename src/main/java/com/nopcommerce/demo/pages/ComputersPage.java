package com.nopcommerce.demo.pages;



import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ComputersPage extends Utility {

    HomePage homePage = new HomePage();
    By desktopLink = By.xpath("//h2[@class='title']/a[@href='/desktops']");

    public void clickOnComputer(){
        clickOnElement(waitUntilVisibilityOfElementLocated(homePage.computersLink,80));
    }

    public void clickOnDesktop(){
        clickOnElement(waitUntilVisibilityOfElementLocated(desktopLink,80));
    }


}
