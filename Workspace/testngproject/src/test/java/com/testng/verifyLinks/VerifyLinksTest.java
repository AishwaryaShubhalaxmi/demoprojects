package com.testng.verifyLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyLinksTest {
  WebDriver driver;
   @BeforeTest
   public void openBrowser() {
	   String path="C:\\Users\\M1046926\\Downloads\\chromedriver_win32\\chromedriver.exe";
	   	 System.setProperty("webdriver.chrome.driver", path);
	   	 driver=new ChromeDriver();
	   	 driver.manage().window().maximize();
	   	 driver.get("http://www.facebook.com/");
	
   }
   @Test
   public void verifyLinks() {
		List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println("Total no. of links is: " + links.size());
		Assert.assertTrue(links.size()>0);
   }
   @AfterTest
   public void closeBrowser() {
	   driver.close();
   }
}
