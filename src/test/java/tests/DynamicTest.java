package tests;

import org.testng.annotations.*;
import base.BaseTest;
import pages.DynamicPage;

@Listeners(listener.TestListener.class)
public class DynamicTest extends BaseTest {

    DynamicPage page;

    @BeforeMethod
    public void init() {
        page = new DynamicPage(driver);
    }

    @Test
    public void testDynamicButtons() {

        page.openDynamicPage();
        page.clickDynamicButtons();
    }
}