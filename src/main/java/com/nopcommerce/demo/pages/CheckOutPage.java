package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CheckOutPage extends Utility
{
    By firstName = By.xpath("//input[@id='BillingNewAddress_FirstName']");
    By lastName = By.xpath("//input[@id='BillingNewAddress_LastName']");
    By email = By.xpath("//input[@id='BillingNewAddress_Email']");
    By country = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By city = By.xpath("//input[@id='BillingNewAddress_City']");
    By address1 = By.xpath("//input[@id='BillingNewAddress_Address1']");
    By zipCode = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By phoneNumber = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By continueButton = By.xpath("//button[@onclick='Billing.save()']");
    By shippingContinueButton = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    By paymentContinueButton = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    By paymentInfoContinueButton = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    By nextDayAir = By.xpath("//input[@id='shippingoption_1']");
    By creditCard = By.xpath("//input[@id='paymentmethod_1']");
    By creditCardType = By.xpath("//select[@id='CreditCardType']");
    By cardHolderName = By.xpath("//input[@id='CardholderName']");
    By cardNumber = By.xpath("//input[@id='CardNumber']");
    By selectMonth = By.xpath("//select[@id='ExpireMonth']");
    By selectYear = By.xpath("//select[@id='ExpireYear']");
    By cardCode = By.xpath("//input[@id='CardCode']");
    By paymentTypeMessage = By.xpath("//span[normalize-space()='Credit Card']");
    By shippingMethodText = By.xpath("//span[normalize-space()='Next Day Air']");
    By totalPriceText = By.xpath("//span[@class='product-subtotal']");
    By confirmButton = By.xpath("//button[normalize-space()='Confirm']");

    public void enterFirstname(String value)
    {
        sendTextToElements(firstName,value);
    }
    public void enterLastname(String value)
    {
        sendTextToElements(lastName,value);
    }
    public void selectCountry(String value)
    {
        selectByVisibleTextFromDropDown(country,value);
    }
    public void enterCity(String value)
    {
        sendTextToElements(city,value);
    }
    public void enterAddress1(String value)
    {
        sendTextToElements(zipCode,value);
    }
    public void enterPhoneNumber(String value)
    {
        sendTextToElements(phoneNumber,value);
    }
    public void clickOnContinue()
    {
        clickOnElement(continueButton);
    }
    public void selectNextDayAir()
    {
        clickOnElement(nextDayAir);
    }
    public void clickOnShippingContinue()
    {
        clickOnElement(shippingContinueButton);
    }
    public void clickOnCreditCard()
    {
        clickOnElement(creditCard);
    }
    public void clickOnPaymentContinue()
    {
        clickOnElement(paymentContinueButton);
    }
    public void selectCreditCardType(String value)
    {
        selectByVisibleTextFromDropDown(creditCardType,value);
    }
    public void enterCardHolderName(String value)
    {
        sendTextToElements(cardHolderName,value);
    }
    public void enterCardNumber(String value)
    {
        sendTextToElements(cardNumber,value);
    }
    public void selectExpirationDate(String month,String year)
    {
        selectByVisibleTextFromDropDown(selectMonth,month);
        selectByVisibleTextFromDropDown(selectYear,year);
    }
    public void enterCardCode(String value)
    {
        sendTextToElements(cardCode,value);
    }
    public String getPaymentTypeText()
    {
        return getTextFromElement(paymentTypeMessage);
    }
    public String getShippingMethodText()
    {
        return getTextFromElement(shippingMethodText);
    }
    public String getTotalPriceText()
    {
        return getTextFromElement(totalPriceText);
    }
    public void clickOnConfirm()
    {
        clickOnElement(confirmButton);
    }
    public void clickOnPaymentInfoContinue()
    {
        clickOnElement(paymentInfoContinueButton);
    }
    public void enterEmail(String value)
    {
     sendTextToElements(email,value);
    }
}
