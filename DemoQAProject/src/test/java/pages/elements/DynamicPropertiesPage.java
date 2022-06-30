package pages.elements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicPropertiesPage {

    public final String url = "https://demoqa.com/dynamic-properties";

    public WebDriver driver;
    public WebDriverWait wdwait;



    By enableAfterButton = By.id("enableAfter");
    By colorChangeButton = By.id("colorChange");
    By visibleAfterButton = By.id("visibleAfter");

    public DynamicPropertiesPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }



    public void getEnableAfterButton() {
        wdwait.until(ExpectedConditions.elementToBeClickable(enableAfterButton));
        driver.findElement(enableAfterButton).click();
    }

    public void getColorChangeButton() {
        wdwait.until(ExpectedConditions.visibilityOfElementLocated(colorChangeButton));
        driver.findElement(colorChangeButton).isDisplayed();
    }

    public void getVisibleAfterButton() {
        wdwait.until(ExpectedConditions.visibilityOfElementLocated(visibleAfterButton));
        driver.findElement(visibleAfterButton).click();
    }


}
