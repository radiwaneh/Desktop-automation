package com.gk.test.page_objects.gui;

import com.gk.test.framework.PageObject;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by radiwaneh on 10/18/2017.
 */
public class MyShahidPage extends PageObject {


    private By clickProfileWidget = By.xpath("//*[@id=\"promoForm\"]/div[5]/div[1]/a");

    private By changepasswordlink = By.id("updatePassword");
    private By iClickOnEditPersonalDataLinkk = By.id("profileEdit");
    private By changepasswordsubmitlink = By.id("forgotPassSubmit");
    private By OldPassword = By.id("updateOldPassword");
    private By NewPassword = By.id("updateNewPassword");
    private By ConfirmNewPassword = By.id("updateNewPasswordConfirmation");
    private By FirstName = By.id("profileFirstName");
    private By LastName = By.id("profileLastName");
    private By FemaleGender = By.xpath("//*[@id=\"profileForm\"]/div[7]/div[2]/div[2]/label");
    private By SaveInfo = By.id("profileSubmit");
    private By SuccessfulEditingInfoMessage = By.xpath("//*[@id=\"formGeneralMsgs\"]/ul/li");

    private By profileMonthOfBirth = By.xpath("//*[@id=\"profileMonthOfBirth\"]//option[2]");
    private By profileYearOfBirth = By.xpath("//*[@id=\"profileYearOfBirth\"]//option[2]");

    private By ChangePasswordErrorMessage = By.xpath("//*[@id=\"formGeneralMsgs\"]/ul/ul/li");

    private By Signout1 = By.xpath("//*[@id=\"appRoot\"]/div/div/header/div/div[2]/span/div/div[2]/div[2]/div/a");
    private By Signout2 = By.xpath("//*[@id=\"appRoot\"]/div/div/header/div/div[2]/span/div/div[2]/div[2]/span/div/div/a[4]");

    private By ActualFirstName = By.xpath("//*[@id=\"userProfileForm\"]/div[3]/li[1]/span");


    public void clickProfileWidget() {
        waitForExpectedElement(clickProfileWidget).click();
    }

    public void clickonupdatepasswordlink() {

        waitForExpectedElement(changepasswordlink).click();
    }

    public void iClickOnEditPersonalDataLink() {

        waitForExpectedElement(iClickOnEditPersonalDataLinkk).click();
    }
    public void clickonupdatepasswordlinksubmit() {

        waitForExpectedElement(changepasswordsubmitlink).click();
    }

    public WebElement OldPassword() {
        return waitForExpectedElement(OldPassword);
    }

    public WebElement NewPassword() {
        return waitForExpectedElement(NewPassword);
    }

    public WebElement ConfirmNewPassword() {
        return waitForExpectedElement(ConfirmNewPassword);
    }

    public String randomAlphanumeric(Integer length) {
        return RandomStringUtils.randomAlphanumeric(length);

    }

    public WebElement FirstName() {
        return waitForExpectedElement(FirstName);
    }

    public WebElement LastName() {
        return waitForExpectedElement(LastName);
    }
    public void FemaleGender() {

        waitForExpectedElement(FemaleGender).click();
    }
    public void profileMonthOfBirth() {waitForExpectedElement(profileMonthOfBirth).click();}
    public void profileYearOfBirth() {waitForExpectedElement(profileYearOfBirth).click();}

    public void SaveInfo() {

        waitForExpectedElement(SaveInfo).click();
        waitForExpectedElement(SaveInfo).click();
    }
    public void Signout2() throws InterruptedException {
        waitForExpectedElement(Signout1).click();
        Thread.sleep(3000);
        waitForExpectedElement(Signout2).click();
    }

    public String SuccessfulEditingInfoMessage() {
        return waitForExpectedElement(SuccessfulEditingInfoMessage).getText();
    }
    public String ActualFullName() {
        return waitForExpectedElement(ActualFirstName).getText();
    }

    public String ChangePasswordErrorMessage() {
        return waitForExpectedElement(ChangePasswordErrorMessage).getText();
    }


}
