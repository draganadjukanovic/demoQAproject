package pages.elements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonsPage {

    public final String url = "https://demoqa.com/buttons";

    public WebDriver driver;
    public WebDriverWait wdwait;
    public Actions actions;

    By doubleClickMeButton = By.id("doubleClickBtn");
    By rightClickMeButton = By.id("rightClickBtn");
    By clickMeButton = By.xpath("(//button[normalize-space()='Click Me'])[1]");
    By doubleClickMessage = By.id("doubleClickMessage");
    By rightClickMessage = By.id("rightClickMessage");
    By dynamicClickMessage = By.id("dynamicClickMessage");

    public ButtonsPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getDoubleClickMeButton(){
        return driver.findElement(doubleClickMeButton);
    }

    public WebElement getRightClickMeButton(){
        return driver.findElement(rightClickMeButton);
    }

    public WebElement getClickMeButton(){
        return driver.findElement(clickMeButton);
    }

    public WebElement getDoubleClickMessage(){
        return driver.findElement(doubleClickMessage);
    }

    public WebElement getRightClickMessage(){
        Actions actions = new Actions(driver);
        return driver.findElement(rightClickMessage);
    }

    public WebElement getDynamicClickMessage(){
        Actions actions = new Actions(driver);
        return driver.findElement(dynamicClickMessage);
    }

    public void doubleClick(){
        Actions actions = new Actions(driver);
        actions.doubleClick(getDoubleClickMeButton()).perform();
    }

    public void rightClick(){
        Actions actions = new Actions(driver);
        actions.contextClick(getRightClickMeButton()).perform();
    }

    public void click(){
        Actions actions = new Actions(driver);
        actions.click(getClickMeButton()).perform();


    }








}
