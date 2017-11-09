package com.gk.test.step_definitions.gui;


import com.gk.test.framework.helpers.UrlBuilder;
import com.gk.test.framework.helpers.WebDriverHelper;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

public class NavigationSteps {


    @Given("^i navigate to the Shahid \"(.*?)\" page$")
    public void i_navigate_to_the_Shahid_page(String pageName) throws Throwable {
        if (pageName.equals("HOME")) {
            UrlBuilder.startAtHomePage();
        }
    }


    @And("^Switch Driver to Widget IFrame$")
    public void switchDriverToWidgetIFrame() throws InterruptedException {
        WebDriverHelper.switchToWidgetIframe();
    }

    @And("^Switch Driver to Default IFrame$")
    public void switchDriverToDefaultIFrame() throws InterruptedException {
        WebDriverHelper.switchToDefaultIframe();
    }



}