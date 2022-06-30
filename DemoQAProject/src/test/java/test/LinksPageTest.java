package test;

import base.BasePage;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import static org.testng.Assert.*;

public class LinksPageTest extends BasePage {

    WebDriverWait wdwait;

    @BeforeMethod
    public void beforeMethod(){
        driver.navigate().to(linksPage.url);
        driver.manage().window().maximize();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    @Test
    public void testClickLinkHome() {
        linksPage.clickLinkHome();
        Set<String> tabs = driver.getWindowHandles();
        ArrayList<String> openedTabs = new ArrayList<>(tabs);
        driver.switchTo().window(openedTabs.get(1));
        assertEquals(driver.getCurrentUrl(), homePage.url);
        assertEquals(openedTabs.size(), 2);
    }

    @Test
    public void testClickLinkHomeai22o() {
        linksPage.clickLinkHomeai22o();
        Set<String> tabs = driver.getWindowHandles();
        ArrayList<String> openedTabs = new ArrayList<>(tabs);
        driver.switchTo().window(openedTabs.get(1));
        assertEquals(driver.getCurrentUrl(), homePage.url);
        assertEquals(openedTabs.size(), 2);
    }

    @Test
    public void testClickLinkCreated() {
        linksPage.clickLinkCreated();
        assertEquals(linksPage.getMessage().getText(), "Link has responded with staus 201 and status text Created" );
    }

    @Test
    public void testClickLinkNoContent() {
        linksPage.clickLinkNoContent();
        assertEquals(linksPage.getMessage().getText(), "Link has responded with staus 204 and status text No Content");
    }

    @Test
    public void testClickLinkMoved() {
        linksPage.clickLinkMoved();
        assertEquals(linksPage.getMessage().getText(), "Link has responded with staus 301 and status text Moved Permanently");
    }

    @Test
    public void testClickLinkBadRequest() {
        linksPage.clickLinkBadRequest();
        assertEquals(linksPage.getMessage().getText(), "Link has responded with staus 400 and status text Bad Request");
    }

    @Test
    public void testClickLinkUnauthorized() {
        linksPage.clickLinkUnauthorized();
        assertEquals(linksPage.getMessage().getText(), "Link has responded with staus 401 and status text Unauthorized");
    }

    @Test
    public void testClickLinkForbidden() {
        linksPage.clickLinkForbidden();
        assertEquals(linksPage.getMessage().getText(), "Link has responded with staus 403 and status text Forbidden");
    }

    @Test
    public void testClickLinkNotFound() {
        linksPage.clickLinkNotFound();
        assertEquals(linksPage.getMessage().getText(), "Link has responded with staus 404 and status text Not Found");
    }
}