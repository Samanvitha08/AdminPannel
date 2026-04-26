package tests;

import org.testng.annotations.*;
import base.BaseTest;
import pages.FramePage;

public class FrameTest extends BaseTest {

    FramePage frame;

    @BeforeMethod
    public void init() {
        frame = new FramePage(driver);
    }

    @Test
    public void testFrames() {

        frame.openFramePage();

        String left = frame.getLeftFrameText();
        String middle = frame.getMiddleFrameText();

        System.out.println("Left Frame: " + left);
        System.out.println("Middle Frame: " + middle);
    }

    @Test
    public void testNestedFrames() {

        frame.openFramePage();

        String nested = frame.handleNestedFrame();

        System.out.println("Nested Frame: " + nested);
    }
}