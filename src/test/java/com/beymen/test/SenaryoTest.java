package com.beymen.test;

import com.beymen.driver.BaseTest;
import com.beymen.page.SenaryoPage;
import org.junit.Test;

public class SenaryoTest extends BaseTest {

    @Test
    public void senaryoTest(){
        SenaryoPage senaryoPage = new SenaryoPage();
        senaryoPage.senaryopage();
    }

}