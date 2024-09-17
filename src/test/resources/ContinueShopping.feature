Feature: Continue Shopping feature

  Background: User logs in and navigates to the cart
    Given I am in sauce demo web page
    When I set the user name text box with "standard_user"
    And I set the password text box with "secret_sauce"
    And I click on the login button
    And I click on the cart button

    Scenario: Continue Shopping
      Given The cart should be displayed
      When I click on the Continue Shopping button
      Then The home page should be displayed

