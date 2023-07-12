package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility
{
    By shoppingCartText = By.xpath("//h1[normalize-space()='Shopping cart']");
    By priceText = By.xpath("//span[@class='value-summary']//strong");
    By updateShoppingCart = By.xpath("//button[@id='updatecart']");
    By termsAndCondition = By.xpath("//input[@id='termsofservice']");
    By checkOut = By.xpath("//button[@id='checkout']");
    By shoppingCart =By.xpath("//span[@class='cart-label']");
    By goToCart =By.xpath("//button[normalize-space()='Go to cart']");
    By quantityValue = By.xpath("//input[contains(@id,'itemquantity')]");

    public String getShoppingCartText()
    {
        return getTextFromElement(shoppingCartText);
    }
    public String getPriceText()
    {
        return getTextFromElement(priceText);
    }
    public void clickOnUpdateCart()
    {
        clickOnElement(updateShoppingCart);
    }
    public void selectTermsAndCondition()
    {
        clickOnElement(termsAndCondition);
    }
    public void clickOnCheckOut()
    {
        clickOnElement(checkOut);
    }
    public void mouseHoverToShoppingCard()
    {
        mouseHoverToElement(shoppingCart);
    }
    public void mouseHoverToGoToCardAndClick()
    {
        mouseHoverToElementAndClick(goToCart);
    }
    public String getNumberOfQuantityValue()
    {
        return getTextFromElement(quantityValue);
    }
}
