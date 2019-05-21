package com.ridezum;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {
    public WebDriver driver;
    protected WebDriverWait wait;


    @Before
    public void setDriver() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/didi1/Downloads/chromedriver_win32/chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://ridezum.com/");

        System.out.println("Start");
        wait = new WebDriverWait(driver, 10);
    }

//    @After
//    public void close() {
//        System.out.println("End");
//        driver.quit();
//    }
}