package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.pages.GearPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class GearTest extends BaseTest {
    GearPage gearPage;
    @BeforeMethod(alwaysRun = true)
    public void inIt(){gearPage = new GearPage();}
    @Test(groups = {"sanity","regression"})
   public void userShouldAddProductSuccessFullyToShoppingCart()throws InterruptedException{
        //1.Mouse Hover on Gear Menu
        Thread.sleep(2000);
        gearPage.mouseHoverOnGearMenu();
        //2.Click on Bags
        gearPage.mouseHoverAndClickOnBags();
        //3.Click on Product Name ‘Overnight Duffle’
        gearPage.clickOnOverNightDuffleProductName();
        //4.Verify the text ‘Overnight Duffle’
        Assert.assertEquals(gearPage.getOverNightDuffleText(),"Overnight Duffle","Error");
        //5.Change Qty 3
        gearPage.changeQuantity3();
        //6.Click on ‘Add to Cart’ Button.
        gearPage.clickOnAddToCartButton();
        //7.Verify the text‘You added Overnight Duffle to your shopping cart.’
        Assert.assertEquals(gearPage.getProductAddedToShoppingCartText(),"You added Overnight Duffle to your shopping cart.","Error");
        //8.Click on ‘shopping cart’ Link into message
        gearPage.clickOnShoppingCart();
        Thread.sleep(2000);
        //9.Verify the product name ‘Overnight Duffle’
        Assert.assertEquals(gearPage.getProductNameOvernightDuffle(),"Overnight Duffle","Error");
        Thread.sleep(1000);
        // Verify the Qty is '3'
         Assert.assertEquals(gearPage.getTextFromTheEnteredQuantity(),"3","Error");
        // Verify the product price ‘$135.00’
        Assert.assertEquals(gearPage.getProductPriceText(),"$135.00","Error");
        // Change Qty to ‘5’
        gearPage.changeQuantity5();
        //Click on ‘Update Shopping Cart’ button
        gearPage.clickOnUpdateShoppingCart();
        //Verify the product price ‘$225.00’
        Assert.assertEquals( gearPage.verifyProductPrice225(),"$225.00","Error");







   }

}
