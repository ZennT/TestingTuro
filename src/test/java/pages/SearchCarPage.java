package pages;

import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

import javax.xml.xpath.XPath;

public class SearchCarPage {

    public SearchCarPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id="searchFormLocationTypeahead-input")
    public WebElement searchBox;

    @FindBy(xpath = "//div[contains(text(),'Current location')]")
    public WebElement currentLocation;

    @FindBy(xpath = "//input[@id='searchFormRangeDateTimePicker-dateRangePicker']")
    public WebElement startDate;

    @FindBy(xpath = "(//div[@class='seo-pages-9jzvtc-StyledText'])[1]")
    public WebElement sfo;

    @FindBy(xpath = "//div[@aria-label='Move forward to switch to the next month']//*[name()='svg']")
    public WebElement rightArrow;

    @FindBy(xpath = "(//table)[2]//td/div[text()='28']/..")
    public WebElement twentyEight;

    @FindBy(xpath = "(//table)[2]//td/div[text()='31']/..")
    public WebElement thirtyOne;

    @FindBy(xpath = "//span[@id='searchIconLabel']/..")
    public WebElement searchButton;

//    @FindBy(css = "#searchFormLocationTypeahead-input")
//    public WebElement searchBox;

//    @FindBy(xpath = "//input[@id='searchFormLocationTypeahead-input']")
//    public WebElement searchBox;

}
