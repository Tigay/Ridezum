package com.ridezum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class JobPage  extends BasePage{
    public JobPage(WebDriver driver) {
        super(driver);
    }

        @FindBy(css = ".posting-btn-submit.template-btn-submit.hex-color")
                private WebElement applyButton;

        public ApplyPage clickApplyButton() {
            wait.until(ExpectedConditions.elementToBeClickable(applyButton));
            applyButton.click();
            return new ApplyPage(driver);
        }

    }

