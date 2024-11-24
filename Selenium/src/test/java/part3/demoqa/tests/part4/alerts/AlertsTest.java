package part3.demoqa.tests.part4.alerts;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3.demoqa.base.BaseTest;

import static utilities.SwitchToUtility.*;

@Test
public class AlertsTest extends BaseTest {


    public void testInformationAlert() {

        String expectedAlertText = "You clicked a button";
        var alertsPage = homePage.goToAlertsFramesWindowsCard().clickAlertsMenuItem();
        alertsPage.clickInformationAlertButton();

        Assert.assertEquals(getAlertText(), expectedAlertText,
                "\n Actual and expected alert message do no match \n");
        acceptAlert();
    }

    public void testConfirmationAlert() {
        String expectedConfirmationResult = "You selected Cancel";
        var alertsPage = homePage.goToAlertsFramesWindowsCard().clickAlertsMenuItem();
        alertsPage.clickConfirmationAlertButton();
        dismissAlert();
        String actualConfirmationResult = alertsPage.getConfirmationResult();

        Assert.assertEquals(actualConfirmationResult, expectedConfirmationResult,
                "Actual and expected confirmation result do not match");
    }

    public void testPromptAlert() {
        String alertText = "eugen";
        var alertsPage = homePage.goToAlertsFramesWindowsCard().clickAlertsMenuItem();
        alertsPage.clickPromptAlertButton();
        setAlertText(alertText);
        acceptAlert();

        String actualResult = alertsPage.getPromptResult();
        String expectedResult = "You entered " + alertText;
        Assert.assertEquals(actualResult, expectedResult,
                "Actual and expected prompt alert do not match");
    }
}
