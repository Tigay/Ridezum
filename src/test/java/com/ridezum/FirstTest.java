package com.ridezum;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest extends BaseTest {
   @Test
    public void verifyTitle(){
       String titleExpected = "Zūm | Rides for Kids, After School Care";
       String titleActual = driver.getTitle();
      Assert.assertTrue(titleExpected.equals(titleActual));


   }


}
