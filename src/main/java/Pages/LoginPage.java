package Pages;

import Bots.ActionsBots;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    // Variables
    private WebDriver driver;
    private ActionsBots actionsBots ;

    // constructers
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.actionsBots=new ActionsBots(driver);

    }

    // locatores
    private final By username = By.id("user-name");
    private final By password = By.id("password");
    private final By LoginBotton = By.id("login-button");

    // actions
    public void Login(String Username, String Password) {
        //By Acton Bot
        //actionsBots.Type(username,Username);
        //actionsBots.Type(password,Password);
        //actionsBots.click(LoginBotton);

        driver.findElement(username).sendKeys(Username);
        driver.findElement(password).sendKeys(Password);
        driver.findElement(LoginBotton).click();
    }

    public boolean IsloggedIn(String expectedURL){
        return driver.getCurrentUrl().equals(expectedURL);
        //Assert.assertTrue(loginPage.IsloggedIn("https://www.saucedemo.com/inventory.html"));


    }

    //fluent






}