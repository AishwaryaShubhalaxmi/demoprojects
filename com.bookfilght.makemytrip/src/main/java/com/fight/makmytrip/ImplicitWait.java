package com.fight.makmytrip;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class ImplicitWait {
	static WebDriver driver;
  public void implicitWait() {
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
  }
}
