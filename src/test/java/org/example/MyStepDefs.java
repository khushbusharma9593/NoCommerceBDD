package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefs
{//Create object of classname for calling the method in this class
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    BrowserManager browserManager = new BrowserManager();
    CategoryPage categoryPage=new CategoryPage();


    @Given("I am on NopCommerce HomePage")
    public void i_am_on_nop_commerce_home_page()
    {
        homePage.clickOnRegisterButton();
    }
    @When("I click on Register button")
    public void i_click_on_register_button()
    {
    }
    @When("I enter all required registration details")
    public void i_enter_all_required_registration_details()
    {
        registerPage.enterRegistrationDetails();
    }
    @Then("I should able to register successfully")
    public void i_should_able_to_register_successfully()
    {
        registerResultPage.verifyUserRegisteredSuccessfully();
    }
    @Given("I am on NopCommerce CategoryPage")
    public void iAmOnNopCommerceCategoryPage()
    {
        categoryPage.verifyHoverOnComputerCategory();
    }

    @When("I click on Computer button")
    public void iClickOnComputerButton()
    {
        categoryPage.verifyHoverOnComputerCategory();
    }

    @Then("I should able to change Category color successfully")
    public void iShouldAbleToChangeCategoryColorSuccessfully()
    {
        categoryPage.verifyCategoryTextColor();
    }


}
