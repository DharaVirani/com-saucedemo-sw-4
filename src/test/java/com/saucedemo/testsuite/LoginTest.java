package com.saucedemo.testsuite;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductPage;
import com.saucedemo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    LoginPage loginPage = new LoginPage();
    ProductPage productPage = new ProductPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        //* Enter “standard_user” username
        loginPage.enterUsername("standard_user");
        //* Enter “secret_sauce” password
        loginPage.enterPassword("secret_sauce");
        //* Click on ‘LOGIN’ button
        loginPage.clickOnLoginButton();
        //* Verify the text “PRODUCTS”
        Assert.assertEquals(productPage.verifyTitleOfProductsPage(),"Products");
    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage(){
        //* Enter “standard_user” username
        loginPage.enterUsername("standard_user");
        //* Enter “secret_sauce” password
        loginPage.enterPassword("secret_sauce");
        //* Click on ‘LOGIN’ button
        loginPage.clickOnLoginButton();
        //* Verify that six products are displayed on page
        Assert.assertEquals(productPage.verifyNumberOfOfProductsDisplayed(),6);
    }
}
