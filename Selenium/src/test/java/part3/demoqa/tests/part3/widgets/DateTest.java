package part3.demoqa.tests.part3.widgets;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3.demoqa.base.BaseTest;

public class DateTest extends BaseTest {

    @Test
    public void testSelectingDate() {

        String month = "May";
        String monthNumber = "05";
        String day = "16";
        String year = "2034";

        var datePickerPage = homePage.goToWidgets().clickDatePicker();
        datePickerPage.clickSelectDate();
        datePickerPage.selectMonth(month);
        datePickerPage.selectYear(year);
        datePickerPage.clickDay(day);

        String actualDate = datePickerPage.getDate();
        String expectedDate = monthNumber + "/" + day + "/" + year;
        Assert.assertEquals(actualDate, expectedDate, "\n Actual & Expected Dates do not match \n" +
                            "\n Actual Date:  " + actualDate + "\n Excepted Date:  " + expectedDate);
    }
}
