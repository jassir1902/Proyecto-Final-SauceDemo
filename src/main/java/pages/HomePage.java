package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {
    WebDriver driver;
    @FindBy(className = "app_logo")
    WebElement sauceDemoTitle;

    @FindBy(className = "inventory_item_name")
    List<WebElement> productsTitle;

    @FindBy(className = "shopping_cart_badge")
    WebElement cartBadge;

    @FindBy(css = "#shopping_cart_container>a")
    WebElement cartIcon;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean sauceDemoTitleIsDisplayed() {
        if (sauceDemoTitle.isDisplayed()) {
            return true;
        }
        return false;
    }

    public boolean isProductInHomePage(String productName) {
        for (WebElement element : productsTitle) {
            if (element.getText().equalsIgnoreCase(productName)) {
                return true;
            }
        }
        return false;
    }

    public void addProductToCart(String productName) {
        // add-to-cart-sauce-labs-bolt-t-shirt
        // sauce labs bolt t-shirt
        String productId = "add-to-cart-" + productName.replace(" ", "-").toLowerCase();
        WebElement productAddToCartButton = driver.findElement(By.id(productId));
        productAddToCartButton.click();
    }

    public boolean verifyCartIconNumber(String cartNumber) {
        String actualCartNumber = cartBadge.getText();
        if (actualCartNumber.equalsIgnoreCase(cartNumber)) {
            return true;
        }
        return false;
    }

    public void removeProductFromCart(String productName) {
        // remove-sauce-labs-bolt-t-shirt
        // sauce labs bolt t-shirt
        String productId = "remove-" + productName.replace(" ", "-").toLowerCase();
        WebElement removeProductButton = driver.findElement(By.id(productId));
        removeProductButton.click();
    }

    public void clickOnCartButton() {cartIcon.click();}
}


