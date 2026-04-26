package tests;

import org.testng.Assert;
import org.testng.annotations.*;
import base.BaseTest;
import pages.TablePage;

@Listeners(listener.TestListener.class)
public class TableTest extends BaseTest {

    TablePage page;

    @BeforeMethod
    public void init() {
        page = new TablePage(driver);
    }

   
    @Test
    public void testTableHeaders() {

        page.openTablePage();

        int headerCount = page.getHeaderCount();
        System.out.println("Headers: " + headerCount);

        Assert.assertTrue(headerCount > 0);
    }


    @Test
    public void testTableRows() {

        page.openTablePage();

        int rowCount = page.getRowCount();
        System.out.println("Rows: " + rowCount);

        Assert.assertTrue(rowCount > 1);
    }

    // ✅ Test 3: Cell Value Check
    @Test
    public void testCellData() {

        page.openTablePage();

        String value = page.getCellValue(2, 1);
        System.out.println("Cell Value: " + value);

        Assert.assertNotNull(value);
    }

    // ✅ Test 4: Print Table
    @Test
    public void testPrintTable() {

        page.openTablePage();
        page.printTable();
    }
}