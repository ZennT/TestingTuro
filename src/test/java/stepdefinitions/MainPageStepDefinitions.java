package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.MainPage;
import util.ConfigurationReader;
import util.Driver;

public class MainPageStepDefinitions {

    MainPage mainPage = new MainPage();

    @Given("User lands on main page")
    public void userLandsOnMainPage() {
        System.out.println(ConfigurationReader.getProperty("baseUrl"));
        Driver.getDriver().get(ConfigurationReader.getProperty("baseUrl"));


    }

    @When("User verifies logo is visible")
    public void userVerifiesLogoIsVisible() {
        Assert.assertTrue(mainPage.logo.isDisplayed());

    }

    @When("User verifies image is visible")
    public void userVerifiesImageIsVisible() {

        Assert.assertTrue(mainPage.image.isDisplayed());

    }

    @When("User verifies become a host cta is enabled")
    public void userVerifiesBecomeAHostCtaIsEnabled() {

        Assert.assertTrue(mainPage.becomeAHost.isDisplayed());
        Assert.assertTrue(mainPage.becomeAHost.isEnabled());
    }

    @When("User account drop down menu is enabled")
    public void userAccountDropDownMenuIsEnabled() {

        Assert.assertTrue(mainPage.dropDown.isEnabled());
    }
}
