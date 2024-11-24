package part3.demoqa.tests.part3.forms;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3.demoqa.base.BaseTest;

public class RadioButtonTest extends BaseTest {

    @Test
    public void testRadioButton() {
        var formsPage = homePage.goToForms().clickPracticeMenuForm();
        formsPage.clickMaleRadioButton();
        Assert.assertTrue(formsPage.isMaleSelected(),"\n Male radio button not selected \n");
    }
}
