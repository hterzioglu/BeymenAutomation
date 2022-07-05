package com.beymen.page;

import com.beymen.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class HesabimPage {
    Methods methods;

    public HesabimPage(){methods = new Methods();}

    public void hesabim(){

        methods.click(By.cssSelector(".icon.icon-account"));
        methods.waitBySeconds(2);
        Assert.assertTrue("Hesabim sayfası açılmadı.",methods.isElementVisible(By.id("loginBtn")));
        methods.waitBySeconds(2);
        System.out.println("Hesabim sayfası açıldı");

    }
}
