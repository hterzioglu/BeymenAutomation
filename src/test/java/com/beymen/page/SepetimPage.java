package com.beymen.page;

import com.beymen.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class SepetimPage {
    Methods methods;

    public SepetimPage (){methods = new Methods();}

    public void sepetim(){
        methods.click(By.cssSelector(".icon.icon-cart"));
        methods.waitBySeconds(2);
        Assert.assertTrue("Sepetim sayfası açılmadı.",methods.isElementVisible(By.cssSelector(".m-empty__messageBtn")));
        methods.waitBySeconds(2);
        System.out.println("Sepetim sayfası açıldı");
    }
}
