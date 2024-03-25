package pages;
import Pageobject.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LandingPage extends PageObject {
    private final By  loginBtnBy = By.xpath("//*[@class='n-navigation__menu-nav']/li[5]");
    private final By acceptTermsBtnBy = By.id("onetrust-accept-btn-handler");
    public LandingPage(WebDriver driver) {
        super(driver);
    }

    public  void clickAcceptTermsButton(){

        driver.findElement(acceptTermsBtnBy).click();
    }

    public  void clickLoginButton(){


        driver.findElement(loginBtnBy).click();
    }

}
