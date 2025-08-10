package Bots;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.browsingcontext.Locator;
import org.openqa.selenium.interactions.Actions;

public class ActionsBots {

    private WebDriver driver;
    private WaitBot waitBot;


    public ActionsBots(WebDriver driver) {
        this.driver = driver;
        this.waitBot = new WaitBot(driver);

    }
// Clicking

    public void click(By Locator) {
      waitBot.FluentWait().until(WebDriver ->
        {
            try {
                //driver.findElement(Locator);
                WebElement element = driver.findElement(Locator);
                new Actions(driver).scrollToElement(element);
               // new Actions(driver).click(element);
                element.click();
                return true;
            }
            catch (Exception e){
                return false;
            }


        }
        );

    }

    // Typing
    public void Type(By Locator, String text) {
        waitBot.FluentWait().until(WebDriver ->
                {
                    try {
                        //driver.findElement(Locator);
                        WebElement element = driver.findElement(Locator);
                        new Actions(driver).scrollToElement(element);
                        // new Actions(driver).click(element);
                        element.sendKeys(text);
                        return true;
                    }
                    catch (Exception e){
                        return false;
                    }


                }
        );

    }

    // Geting Text
    public String GetText(By Loc) {
        return (String) waitBot.FluentWait().until(WebDriver ->
                {
                    try {
                        //driver.findElement(Locator);
                        WebElement element = driver.findElement(Loc);
                        new Actions(driver).scrollToElement(element);
                        //return element.getText().isEmpty();
                        String msg = element.getText();
                        return !msg.isEmpty() ? msg : null;
                        // new Actions(driver).click(element);
                        //element.click();
                       // return true;
                    } catch (Exception e) {
                        return null;
                    }


                }
        );


    }

}