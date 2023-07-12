package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility
{
    By firstName = By.xpath("//input[@id='FirstName']");
    By lastName = By.xpath("//input[@id='LastName']");
    By email = By.xpath("//input[@id='Email']");
    By password = By.xpath("//input[@id='Password']");
    By confirmPassword = By.xpath("//input[@id='ConfirmPassword']");
    By registerButton = By.xpath("//button[@id='register-button']");
    By registrationCompleted = By.xpath("//div[@class='result']");

    public void enterFirstname(String value)
    {
        sendTextToElements(firstName,value);
    }
    public void enterLastname(String value)
    {
        sendTextToElements(lastName,value);
    }
    public void enterEmail(String value)
    {
        sendTextToElements(email,value);
    }
    public void enterPassword(String value)
    {
        sendTextToElements(password,value);
    }
    public void enterConfirmPassword(String value)
    {
        sendTextToElements(confirmPassword,value);
    }
    public void clickOnRegisterButton()
    {
        clickOnElement(registerButton);
    }
    public String getRegistrationCompletedText()
    {
        return getTextFromElement(registrationCompleted);
    }
}





