package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import java.util.List;
import base.BasePage;

public class TablePage extends BasePage {

    public TablePage(WebDriver driver) {
        super(driver);
    }

 
    String tableURL = "https://testpages.eviltester.com/styled/tag/table.html";

 
    By headers = By.xpath("//table//th");
    By rows = By.xpath("//table//tr");
    By cells = By.xpath("//table//td");

    
    public void openTablePage() {
        driver.get(tableURL);
        waitForPageLoad();
    }


    public int getHeaderCount() {
        return driver.findElements(headers).size();
    }

   
    public int getRowCount() {
        return driver.findElements(rows).size();
    }

  
    public int getCellCount() {
        return driver.findElements(cells).size();
    }


    public String getCellValue(int row, int col) {
        String xpath = "//table//tr[" + row + "]//td[" + col + "]";
        return driver.findElement(By.xpath(xpath)).getText();
    }

 
    public void printTable() {
        List<WebElement> allRows = driver.findElements(rows);

        for (WebElement r : allRows) {
            System.out.println(r.getText());
        }
    }
}
