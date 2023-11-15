package org.example;

import org.openqa.selenium.By;

import static org.example.Utils.clickOnElement;

public class HomePage extends Utils
{//Create By method for reusability purpose
    private By _registerlink = By.xpath("//a[@class=\"ico-register\"]");
    public void clickOnRegisterButton()

    {
        clickOnElement(_registerlink);
    }

    }

