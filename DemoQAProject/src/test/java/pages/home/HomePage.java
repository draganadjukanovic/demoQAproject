package pages.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {

    public final String url = "https://demoqa.com/";

    public WebDriver driver;

    By categoryCards = By.cssSelector(".card.mt-4.top-card");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getCategoryCards() {
        return driver.findElements(categoryCards);
    }

    public WebElement getElements() {
        return getCategoryCards().get(0);
    }
    public WebElement getForms() {
        return getCategoryCards().get(1);
    }
    public WebElement getAlertsFrameAndWindows() {
        return getCategoryCards().get(2);
    }
    public WebElement getWidgets() {
        return getCategoryCards().get(3);
    }
    public WebElement getInteractions() {
        return getCategoryCards().get(4);
    }
    public WebElement getBookStoreApplication() {
        return getCategoryCards().get(5);
    }


    public void clickOnElements(){
        getElements().click();
    }

    public void clickOnForms(){
        getForms().click();
    }

    public void clickOnAlertFrameAndWindows(){
        getAlertsFrameAndWindows().click();
    }

    public void clickOnWidgets(){
        getWidgets().click();
    }

    public void clickOnInteractions(){
        getInteractions().click();
    }

    public void clickOnBookStoreApplication(){
        getBookStoreApplication().click();
    }




}

