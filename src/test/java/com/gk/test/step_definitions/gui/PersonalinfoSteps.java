package com.gk.test.step_definitions.gui;

import com.gk.test.framework.helpers.Props;
import com.gk.test.framework.helpers.WebDriverHelper;
import com.gk.test.framework.helpers.utils.RandomGenerator;
import com.gk.test.page_objects.gui.MyShahidPage;
import com.gk.test.page_objects.gui.PaymentPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import static junit.framework.TestCase.fail;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by radiwaneh on 10/18/2017.
 */
public class PersonalinfoSteps {
    public static String NewPassword = RandomGenerator.randomAlphabetic(6);

    public static String ExpectedFirstName;
    public static String ExpectedLastName;

    private MyShahidPage MyShahidPage;


    public PersonalinfoSteps(MyShahidPage MyShahidPage) {
        this.MyShahidPage = MyShahidPage;
    }


    @And("^i click On Personal Profile Widget$")
    public void iClickOnPersonalProfileWidget() throws InterruptedException {
        MyShahidPage.clickProfileWidget();
        Thread.sleep(3000);

    }

    @And("^i click on update password link$")
    public void iClickOnUpdatePasswordLink() throws InterruptedException {
        Thread.sleep(3000);
        MyShahidPage.clickonupdatepasswordlink();
    }

    @And("^i enter old password \"([^\"]*)\" and new password and the confirmation of new password$")
    public void iEnterOldPasswordAndNewPasswordAndTheConfirmationOfNewPassword(String OldPass) {

        MyShahidPage.OldPassword().clear();
        MyShahidPage.OldPassword().sendKeys(OldPass);

        MyShahidPage.randomAlphanumeric(6);

        MyShahidPage.NewPassword().clear();
        MyShahidPage.NewPassword().sendKeys(NewPassword);


        MyShahidPage.ConfirmNewPassword().clear();
        MyShahidPage.ConfirmNewPassword().sendKeys(NewPassword);


    }

    @And("^i click on submit$")
    public void iClickOnSubmit() throws InterruptedException {
        MyShahidPage.clickonupdatepasswordlinksubmit();
        Thread.sleep(3000);
    }


    @And("^i enter old password x and new password \"([^\"]*)\" and the confirmation of new password")
    public void iEnterOldPasswordXAndNewPasswordAndTheConfirmationOfNewPassword(String NewPass) {
        MyShahidPage.OldPassword().clear();
        MyShahidPage.OldPassword().sendKeys(NewPassword);
        MyShahidPage.NewPassword().clear();
        MyShahidPage.NewPassword().sendKeys(NewPass);
        MyShahidPage.ConfirmNewPassword().clear();
        MyShahidPage.ConfirmNewPassword().sendKeys(NewPass);


    }

    @And("^i click Edit Profile Link$")
    public void iClickEditProfileLink() {
        MyShahidPage.iClickOnEditPersonalDataLink();
    }

    @And("^i change First Name \"([^\"]*)\"$")
    public void iChangeFirstName(String FirstName) {
        MyShahidPage.FirstName().clear();
        MyShahidPage.FirstName().sendKeys(FirstName);
        ExpectedFirstName= FirstName;
    }

    @And("^i change Last Name \"([^\"]*)\"$")
    public void iChangeLastName(String LastName) {
        MyShahidPage.LastName().clear();
        MyShahidPage.LastName().sendKeys(LastName);
        ExpectedLastName= LastName;
    }


    @And("^i change Month of birth$")
    public void iChangeMonthOfBirth() {

        MyShahidPage.profileMonthOfBirth();
    }

    @And("^i change Year of Birth$")
    public void iChangeYearOfBirth() {

        MyShahidPage.profileYearOfBirth();
    }

    @And("^i change the Female Gender$")
    public void iChangeTheGender() {
        MyShahidPage.FemaleGender();
       }

    @And("^i click on Save info$")
    public void iClickOnSaveInfo() {
        MyShahidPage.SaveInfo();
    }





    @Then("^i verify Editing Profile \"([^\"]*)\"$")
    public void iVerifyEditingProfile(String ValidationMessage) throws InterruptedException {
        assertThat(MyShahidPage.SuccessfulEditingInfoMessage()).contains(Props.getMessage(ValidationMessage));

    }

    @Then("^i Signoutt$")
    public void iSignoutt() throws InterruptedException {
        MyShahidPage.Signout2();
    }

    @And("^i Validate all changes made$")
    public void iValidateAllChangesMade() {
        //assertThat(MyShahidPage.ActualFullName().contains(ExpectedFirstName+ " " + ExpectedLastName));



        if (MyShahidPage.ActualFullName().contains(ExpectedFirstName+ " " + ExpectedLastName))
        {


        }else{ fail("failed");


        }
      }

    @And("^i validate error message for change password \"([^\"]*)\"$")
    public void iValidateErrorMessageForChangePassword(String ValidationErrorMessage)  {
        assertThat(MyShahidPage.ChangePasswordErrorMessage()).contains(Props.getMessage(ValidationErrorMessage));

    }
}
