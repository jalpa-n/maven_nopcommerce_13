package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {

    By computersLink = By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']");
    By electronicsLink = By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics ']");
    By apparelLink = By.xpath("//ul[@class='top-menu notmobile']//a[text()='Apparel ']");
    By digitalDownloadLink = By.xpath("//ul[@class='top-menu notmobile']//a[text()='Digital downloads ']");
    By booksLink = By.xpath("//ul[@class='top-menu notmobile']//a[text()='Books ']");
    By jewelryLink = By.xpath("//ul[@class='top-menu notmobile']//a[text()='Jewelry ']");
    By giftCardLink = By.xpath("//ul[@class='top-menu notmobile']//a[text()='Gift Cards ']");
    By titleText = By.xpath("//div[@class='page-title']");


    public String selectMenu(String menu) {

        List<WebElement> menuList = driver.findElements(By.xpath("//div[@class='header-menu']/ul[1]/li/a"));
        String expectedText = null;

        for (WebElement element : menuList) {
            if (element.getText().equalsIgnoreCase(menu)) {
                expectedText = element.getText();
                element.click();
                break;
            }
        }
        return expectedText;
    }

    public String getActualText (){

        return waitUntilVisibilityOfElementLocated(titleText,50).getText();
    }

}
