package part3.demoqa.tests.part4.interactions;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3.demoqa.base.BaseTest;

public class SliderTest extends BaseTest {

    @Test
    public void testSliderResult() {
        int x = 180;
        int y = 0;

        var sliderPage = homePage.goToWidgets().clickSlider();
        sliderPage.moveSlider(x, y);

        String actualValue = sliderPage.getSliderValue();
        String expectedValue = "78";
        Assert.assertEquals(actualValue, expectedValue,
                "\n Actual & Expected Value do not match \n");
    }
}
