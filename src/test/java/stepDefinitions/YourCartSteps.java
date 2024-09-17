package stepDefinitions;

import Utilities.DriverManager;
import io.cucumber.java.en.And;
import org.junit.jupiter.api.Assertions;
import pages.YourCartPage;

public class YourCartSteps {
    YourCartPage yourCartPage = new YourCartPage(DriverManager.getDriver().driver);

    @And("The cart should be displayed")
    public void verifyCartTitle(){
        Assertions.assertTrue(yourCartPage.verifyCartTitle());
    }

    @And("I click on the Continue Shopping button")
    public void continueShopping(){
        yourCartPage.continueShopping();
    }

    @And("I click on the checkout button")
    public void clickOnCheckoutButton(){
        yourCartPage.clickOnCheckoutButton();
    }
}
