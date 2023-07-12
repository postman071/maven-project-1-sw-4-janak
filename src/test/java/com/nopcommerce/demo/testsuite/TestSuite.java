package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.basetest.BaseTest;
import com.nopcommerce.demo.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSuite extends BaseTest
{
    HomePage homePage = new HomePage();
    ComputerPage computersPage = new ComputerPage();
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    LoginPage loginPage = new LoginPage();
    CheckOutPage checkOutPage = new CheckOutPage();

    @Test
    public void verifyProductArrangeInAlphabeticalOrder()
    {
        homePage.clickOnComputerTab();
        computersPage.clickOnDesktop();
        String actualOrder = computersPage.sortDesktopByPositionZtoA().toString();
        String ExceptedOrder = computersPage.getAllProductNamesAfterShorting().toString();
        Assert.assertTrue(ExceptedOrder.contains(actualOrder));
    }
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() {
        String expectedMessage = "Build your own computer";
        homePage.clickOnComputerTab();
        computersPage.clickOnDesktop();
        computersPage.selectValueFromShortingDropDown("Name: A to Z");
        computersPage.clickAddToCartByProductName("Build your own computer");
        String actualMessage = buildYourOwnComputerPage.getBuildYourOwnComputerText();
        Assert.assertEquals(actualMessage, expectedMessage, " ");

        buildYourOwnComputerPage.selectProcessor("2.2 GHz Intel Pentium Dual-Core E2200");
        buildYourOwnComputerPage.selectRam("8GB [+$60.00]");
        buildYourOwnComputerPage.selectHDD("400 GB [+$100.00]");
        buildYourOwnComputerPage.selectOs("Vista Premium");
        //buildYourOwnComputerPage.selectMicrosoftOfficeSoftwareOption();
        buildYourOwnComputerPage.selectTotalCommanderSoftwareOption();
        String expectedMessage1 = "$1,470.00";
        String actualMessage1 = buildYourOwnComputerPage.getTotalPriceText();
        Assert.assertEquals(actualMessage1, expectedMessage1, " ");

        buildYourOwnComputerPage.clickOnAddToCart();
        String expectedMess = "The product has been added to your shopping cart";
        String actualMess = buildYourOwnComputerPage.getSuccessfullyAddedToCartText();

        buildYourOwnComputerPage.closeNotificationBar();
        buildYourOwnComputerPage.mouseHoverToShoppingCartAndClickOnCart();
        String expectedMsg = "Shopping cart";
        String actualMsg = shoppingCartPage.getShoppingCartText();
        Assert.assertEquals(actualMsg,expectedMsg, "  ");


        computersPage.changeQuantity();
        computersPage.clickOnUpdateCart();
        String expectedMessage2 = "$2,940.00";
        String actualMessage2 = shoppingCartPage.getPriceText();
        Assert.assertEquals(actualMessage2,expectedMessage2,"  ");


        shoppingCartPage.selectTermsAndCondition();
        shoppingCartPage.clickOnCheckOut();
        String expectedText = "Welcome, Please Sign In!";
        String actualText = loginPage.getWelcomeText();
        Assert.assertEquals(expectedText,actualText, "  ");


        loginPage.clickOnGuestCheckout();
        checkOutPage.enterFirstname("john");
        checkOutPage.enterLastname("david");
        checkOutPage.enterEmail("johndavid123@gmail.com");
        checkOutPage.selectCountry("United Kingdom");
        checkOutPage.enterCity("London");
        checkOutPage.enterAddress1("london");
        checkOutPage.enterPhoneNumber("07700017017");
        checkOutPage.clickOnContinue();
        checkOutPage.selectNextDayAir();
        checkOutPage.clickOnShippingContinue();
        checkOutPage.clickOnCreditCard();
        checkOutPage.clickOnPaymentContinue();
        checkOutPage.selectCreditCardType("Master card");
        checkOutPage.enterCardHolderName("John David");
        checkOutPage.enterCardNumber("5000667070221717");
        checkOutPage.selectExpirationDate("24", "2027");
        checkOutPage.enterCardCode("777");
        checkOutPage.clickOnPaymentInfoContinue();


        String expectedMg = "Credit Card";
        String actualMg = checkOutPage.getPaymentTypeText();
        Assert.assertEquals(actualMg,expectedMg," ");

        String expectedM3 = "Next Day Air";
        String actualM3 = checkOutPage.getShippingMethodText();
        Assert.assertEquals(actualM3,expectedM3);

        String expectedM7 = "$2,940.00";
        String actualM7 = checkOutPage.getTotalPriceText();
        Assert.assertEquals(actualM7,expectedM7," ");

        checkOutPage.clickOnConfirm();
        String expectedTxt = "Thank you";
        String actualTxt = homePage.getThankYouText();
        Assert.assertEquals(actualTxt,expectedTxt," ");

        String expectedMSg = "Your order has been successfully processed!";
        String actualMSg = homePage.getSuccessfulText();
        Assert.assertEquals(actualMSg,expectedMSg, "  ");

        homePage.clickOnContinue();

        String expectedM = "Welcome to our store";
        String actualM = homePage.getWelcomeStoreText();
        Assert.assertEquals(actualM,expectedM,"  ");
    }
}
