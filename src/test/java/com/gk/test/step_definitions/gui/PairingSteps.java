package com.gk.test.step_definitions.gui;

import com.gk.test.framework.PageObject;
import com.gk.test.framework.helpers.Props;
import com.gk.test.page_objects.gui.PairingPage;
import com.gk.test.page_objects.gui.SignInOrRegisterPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by radiwaneh on 10/30/2017.
 */

public class PairingSteps {

    private PairingPage pairingPage;

    public PairingSteps(PairingPage pairingPage) {this.pairingPage = pairingPage;}

    @And("^i Click on DeviceManagement$")
    public void i_click_on_Register_for_New_Registration()   {
        pairingPage.DeviceManagement();
    }


    @And("^i Validate Pairing Page Component \"([^\"]*)\"$")
    public void iValidatePairingPageComponent(String ParingPageObject){
        assertThat(pairingPage.DeviceManagementVerification()).contains(Props.getMessage(ParingPageObject));

    }
}
