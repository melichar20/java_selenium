package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private final WebDriver driver;
    private By userID = By.id("LoginControl_txtUserId");
    private By password = By.id("LoginControl_txtPassword");
    private By loginButton = By.id("LoginControl_btnSubmitLogin");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLogin() {
        driver.findElement(userID).sendKeys("mdm3070");
        driver.findElement(password).sendKeys("mdm192259");
        driver.findElement(loginButton).click(); // create a return statement returning the HomePage
    }
}
