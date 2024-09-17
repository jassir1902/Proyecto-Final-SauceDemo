package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourInformationPage {
    WebDriver driver;

    @FindBy(id = "first-name")
    WebElement firstNameTextBox;

    @FindBy(id="last-name")
    WebElement lastNameTextBox;

    @FindBy(id="postal-code")
    WebElement zipCodeTextBox;

    @FindBy(id = "continue")
    WebElement continueButton;

    @FindBy(xpath = "//*[@id='header_container']/div[2]/span")
    WebElement yourInformationTitle;

    @FindBy(xpath = "//*[@id='checkout_info_container']/div/form/div[1]/div[4]")
    WebElement errorMessage;




    public YourInformationPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean verifyYourInformationTitle() {
        String actualYourInformationTitle = yourInformationTitle.getText();
        if (actualYourInformationTitle.equalsIgnoreCase("Checkout: Your Information")) {
            return true;
        }
        return false;
    }

    public boolean errorMessageIsDisplayed() {
        try {
            return errorMessage.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void setFirstNameTextBox(String firstName){
        firstNameTextBox.sendKeys(firstName);
    }

    public void setLastNameTextBox(String lastName){
        lastNameTextBox.sendKeys(lastName);
    }

    public void setZipCodeTextBox(String zipCode){
        zipCodeTextBox.sendKeys(zipCode);
    }

    public void clickOnContinueButton(){
        continueButton.click();
    }
}
