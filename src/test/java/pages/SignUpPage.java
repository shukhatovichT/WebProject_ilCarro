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

public class SignUpPage extends BasePage{

    @FindBy(xpath = "//input[@formcontrolname='firstName']")
    WebElement firstNameField;

    @FindBy(xpath = "//input[@formcontrolname='lastName']")
    WebElement lastNameField;

    @FindBy(xpath = "//input[@formcontrolname='email']")
    WebElement emailField;

    @FindBy(xpath = "//input[@formcontrolname='password']")
    WebElement passwordField;

    @FindBy(xpath = "//button[contains(text(), \"Y’alla!\")]")
    WebElement yallaButton;

    @FindBy(xpath = "//input[@type='checkbox']")
    WebElement checkbox;

    @FindBy(xpath = "//span[@class='navigator' and contains(text(), 'Click here')]")
    WebElement clickHereLink;

    public SignUpPage(WebDriver driver){
        setDriver(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
    }

    public SignUpPage fillFirstNameField(String firstName){
        firstNameField.sendKeys(firstName);
        return this;
    }

    public SignUpPage fillLastNameField(String lastName){
        lastNameField.sendKeys(lastName);
        return this;
    }

    public SignUpPage fillEmailField(String email){
        emailField.sendKeys(email);
        return this;
    }

    public SignUpPage fillPasswordField(String password){
        passwordField.sendKeys(password);
        return this;
    }

    public SignUpPage clickOnCheckbox(){
        checkbox.click();
        return this;
    }

    public SignUpPage clickByYallaButton(){
        yallaButton.click();
        return this;
    }

    public LogInPage clickOnClickHereLink(){
        clickHereLink.click();
        return new LogInPage(getDriver());
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
