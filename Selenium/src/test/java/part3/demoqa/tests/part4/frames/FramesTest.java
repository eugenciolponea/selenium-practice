package part3.demoqa.tests.part4.frames;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3.demoqa.base.BaseTest;

public class FramesTest extends BaseTest {

    @Test
    public void testFramesBigBox() {
        var framesPage = homePage.goToAlertsFramesWindowsCard().clickFrameMenuItem();
        String actualBigBoxText = framesPage.getTextInBigFrame();
        String expectedBigBoxText = "This is a sample page";
        Assert.assertEquals(actualBigBoxText, expectedBigBoxText,
                "Actual & Expected Text do not match");

        String actualHeaderText = framesPage.getHeaderFramesText();
        String expectedHeaderText = "Frames";
        Assert.assertEquals(actualHeaderText, expectedHeaderText,
                "Actual & Expected header do not match");
    }

    @Test
    public void testFramesSmallBox() {
        var framesPage = homePage.goToAlertsFramesWindowsCard().clickFrameMenuItem();
        String actualSmallBoxText = framesPage.getTextInSmallFrame();
        String expectedSmallBoxText = "This is a sample page";

        Assert.assertEquals(actualSmallBoxText, expectedSmallBoxText,
                "Actual & Expected small text do no match");

        String actualHeaderText = framesPage.getHeaderFramesText();
        String expectedHeaderText = "Frames";
        Assert.assertEquals(actualHeaderText, expectedHeaderText,
                "Actual & Expected header do not match");
    }

}
