package com.gk.test.page_objects.gui;

import com.gk.test.framework.PageObject;
import org.openqa.selenium.By;

/**
 * Sample page object class which defines all the elements for a specific page.
 * Every  Class which contains page objects should extend "PageObject" class
 * This gives access to the webdriver object and utility methods
 * USE CSS,ID,NAME,CLASSNAME selectors instead of xpath
 */
public class HomePage extends PageObject {

    private By headerSignInLink = By.xpath("//a[@href='/ar/widget/login']");
    private By headerLogoutLink = By.id("headerLogout");
    private By burgermenu = By.xpath("//*[@id=\"appRoot\"]/div/div/header/div/div[2]/span/div/div[2]/div[2]/div/a");
    public By userNameLoggedIn = By.xpath("//a[@href='/ar/widget/dashboard']");

    public void clickSignInLink() {
        waitForExpectedElement(headerSignInLink).click();
    }

    public void clickSignOutLink() {
        waitForExpectedElement(headerLogoutLink).click();

    }

    public void burgermenu() {
        waitForExpectedElement(burgermenu).click();
            }

    public  boolean checkUserNameInHomePage(){
       boolean element = waitForExpectedElement(userNameLoggedIn).isDisplayed();

       return element;
    }








}
