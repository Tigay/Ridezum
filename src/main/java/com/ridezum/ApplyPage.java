package com.ridezum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ApplyPage extends BasePage {
    public ApplyPage(WebDriver driver) {
        super(driver);
    }
        @FindBy(css = "a.postings-btn.template-btn-submit.hex-color")
        private List<WebElement> applyEndButton;

        public ApplyPage clickApplyEndButton() {
            wait.until(ExpectedConditions.elementToBeClickable(applyEndButton));
            applyEndButton.click();
            return new FormPage(driver);




}
}
