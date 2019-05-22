package com.ridezum;

import org.junit.Test;

public class ApplyEndTest  extends BaseTest {
    private HomePage homePage;
    private CareerPage careerPage;
    private JobPage jobPage;
    private ApplyPage applyPage;
    private FormPage formPage;

    @Test
    public void testFirst() {

        homePage = new HomePage(driver);
        careerPage = homePage.clickCareerButton();
        jobPage = careerPage.clickViewJobButton();
        applyPage = jobPage.clickApplyButton();
        formPage = applyPage.clickApplyEndButton();
    }
}