package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

public class MainPage {



    public MainPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

  @FindBy(xpath ="(//a[@title='Turo'])[1]/span")
    public WebElement logo ;

  @FindBy(xpath = "//div[@id='__next']/div[2]/div[1]")
  public WebElement image;

  @FindBy(xpath = "//a[contains(@class,seo-pages-1uv25j8)]")
    public WebElement becomeAHost;

  @FindBy(xpath = "//div[@class='seo-pages-b5h863 eg3xwrw0']")
//  //button[contains(@class,"seo-pages-uda1tw")]
//   //button[contains(@class,"uda1tw")]
    public WebElement dropDown;










}
