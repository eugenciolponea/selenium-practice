package part3.demoqa.tests.part3.widgets;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3.demoqa.base.BaseTest;

import java.util.List;

public class SelectDropdownTest extends BaseTest {

    @Test
    public void testMultiSelectDropDown() {

        var selectMenuPage = homePage.goToWidgets().clickSelectMenu();
        selectMenuPage.selectStandardMulti("Volvo");
        selectMenuPage.selectStandardMulti(1);
        selectMenuPage.selectStandardMulti("Audi");
        selectMenuPage.selectStandardMulti(2);

        selectMenuPage.deselectStandardMulti("saab");

        List<String> actualSelectedOptions = selectMenuPage.getAllSelectedStandardMultiOptions();
        Assert.assertTrue(actualSelectedOptions.contains("Volvo"));
        Assert.assertTrue(actualSelectedOptions.contains("Opel"));
        Assert.assertFalse(actualSelectedOptions.contains("Saab"));
        Assert.assertTrue(actualSelectedOptions.contains("Audi"));

    }
}
