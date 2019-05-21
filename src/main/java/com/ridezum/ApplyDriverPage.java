package com.ridezum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ApplyDriverPage extends BasePage {
    public ApplyDriverPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#application_form_first_name")
    private WebElement firstNameField;

    @FindBy(css = "#application_form_last_name")
    private WebElement lastNameField;

    @FindBy(css = "#application_form_email")
    private WebElement emailField;

    @FindBy(css = "#application_form_phone_number")
    private WebElement phoneField;

    @FindBy(css = "#application_form_applicant_region")
    private WebElement regionSelectButton;

    @FindBy(css = "#application_form_zipcode")
    private WebElement zipcodeField;

    @FindBy(css = "#application_form_refcode")
    private WebElement refcodeField;

    @FindBy(css = ".btn-apply.js-submit.app-apply-button.application-form__submit-button")
    private WebElement submitButton;

    @FindBy(css = ".help-block")
    private List<WebElement>emailError;

    public void inputFirstNameField(String firstName) {
        wait.until(ExpectedConditions.elementToBeClickable(firstNameField));
        firstNameField.sendKeys(firstName);
    }

    public void inputLastNameField(String lastName) {
        wait.until(ExpectedConditions.elementToBeClickable(lastNameField));
        lastNameField.sendKeys(lastName);
    }

    public void inputEmailField(String email) {
        wait.until(ExpectedConditions.elementToBeClickable(emailField));
        emailField.sendKeys(email);
    }

    public void inputPhoneField(String phone) {
        wait.until(ExpectedConditions.elementToBeClickable(phoneField));
        phoneField.sendKeys(phone);
    }

    public void selectButton() {
        wait.until(ExpectedConditions.elementToBeClickable(regionSelectButton));
        Select select = new Select(regionSelectButton);
        select.selectByIndex(3);
    }

    public void inputZipcodeField(String zipcode) {
        wait.until(ExpectedConditions.elementToBeClickable(zipcodeField));
        zipcodeField.sendKeys(zipcode);
    }

    public void inputRefcodeField(String refcode) {
        wait.until(ExpectedConditions.elementToBeClickable(refcodeField));
        refcodeField.sendKeys(refcode);
    }

    public String getFirstNameField() {
        String re1 = firstNameField.getAttribute("value");
        return re1;
    }

    public String getLastName() {
        String res3 = lastNameField.getAttribute("value");
        return res3;
    }

    public String getEmailField() {
        String re2 = emailField.getAttribute("value");
        return re2;
    }

    public String getPhoneField() {
        String res4 = phoneField.getAttribute("value");
        return res4;
    }

    public WebElement getRegionSelectButton() {
        return regionSelectButton;
    }

    public String getZipcodeField() {
        String res5 = zipcodeField.getAttribute("value");
        return res5;
    }

    public String getRefcodeField() {
        String res6 = refcodeField.getAttribute("value");
        return res6;
    }

    public void clickSubmitButton() {
        wait.until(ExpectedConditions.visibilityOfAllElements(submitButton));
        submitButton.click();

    }
}