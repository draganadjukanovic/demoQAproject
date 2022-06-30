package test;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.*;

public class TextBoxPageTest extends BasePage {

    @BeforeMethod
    public void beforeMethod(){
        driver.manage().window().maximize();
        driver.navigate().to(textBoxPage.url);
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    @Test
    public void testFillInAndSubmitTextBox(String fullName, String email, String currentAddress, String permanentAddress) {
        textBoxPage.fillInAndSubmit("Dragana", "dragana@gmail.com", "Petra Petrovica, Beograd", "Marka Markovica, Beograd");
        assertTrue(textBoxPage.getSubmittedDataContainer().isDisplayed());
    }
}