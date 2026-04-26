package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import base.BasePage;

public class FramePage extends BasePage {

    public FramePage(WebDriver driver) {
        super(driver);
    }

    String frameURL = "https://testpages.eviltester.com/styled/frames/frames-test.html";


    public void openFramePage() {
        driver.get(frameURL);
        waitForPageLoad();
    }

  
    public String getLeftFrameText() {
        driver.switchTo().defaultContent();   
        driver.switchTo().frame("left");

        String text = driver.findElement(By.tagName("body")).getText();

        driver.switchTo().defaultContent();
        return text;
    }

   
    public String getMiddleFrameText() {
        driver.switchTo().defaultContent();   
        driver.switchTo().frame("middle");

        String text = driver.findElement(By.tagName("body")).getText();

        driver.switchTo().defaultContent();
        return text;
    }

   
    public String handleNestedFrame() {

        driver.switchTo().defaultContent();   

      
        driver.switchTo().frame("middle");

        String text = driver.findElement(By.tagName("body")).getText();

        driver.switchTo().defaultContent();

        return text;
    }
}