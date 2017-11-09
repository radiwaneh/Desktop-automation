package com.gk.test.step_definitions.gui;


import com.gk.test.page_objects.gui.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageSteps {

    private HomePage homePage;

    public HomePageSteps(HomePage homePage) {
        this.homePage = homePage;
    }


    @Given("^i click \"(.*?)\" on the Home Page$")
    public void i_click_on_the_Home_Page(String pageToNavigate) throws Throwable {
        if (pageToNavigate.equals("SIGN_IN")) {
            homePage.clickSignInLink();
        } else if (pageToNavigate.equals("SIGN_OUT")) {
            homePage.clickSignOutLink();
        }
    }


    @Then("^click BurgerMenu$")
    public void BurgerMenu()   {
        homePage.burgermenu();
    }

    @Then("^i validate the Logged in home page component$")
    public void iValidateTheLoggedInHomePageComponent()   {
       Assert.assertEquals("Login not working properly :  ", homePage.checkUserNameInHomePage(), true);


    }
}