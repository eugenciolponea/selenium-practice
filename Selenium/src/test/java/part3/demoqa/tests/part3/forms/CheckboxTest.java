package part3.demoqa.tests.part3.forms;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3.demoqa.base.BaseTest;

public class CheckboxTest extends BaseTest {

    @Test
    public void testCheckbox() {
        var formsPage = homePage.goToForms().clickPracticeMenuForm();
        formsPage.clickSportsCheckbox();
        formsPage.clickMusicCheckbox();
        formsPage.clickReadingCheckbox();
        formsPage.unclickReadingCheckbox();

        Assert.assertFalse(formsPage.isReadingSelected(), "\n Reading checkbox is selected \n");
    }
}
