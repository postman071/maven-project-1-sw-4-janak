package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ComputerPage extends Utility {
    By desktop = By.xpath("//li[@class='active last']//a[normalize-space()='Desktops']");
    By clearQuantity = By.xpath("//input[@value='1']");
    By addQuantity = By.xpath("//input[@value='1']");
    By updateShoppingCart = By.xpath("//button[@id='updatecart']");
    By sortingFilterOption = By.xpath("//select[@id='products-orderby']");

    public void clickOnDesktop() {
        clickOnElement(desktop);
    }

    public void selectValueFromShortingDropDown(String text) {
        WebElement dropDown = driver.findElement(sortingFilterOption);
        Select select = new Select(dropDown);
        select.selectByVisibleText(text);
    }

    public void changeQuantity() {
        driver.findElement(clearQuantity).clear();
        sendTextToElements(addQuantity, "2");
    }

    public void clickOnUpdateCart() {
        clickOnElement(updateShoppingCart);
    }

    public void clickAddToCartByProductName(String productName) {
        clickOnElement(By.xpath("(//h2//a[normalize-space()='" + productName + "']//following::button)[1]"));
    }

    public List<String> sortDesktopByPositionZtoA() {
        List<WebElement> beforeShortValue = driver.findElements(By.xpath("//h2[@class='product-title']//a"));
        List<String> beforeShortDesktopValue = new ArrayList<>();
        for (WebElement value : beforeShortValue) {
            beforeShortDesktopValue.add(value.getText());
        }
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='products-orderby']"), "Name: Z to A");
        waitUntilVisibilityOfElementLocated(By.xpath("//div[@class='picture']//img"), 5);
        List<WebElement> afterShortValue = driver.findElements(By.xpath("//h2[@class='product-title']//a"));
        List<String> afterShortDesktopValue = new ArrayList<>();

        for (WebElement value1 : afterShortValue) {
            afterShortDesktopValue.add(value1.getText());

            Collections.sort(beforeShortDesktopValue);// Ascending order

            Collections.reverse(beforeShortDesktopValue);// reverse

            return beforeShortDesktopValue;
        }

        return beforeShortDesktopValue;
    }

    public List<String> getAllProductNamesAfterShorting()
    {
        waitUntilVisibilityOfElementLocated(By.xpath("//div[@class='picture']//img"), 5);
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='products-orderby']"), "Name: Z to A");
        waitUntilVisibilityOfElementLocated(By.xpath("//div[@class='picture']//img"), 5);

        // After shorting value
        List<WebElement> afterShortValue = driver.findElements(By.xpath("//h2[@class='product-title']//a"));
        List<String> afterShortDesktopValue = new ArrayList<>();

        for (WebElement value1 : afterShortValue) {
            afterShortDesktopValue.add(value1.getText());
        }
        return afterShortDesktopValue;
    }
}