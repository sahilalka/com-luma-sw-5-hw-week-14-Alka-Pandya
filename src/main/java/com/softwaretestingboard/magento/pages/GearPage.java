package com.softwaretestingboard.magento.pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class GearPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-6']//span[contains(text(),'Gear')]")
    WebElement gearMenu ;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Bags')]" )
    WebElement bags ;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Overnight Duffle']")
    WebElement overNightDuffle;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Overnight Duffle')]")
    WebElement overNightDuffleText ;
    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement quantity3;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Add to Cart')]")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//body/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]")
    WebElement addDuffleText;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCart;
    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Overnight Duffle']")
    WebElement productNameOvernightDuffle;
    @CacheLookup
    @FindBy(css = ".input-text.qty")
    WebElement text3;
    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-price']//span[@class='price'][normalize-space()='$135.00']")
    WebElement price135;
    @CacheLookup
    @FindBy(css = ".input-text.qty")
    WebElement quantity5;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Update Shopping Cart']")
    WebElement updateShoppingCart;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'$225.00')]")
    WebElement productPrice225;
    public void mouseHoverOnGearMenu() {
        Reporter.log("mouse hover on gear menu");
        CustomListeners.test.log(Status.PASS,"mouse on gear menu");
        mouseHoverToElement(gearMenu);
    }

      public void mouseHoverAndClickOnBags() {
        Reporter.log("mouseHoverAndClickOnBags");
        CustomListeners.test.log(Status.PASS,"mouseHoverAndClickOnBags");
        mouseHoverToElementAndClick(bags);
     }

    public void clickOnOverNightDuffleProductName() {
        Reporter.log("clickOnOverNightDuffleProductName");
        CustomListeners.test.log(Status.PASS,"clickOnOverNightDuffleProductName");
        clickOnElement(overNightDuffle);
    }

    public String getOverNightDuffleText() {
        Reporter.log("getOverNightDuffleText");
        CustomListeners.test.log(Status.PASS,"getOverNightDuffleText'");
        return getTextFromElement(overNightDuffleText);
    }
       public void changeQuantity3() {
        Reporter.log("changeQuantity3");
        CustomListeners.test.log(Status.PASS,"changeQuantity3");
        clearValueFromTextBox(By.xpath("//input[@id='qty']"));
        sendTextToElement(quantity3, "3");
    }

    public void clickOnAddToCartButton() {
        Reporter.log("Add to Cart");
        CustomListeners.test.log(Status.PASS,"Add to Cart");
        clickOnElement(addToCart);
    }

    public String getProductAddedToShoppingCartText() {
        Reporter.log("Verify the text'‘You added Overnight Duffle to your shopping cart.’");
        CustomListeners.test.log(Status.PASS,"Verify the text'‘You added Overnight Duffle to your shopping cart.’");
        return getTextFromElement(addDuffleText);
    }

    public void clickOnShoppingCart() {
        Reporter.log("Click on Shopping Cart ");
        CustomListeners.test.log(Status.PASS,"Click on Shopping Cart");
        clickOnElement(shoppingCart);
    }

    public String getProductNameOvernightDuffle() {
        Reporter.log("verify the text Product Name Overnight Duffle");
        CustomListeners.test.log(Status.PASS,"verify the text Product Name Overnight Duffle");
        return getTextFromElement(productNameOvernightDuffle);
    }
    public String getTextFromTheEnteredQuantity(){
        Reporter.log("Verify the text '3'");
        CustomListeners.test.log(Status.PASS,"Verify the text '3'");
        return driver.findElement(By.cssSelector(".input-text.qty")).getAttribute("value");
    }

    public String getProductPriceText() {
        Reporter.log("Product Price 135");
        CustomListeners.test.log(Status.PASS,"Product Price 135");
        return getTextFromElement(price135);
    }

        public void changeQuantity5() {
        Reporter.log("verify qty 5");
        CustomListeners.test.log(Status.PASS,"verify qty 5");
        clearValue(quantity5);
        sendTextToElement(quantity5, "5");

    }
    public void clickOnUpdateShoppingCart(){
        Reporter.log("Update Shopping Cart");
        CustomListeners.test.log(Status.PASS,"Update Shopping Cart");
        clickOnElement(updateShoppingCart);
    }
    public String verifyProductPrice225(){
        Reporter.log("Verify the Product Price 225");
        CustomListeners.test.log(Status.PASS,"Verify the Product Price 225");
        return  getTextFromElement(productPrice225);

    }

}
