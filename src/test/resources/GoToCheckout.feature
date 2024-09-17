Feature: Checkout feature

  Background: User should be able to do a checkout
    Given I am in sauce demo web page
    When I set the user name text box with "standard_user"
    And I set the password text box with "secret_sauce"
    And I click on the login button
    And I click on the cart button

    Scenario: Go to Checkout
      Given The cart should be displayed
      And I click on the checkout button
      Then The page Your Information is displayed

