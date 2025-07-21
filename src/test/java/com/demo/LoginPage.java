package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    // Locators
    By usernameField = By.id("username");
    By passwordField = By.id("password");
    By loginButton   = By.id("login");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String uname) {
        driver.findElement(usernameField).sendKeys(uname);
    }

    public void enterPassword(String pwd) {
        driver.findElement(passwordField).sendKeys(pwd);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public void loginAs(String uname, String pwd) {
        enterUsername(uname);
        enterPassword(pwd);
        clickLogin();
    }
}
