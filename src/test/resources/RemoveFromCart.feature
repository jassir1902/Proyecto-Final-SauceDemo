Feature: Remove items from cart in Sauce Demo App

  Background: User logs in and navigates to home page
    Given I am in sauce demo web page
    When I set the user name text box with "standard_user"
    And I set the password text box with "secret_sauce"
    And I click on the login button

  Scenario: Remove product from the cart after adding two products
    Given I add to the cart the product "Sauce Labs Onesie"
    And I add to the cart the product "Sauce Labs Backpack"
    When I remove the product "Sauce Labs Backpack" from the cart
    Then The cart icon should display "1"
