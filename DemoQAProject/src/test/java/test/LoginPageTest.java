package test;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.*;

public class LoginPageTest extends BasePage {

    @BeforeMethod
    public void beforeMethod(){
        driver.navigate().to(loginPage.url);
        driver.manage().window().maximize();

    }

    @Test
    public void testLoginToBookstoreApp() {
        loginPage.loginToBookstoreApp("insprojekat@gmail.com", "Zavrsni13#");
        assertEquals(driver.getCurrentUrl(), profilePage.url);
    }
}