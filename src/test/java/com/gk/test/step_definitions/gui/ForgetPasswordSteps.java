package com.gk.test.step_definitions.gui;

import com.gk.test.framework.helpers.Props;
import com.gk.test.page_objects.gui.ForgetPasswordPage;
import com.gk.test.page_objects.gui.HomePage;
import com.gk.test.page_objects.gui.SignInOrRegisterPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by radiwaneh on 10/11/2017.
 */


public class ForgetPasswordSteps {

    private ForgetPasswordPage ForgetPasswordPage;

    public ForgetPasswordSteps(ForgetPasswordPage forgetPasswordPage) {
        this.ForgetPasswordPage = forgetPasswordPage;
    }


    @And("^i enter Email \"([^\"]*)\"$")
    public void iEnterEmail(String EmailTXT) {
           ForgetPasswordPage.EmailText().sendKeys(EmailTXT);

    }
    @And("^i enter Captcha \"([^\"]*)\"$")
    public void iEnterCaptcha(String Captcha) throws InterruptedException {
        Thread.sleep(3000);
        ForgetPasswordPage.CaptchaText().sendKeys(Captcha);
    }

    @And("^i click on Submit button on the ForgetPassword Page$")
    public void iClickOnSubmitButtonOnTheForgetPasswordPage() throws InterruptedException {
        ForgetPasswordPage.clickSubmitButton();
        Thread.sleep(3000);
    }

    @Then("^i can see the validation message for invalid captcha \"(.*?)\"$")
    public void i_can_see_the_validation_message (String expectedErrorMessage)  {
        assertThat(ForgetPasswordPage.getwrongCaptchaerrorMessage()).contains(Props.getMessage(expectedErrorMessage));

    }

    @Then("^i can see the validation message for empty captcha \"([^\"]*)\"$")
    public void iCanSeeTheValidationMessageForEmptyCaptcha(String expectedErrorMessage)  {
        assertThat(ForgetPasswordPage.getemptyCaptchaerrorMessage()).contains(Props.getMessage(expectedErrorMessage));

    }

    @Then("^i can see the validation message on email \"([^\"]*)\"$")
    public void iCanSeeTheValidationMessageOnEmail(String expectedErrorMessage)  {
        assertThat(ForgetPasswordPage.forgetPassEmailerrorMessage()).contains(Props.getMessage(expectedErrorMessage));

    }


    @Then("^i can see the validation message on password \"([^\"]*)\"$")
    public void iCanSeeTheValidationMessageOnPassword(String expectedErrorMessage) throws Throwable {
        assertThat(ForgetPasswordPage.passerrorMessage()).contains(Props.getMessage(expectedErrorMessage));      }


    @Then("^i can see the validation message for Invalid Email format\"([^\"]*)\"$")
    public void iCanSeeTheValidationMessageForInvalidEmailFormat(String expectedErrorMessage)  {
        assertThat(ForgetPasswordPage.InvalidEmailFormaterrorMessage()).contains(Props.getMessage(expectedErrorMessage));
    }

    @Then("^i can see the validation message for valid Email with invalid captcha\"([^\"]*)\"$")
    public void iCanSeeTheValidationMessageForValidEmailWithInvalidCaptchaString (String expectedErrorMessage)  {
        assertThat(ForgetPasswordPage.validEmailFormatInvalidCaptchaErrorMessage()).contains(Props.getMessage(expectedErrorMessage));

    }

    @Then("^i can see the validation message for successful action \"([^\"]*)\"$")
    public void iCanSeeTheValidationMessageForSuccessfulAction(String SucessfulAction)  {
        assertThat(ForgetPasswordPage.validEmailValidCaptcha()).contains(Props.getMessage(SucessfulAction));
    }
}
