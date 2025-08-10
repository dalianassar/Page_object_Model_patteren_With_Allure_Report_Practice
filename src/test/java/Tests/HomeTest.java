package Tests;

import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeTest {

    private WebDriver driver;
    @Test
    public void AddToCartTC(){
        new LoginPage(driver)
                .Login("standard_user" , " secret_sauce");
    }
























    //Configurations
    @BeforeMethod
    public void setUp() {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");
        driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.saucedemo.com/");

    }

    @AfterMethod
    public void teardown() {
        driver.quit();



    }

}