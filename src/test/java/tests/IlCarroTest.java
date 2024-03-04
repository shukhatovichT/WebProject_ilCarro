package tests;

import helpers.TopMenuItem;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LogInPage;
import pages.MainPage;


public class IlCarroTest {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--lang=en");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    @Test
    public void ilCarroTest_001() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        LogInPage logInPage = mainPage.openTopMenu(TopMenuItem.LOGIN.toString());
        logInPage.fillEmailField("email@gmail.com").clickByYallaButton();

        Thread.sleep(5000);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
