package com.saucedemo.pages;

import com.saucedemo.utilities.Utility;
import org.openqa.selenium.By;

public class ProductPage extends Utility {

    By productsTitle = By.xpath("//span[text()='Products']");
    By allProductsList = By.className("inventory_item");

    public String verifyTitleOfProductsPage(){
        return getTextElement(productsTitle);
    }

    public int verifyNumberOfOfProductsDisplayed(){
        return getSizeOfElements(allProductsList);
    }
}
