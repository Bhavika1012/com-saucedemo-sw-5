package com.saucedemo.pages;

import com.saucedemo.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By usernameField = By.id("user-name");
    By passwordField = By.id("password");
    By loginLink = By.id("login-button");
    By productText = By.xpath("//span[@class='title']");

    public void enterUsername(String username) {
        sendTextToElement(usernameField, username);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnButton() {
        clickOnElement(loginLink);
    }

    public String getProductText() {
        return getTextFromElement(productText);

    }

}
