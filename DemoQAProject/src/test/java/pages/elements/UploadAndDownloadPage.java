package pages.elements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UploadAndDownloadPage {

    public final String url = "https://demoqa.com/upload-download";

    public WebDriver driver;

    By downloadButton = By.id("downloadButton");
    By chooseFileButton = By.id("uploadFile");
    By uploadedFilePath = By.id("uploadedFilePath");

    public UploadAndDownloadPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getDownloadButton(){
        return driver.findElement(downloadButton);
    }

    public WebElement getChooseFileButton(){
        return driver.findElement(chooseFileButton);
    }

    public WebElement getUploadedFilePath(){
        return driver.findElement(uploadedFilePath);
    }

    public void clickOnDownloadButton(){
        getDownloadButton().click();
    }




}
