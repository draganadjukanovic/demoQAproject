package test;

import base.BasePage;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.*;

public class ButtonsPageTest extends BasePage {

    WebDriverWait wdwait;

    @BeforeMethod
    public void beforeMethod(){
        driver.navigate().to(buttonsPage.url);
        driver.manage().window().maximize();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }


    @Test
    public void testDoubleClick()  {
        buttonsPage.doubleClick();
        assertTrue(buttonsPage.getDoubleClickMessage().isDisplayed());
    }

    @Test
    public void testRightClick() {
        buttonsPage.rightClick();
        assertTrue(buttonsPage.getRightClickMessage().isDisplayed());
    }

    @Test
    public void testClick() {
        buttonsPage.click();
        assertTrue(buttonsPage.getDynamicClickMessage().isDisplayed());
    }
}