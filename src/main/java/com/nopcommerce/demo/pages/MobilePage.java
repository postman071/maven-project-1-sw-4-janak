package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class MobilePage extends Utility
{
    By cellPhone = By.xpath("//h1[normalize-space()='Cell phones']");
    By ProductName = By.xpath("//h1[normalize-space()='Nokia Lumia 1020']");
    By PriceName = By.xpath("//div[@class='product-price']//span[normalize-space()='$349.00']");
    By listView = By.xpath("//a[normalize-space()='List']");
    By clearQuantity = By.xpath("//input[@id='product_enteredQuantity_20']");
    By addQuantity = By.xpath("//input[@id='product_enteredQuantity_20']");
    By updateShoppingCart = By.xpath("//button[@id='add-to-cart-button-20']");
    By addToCart = By.xpath("//button[@id='add-to-cart-button-20']");
    By successfullyText = By.xpath("//div[@id='bar-notification']");
    By closeNotificationBar = By.xpath("//span[@title='Close']");

    public String getMobileText()
    {
        return getTextFromElement(cellPhone);
    }
    public void clickOnListViewIcon()
    {
        clickOnElement(listView);
    }
    public void selectPhoneFromList(String phone)
    {
        clickOnElement(By.xpath("//h2[@class='product-title']//a[contains(text(),'"+ phone +"')]"));
    }
    public String getProductNameText()
    {
        return getTextFromElement(ProductName);
    }
    public void changeQuantity()
    {
        sendTextToElements(addQuantity,"2");
    }
    public void clickOnUpdateCart()
    {
        clickOnElement(updateShoppingCart);
    }
    public String getPriceText()
    {
        return getTextFromElement(PriceName);
    }
    public void clickOnAddToCart()
    {
        clickOnElement(addToCart);
    }
    public String getAddedToCartTextSuccessfully()
    {
        return getTextFromElement(successfullyText);
    }
    public void closeNotificationBar()
    {
        clickOnElement(closeNotificationBar);
    }
}
