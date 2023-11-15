Feature:Category

  @category
  Scenario: As a user, I should able to change the color of category successfully

    Given I am on NopCommerce CategoryPage
    When I click on Computer button
    Then I should able to change Category color successfully