package test;

import base.BasePage;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class UploadAndDownloadPageTest extends BasePage {

    @BeforeMethod
    public void beforeMethod() {
        driver.navigate().to(uploadAndDownloadPage.url);
        driver.manage().window().maximize();
    }

    @Test
    public void testDownloadFile() {
        uploadAndDownloadPage.clickOnDownloadButton();
    }

    @Test
    public void testUploadFile() {
        uploadAndDownloadPage.getChooseFileButton().sendKeys("C:\\Users\\SARUFO\\IdeaProjects\\ZavrsniProjekatDemoQA\\src\\main\\resources\\testProjekat.docx");
        Assert.assertEquals(uploadAndDownloadPage.getUploadedFilePath().getText(), "C:\\fakepath\\testProjekat.docx");
        }
    }
