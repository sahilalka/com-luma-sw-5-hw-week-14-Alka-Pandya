package com.softwaretestingboard.magento.pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class MenPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-5']" )
    WebElement menMenu;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-18']//span[contains(text(),'Bottoms')]")
    WebElement bottomsMenu;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement pantsMenu;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cronus Yoga Pant']")
    WebElement productsName;

    @CacheLookup
    @FindBy(xpath = "//div[@class='swatch-opt-880']//div[@id='option-label-size-143-item-175']")
    WebElement productsSize;

    @CacheLookup
    @FindBy(xpath = "//div[@class='swatch-opt-880']//div[@id='option-label-color-93-item-49']")
    WebElement productColor;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/button[1]/span[1]")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']" )
    WebElement cronusYogaPantText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']" )
    WebElement  shoppingCartLink;

    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement  textShoppingCart;

    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement yogaPantProductName;

    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'32')]" )
    WebElement size32;


    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement blackColorProduct;

    public void mouseHoverOnMenMenuTab() {
        Reporter.log("mouseHoverOnMenMenuTab");
        CustomListeners.test.log(Status.PASS,"mouseHoverOnMenMenuTab");
        mouseHoverToElement(menMenu);
    }

    public void mouseHoverOnBottomsMenuTab() {
        Reporter.log("mouseHoverOnBottomsMenuTab");
        CustomListeners.test.log(Status.PASS,"mouseHoverOnBottomsMenuTab");
        mouseHoverToElement(bottomsMenu);
    }

    public void clickOnPants() {
        Reporter.log("clickOnPants");
        CustomListeners.test.log(Status.PASS,"clickOnPants");
        mouseHoverToElementAndClick(pantsMenu);
    }

    public void mouseHoverOnProductsName() {
        Reporter.log("mouseHoverOnProductsName");
        CustomListeners.test.log(Status.PASS,"mouseHoverOnProductsName");
        mouseHoverToElement(productsName);
    }

    public void clickOnProductSize() {
        Reporter.log("clickOnProductSize");
        CustomListeners.test.log(Status.PASS,"clickOnProductSize");
        mouseHoverToElementAndClick(productsSize);
    }

    public void clickOnProductColor() {
        Reporter.log("clickOnProductColor");
        CustomListeners.test.log(Status.PASS,"clickOnProductColor");
        mouseHoverToElementAndClick(productColor);
    }

    public void clickOnAddToCart() {
        Reporter.log("clickOnAddToCart");
        CustomListeners.test.log(Status.PASS,"clickOnAddToCart");
        mouseHoverToElementAndClick(addToCartButton);
    }

    public String getCronusYogaPantAddedText() {
        Reporter.log("getCronusYogaPantAddedText");
        CustomListeners.test.log(Status.PASS,"getCronusYogaPantAddedText");
        return getTextFromElement(cronusYogaPantText);
    }

    public void clickOnShoppingCartLink() {
        Reporter.log("clickOnShoppingCartLink");
        CustomListeners.test.log(Status.PASS,"clickOnShoppingCartLink");
        clickOnElement(shoppingCartLink);
    }

    public String getShoppingCartText() {
        Reporter.log("getShoppingCartText");
        CustomListeners.test.log(Status.PASS,"getShoppingCartText");
        return getTextFromElement(textShoppingCart);
    }

    public String getCronusYogaPantText(){
        Reporter.log("getCronusYogaPantText");
        CustomListeners.test.log(Status.PASS,"getCronusYogaPantText");
        return getTextFromElement(yogaPantProductName);
    }

    public String getProductSize32Text() {
        Reporter.log("getProductSize32Text");
        CustomListeners.test.log(Status.PASS,"getProductSize32Text");
        return getTextFromElement(size32);
    }

    public String getBlackColorProductText() {
        Reporter.log("getBlackColorProductText");
        CustomListeners.test.log(Status.PASS,"getBlackColorProductText");
        return getTextFromElement(blackColorProduct);
    }

}
