package tests;

import org.testng.annotations.*;
import base.BaseTest;
import pages.FormPage;

@Listeners(listener.TestListener.class)
public class FormTest extends BaseTest {

    FormPage form;

    @BeforeMethod
    public void init() {
        form = new FormPage(driver);
    }


    @Test(dataProvider = "basicData")
    public void testBasicForm(String user, String pass, String comment) {

        form.openBasicForm();
        form.fillBasicForm(user, pass, comment);
        form.submitBasicForm();
    }


    @Test
    public void testFileUpload() {

        form.openFileUpload();


        form.uploadFile("C:\\Users\\Public\\test.txt");

        form.submitUpload();
    }


    @DataProvider(name = "basicData")
    public Object[][] basicData() {
        return new Object[][]{
                {"user1", "pass1", "hello"},
                {"admin", "admin123", "testing"}
        };
    }
}