package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class SearchPage extends BasePage{

    public SearchPage(WebDriver driver){
        setDriver(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
    }

    @FindBy(xpath = "//input[@formcontrolname='city']")
    WebElement citySearchField;

    @FindBy(xpath = "//input[@formcontrolname='dates']")
    WebElement datesField;


    public SearchPage fillCitySearchField(String city){
        citySearchField.sendKeys(city);
        return this;
    }

    public SearchPage fillDateRangeField(String dateRange) {
        datesField.clear();
        datesField.sendKeys(dateRange);
        return this;
    }


}
