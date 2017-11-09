package com.gk.test.page_objects.gui;
import com.gk.test.framework.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by radiwaneh on 10/15/2017.
 */
public class SearchPage extends PageObject {


    private By searchButton = By.xpath("//*[@id=\"appRoot\"]/div/div/header/div/div[2]/span/div/div[2]/div[1]/div/img");
    private By SearchBarText = By.xpath("//*[@id=\"appRoot\"]/div/div/header/div/div[2]/span/div/div[2]/div[1]/div/div[2]/input");
    private By SearchValidationResult = By.xpath("//*[@id=\"appRoot\"]/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/a/h1");
    private By SearchValidationErrorMessage = By.xpath("//*[@id=\"appRoot\"]/div/div/div[1]/div/div/div/div/header/h2");
    private By FirstOptionClick = By.xpath("//*[@id=\"appRoot\"]/div/div/header/div/div[2]/span/div/div[2]/div[1]/div/ul/li[1]/a");
    private By VideoTitle = By.xpath("//*[@id=\"appRoot\"]/div/div/div[1]/div/div/div/div/div[2]/div[1]/div[2]/div[1]/div[2]/h2");



    public void clickSearchButton() {
        waitForExpectedElement(searchButton).click();
    }

    public WebElement SearchBarText() {
        return waitForExpectedElement(SearchBarText);
    }

    public String SearchValidationResult() {
        return waitForExpectedElement(SearchValidationResult).getText();

    }

    public String SearchValidationErrorMessage() {
        return waitForExpectedElement(SearchValidationErrorMessage).getText();

    }
    public void FirstOptionClick() {
        waitForExpectedElement(FirstOptionClick).click();
    }

    public String VideoTitle() {
        return waitForExpectedElement(VideoTitle).getText();

    }
}
