package com.gk.test.page_objects.gui;

import com.gk.test.framework.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by radiwaneh on 10/11/2017.
 */
public class ForgetPasswordPage extends PageObject {

    private static By EmailText = By.id("forgotPassEmail");

    private By CaptchaText = By.id("ForgotPassCaptchaAnswer");

    private By wrongCaptchaerrorMessage = By.xpath("//*[@id=\"forgotPassForm\"]/div[2]/div");

    private By emptyCaptchaerrorMessage = By.xpath("//*[@id=\"forgotPassForm\"]/div[5]/div");

    private By emailerrorMessage = By.cssSelector("#formGeneralMsgs > ul:nth-child(\\n) > li");

    private By passerrorMessage = By.cssSelector("#formGeneralMsgs > ul:nth-child(1) > ul:nth-child(1) > li:nth-child(1)");

    private By validEmailValidCaptcha = By.xpath("//*[@id=\"formGeneralMsgs\"]/ul/li");


    private By  validEmailFormatInvalidCaptchaErrorMessage = By.xpath("//*[@id=\"formGeneralMsgs\"]/ul/li");

    public WebElement EmailText() {
      return waitForExpectedElement(EmailText);
    }

    public WebElement CaptchaText() {
        return waitForExpectedElement(CaptchaText);
    }

    private By clickSubmitButton = By.id("forgotPassSubmit");
    public void clickSubmitButton() {
        waitForExpectedElement(clickSubmitButton).click();
    }

    public String getwrongCaptchaerrorMessage() {
        return waitForExpectedElement(wrongCaptchaerrorMessage).getText();
    }

    public String getemptyCaptchaerrorMessage() {
        return waitForExpectedElement(emptyCaptchaerrorMessage).getText();
}
    public String forgetPassEmailerrorMessage() {
        return waitForExpectedElement(emailerrorMessage).getText();
    }
    public String passerrorMessage() {
        return waitForExpectedElement(passerrorMessage).getText();
    }
    public String InvalidEmailFormaterrorMessage() {
        return waitForExpectedElement(wrongCaptchaerrorMessage).getText();
    }
    public String validEmailFormatInvalidCaptchaErrorMessage() {
        return waitForExpectedElement(validEmailFormatInvalidCaptchaErrorMessage).getText();
    }
    public String validEmailValidCaptcha() {
        return waitForExpectedElement(validEmailValidCaptcha).getText();
    }
}
