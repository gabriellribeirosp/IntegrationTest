package br.com.outseara.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class LoginMobilePage {

    private AndroidDriver<MobileElement> driver;

    public LoginMobilePage(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
    }

    private By usernameInput = By.id("test-Username");
    private By passwordInput = By.id("test-Password");
    private By loginButton = By.id("test-LOGIN");

    public void enterUsername(String username) {
        driver.findElement(usernameInput).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void tapLogin() {
        driver.findElement(loginButton).click();
    }
}