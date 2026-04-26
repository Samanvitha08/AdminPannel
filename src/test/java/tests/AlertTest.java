package tests;

import org.testng.annotations.*;
import base.BaseTest;
import pages.AlertPage;

@Listeners(listener.TestListener.class)
public class AlertTest extends BaseTest {

    AlertPage alert;

    @BeforeMethod
    public void init() {
        alert = new AlertPage(driver);
    }

 
    @Test
    public void testSimpleAlert() {
        alert.openAlertPage();
        alert.clickSimpleAlert();
    }


    @Test
    public void testConfirmAlert() {
        alert.openAlertPage();
        alert.acceptConfirm();
        alert.dismissConfirm();
    }


    @Test
    public void testPromptAlert() {
        alert.openAlertPage();
        alert.handlePrompt("Hello Selenium");
    }
}