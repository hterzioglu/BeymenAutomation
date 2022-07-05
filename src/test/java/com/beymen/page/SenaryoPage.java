package com.beymen.page;

import com.beymen.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class SenaryoPage {
    Methods methods;

    public SenaryoPage(){methods = new Methods();}

    public void senaryopage(){

        Assert.assertTrue("Ana sayfa açılmadı.",methods.isElementVisible(By.cssSelector(".o-header__logo--img.--blue")));
        methods.waitBySeconds(2);
        System.out.println("Ana sayfa açıldı");
        methods.click(By.cssSelector(".icon.icon-cart"));
        methods.waitBySeconds(2);
        Assert.assertTrue("Sepetim sayfası açılmadı.",methods.isElementVisible(By.cssSelector(".m-empty__messageBtn")));
        methods.waitBySeconds(2);
        System.out.println("Sepetim sayfası açıldı");
        methods.waitBySeconds(2);
        methods.click(By.cssSelector(".o-header__logo--img.--blue"));
        methods.waitBySeconds(2);
        methods.click(By.cssSelector(".icon.icon-account"));
        methods.waitBySeconds(2);
        Assert.assertTrue("Hesabim sayfası açılmadı.",methods.isElementVisible(By.id("loginBtn")));
        methods.waitBySeconds(2);
        System.out.println("Hesabim sayfası açıldı");
        methods.waitBySeconds(2);
        methods.click(By.cssSelector(".o-header__logo--img.--blue"));
        methods.waitBySeconds(2);
        methods.click(By.cssSelector(".default-input.o-header__search--input"));
        methods.waitBySeconds(2);
        methods.sendKeys(By.cssSelector(".default-input.o-header__search--input"),"pantolon");
        methods.waitBySeconds(2);
        methods.EnterKey(By.cssSelector(".default-input.o-header__search--input"));
        methods.waitBySeconds(2);
        methods.scrollWithAction(By.cssSelector(".o-footer__top--icon.bwi-cc"));
        methods.waitBySeconds(2);
        methods.click(By.id("moreContentButton"));
        methods.waitBySeconds(2);
        methods.randomElementClick(By.cssSelector(".col-sm-4.col-md-4.col-lg-4.col-xl-4.col-xxl-3.o-productList__itemWrapper"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//span[@class='m-variation__item -criticalStock']"));
        methods.waitBySeconds(2);



    }
}
