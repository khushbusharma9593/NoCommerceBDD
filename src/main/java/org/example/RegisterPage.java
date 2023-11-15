package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterPage extends Utils
{   //Create below Global variables for reusability purpose
    private By _registerSubmitButton = By.id("register-button");
    private By _genderOfUser = By.id("gender-male");
    private By _firstNameField = By.name("FirstName");
    private By _lastNameField = By.name("LastName");
    private By _dateOfBirthDay = By.name("DateOfBirthDay");
    private By _dateOfBirthMonth = By.name("DateOfBirthMonth");
    private By _dateOfBirthYear = By.name("DateOfBirthYear");
    private By _emailOfUser = By.name("Email");
    private By _passwordOfUser = By.name("Password");
    private By _confirmPassword = By.name("ConfirmPassword");

    public void verifyUserIsOnRegisterPage()
    {
//Enter URL of register button
       Assert.assertTrue(driver.getCurrentUrl().contains("register"), "User is NOT on register page");
    }
    //Create method
    public void enterRegistrationDetails()
    {
        //click on Register button
        clickOnElement(_registerSubmitButton);  //click on register button by using reusability method

        //clicking on male option by using this method
        clickOnElement(_genderOfUser);


        //enter first name by using typeText method
        typeText(_firstNameField, "Raj");

        //enter last name by using typeText method
        typeText(_lastNameField, "Verma");

        //Create object of selectDay
        selectByText(_dateOfBirthDay, "21");

        //Create object of selectMonth
        selectByText(_dateOfBirthMonth, "May");

        //Create object of selectYear
        selectByText(_dateOfBirthYear, "1995");

        //enter email id
        typeText(_emailOfUser, email);

        //enter password  by using typeText method
        typeText(_passwordOfUser, password);

        //enter confirm password  by using typeText method
        typeText(_confirmPassword, password);

        //click on register button fill all the information by using this method
        clickOnElement(_registerSubmitButton);

    }
}
