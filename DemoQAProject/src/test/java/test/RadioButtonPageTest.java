package test;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.*;

public class RadioButtonPageTest extends BasePage {

    @BeforeMethod
    public void beforeMethod(){
        driver.navigate().to(radioButtonPage.url);
        driver.manage().window().maximize();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    @Test
    public void testSelectYes() {
    radioButtonPage.clickOnYes();
    Assert.assertEquals(radioButtonPage.getMessage().getText(), "Yes");

    }

    @Test
    public void testSelectImpressive() {
        radioButtonPage.clickOnImpressive();
        Assert.assertEquals(radioButtonPage.getMessage().getText(), "Impressive");
    }

    @Test
    public void testSelectNoIsProhibited() {
        radioButtonPage.clickOnNo();
        Assert.assertFalse(radioButtonPage.getButtonNo().isSelected());
    }
}