package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.bookstoreApplication.LoginPage;
import pages.bookstoreApplication.ProfilePage;
import pages.elements.*;
import pages.forms.FormsPage;
import pages.forms.PracticeFormPage;
import pages.home.HomePage;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;

public class BasePage {

    public final String url = "https://demoqa.com/";

    public WebDriverManager wmd;
    public WebDriver driver;
    public WebDriverWait wdwait;

    public HomePage homePage;
    public ElementsPage elementsPage;
    public TextBoxPage textBoxPage;
    public CheckBoxPage checkBoxPage;
    public RadioButtonPage radioButtonPage;
    public WebTablesPage webTablesPage;
    public ButtonsPage buttonsPage;
    public LinksPage linksPage;
    public BrokenLinksImagesPage brokenLinksImagesPage;
    public UploadAndDownloadPage uploadAndDownloadPage;
    public DynamicPropertiesPage dynamicPropertiesPage;
    public FormsPage formsPage;
    public PracticeFormPage practiceFormPage;
    public LoginPage loginPage;
    public ProfilePage profilePage;



    @BeforeClass
    public void beforeClass() {
        wmd = new ChromeDriverManager();
        wmd.setup();
        //driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("src/main/resources/addblockplus.crx"));
        driver = new ChromeDriver(options);
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(5));
        ArrayList<String> tabs = new ArrayList<> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        wdwait.until(ExpectedConditions.visibilityOf(driver.findElement(By.tagName("h1"))));
        driver.close();
        driver.switchTo().window(tabs.get(0));

        driver.manage().window().maximize();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(5));

        homePage = new HomePage(driver);
        elementsPage = new ElementsPage(driver);
        textBoxPage = new TextBoxPage(driver);
        checkBoxPage = new CheckBoxPage(driver);
        radioButtonPage = new RadioButtonPage(driver);
        webTablesPage = new WebTablesPage(driver);
        buttonsPage = new ButtonsPage(driver);
        linksPage = new LinksPage(driver);
        brokenLinksImagesPage = new BrokenLinksImagesPage(driver);
        uploadAndDownloadPage = new UploadAndDownloadPage(driver);
        dynamicPropertiesPage = new DynamicPropertiesPage(driver, wdwait);
        formsPage = new FormsPage(driver);
        practiceFormPage = new PracticeFormPage(driver, wdwait);
        loginPage = new LoginPage(driver);
        profilePage = new ProfilePage(driver);

    }


    @AfterClass
    public void afterClass() {
        //  wdwait = null;
        //  driver.quit();
        //  driver = null;
        // wmd = null;

    }








    }




