package com.ridezum;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class ApplyDriverTest extends BaseTest {
    private HomePage homePage;
    private ApplyDriverPage applyDriverPage;
    private UserDriver userDriver;


    @Test
    public void testFirst() {

        homePage = new HomePage(driver);

        applyDriverPage = homePage.clickBecomeDriverButton();

        UserDriver userDriver = new UserDriver();

// iframe

        driver.switchTo().frame(driver.findElement(By.cssSelector(".iframe-container.m-banner-drive__iframe")));

        applyDriverPage.inputFirstNameField(userDriver.getFirstName());
        applyDriverPage.inputLastNameField(userDriver.getLastName());
        applyDriverPage.inputEmailField(userDriver.getEmail());
        applyDriverPage.inputPhoneField(userDriver.getPhone());
        applyDriverPage.inputZipcodeField(userDriver.getZipcode());
        applyDriverPage.inputRefcodeField(userDriver.getRefcode());

        //swithOut from iframe

        driver.switchTo().defaultContent();

        String res7 = applyDriverPage.clickSubmitButton();
        Assert.assertEquals("Submit",res7);

        //String error = applyDriverPage.


    }
}