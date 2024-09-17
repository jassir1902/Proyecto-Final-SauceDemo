Feature: Verificar Datos Ingresados feature

  Background: User should be able to do a checkout
    Given I am in sauce demo web page
    When I set the user name text box with "standard_user"
    And I set the password text box with "secret_sauce"
    And I click on the login button
    And I click on the cart button
    And I click on the checkout button

  Scenario: Verificar datos erroneos
    Given The page Your Information is displayed
    When I fill the checkout information with
      | Jassir | Guzman | @@@@ |
    And I click on continue button
    Then The error message is displayed

