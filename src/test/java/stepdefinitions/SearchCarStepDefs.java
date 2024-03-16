package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.MainPage;
import pages.SearchCarPage;

import static util.ReusableMethods.waitSomeTime;


public class SearchCarStepDefs {


    SearchCarPage searchCarPage = new SearchCarPage();
    MainPage mainPage = new MainPage();



    @When("User sends a city to search box")
    public void userSendsACityToSearchBox() throws InterruptedException {

        //searchCarPage.searchBox.sendKeys("San Francisco");
       searchCarPage.searchBox.click();
       searchCarPage.currentLocation.click();
       waitSomeTime(2L);

    }

    @And("User selects a from date and time")
    public void userSelectsAFromDateAndTime() throws InterruptedException {
//        searchCarPage.sfo.click();

        searchCarPage.startDate.click();
//        searchCarPage.rightArrow.click();
        waitSomeTime(1L);
        searchCarPage.twentyEight.click();
        waitSomeTime(2L);
        searchCarPage.thirtyOne.click();

        searchCarPage.searchButton.click();
    }

    @And("User selects until date and time")
    public void userSelectsUntilDateAndTime() {

    }

    @Then("User clicks search button")
    public void userClicksSearchButton() {
    }


}
