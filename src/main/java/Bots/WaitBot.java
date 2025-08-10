package Bots;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeoutException;

public class WaitBot {
    private WebDriver driver;
    public WaitBot (WebDriver driver){
        this.driver=driver;
    }

public FluentWait<WebDriver> FluentWait(){
        return new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(100))
                //.ignoring()
                .ignoreAll(getExceptions());
}

private ArrayList<Class<? extends Exception>> getExceptions(){
        ArrayList<Class<? extends Exception>> exceptions  = new ArrayList<>();
        exceptions.add(NoSuchElementException.class);
        exceptions.add(StaleElementReferenceException.class);
        exceptions.add(ElementClickInterceptedException.class);
        exceptions.add(ElementNotInteractableException.class);
       // exceptions.add(TimeoutException.class); we wait this exception



    return exceptions;
}

}