package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.pages.WomenPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;

@Listeners(CustomListeners.class)
public class WomenTest extends BaseTest {
   WomenPage womenPage;
    @BeforeMethod(alwaysRun = true)
    public void inIt(){womenPage = new WomenPage();}
    @Test(groups = {"sanity","regression"})
    public void verifyTheSortByProductNameFilter(){
    womenPage.mouseHoverOnWomenMenuTab();
    womenPage.mouseHoverOnTopTab();
    womenPage.clickOnJackets();
    womenPage.selectSortByFilterProductName();

    // Verify the products name display in alphabetical order
     ArrayList<String> actualList = getArrayListOfStringsFromWebElements(womenPage.returnListOfProductNamesElementsLocator());
     ArrayList<String> expectedList = getArrayListOfStringsFromWebElements(womenPage.returnListOfProductNamesElementsLocator());

     Collections.sort(expectedList);
     Assert.assertEquals(actualList, expectedList, "Error message: Products are not displayed in alphabetical order");

    }
      @Test(groups = {"smoke","regression"})
      public void verifyTheSortByPriceFilter(){
     womenPage.mouseHoverOnWomenMenuTab();
     womenPage.mouseHoverOnTopTab();
     womenPage.clickOnJackets();
     womenPage.selectSortByFilterPrice();

     // Verify the products price display in Low to High
       ArrayList<String> actualList = getArrayListOfStringsFromWebElements(womenPage.returnListOfPriceElementsLocator());
       ArrayList<String> expectedList = getArrayListOfStringsFromWebElements(womenPage.returnListOfPriceElementsLocator());


       Collections.sort(expectedList);
       Assert.assertEquals(actualList, expectedList, "Error message: Products are not displayed in alphabetical order");


      }
}
