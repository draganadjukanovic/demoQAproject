package test;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.*;

public class BrokenLinksImagesPageTest extends BasePage {

    @BeforeMethod
    public void beforeMethod() {
        driver.navigate().to(brokenLinksImagesPage.url);
        driver.manage().window().maximize();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void testValidImage() {
        brokenLinksImagesPage.getValidImage().isDisplayed();
        Assert.assertTrue(driver.findElement(By.cssSelector("img[src=\"/images/Toolsqa.jpg\"]")).isDisplayed());
    }


    @Test
    public void testBrokenImage() {
        brokenLinksImagesPage.getBrokenImage().isDisplayed();
        Assert.assertTrue(driver.findElement(By.cssSelector("img[src=\"/images/Toolsqa_1.jpg\"]")).isDisplayed());
    }

    @Test
    public void testValidLink() {
        brokenLinksImagesPage.clickOnValidLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/");

    }

    @Test
    public void testBrokenLink() {
        brokenLinksImagesPage.clickOnBrokenLink();
        Assert.assertEquals(driver.getCurrentUrl(), "http://the-internet.herokuapp.com/status_codes/500");
    }
}