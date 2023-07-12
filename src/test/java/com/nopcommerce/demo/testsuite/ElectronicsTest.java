package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.basetest.BaseTest;
import com.nopcommerce.demo.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.UUID;

public class ElectronicsTest extends BaseTest
{
    String email;
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    MobilePage cellPhonePage = new MobilePage();

    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    RegisterPage registerPage = new RegisterPage();

    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully()
    {
        homePage.mouseHoverToElectronicTab();
        homePage.mouseHoverToCellPhoneAndClick();
        String expectedMessage = "Cell phones";
        String actualMessage = cellPhonePage.getMobileText();
        Assert.assertEquals(actualMessage,expectedMessage);
    }
    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully()
    {
        String name = UUID.randomUUID().toString();
        email = name + "@gmail.com";
        String option = "Register";

        homePage.mouseHoverToElectronicTab();
        homePage.mouseHoverToCellPhoneAndClick();
        String expectedMessage = "Cell phones";
        String actualMessage = cellPhonePage.getMobileText();
        Assert.assertEquals(actualMessage,expectedMessage);

        cellPhonePage.clickOnListViewIcon();
        cellPhonePage.selectPhoneFromList("Nokia Lumia 1020");

        String expectedMessage1 = "Nokia Lumia 1020";
        String actualMessage1 = cellPhonePage.getProductNameText();
        Assert.assertEquals(actualMessage1,expectedMessage1);

        String expectedMessage2 = "$349.00";
        String actualMessage2 = cellPhonePage.getPriceText();
        Assert.assertEquals(actualMessage2,expectedMessage2);

        cellPhonePage.changeQuantity();
        cellPhonePage.clickOnUpdateCart();

        String expectedMessage3 = "The product has been added to your shopping cart";
        String actualMessage3 = cellPhonePage.getAddedToCartTextSuccessfully();
        Assert.assertEquals(actualMessage3, expectedMessage3);

        cellPhonePage.closeNotificationBar();
        shoppingCartPage.mouseHoverToShoppingCard();
        shoppingCartPage.mouseHoverToGoToCardAndClick();

        String expectedText = "Shopping cart";
        String actualText = shoppingCartPage.getShoppingCartText();
        Assert.assertEquals(actualText, expectedText);

        String expectedMessage4 = "2";
        String actualMessage4 = shoppingCartPage.getNumberOfQuantityValue();
        Assert.assertEquals(actualMessage4, expectedMessage4);

        String expectedMessage5 = "$698.00";
        String actualMessage5 = shoppingCartPage.getPriceText();
        Assert.assertEquals(actualMessage5, expectedMessage5);

        shoppingCartPage.selectTermsAndCondition();
        shoppingCartPage.clickOnCheckOut();

        String expectedSignInMessage = "Welcome, Please Sign In!";
        String actualSignInMessage = loginPage.getWelcomeText();
        Assert.assertEquals(expectedSignInMessage, actualSignInMessage);

        homePage.clickOnRegisterTab();
        registerPage.enterFirstname("john");
        registerPage.enterLastname("david");
        registerPage.enterEmail(email);
        registerPage.enterPassword("Johndavid@123");
        registerPage.enterConfirmPassword("Johndavid@123");
        registerPage.clickOnRegisterButton();

        String expectedRegMessage = "Your registration completed";
        String actualRegMessage = registerPage.getRegistrationCompletedText();
        Assert.assertEquals(actualRegMessage,expectedRegMessage);

        System.out.println("Shopping cart is getting empty");
    }
}

