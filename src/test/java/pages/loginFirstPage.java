
package pages;

import Pageobject.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class loginFirstPage extends PageObject {
    private final By emailBy = By.id("field_EmailOrPhone");
    private final By nextBtnBy = By.id("button_btn_submit_email");
    private final By errorMessage = By.xpath("//*[@class='input-error-message' ]/p");

    public loginFirstPage(WebDriver driver) {
        super(driver);
    }




    public void enterEmail(String Email) {
        driver.findElement(emailBy).sendKeys(Email);
    }

    public void pressNextButton() {
        driver.findElement(nextBtnBy).click();
    }




}