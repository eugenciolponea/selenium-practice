package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class ModalDialogsPage extends  Alerts_Frames_WindowsPage {
    private By smallModalButton = By.id("showSmallModal");
    private By smallModalText = By.xpath("//div[text()='This is a small modal. It has very less content']");
    private By closeButton = By.id("closeSmallModal");

    public void clickSmallModalButton() {
        scrollToElementJS(smallModalButton);
        click(smallModalButton);
    }

    public String getSmallModalText() {
        return find(smallModalText).getText();
    }

    public void clickCloseButton() {
        click(closeButton);
    }
}
