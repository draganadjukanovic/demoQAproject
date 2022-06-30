package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Set;

public class LinksPage {

    public final String url = "https://demoqa.com/links";
    public WebDriver driver;
    //public WebDriverWait wdwait;

    By linkHome = By.id("simpleLink");
    By linkHomeai22o = By.id("dynamicLink");
    By linkCreated = By.id("created");
    By linkNoContent = By.id("no-content");
    By linkMoved = By.id("moved");
    By linkBadRequest = By.id("bad-request");
    By linkUnauthorized = By.id("unauthorized");
    By linkForbidden = By.id("forbidden");
    By linkNotFound = By.id("invalid-url");

    By message = By.id("linkResponse");



    public LinksPage(WebDriver driver) {
        this.driver = driver;
    }


    public WebElement getLinkHome(){
        return driver.findElement(linkHome);
    }


    public WebElement getLinkHomeai22o(){
        return driver.findElement(linkHomeai22o);
    }

    public WebElement getLinkCreated(){
        return driver.findElement(linkCreated);
    }

    public WebElement getLinkNoContent(){
        return driver.findElement(linkNoContent);
    }

    public WebElement getLinkMoved(){
        return driver.findElement(linkMoved);
    }

    public WebElement getLinkBadRequest(){
        return driver.findElement(linkBadRequest);
    }

    public WebElement getLinkUnauthorized(){
        return driver.findElement(linkUnauthorized);
    }

    public WebElement getLinkForbidden(){
        return driver.findElement(linkForbidden);
    }

    public WebElement getLinkNotFound(){
        return driver.findElement(linkNotFound);
    }

    public WebElement getMessage(){
        return driver.findElement(message);
    }

    public void clickLinkHome(){
        getLinkHome().click();
    }


    public void clickLinkHomeai22o(){
        getLinkHomeai22o().click();
    }

    public void clickLinkCreated(){
        getLinkCreated().click();
    }

    public void clickLinkNoContent(){
        getLinkNoContent().click();
    }

    public void clickLinkMoved(){
        getLinkMoved().click();
    }

    public void clickLinkBadRequest(){
        getLinkBadRequest().click();
    }

    public void clickLinkUnauthorized(){
        getLinkUnauthorized().click();
    }

    public void clickLinkForbidden(){
        getLinkForbidden().click();
    }

    public void clickLinkNotFound(){
        getLinkNotFound().click();
    }

























}

