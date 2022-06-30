package pages.elements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class WebTablesPage {

    public final String url = "https://demoqa.com/webtables";

    public WebDriver driver;



    By addButton = By.id("addNewRecordButton");

    By registrationForm = By.id("registration-form-modal");
    By firstNameInput = By.id("firstName");
    By lastNameInput = By.id("lastName");
    By emailInput = By.id("userEmail");
    By ageInput = By.id("age");
    By salaryInput = By.id("salary");
    By departmentInput = By.id("department");
    By submitButton = By.id("submit");
    By close = By.className("close");


    By searchBoxInput = By.id("searchBox");
    By searchIcon = By.id("basic-addon2");


    By sortFirstName = By.xpath("(//div[contains(text(),'First Name')])[1]");
    By sortLastName = By.xpath("(//div[contains(text(),'Last Name')])[1]");
    By sortAge = By.xpath("(//div[contains(text(),'Age')])[1]");
    By sortEmail = By.xpath("(//div[contains(text(),'Email')])[1]");
    By sortSalary = By.xpath("(//div[contains(text(),'Salary')])[1]");
    By sortDepartment = By.xpath("(//div[contains(text(),'Department')])[1]");
    By sortActions = By.xpath("(//div[contains(text(),'Action')])[1]");
    By edit = By.id("edit-record-1");
    By delete = By.id("delete-record-1");
    By exist = By.cssSelector(".rt-tbody");

    By page = By.cssSelector("input[value=\"1\"]");
    By nextPage = By.className("-next");
    By previousPage = By.className("-previous");
    By rows = By.cssSelector("select[aria-label=\"rows per page\"]");

    public WebTablesPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getAddButton() {
        return driver.findElement(addButton);
    }

    public WebElement getRegistrationForm() { return driver.findElement(registrationForm);}

    public WebElement getFirstNameInput() { return driver.findElement(firstNameInput);}
    public WebElement getLastNameInput() { return driver.findElement(lastNameInput);}
    public WebElement getEmailInput() { return driver.findElement(emailInput);}
    public WebElement getAgeInput() { return driver.findElement(ageInput);}
    public WebElement getSalaryInput() { return driver.findElement(salaryInput);}
    public WebElement getDepartmentInput() { return driver.findElement(departmentInput);}
    public WebElement getSubmitButton() { return driver.findElement(submitButton);}

    public WebElement getSearchBoxInput() {
        return driver.findElement(searchBoxInput);
    }

    public WebElement getSearchIcon() {
        return driver.findElement(searchIcon);
    }
    public WebElement getClose() {
        return driver.findElement(close);
    }

    public WebElement getSearchBox() {
        return driver.findElement(searchBoxInput);
    }

    public WebElement getSearchButton() {
        return driver.findElement(searchIcon);
    }

    public WebElement getSortFirstName() {
        return driver.findElement(sortFirstName);
    }

    public WebElement getSortLastName() {
        return driver.findElement(sortLastName);
    }

    public WebElement getSortAge() {
        return driver.findElement(sortAge);
    }

    public WebElement getSortEmail() {
        return driver.findElement(sortEmail);
    }

    public WebElement getSortSalary() {
        return driver.findElement(sortSalary);
    }

    public WebElement getSortDepartment() {
        return driver.findElement(sortDepartment);
    }

    public WebElement getSortActions() {
        return driver.findElement(sortActions);
    }

    public WebElement getEdit() {
        return driver.findElement(edit);
    }
    public List<WebElement> getExist() {
        return driver.findElements(exist);
    }

    public void delete(int i) {
        getExist().get(i).findElement(delete).click();
    }

    public void select(String value) {
        Select sort = new Select(driver.findElement(rows));
        sort.selectByValue(value);
    }

    public WebElement getPage() {
        return driver.findElement(page);
    }

    public WebElement getNextPage() {
        return driver.findElement(nextPage);
    }

    public WebElement getPreviousPage() {
        return driver.findElement(previousPage);
    }




   public void clickAddButton(){
       getAddButton().click();
   }

    public void addTableEntry(String firstName, String lastName, String email, int age, int salary, String department){
        clickAddButton();
        getFirstNameInput().sendKeys(firstName);
        getLastNameInput().sendKeys(lastName);
        getEmailInput().sendKeys(email);
        getAgeInput().sendKeys(String.valueOf(age));
        getSalaryInput().sendKeys(String.valueOf(salary));
        getDepartmentInput().sendKeys(department);
        getSubmitButton().click();

    }

    public void clickCloseButton(){
        getClose().click();
    }

    public void inputTextInSearchBox(String searchText){
        getSearchBoxInput().sendKeys(searchText);
    }

    public void clickOnSearchIcon(){
        getSearchIcon().click();
    }




}
