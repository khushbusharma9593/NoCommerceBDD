package org.example;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks extends BrowserManager
{
    @Before
    public void setUp(){
        openBrowser();
    }

 @After
      public void tearDown(Scenario scenario)
    {//Create TakeScreenshot method if any test case is failed , so automatic it will take screenshot of
        if (scenario.isFailed())
        {
            TakesScreenshot ts =(TakesScreenshot) driver;
            byte[]src =ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(src,"image/png","screenshot");
        }
        closeBrowser();

    }
}
