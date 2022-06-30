package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButtonPage {

    public final String url = "https://demoqa.com/radio-button";

    public WebDriver driver;

    By buttonYes = By.cssSelector("label[for=\"yesRadio\"]");
    By buttonImpressive = By.cssSelector("label[for=\"impressiveRadio\"]");
    By buttonNo = By.cssSelector("label[for=\"noRadio\"]");

    By message = By.className("text-success");


    public RadioButtonPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getButtonYes() {
        return driver.findElement(buttonYes);
    }

    public WebElement getButtonImpressive() {
        return driver.findElement(buttonImpressive);
    }

    public WebElement getButtonNo() {
        return driver.findElement(buttonNo);
    }

    public WebElement getMessage(){ return driver.findElement(message);}

    public void clickOnYes() {
        getButtonYes().click();
    }

    public void clickOnImpressive(){
        getButtonImpressive().click();
    }

    public void clickOnNo(){
        getButtonNo().click();
    }

}
