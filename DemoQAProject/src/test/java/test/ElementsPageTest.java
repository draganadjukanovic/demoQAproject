package test;

import base.BasePage;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.*;

public class ElementsPageTest extends BasePage {

    @BeforeMethod
    public void beforeMethod(){
        driver.navigate().to(elementsPage.url);
        driver.manage().window().maximize();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    @Test
    public void testGoToTextBoxPage() {
        elementsPage.clickOnTextBox();
        assertEquals(driver.getCurrentUrl(), textBoxPage.url);
    }

    @Test
    public void testGoToCheckBoxPage() {
        elementsPage.clickOnCheckBox();
        assertEquals(driver.getCurrentUrl(), checkBoxPage.url);
    }

    @Test
    public void testGoToRadioButtonPage() {
        elementsPage.clickOnRadioButton();
        assertEquals(driver.getCurrentUrl(), radioButtonPage.url);
    }

    @Test
    public void testGoToWebTablesPage() {
        elementsPage.clickOnWebTables();
        assertEquals(driver.getCurrentUrl(), webTablesPage.url);
    }

    @Test
    public void testGoToButtonsPage() {
        elementsPage.clickOnButtons();
        assertEquals(driver.getCurrentUrl(), buttonsPage.url);
    }

    @Test
    public void testGoToLinksPage() {
        elementsPage.clickOnLinks();
        assertEquals(driver.getCurrentUrl(), linksPage.url);
    }

    @Test
    public void testGoToBrokenLinksImagesPage() {
        elementsPage.clickOnBrokenLinksImages();
        assertEquals(driver.getCurrentUrl(), brokenLinksImagesPage.url);
    }

    @Test
    public void testGoToUploadAndDownloadPage() {
        elementsPage.clickOnUploadAndDownload();
        assertEquals(driver.getCurrentUrl(), uploadAndDownloadPage.url);
    }

    @Test
    public void testGoToDynamicPropertiesPage() {
        elementsPage.clickOnDynamicProperties();
        assertEquals(driver.getCurrentUrl(), dynamicPropertiesPage.url);
    }




}