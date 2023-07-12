package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ElectronicPage extends Utility
{
    By electronicsTabText = By.xpath("//h1[normalize-space()='Electronics']");

    public String getElectronicsTabText()
    {
        return getTextFromElement(electronicsTabText);
    }
    public void selectMenu(String menu)
    {
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='" + menu + "']"));
    }
}