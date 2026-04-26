package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import base.BasePage;

public class DynamicPage extends BasePage {

    public DynamicPage(WebDriver driver) {
        super(driver);
    }

   
    String dynamicURL = "https://testpages.eviltester.com/styled/dynamic-buttons-disabled.html";


    By startBtn = By.id("button00");
    By oneBtn = By.id("button01");
    By twoBtn = By.id("button02");
    By threeBtn = By.id("button03");

  
    public void openDynamicPage() {
        driver.get(dynamicURL);
        waitForPageLoad();
    }


    public void clickDynamicButtons() {

        safeClick(startBtn);

        waitForElement(oneBtn);
        safeClick(oneBtn);

        waitForElement(twoBtn);
        safeClick(twoBtn);

        waitForElement(threeBtn);
        safeClick(threeBtn);
    }
}
