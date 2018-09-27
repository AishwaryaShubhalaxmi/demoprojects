package com.mindtree.mmt;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BookTicket {
	static WebDriver driver;
  
  
  @BeforeTest
  public void launchBrowser() {
	  String path="C:\\Users\\M1046926\\Downloads\\chromedriver_win32\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", path);
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.makemytrip.com");
  }
  
  @Test(priority=1)
  public void searchFlight() {
	WebElement ele=  driver.findElement(By.id("hp-widget__sfrom"));
	ele.click();
    ele.sendKeys("DEL");
  }
   
  @Test(priority=2)
  public void searchreturnFlight() {
	WebElement ele=  driver.findElement(By.id("hp-widget__sTo"));
	ele.click();
	ele.sendKeys("BLR");
  }
  
  @Test(priority=3)
  public void departureDate() {
	  Date d= new Date();
		 SimpleDateFormat f= new SimpleDateFormat("dd");
		 String str= f.format(d);
		 driver.findElement(By.id("hp-widget__depart")).click();
		  if(Integer.parseInt(str)>10) {
			  str=str.substring(1);
		  }
		 driver.findElement(By.xpath("//td[@class='ui-datepicker-current-day ui-state-minDate']//a[contains(text(), '"+str+"')]")).click();
  }
   
}
