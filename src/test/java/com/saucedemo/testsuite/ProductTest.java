package com.saucedemo.testsuite;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductPage;
import com.saucedemo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductTest extends BaseTest {

    ProductPage productPage = new ProductPage();
    LoginPage loginpage= new LoginPage();

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage(){
        loginpage.enterUsername("standard_user");
        loginpage.enterPassword("secret_sauce");
        loginpage.clickOnButton();
        // Assert.assertEquals(productPage.getProductText(),"Products");
        String productPerPage = "6";

        Assert.assertEquals(productPage.getProductPerPage(),productPerPage);


    }



}
