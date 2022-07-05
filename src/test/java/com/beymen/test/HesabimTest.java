package com.beymen.test;

import com.beymen.driver.BaseTest;
import com.beymen.page.HesabimPage;
import org.junit.Test;

public class HesabimTest extends BaseTest {

  @Test
  public void hesabimTest(){

      HesabimPage hesabimpage = new HesabimPage();
      hesabimpage.hesabim();
  }


}
