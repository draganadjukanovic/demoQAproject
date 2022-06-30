package test;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.*;

public class DynamicPropertiesPageTest extends BasePage {

    @BeforeMethod
    public void beforeMethod(){
        driver.navigate().to(dynamicPropertiesPage.url);
        driver.manage().window().maximize();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    @Test
    public void testEnableAfterButton() {
        dynamicPropertiesPage.getEnableAfterButton();
        Assert.assertTrue(driver.findElement(By.id("enableAfter")).isEnabled());
    }

    @Test
    public void testColorChangeButton() {
        dynamicPropertiesPage.getColorChangeButton();
        Assert.assertTrue(driver.findElement(By.cssSelector(".mt-4.text-danger.btn.btn-primary")).isDisplayed());
    }

    @Test
    public void testVisibleAfterButton() {
        dynamicPropertiesPage.getVisibleAfterButton();
        Assert.assertTrue(driver.findElement(By.id("visibleAfter")).isDisplayed());
    }
}