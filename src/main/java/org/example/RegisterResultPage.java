package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterResultPage extends Utils
{
    //Create variable
    String expectedRegistrationSuccessMessage = "Your registration completed......";

    public void verifyUserRegisteredSuccessfully()
    {//Assert method is used for comparison of actual and expected result
        String actualRegistrationMessage = getTextFromElement(By.className("result"));
        Assert.assertEquals(actualRegistrationMessage, expectedRegistrationSuccessMessage, "Your registration is not completed or message is incorrect");
    }
}

