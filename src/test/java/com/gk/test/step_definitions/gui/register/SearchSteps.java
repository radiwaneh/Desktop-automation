package com.gk.test.step_definitions.gui.register;

import com.gk.test.framework.helpers.Props;
import com.gk.test.framework.helpers.utils.KeyboardActions;
import com.gk.test.page_objects.gui.SearchPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import java.awt.*;

import static com.sun.jmx.snmp.ThreadContext.contains;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by radiwaneh on 10/15/2017.
 */
public class SearchSteps {

    private SearchPage SearchPage;
    public static String SearchValidationText;
    public SearchSteps(SearchPage SearchPage) {
        this.SearchPage = SearchPage;
    }

    @And("^i click on search button$")
    public void iClickOnSearchButton()   {

        SearchPage.clickSearchButton();
    }

    @And("^i fill search bar with \"([^\"]*)\"$")
    public void iFillSearchBarWith(String SearchText)  {
        SearchPage.SearchBarText().clear();
        SearchPage.SearchBarText().sendKeys(SearchText);
        SearchValidationText = SearchText;
        }



    @And("^I click enter button after filling search bar$")
    public void iClickEnterButtonAfterFillingSearchBar() throws AWTException, InterruptedException {

        KeyboardActions.clickenter();

    }


    @Then("^i validate the component$")
    public void iValidateTheComponent() {
     assertThat(SearchPage.SearchValidationResult().contains(SearchValidationText));
    }

    @Then("^i validate the component the error message \"([^\"]*)\"$")
    public void iValidateTheComponentTheErrorMessage(String errormessage) {
        assertThat(SearchPage.SearchValidationErrorMessage()).contains(Props.getMessage(errormessage));
    }


    @And("^I pick the first option$")
    public void iPickTheFirstOption() {

        SearchPage.FirstOptionClick();

    }

    @Then("^i validate the Video$")
    public void iValidateTheVideo() {

        assertThat(SearchPage.VideoTitle().contains(SearchValidationText));


    }
}
