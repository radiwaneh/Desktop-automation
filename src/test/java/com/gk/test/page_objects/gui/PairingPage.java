package com.gk.test.page_objects.gui;

import com.gk.test.framework.PageObject;
import org.openqa.selenium.By;

/**
 * Created by radiwaneh on 10/30/2017.
 */
public class PairingPage extends PageObject {

    private By DeviceManagement = By.xpath("//*[@id=\"promoForm\"]/div[5]/div[3]/a/span[2]");
    private By DeviceManagementVerification = By.xpath("//*[@id=\"widget-content\"]/div[2]/h4");


    public void DeviceManagement() {
        waitForExpectedElement(DeviceManagement).click();
    }
    public String DeviceManagementVerification() {
        return waitForExpectedElement(DeviceManagementVerification).getText();
    }



}
