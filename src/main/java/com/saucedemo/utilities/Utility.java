package com.saucedemo.utilities;


import com.saucedemo.browserfactory.ManageBrowser;
import org.openqa.selenium.By;

/**
 * Created by Jay Vaghani
 */
public class Utility extends ManageBrowser {
    /**
     * This method will click on element
     */
    public void clickOnElement(By by){  //locator return type is By and by is variable
        driver.findElement(by).click();
    }
    /**
     * This method will send keys to element
     */
    public void sendTextToElement(By by, String text){
      driver.findElement(by).sendKeys(text);
    }
    /**
     * This method will get text from element
     */
    public String getTextElement(By by){
        return driver.findElement(by).getText();
    }

    /**
     * This method is to get size of the elements
     */

    public int getSizeOfElements(By by){
        return driver.findElements(by).size();
    }








}







