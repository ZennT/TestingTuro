package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.FilterPage;
import pojo.User;
import util.ConfigurationReader;
import util.Driver;

import static util.ReusableMethods.waitSomeTime;

public class FilterUrlStepDefs {

    FilterPage fp = new FilterPage();


    @Given("User lands on filterUrl")
    public void userLandsOnFilterUrl() {

        Driver.getDriver().get(ConfigurationReader.getProperty("filterUrl"));
    }

    @When("User opens sortBy dropdown menu")
    public void userOpensSortByDropdownMenu() {
        fp.sortBydropDown.click();
        waitSomeTime(2L);
    }

    @And("User selects second option on the menu")
    public void userSelectsSecondOptionOnTheMenu() {
        fp.priceLowtoHigh.click();
        waitSomeTime(2L);
    }

    @And("User hits apply button")
    public void userHitsApplyButton() {

        fp.applyButton.click();
        waitSomeTime(2L);
    }

    @And("User opens pickup options dropdown")
    public void userOpensPickupOptionsDropdown() {
        fp.pickupOptionDropDown.click();
        waitSomeTime(2L);


    }

    @And("User selects pickup near location")
    public void userSelectsPickupNearLocation() {
        fp.pickUpLocation.click();
        waitSomeTime(2L);
    }

    @And("User clicks on apply button")
    public void userClicksOnApplyButton() {

        fp.apply.click();
    }

    @And("User opens book instantly dropdown")
    public void userOpensBookInstantlyDropdown() {
        waitSomeTime(2L);
        fp.bookInstantly.click();

    }

    @And("User clicks on view results button")
    public void userClicksOnViewResultsButton() {

        fp.viewResultsButton.click();
    }

    @And("User opens more filters dropdown")
    public void userOpensMoreFiltersDropdown() {
        fp.moreFilters.click();
    }

    @And("User clicks on vehicle type")
    public void userClicksOnVehicleType() {
        fp.sUVs.click();
    }

    @And("User selects vehicle make and model")
    public void userSelectsVehicleMakeAndModel() {
        fp.makeDropDown.click();
        waitSomeTime(2L);
        fp.tesla.click();
        waitSomeTime(4L);
        fp.modelDropDown.click();
        waitSomeTime(2L);
        fp.modelX.click();
    }

    @And("User selects number of seats")
    public void userSelectsNumberOfSeats() {
    }

    @And("User selects transmission type")
    public void userSelectsTransmissionType() {
    }

    @And("User selects electric vehicle option")
    public void userSelectsElectricVehicleOption() {
    }

    @And("User clicks on show more and selects toll pass")
    public void userClicksOnShowMoreAndSelectsTollPass() {
    }

    @And("User clicks on allstar host")
    public void userClicksOnAllstarHost() {
    }

    @And("User clicks on view results")
    public void userClicksOnViewResults() {
    }
}
