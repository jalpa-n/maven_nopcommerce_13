package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class DesktopPages extends Utility {

By sortByfilter = By.xpath("//select[@id='products-orderby']");
By buildYourOwnComputer = By.xpath("//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/1/1/1\"),!1']");

    public void sortByZToA(){
        selectByValueFromDropDown(waitUntilVisibilityOfElementLocated(sortByfilter,50),"6");
    }

    public List<String> verifyProductSortedByZToAFilter() throws InterruptedException {

        List<WebElement> productList = driver.findElements(By.xpath("//div[@class='product-grid']//h2"));
        List<String> productNameList = new ArrayList<>();

        for(WebElement name : productList){
            productNameList.add(name.getText());
        }
        return productNameList;
    }

    public void sortByAtoZ(){

        selectByValueFromDropDown(waitUntilVisibilityOfElementLocated(sortByfilter,50),"5");
    }

    public void addProductToCart (){

        clickOnElement(waitUntilVisibilityOfElementLocated(buildYourOwnComputer,80));
    }

}