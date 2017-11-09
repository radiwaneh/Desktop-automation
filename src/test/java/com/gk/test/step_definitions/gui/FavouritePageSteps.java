package com.gk.test.step_definitions.gui;

import com.gk.test.framework.helpers.Props;
import com.gk.test.framework.helpers.WebDriverHelper;
import com.gk.test.framework.helpers.utils.KeyboardActions;
import com.gk.test.page_objects.gui.FavouritePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;

import static com.gk.test.framework.helpers.WebDriverHelper.getWebDriver;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by radiwaneh on 11/6/2017.
 */
public class FavouritePageSteps {

    private FavouritePage FavouritePage;

    public FavouritePageSteps(FavouritePage FavouritePage) {
        this.FavouritePage = FavouritePage;
    }


    @And("^i click on favourite list$")
    public void iClickOnFavouriteList() throws InterruptedException {
        FavouritePage.favouriteListPage();

    }


    @And("^i verify favourite page \"([^\"]*)\"$")
    public void iVerifyFavouritePage(String favouritepagemessage) {

        assertThat(FavouritePage.favouriteListPageMessage()).contains(Props.getMessage(favouritepagemessage));

    }

    @And("^i click on favourite button on Series from favourite page$")
    public void iClickOnFavouriteButtonOnSeriesoFromFavouritePage() throws InterruptedException {

        FavouritePage.favouriteListPageFavouriteButtonOnSeries();


    }

    @And("^i click on favourite button on Episode from favourite page$")
    public void iClickOnFavouriteButtonOnEpisodeoFromFavouritePage() {
        FavouritePage.favouriteListPageFavouriteButtonOnSeries();
    }

    @And("^i click on favourite button on Movie from favourite page$")
    public void iClickOnFavouriteButtonOnMovieFromFavouritePage() {
        FavouritePage.favouriteListPageFavouriteButtonOnMovie();
    }

    @And("^i click on favourite button on Program from favourite page$")
    public void iClickOnFavouriteButtonOnProgramFromFavouritePage() {
        FavouritePage.favouriteListPageFavouriteButtonOnProgram();
    }

    @And("^i click on favourite button on Series from Home page$")
    public void iClickOnFavouriteButtonOnSeriesFromHomePage() throws InterruptedException {



        FavouritePage.HomePageSeriesFavouriteButton();

    }

    @And("^i click on favourite button on Movie from Home page$")
    public void iClickOnFavouriteButtonOnMovieFromHomePage() throws InterruptedException {
        FavouritePage.HomePageMovieFavouriteButton();

    }

    @And("^i click on favourite button on Program from Home page$")
    public void iClickOnFavouriteButtonOnProgramFromHomePage() throws InterruptedException {
        FavouritePage.HomePageProgramFavouriteButton();

    }

    @And("^i click on Info button on Favourite page$")
    public void iClickOnInfoButtonOnFavouritePage() {
        FavouritePage.InfoPlayerButton();
    }

    @And("^i click on favourite button on player$")
    public void iClickOnFavouriteButtonOnPlayer() {
        FavouritePage.PlayerFavouriteButton();
    }


    @And("^i pick video from home page$")
    public void iPickVideoFromHomePage() {
        FavouritePage.HomePageVideo();
    }

    @And("^i hover over the video on home screen$")
    public void iHoverOverTheVideoOnHomeScreen() {
        WebDriverHelper.HoverOverBurgerMenu("//*[@id=\"appRoot\"]/div/div/div[1]/div/div/div/div/div[3]/div/div/div/div/div[1]/div/div", "//*[@id=\"appRoot\"]/div/div/div[1]/div/div/div/div/div[3]/div/div/div/div/div[1]/div/div/a/div[1]/div/img");

    }


    @And("^i go down with arrows \"([^\"]*)\"$")
    public void iGoDownWithArrows(Integer number) throws AWTException, InterruptedException {
        for (int i = 0; i < number; i++) {
            KeyboardActions.ArrowDown();
        }
    }

    @And("^i go page down \"([^\"]*)\"$")
    public void iGoPageDown(Integer number) throws AWTException, InterruptedException {
        for (int i = 0; i < number; i++) {
            KeyboardActions.PageDown();
        }
    }
}
