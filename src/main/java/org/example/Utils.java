package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BasePage {
    //Create clickOn method to click on any element
    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    //Create typeText method when we type in the box
    public static void typeText(By by, String text) {
        driver.findElement(by).sendKeys(new CharSequence[]{text});
    }

    //Create getText method
    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    //Create timeStamp Method for email id creation
    public static String timeStamp() {
        String timeStamp = (new SimpleDateFormat("yyyyMMddHHmmss")).format(new Date());
        return timeStamp;
    }

    //Create selectByText method
    public static void selectByText(By by, String text) {
        Select selectDay = new Select(driver.findElement(by));
        selectDay.selectByVisibleText(text);
    }

    public static void selectByIndexOfTheElement(By by, int index) {
        Select selectMonth = new Select(driver.findElement(by));
        selectMonth.selectByIndex(index);
    }

    //Declared variable for email id
    static String email = "khushi" + timeStamp() + "@gmail.com";

    //Declared variable for password
    static String password = "H@12345";

    public static void captureScreenshot(String screenShotName) {

        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(source, new File("ScreenshotsTS\\" + screenShotName + timeStamp() + ".png"));
            System.out.println("Screenshot taken");
        } catch (
                IOException e) {
            System.out.println("Exception while taking screenshot" + e.getMessage());
        }

    }
}
