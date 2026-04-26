package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import base.BasePage;

public class AlertPage extends BasePage {

    public AlertPage(WebDriver driver) {
        super(driver);
    }

   
    String alertURL = "https://testpages.eviltester.com/styled/alerts/alert-test.html";


    By alertBtn   = By.id("alertexamples");
    By confirmBtn = By.id("confirmexample");
    By promptBtn  = By.id("promptexample");


    public void openAlertPage() {
        driver.get(alertURL);
        waitForPageLoad();
    }

  
    public void clickSimpleAlert() {
        safeClick(alertBtn);
        acceptAlert();   
    }

    public void acceptConfirm() {
        safeClick(confirmBtn);
        acceptAlert();   
    }

    public void dismissConfirm() {
        safeClick(confirmBtn);
        dismissAlert();  
    }

  
    public void handlePrompt(String text) {
        safeClick(promptBtn);

        driver.switchTo().alert().sendKeys(text);
        driver.switchTo().alert().accept();
    }
}