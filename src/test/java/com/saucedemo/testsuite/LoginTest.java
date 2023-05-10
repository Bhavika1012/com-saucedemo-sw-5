package com.saucedemo.testsuite;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductPage;
import com.saucedemo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest { //This class is only for test methods
    //Object creation
    LoginPage loginPage = new LoginPage();
    ProductPage productPage = new ProductPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnButton();

        Assert.assertEquals(productPage.getProductText(), "Products");
    }

}
