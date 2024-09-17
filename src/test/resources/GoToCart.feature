Feature: GoToCart feature

  Background: User logs in and navigates to home page
    Given I am in sauce demo web page
    When I set the user name text box with "standard_user"
    And I set the password text box with "secret_sauce"
    And I click on the login button

    Scenario: Go to Cart
      Given The home page should be displayed
      When I click on the cart button
      Then The cart should be displayed

