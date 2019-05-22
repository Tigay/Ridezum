package com.ridezum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }
        @FindBy(css = ".front-banner__btns a:nth-child(2)")
        private WebElement becomeDriverButton;

     @FindBy (css = ".main-menu__link main-menu__link_active")
     private WebElement careerButton;

        public ApplyDriverPage clickBecomeDriverButton(){
            wait.until(ExpectedConditions.elementToBeClickable(becomeDriverButton));
            becomeDriverButton.click();
            return new ApplyDriverPage(driver);
        }
        public CareerPage clickCareerButton(){
            wait.until(ExpectedConditions.elementToBeClickable(careerButton));
            careerButton.click();
            return new CareerPage(driver);
        }




    }
