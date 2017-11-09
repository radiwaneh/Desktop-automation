package com.gk.test.framework.helpers.screenshot_helper;

import com.gk.test.framework.PageObject;
import com.gk.test.page_objects.gui.PaymentPage;
import com.gk.test.step_definitions.gui.PaymentSteps;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

import static com.gk.test.framework.helpers.WebDriverHelper.getWebDriver;

public class ScreenshotHook extends PageObject {

    private static final Logger LOG = LoggerFactory.getLogger(ScreenshotHook.class);

    @After
    public void embedScreenshot(Scenario scenario) throws InterruptedException {
        try {
            Map<String, Object> screenShots = ScreenshotHelper.getScreenShotsForCurrentTest();
            for (Map.Entry<String, Object> screenShot : screenShots.entrySet()) {
                scenario.write(screenShot.getKey());
                scenario.embed((byte[]) screenShot.getValue(), "image/png");
            }

            ScreenshotHelper.tidyUpAfterTestRun();

            if (scenario.isFailed()) {
                scenario.write(getWebDriver().getCurrentUrl());
                byte[] screenShot = ((TakesScreenshot) getWebDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenShot, "image/png");

                PaymentPage PP = new PaymentPage();
                PaymentSteps PS = new PaymentSteps(PP);


                PS.setConditionBack();


            }

        } catch (WebDriverException | ClassCastException wde) {
            LOG.error(wde.getMessage());
        } finally {
            getWebDriver().switchTo().defaultContent();
        }
    }
}
