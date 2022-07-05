package com.beymen.page;

import com.beymen.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class SamplePage {
    Methods methods;

    public SamplePage (){methods = new Methods();}

    public void sample(){
        Assert.assertTrue("Ana sayfa açılmadı.",methods.isElementVisible(By.cssSelector(".o-header__logo--img.--blue")));
        methods.waitBySeconds(2);
        System.out.println("Ana sayfa açıldı");
    }

}
