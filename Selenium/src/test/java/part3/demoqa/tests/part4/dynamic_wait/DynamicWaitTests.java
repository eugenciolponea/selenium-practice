package part3.demoqa.tests.part4.dynamic_wait;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3.demoqa.base.BaseTest;

public class DynamicWaitTests extends BaseTest {

    @Test
    public void testVisibleAfterButtonText() {
        var dynamicPage = homePage.goToElements().clickDynamicProperties();

        String actualText = dynamicPage.getVisibleAfterButtonText();
        String expectedText = "Visible After 5 Seconds";
        Assert.assertEquals(actualText, expectedText,
                "\n Actual & Expected text do not match \n");
    }

    @Test
    public void testProgressBar() {
        var progressBarPage = homePage.goToWidgets().clickProgressBar();
        progressBarPage.clickStartButton();

        String actualValue = progressBarPage.getProgressValue();
        String expectedValue = "100%";
        Assert.assertEquals(actualValue, expectedValue,
                "\n Value is Not 100% \n");
    }
}
