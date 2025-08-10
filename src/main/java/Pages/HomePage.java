package Pages;

import Bots.ActionsBots;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage {
    //variables
    private WebDriver driver;
    private ActionsBots actionBots;
    private  final By AddtoCartBotton = By.xpath("//div[.='Sauce Labs Backpack']");
    private  final By cartIcon = By.xpath("//*[@data-icon=\"shopping-cart\"] //following::span");

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.actionBots = new ActionsBots(driver);
    }

    //Actions
    public void addToCart() {
        driver.findElement(AddtoCartBotton).click();
        //By Bot patteren
       // actionBots.click(AddtoCartBotton);
    }

    // Validations
    @Step("Login to web portal with {username}and{password}")
     public HomePage validateCartIcon() {
         String CartIconText = driver.findElement(cartIcon).getText();
         Assert.assertEquals(CartIconText, "1");
         return this;
     }}
         // validation by actionBot
         // String CartIconText =actionBots.GetText(cartIcon);
         //Assert.assertEquals(CartIconText ,"1");