package part3.demoqa.tests.part4.interactions;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3.demoqa.base.BaseTest;

public class KeyboardTest extends BaseTest {

    @Test
    public void testApplicationUsingKeyboard() {
        var textBoxPage = homePage.goToElements().clickTextBoxMenuItem();
        textBoxPage.setFullName("Eugen Mihai C");
        textBoxPage.setEmail("eugenmihai@gmail.com");
        textBoxPage.setCurrentAddress("Aleea Trandafirilor");
        textBoxPage.setCurrentAddress("Slatina");
        textBoxPage.setCurrentAddress("Olt");
        textBoxPage.clickSubmitButton();

        String actualAddress = textBoxPage.getCurrentAddress();
        Assert.assertTrue(actualAddress.contains("Slatina"),
                "Actual address does not contain Slatina city");
    }
}
