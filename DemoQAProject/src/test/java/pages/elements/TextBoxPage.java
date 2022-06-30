package pages.elements;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class TextBoxPage {

    public final String url = "https://demoqa.com/text-box";

    public WebDriver driver;


    By fullNameInput = By.id("userName");
    By emailInput = By.id("userEmail");
    By currentAddressInput = By.id("currentAddress");
    By permanentAddressInput = By.id("permanentAddress");
    By submitButton = By.id("submit");

    By submittedDataContainer = By.xpath("//*[@id=\"output\"]/div");


    public TextBoxPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getFullNameInput() {
        return driver.findElement(fullNameInput);
    }

    public WebElement getEmailInput() {
        return driver.findElement(emailInput);
    }

    public WebElement getCurrentAddressInput() {
        return driver.findElement(currentAddressInput);
    }

    public WebElement getPermanentAddressInput() {
        return driver.findElement(permanentAddressInput);
    }

    public WebElement getSubmitButton() {
        //scroll();
        return driver.findElement(submitButton);}

    public WebElement getSubmittedDataContainer(){
        return driver.findElement(submittedDataContainer);
    }

    public void fillInAndSubmit (String fullName, String email, String currentAddress, String permanentAddress) {
        getFullNameInput().sendKeys(fullName);
        getEmailInput().sendKeys(email);
        getCurrentAddressInput().sendKeys(currentAddress);
        getPermanentAddressInput().sendKeys(permanentAddress);
        getSubmitButton().click();
    }


}
