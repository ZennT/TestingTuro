package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

public class FilterPage {


    public FilterPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="(//span[@class='css-3z9m8u'])[1]" )
    public WebElement sortBydropDown;

    @FindBy(xpath = "(//p[@id='sortType-label'])[2]")
    public WebElement priceLowtoHigh;

    @FindBy(xpath = "(//span[@class='css-buv94'])[1]")
    public WebElement applyButton;

    @FindBy(xpath ="(//span[@class='css-3z9m8u'])[2]" )
    public WebElement pickupOptionDropDown;

    @FindBy(xpath = "//p[@id='PICKUP_NEAR-label']")
    public WebElement pickUpLocation;

    @FindBy(xpath = "(//span[@class='css-1gp68je'])[1]")
    public WebElement apply;

    @FindBy(xpath = "(//p[@class='css-rwxmo3'])[4]")
    public WebElement bookInstantly;

    @FindBy(xpath = "(//span[@class='css-buv94'])[2]")
    public WebElement viewResultsButton;

    @FindBy(xpath = "(//p[@class='css-rwxmo3'])[5]")
    public WebElement moreFilters;

    @FindBy(xpath = "//span[@class='imageMultiSelectOption-icon typeIcon typeIcon--suv']")
//    span[contains(@class,imageMultiSelectOption-icon)]
    public WebElement sUVs;

    @FindBy(xpath = "//select[@id='makes']")
    public WebElement makeDropDown;

    @FindBy(xpath = "//option[@value='Tesla']")
    public WebElement tesla;

    @FindBy(xpath = "//select[@id='models']")
    public WebElement modelDropDown;

    @FindBy(xpath = "//option[@value='Model X']")
    public WebElement modelX;






}
