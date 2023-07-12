package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility
{
    By computerTabOnTopMenu = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");
    By electronicsTabOnTopMenu= By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']");
    By cellPhone= By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']");
    By ThankYouText= By.xpath("//h1[normalize-space()='Thank you']");
    By ContinueButton= By.xpath("//button[normalize-space()='Continue']");
    By WelcomeStoreText= By.xpath("//h2[normalize-space()='Welcome to our store']");
    By SuccessfulText = By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");
    By RegisterTab = By.xpath("//button[@class='button-1 register-button']");

    public void clickOnComputerTab()
    {
        clickOnElement(computerTabOnTopMenu);
    }
    public void mouseHoverToElectronicTab()
    {
        mouseHoverToElement(electronicsTabOnTopMenu);
    }
    public void mouseHoverToCellPhoneAndClick()
    {
        mouseHoverToElementAndClick(cellPhone);
    }
    public String getThankYouText()
    {
        return getTextFromElement(ThankYouText);
    }
    public void clickOnContinue()
    {
        clickOnElement(ContinueButton);
    }
    public String getWelcomeStoreText()
    {
        return getTextFromElement(WelcomeStoreText);
    }
    public String getSuccessfulText()
    {
        return getTextFromElement(SuccessfulText);
    }
    public void clickOnRegisterTab()
    {
        clickOnElement(RegisterTab);
    }
}
