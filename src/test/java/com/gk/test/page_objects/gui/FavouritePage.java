package com.gk.test.page_objects.gui;

import com.gk.test.framework.PageObject;
import com.gk.test.framework.helpers.WebDriverHelper;
import org.openqa.selenium.By;

/**
 * Created by radiwaneh on 11/6/2017.
 */
public class FavouritePage extends PageObject {

    private By favouriteListPage = By.xpath("//*[@id=\"appRoot\"]/div/div/header/div/div[2]/span/div/div[2]/div[2]/span/div/div/a[2]");
    private By favouriteListPageFavouriteButtonOnSeries = By.xpath("//*[@id=\"appRoot\"]/div/div/div[1]/div/div/div/div/div/div/div[2]/div/div/div/div/div/div/div/a");
    private By favouriteListPageFavouriteButtonOnMovie = By.xpath("//*[@id=\"appRoot\"]/div/div/div[1]/div/div/div/div/div/div/div[2]/div/div/div/div/div/div/div/a/img");
    private By favouriteListPageFavouriteButtonOnProgram = By.xpath("//*[@id=\"appRoot\"]/div/div/div[1]/div/div/div/div/div/div/div[2]/div/div/div/div/div/div/div/a");

    private By InfoPlayerButton = By.xpath("//*[@id=\"appRoot\"]/div/div/div[1]/div/div/div/div/div[2]/div[1]/div[2]/div[1]/div[1]/button/img");
    private By PlayerFavouriteButton = By.xpath("//*[@id=\"fav-button\"]/img");
    private By favouriteListPageMessage = By.xpath("//*[@id=\"appRoot\"]/div/div/div[1]/div/div/div/div/div/div/h4");
    private By HomePageVideo = By.xpath("//*[@id=\"appRoot\"]/div/div/div[1]/div/div/div/div/div[2]/div/div/div/div/div[2]/div/div/a/div");
    private By VideoSeriesWidgetHomePage = By.xpath("//*[@id=\"appRoot\"]/div/div/div[1]/div/div/div/div/div[3]/div/div/div/div/div[1]/div/div/a");
    private By VideoMovieWidgetHomePage = By.xpath("//*[@id=\"appRoot\"]/div/div/div[1]/div/div/div/div/div[4]/div/div/div/div/div[3]/div/div/a/img");
    private By VideoProgramWidgetHomePage = By.xpath("//*[@id=\"appRoot\"]/div/div/div[1]/div/div/div/div/div[13]/div/div/div/div/div[1]/div/div/a/div[1]/img");

    public void favouriteListPage() {
        waitForExpectedElement(favouriteListPage).click();
    }

    public void favouriteListPageFavouriteButtonOnSeries() {
        waitForExpectedElement(favouriteListPageFavouriteButtonOnSeries);
        WebDriverHelper.HoverOverBurgerMenu("//*[@id=\"appRoot\"]/div/div/div[1]/div/div/div/div/div/div/div[2]/div/div/div/div/div/div/div/a", "//*[@id=\"appRoot\"]/div/div/div[1]/div/div/div/div/div/div/div[2]/div/div/div/div/div/div/div/a/div[1]/div/img");
    }

    public void favouriteListPageFavouriteButtonOnMovie() {
        waitForExpectedElement(favouriteListPageFavouriteButtonOnMovie);
        WebDriverHelper.HoverOverBurgerMenu("//*[@id=\"appRoot\"]/div/div/div[1]/div/div/div/div/div/div/div[2]/div/div/div/div/div/div/div/a/img", "//*[@id=\"appRoot\"]/div/div/div[1]/div/div/div/div/div/div/div[2]/div/div/div/div/div/div/div/a/div[2]/div[4]/img");

    }

    public void favouriteListPageFavouriteButtonOnProgram() {
        waitForExpectedElement(favouriteListPageFavouriteButtonOnProgram);
        WebDriverHelper.HoverOverBurgerMenu("//*[@id=\"appRoot\"]/div/div/div[1]/div/div/div/div/div/div/div[2]/div/div/div/div/div/div/div/a", "//*[@id=\"appRoot\"]/div/div/div[1]/div/div/div/div/div/div/div[2]/div/div/div/div/div/div/div/a/div[1]/div/img");

    }

    public void HomePageSeriesFavouriteButton() throws InterruptedException {
        waitForExpectedElement(VideoSeriesWidgetHomePage);
        WebDriverHelper.HoverOverBurgerMenu("//*[@id=\"appRoot\"]/div/div/div[1]/div/div/div/div/div[3]/div/div/div/div/div[1]/div/div/a", "//*[@id=\"appRoot\"]/div/div/div[1]/div/div/div/div/div[3]/div/div/div/div/div[1]/div/div/a/div[1]/div/img");

    }

    public void HomePageMovieFavouriteButton() throws InterruptedException {
        waitForExpectedElement(VideoMovieWidgetHomePage);
        WebDriverHelper.HoverOverBurgerMenu("//*[@id=\"appRoot\"]/div/div/div[1]/div/div/div/div/div[4]/div/div/div/div/div[3]/div/div/a/img", "//*[@id=\"appRoot\"]/div/div/div[1]/div/div/div/div/div[4]/div/div/div/div/div[3]/div/div/a/div[2]/div[4]/img");

    }

    public void HomePageProgramFavouriteButton() throws InterruptedException {
        waitForExpectedElement(VideoProgramWidgetHomePage);
        WebDriverHelper.HoverOverBurgerMenu("//*[@id=\"appRoot\"]/div/div/div[1]/div/div/div/div/div[13]/div/div/div/div/div[1]/div/div/a/div[1]/img", "//*[@id=\"appRoot\"]/div/div/div[1]/div/div/div/div/div[13]/div/div/div/div/div[1]/div/div/a/div[1]/div/img");

    }

    public void InfoPlayerButton() {
        waitForExpectedElement(InfoPlayerButton).click();
    }

    public void PlayerFavouriteButton() {
        waitForExpectedElement(PlayerFavouriteButton).click();
    }

    public String favouriteListPageMessage() {
        return waitForExpectedElement(favouriteListPageMessage).getText();
    }

    public void HomePageVideo() {
        waitForExpectedElement(HomePageVideo).click();
    }


}
