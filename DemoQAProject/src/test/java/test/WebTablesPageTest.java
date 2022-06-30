package test;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.*;

public class WebTablesPageTest extends BasePage {

    @BeforeMethod
    public void beforeMethod(){
        driver.navigate().to(webTablesPage.url);
        driver.manage().window().maximize();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }



    @Test
    public void testAddTableEntry() {
        webTablesPage.addTableEntry("Dragana", "Djukanovic", "draganadj@gmail.com",  38, 1000, "QA");
        //TODO assert
    }

    @Test
    public void testCloseRegistrationForm(){
        webTablesPage.clickAddButton();
        webTablesPage.clickCloseButton();
        Assert.assertFalse(webTablesPage.getRegistrationForm().isDisplayed());
    }


    @Test
    public void searchTableEntry(){
        webTablesPage.inputTextInSearchBox("Cierra");
        webTablesPage.clickOnSearchIcon();
        Assert.assertTrue(driver.findElement(By.xpath("//div[normalize-space()='Cierra']")).isDisplayed());
        Assert.assertFalse(driver.findElement(By.xpath("//div[normalize-space()='Alden']")).isDisplayed());
        Assert.assertFalse(driver.findElement(By.xpath("//div[normalize-space()='Kierra']")).isDisplayed());

    }


    //TODO Tests for Sort, Edit, Delete...






}