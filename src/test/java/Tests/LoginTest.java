package Tests;

import Pages.LoginPage;
import io.qameta.allure.*;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Issue;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.qameta.allure.TmsLink;
import io.qameta.allure.testng.Tag;
import io.qameta.allure.testng.Tags;
import jdk.jfr.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.AllureUtils;

public class LoginTest {
    //Variables
    WebDriver driver;



    @Test
    @Description("verify that user is redirected to home page after providing correct credentials")
    @Tag("Valid Login")
    @Owner("Dalia Nassar")
    @Severity(SeverityLevel.CRITICAL)
    @Link("www.confluence.jira.com/login")
    @TmsLink("https://dalia.atlasian.net/projcts/")
    @Issue("https://dalia.atlasian.net/browse/TA-64")

    public void ValidloginTc() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.Login("standard_user", "secret_sauce");
        Assert.assertTrue(loginPage.IsloggedIn("https://www.saucedemo.com/inventory.html"));

    }
    // behavioral - based hirori
    @Epic("Web portal")
    @Feature("Login Feature ")
    @Story("Invalid Test cases")
    @Test
    public void InValidloginTc() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.Login("standard_use", "secret_sauce");
        //Assert.assertTrue(loginPage.IsloggedIn("https://www.saucedemo.com/inventory.html"));

    }

    @Test
    public void ValidloginFluentPatterenTc() {
       new LoginPage(driver)
       .Login("standard_user", "secret_sauce");


    }




    //Configurations
        @BeforeMethod
        public void setUp() {
            EdgeOptions edgeOptions = new EdgeOptions();
            edgeOptions.addArguments("--start-maximized");
            driver = new EdgeDriver(edgeOptions);
            driver.get("https://www.saucedemo.com/");
            AllureUtils.cleanAllureResults();

        }

        @AfterMethod
        public void teardown() {
            driver.quit();



    }
}