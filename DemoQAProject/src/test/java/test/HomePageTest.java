package test;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class HomePageTest extends BasePage {

    @BeforeMethod
    public void beforeMethod(){
        driver.navigate().to(url);
        driver.manage().window().maximize();
    }

    @Test
    public void testGoToElementsPage() {
        homePage.clickOnElements();
        Assert.assertEquals(driver.getCurrentUrl(), elementsPage.url);


    }

    @Test
    public void testGoToFormsPage() {
        homePage.clickOnForms();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/forms");
    }

    @Test
    public void testGoToAlertsFrameAndWindowsPage() {
        homePage.clickOnAlertFrameAndWindows();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/alertsWindows");
    }

    @Test
    public void testGoToWidgetsPage() {
        homePage.clickOnWidgets();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/widgets");
    }

    @Test
    public void testGoToInteractionsPage() {
        homePage.clickOnInteractions();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/interaction");
    }

    @Test
    public void testGoToBookStoreApplicationPage() {
        homePage.clickOnBookStoreApplication();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/books");
    }
}