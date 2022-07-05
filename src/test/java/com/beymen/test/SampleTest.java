package com.beymen.test;

import com.beymen.driver.BaseTest;
import com.beymen.methods.Methods;
import com.beymen.page.LoginPage;
import com.beymen.page.SamplePage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.beymen.methods.Methods;

public class SampleTest extends BaseTest {
    Methods methods;


 @Test
         public void sampleTest(){
     //WebDriver driver = new ChromeDriver();

    /* String ActualTitle = driver.findElement(By.cssSelector());
     String ExpectedTitle = "Most Reliable App & Cross Browser Testing Platform | BrowserStack";
     Assert.assertEquals(ExpectedTitle, ActualTitle);*/
     SamplePage samplePage = new SamplePage();
     samplePage.sample();


 }

}
