package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy (id= "username")
    WebElement usernameElement;

    @FindBy(id= "password")
    WebElement passwordElement;

    @FindBy(id= " submit")
    WebElement submitBtn;


    public void openWebsite() {
        driver.get("http://18.118.14.155:8080/bank");
    }
    public void doLogin(String username, String password){
         usernameElement.sendKeys(username);
         passwordElement.sendKeys(password);
         submitBtn.click();
    }
}
