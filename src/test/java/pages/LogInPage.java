package pages;


import org.openqa.selenium.Alert;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LogInPage extends BasePage{

    @FindBy(xpath = "//input[@formcontrolname='email']")
    WebElement emailField;

    @FindBy(xpath = "//input[@formcontrolname='password']")
    WebElement passwordField;

    @FindBy(xpath = "//button[contains(text(), \"Y’alla!\")]")
    WebElement yallaButton;

    @FindBy(xpath = "//span[@class='navigator' and contains(text(), 'Click here')]")
    WebElement clickHereLink;

    public LogInPage(WebDriver driver){
        setDriver(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
    }

    public LogInPage fillEmailField(String email){
        emailField.sendKeys(email);
        return this;
    }

    public LogInPage fillPasswordField(String password){
        passwordField.sendKeys(password);
        return this;
    }

    public LogInPage clickByYallaButton(){
        yallaButton.click();
        return this;
    }

    public SignUpPage clickOnClickHereLink(){
        clickHereLink.click();
        return new SignUpPage(getDriver());
    }

    public BasePage clickByYallaButton2(){
        yallaButton.click();
        Alert alert =getAlertIfPresent();
        if(alert != null){
            alert.accept();
            return new LogInPage(getDriver());
        } else {
            return new SearchPage(getDriver());
        }
    }

    private Alert getAlertIfPresent(){
        try {
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofMillis(5000));
            return wait.until(ExpectedConditions.alertIsPresent());
        } catch(TimeoutException e) {
            System.out.println("Alert issue " + e);
            return null;
        }
    }




}
