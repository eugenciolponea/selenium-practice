package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

import java.util.Set;

import static utilities.SwitchToUtility.switchToWindow;

public class BrowserWindowsPage extends Alerts_Frames_WindowsPage {

    private By newWindowButton = By.id("windowButton");

    public void clickNewWindowButton() {
        click(newWindowButton);
    }

    public void switchToNewWindow() {
        String currentHandle = driver.getWindowHandle();
        System.out.println("Main Window Id: " + currentHandle + "\n");

        Set<String> allHandles = driver.getWindowHandles();
        System.out.println("Number of open windows: " + allHandles.size() + "\n");
        for(String handle : allHandles) {
            if(currentHandle.equals(handle)) {
                System.out.println("1st Window ID: " + handle + "\n");
            } else {
                switchToWindow(handle);
                System.out.println("2nd Window ID: " + handle + "\n");
            }
        }

    }
}
