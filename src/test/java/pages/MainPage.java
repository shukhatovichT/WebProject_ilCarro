package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class MainPage extends BasePage{

    public MainPage(WebDriver driver){
        setDriver(driver);
        driver.get("https://ilcarro.web.app/");
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);

    }

    public <T extends BasePage> T openTopMenu(String topMenuItem){

        WebElement menuItem = getDriver().findElement(By.xpath("//a[contains(text(),'" + topMenuItem + "')]"));
        menuItem.click();;

        switch (topMenuItem){
            case "SEARCH":
                return(T) new SearchPage(getDriver());
            case "LETTHECARWORK":
                return(T) new LetTheCarWorkPage(getDriver());
            case "TERMSOFUSE":
                return(T) new TermsOfUsePage(getDriver());
            case "LOGIN":
                return(T) new LogInPage(getDriver());
            case "SIGNUP":
                return(T) new SignUpPage(getDriver());
            default:
                throw new IllegalArgumentException("Invalid top menu item: " + topMenuItem);
        }

        }



}
