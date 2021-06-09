package com.nopcommerce.demo.utility;

import com.nopcommerce.demo.basepage.BasePage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Utility extends BasePage {
    /**
     * This method will click on element
     * @param by
     */
    public void clickOnElement(By by){

        driver.findElement(by).click();
    }

    public void clickOnElement(WebElement element){

        element.click();
    }




    /**
     * This method will get text from element
     * @param by
     * @return
     */
    public String getTextFromElement(By by){

        return driver.findElement(by).getText();

    }


    public String getTextFromElement(WebElement element){

        return element.getText();
    }




    /**
     * This method will send text on element
     * @param by
     * @param text
     */


    public void sendTextToElement(By by,String text){

        driver.findElement(by).sendKeys(text);
    }

    public void sendTextToElement(WebElement element,String text){

        element.sendKeys(text);
    }





    /**
     * This method will select by value from dropdown
     * @param by
     * @param value
     */

    public void selectByValueFromDropDown (By by, String value){

        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }
    public void selectByValueFromDropDown (WebElement element, String value){

        Select select = new Select(element);
        select.selectByValue(value);
    }
    public void selectByVisibleText(By by,String visibleText){
        Select select=new Select(driver.findElement(by));
        select.selectByVisibleText(visibleText);
    }
    public void selectByVisibleText(WebElement element,String visibleText){
        Select select=new Select(element);
        select.selectByVisibleText(visibleText);
    }
    public void selectByIndex(By by,int index){
        Select select=new Select(driver.findElement(by));
        select.selectByIndex(index);
    }

    public void selectByIndex(WebElement element,int index){
        Select select=new Select(element);
        select.selectByIndex(index);
    }



    /**
     * this method change the quantity of selected element
     * @param by
     * @param quantity
     */
    public void changeQuantityOnElement(By by,String quantity){

        WebElement quantityElement=driver.findElement(by);
        quantityElement.clear();
        quantityElement.sendKeys(quantity);
    }

    public void changeQuantityOnElement(WebElement element ,String quantity){

        WebElement quantityElement= element;
        quantityElement.clear();
        quantityElement.sendKeys(quantity);
    }





    /**
     * This method used to scroll down the page
     * @param by
     * @param yAxis
     */
    public void scrollDown(By by,int yAxis){

        Actions actions=new Actions(driver);
        WebElement slider=driver.findElement(by);

        actions.dragAndDropBy(slider,0,yAxis).build().perform();
    }

    public void scrollDown(WebElement element,int yAxis){

        Actions actions=new Actions(driver);
        WebElement slider = element;

        actions.dragAndDropBy(slider,0,yAxis).build().perform();

    }




    /**
     * This method will used to hover mouse on element
     */
    public void mouseHoverToElement(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).build().perform();
    }

    public void mouseHoverToElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }


    /**
     * this method will used to wait until element located
     */

    public WebElement waitUntilVisibilityOfElementLocated(By by, int timeout){

        WebDriverWait wait = new WebDriverWait(driver,timeout);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        return element;
    }

}

