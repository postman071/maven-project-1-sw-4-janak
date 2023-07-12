package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.basetest.BaseTest;
import com.nopcommerce.demo.pages.ElectronicPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest
{
    ElectronicPage electronicPage = new ElectronicPage();

    @Test
    public void verifyPageNavigation() {
        String menuName = "Electronics";
        String expectedMessage = "Electronics";
        // This method select Electronics tab on top menu
        electronicPage.selectMenu(menuName);
        String actualMessage = electronicPage.getElectronicsTabText();
        Assert.assertEquals(actualMessage, expectedMessage, "  ");
    }

}
