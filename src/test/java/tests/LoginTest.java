package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LandingPage;
import pages.loginFirstPage;

import java.util.concurrent.TimeUnit;

public class LoginTest
{

    private static final WebDriver driver = new ChromeDriver();
    @Test

    public void login(){

        driver.get(Utils.BASE_URL);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        LandingPage landingPage = new LandingPage(driver);
        landingPage.clickAcceptTermsButton();
        loginFirstPage loginFirstPage = new loginFirstPage(driver);
        landingPage.clickLoginButton();
        loginFirstPage.enterEmail(Utils.username);
        loginFirstPage.pressNextButton();

    }
}
