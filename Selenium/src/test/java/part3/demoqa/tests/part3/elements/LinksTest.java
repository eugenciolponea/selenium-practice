package part3.demoqa.tests.part3.elements;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3.demoqa.base.BaseTest;

public class LinksTest extends BaseTest {

    @Test
    public void testLinks() {
        var linksPage = homePage.goToElements().clickLinks();
        linksPage.clickBadRequestLink();
        String actualResponse = linksPage.getResponseLink();
        Assert.assertTrue(actualResponse.contains("400") && actualResponse.contains("Bad Request"),
                            "\n Actual response (" + actualResponse + ") " + "does not contain 400 Bad Request");
    }
}
