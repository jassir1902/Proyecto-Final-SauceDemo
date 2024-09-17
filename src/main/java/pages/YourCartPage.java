package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourCartPage {
    WebDriver driver;

    @FindBy(id = "checkout")
    WebElement checkoutButton;

    @FindBy(xpath = "//*[@id='header_container']/div[2]/span")
    WebElement cartTitle;

    @FindBy(css = "#continue-shopping")
    WebElement continueS;

    public YourCartPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean verifyCartTitle() {
        String actualCartTitle = cartTitle.getText();
        if (actualCartTitle.equalsIgnoreCase("Your Cart")) {
            return true;
        }
        return false;
    }

    public void continueShopping(){
        continueS.click();
    }

    public void clickOnCheckoutButton(){
        checkoutButton.click();
    }
}
