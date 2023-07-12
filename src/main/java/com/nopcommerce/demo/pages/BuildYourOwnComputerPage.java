package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;


public class BuildYourOwnComputerPage extends Utility
{
    By buildYourOwnComputerText = By.xpath("//h1[normalize-space()='Build your own computer']");
    By selectProcessor = By.xpath("//select[@id='product_attribute_1']");
    By selectRam = By.xpath("//select[@id='product_attribute_2']");
    By totalPrice = By.xpath("//div[@class='product-price']//span");
    By microsoftOfficeSoftwareOption = By.xpath("//input[@id='product_attribute_5_10']");
    By totalCommanderSoftwareOption = By.xpath("//input[@id='product_attribute_5_12']");
    By addToCart = By.xpath("//button[@id='add-to-cart-button-1']");
    By successfullyText = By.xpath("//div[@id='bar-notification']");
    By closeNotificationBar = By.xpath("//span[@title='Close']");
    By shoppingCart = By.xpath("//span[@class='cart-label']");
    By goToCart = By.xpath("//button[normalize-space()='Go to cart']");

    public String getBuildYourOwnComputerText()
    {
        return getTextFromElement(buildYourOwnComputerText);
    }
    public void selectProcessor(String name)
    {
        selectByVisibleTextFromDropDown(selectProcessor, name);
    }
    public void selectRam(String name)
    {
        selectByVisibleTextFromDropDown(selectRam, name);
    }
    public void selectHDD(String value)
    {
        clickOnElement(By.xpath("//label[normalize-space()='" + value + "']"));
    }
    public void selectOs(String value)
    {
        clickOnElement(By.xpath("//label[contains(normalize-space(),'" + value + "')]"));
    }
    public String getTotalPriceText()
    {
        return getTextFromElement(totalPrice);
    }
    public void clickOnAddToCart()
    {
        clickOnElement(addToCart);
    }
    public String getSuccessfullyAddedToCartText()
    {
        return getTextFromElement(successfullyText);
    }
    public void closeNotificationBar()
    {
        clickOnElement(closeNotificationBar);
    }
    public void mouseHoverToShoppingCartAndClickOnCart()
    {
        mouseHoverToElement(shoppingCart);
        mouseHoverToElementAndClick(goToCart);
    }
    public void selectmicrosoftOfficeSoftwareOption()
    {
        //selectCheckBox();
    }
    public void selectTotalCommanderSoftwareOption()
    {
        //selectCheckBox();
    }
}
