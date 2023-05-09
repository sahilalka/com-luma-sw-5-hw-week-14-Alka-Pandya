package com.softwaretestingboard.magento.pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class WomenPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//a[@class='level-top ui-corner-all'][@id='ui-id-4']")
    WebElement  womenMenu;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-9']")
    WebElement topMenu;

    @CacheLookup
    @FindBy(css = "a[id='ui-id-11'] span")
    WebElement  jackets;

    @CacheLookup
    @FindBy(xpath = "//select[@id='sorter']")
    WebElement dropDownListProductName;

    @CacheLookup
    @FindBy(xpath = "//strong[@class='product name product-item-name']//a")
    WebElement productNamesElements;

    @CacheLookup
    @FindBy(xpath = "(//select[@id='sorter'])[1]")
    WebElement dropDownListPrice;

    @CacheLookup
    @FindBy(xpath = "//div[@class='product details product-item-details']//div[@class='price-box price-final_price']")
    WebElement priceElements;

    public void mouseHoverOnWomenMenuTab() {
        Reporter.log("mouseHoverOnWomenMenuTab");
        CustomListeners.test.log(Status.PASS,"mouseHoverOnWomenMenuTab");
        mouseHoverToElement(womenMenu);
    }

    public void mouseHoverOnTopTab() {
        Reporter.log("mouseHoverOnTopTab");
        CustomListeners.test.log(Status.PASS,"mouseHoverOnTopTab");
        mouseHoverToElement(topMenu);
    }
    public void clickOnJackets() {
        Reporter.log("clickOnJackets");
        CustomListeners.test.log(Status.PASS,"clickOnJackets");
        clickOnElement(jackets);
    }

    public void selectSortByFilterProductName() {
        Reporter.log("selectSortByFilterProductName");
        CustomListeners.test.log(Status.PASS,"selectSortByFilterProductName");
        selectByVisibleTextFromDropDown(dropDownListProductName,"Product Name");
    }

    public List<WebElement> returnListOfProductNamesElementsLocator() {
        Reporter.log("returnListOfProductNamesElementsLocator");
        CustomListeners.test.log(Status.PASS,"returnListOfProductNamesElementsLocator");
        List<WebElement> listOfElements = driver.findElements(By.xpath("//strong[@class='product name product-item-name']//a"));
        return listOfElements;
    }

    public List<WebElement> returnListOfPriceElementsLocator(){
        Reporter.log("returnListOfPriceElementsLocator");
        CustomListeners.test.log(Status.PASS,"returnListOfPriceElementsLocator");
        List<WebElement> listOfElements = driver.findElements(By.xpath("//div[@class='product details product-item-details']//div[@class='price-box price-final_price']"));
        return listOfElements;
    }
    public void selectSortByFilterPrice() {
        Reporter.log("selectSortByFilterPrice");
        CustomListeners.test.log(Status.PASS,"selectSortByFilterPrice");
        selectByVisibleTextFromDropDown(dropDownListPrice,"Price");
    }










}
