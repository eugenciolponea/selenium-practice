package part3.demoqa.tests.part4.screenshots;

import org.testng.annotations.Test;
import part3.demoqa.base.BaseTest;

public class CaptureFailedScreenshotTest extends BaseTest {
    @Test
    public void testSubmitButtonWithoutJavaScriptExecutor() {
        var practiceFormPage = homePage.goToForms().clickPracticeMenuForm();
        practiceFormPage.clickSubmitButton();
    }
}
