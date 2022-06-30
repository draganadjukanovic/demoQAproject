package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrokenLinksImagesPage {

    public final String url = "https://demoqa.com/broken";

    public WebDriver driver;

    By validImage = By.cssSelector("img[src=\"/images/Toolsqa.jpg\"]");
    By brokenImage = By.cssSelector("img[src=\"/images/Toolsqa_1.jpg\"]");
    By clickHereForValidLink = By.linkText("Click Here for Valid Link");
    By clickHereForBrokenLink = By.linkText("Click Here for Broken Link");

    public BrokenLinksImagesPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getValidImage() {
        return driver.findElement(validImage);
    }

    public WebElement getBrokenImage() {
        return driver.findElement(brokenImage);
    }

    public WebElement getClickHereForValidLink() {
        return driver.findElement(clickHereForValidLink);
    }

    public WebElement getClickHereForBrokenLink() {
        return driver.findElement(clickHereForBrokenLink);
    }

    public void clickOnValidLink(){
        getClickHereForValidLink().click();
    }

    public void clickOnBrokenLink(){
        getClickHereForBrokenLink().click();
    }



}



