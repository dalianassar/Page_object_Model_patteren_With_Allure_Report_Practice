package driveres;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeFactory extends abstractDriver{
    @Override
    public WebDriver createDriver() {
        return new ChromeDriver();
    }
}