package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BrowserManager extends Utils
{//Create openBrowser method for opening of any website
    public void openBrowser()
    {
System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
driver =new ChromeDriver();


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20l));
        driver.manage().window().fullscreen();
        driver.get("https://demo.nopcommerce.com/");

    }//Create closeBrowser Method for closing all the windows
    public void closeBrowser()
    {
      driver.quit();
    }
}
