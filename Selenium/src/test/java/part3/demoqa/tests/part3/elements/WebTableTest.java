package part3.demoqa.tests.part3.elements;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3.demoqa.base.BaseTest;

public class WebTableTest extends BaseTest {

    @Test
    public void testWebTable() {

        String email = "alden@example.com";
        String expectedAge = "46";

        var webTablePage = homePage.goToElements().clickWebTables();
        webTablePage.clickEdit(email);
        webTablePage.setAge("46");
        webTablePage.clickSubmitButton();
        String actualAge = webTablePage.getTableAge(email);

        Assert.assertEquals(actualAge, expectedAge, "\n Actual and expected age do not match \n");
    }
}
