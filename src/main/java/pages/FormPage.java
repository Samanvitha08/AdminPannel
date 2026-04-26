package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import base.BasePage;

public class FormPage extends BasePage {

    public FormPage(WebDriver driver) {
        super(driver);
    }

   
    String basicURL  = "https://testpages.eviltester.com/styled/basic-html-form-test.html";
    String fancyURL = "https://testpages.eviltester.com/styled/basic-html-form-test.html";
    String uploadURL = "https://testpages.eviltester.com/styled/file-upload-test.html";

  
    By username = By.name("username");
    By password = By.name("password");
    By comments = By.name("comments");
    By checkbox1 = By.cssSelector("input[value='cb1']");
    By radio1 = By.cssSelector("input[value='rd1']");
    By dropdown = By.name("dropdown");
    By submitBtn = By.cssSelector("input[type='submit']");


    By email = By.cssSelector("input[type='email']");
    By number = By.cssSelector("input[type='number']");
    By date = By.cssSelector("input[type='date']");

   
    By fileInput = By.name("filename");

  
    public void openBasicForm() {
        driver.get(basicURL);
        waitForPageLoad();
    }

    public void fillBasicForm(String user, String pass, String comment) {
        type(username, user);
        type(password, pass);
        type(comments, comment);

        safeClick(checkbox1);
        safeClick(radio1);

        Select select = new Select(waitForElement(dropdown));
        select.selectByVisibleText("Drop Down Item 2");
    }

    public void submitBasicForm() {
        safeClick(submitBtn);
    }

  
    public void openFancyForm() {
        driver.get(fancyURL);
        waitForPageLoad();
    }

    public void fillFancyForm(String mail, String numVal, String dateVal) {
        type(email, mail);
        type(number, numVal);
        type(date, dateVal);
    }

    public void submitFancyForm() {
        safeClick(submitBtn);
    }

   
    public void openFileUpload() {
        driver.get(uploadURL);
        waitForPageLoad();
    }

    public void uploadFile(String path) {
        waitForElement(fileInput).sendKeys(path);
    }

    public void submitUpload() {
        safeClick(submitBtn);
    }
}