package com.gk.test.page_objects.gui;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
/**
 * Created by radiwaneh on 10/15/2017.
 */
public class Login {



    @FindBy(how = How.XPATH, using = "//*[@id=\"loginEmail\"]")
    public WebElement txtEmail;

    @FindBy(how = How.XPATH, using = "//*[@id=\"loginPassword\"]")
    public WebElement txtPassword;

    @FindBy(how = How.XPATH, using = "//*[@id=\"LoginForm\"]/div[8]")
    public WebElement btnLogin;

    @FindBy(how = How.XPATH, using = "//*[@id=\"loginCaptchaAnswer\"]")
    public WebElement objTxtCaptcha ;


    public void loginDataEntry(String email, String password) {
        txtEmail.click();
        txtEmail.clear();
        txtEmail.sendKeys(email);
        txtEmail.click();
        txtEmail.clear();
        txtEmail.sendKeys(email);
        txtPassword.click();
        txtPassword.clear();
        txtPassword.sendKeys(password);
    }

}
