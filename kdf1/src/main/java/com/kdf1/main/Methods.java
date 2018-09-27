package com.kdf1.main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Methods {
	static WebDriver driver;
	public static void openBrowser() {
		String path="C:\\Users\\M1046926\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver= new ChromeDriver();
	}
	public static void maximize() {
		driver.manage().window().maximize();
	}
	public static void implementwait() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
    public static void navigate(String baseurl) {
    	driver.get(baseurl);
	}
    public static void enterUsername(String locator,String value, String param) {
    	if(locator.equals("name")) {
		driver.findElement(By.name(value)).sendKeys(param);}
    	else if(locator.equals("id")) {
    	driver.findElement(By.id(value)).sendKeys(param);
    	}
	}
    
    
   public static void enterPassword(String locator,String value, String param) {
	   if(locator.equals("name")) {
		driver.findElement(By.name(value)).sendKeys(param);}
	   else if(locator.equals("id")) {
	    driver.findElement(By.id(value)).sendKeys(param);
	   }
	}
   
   public static void click(String locator,String value) {
	    if(locator.equals("name")) {
		driver.findElement(By.name(value)).click();}
	    else if(locator.equals("id")) {
	    driver.findElement(By.id(value)).click();
	    }
   }
   public static void verify(String param) {
	   String expected=param;
	   String actual= driver.getTitle();
	   Assert.assertEquals(actual, expected);
		
	}
   public static void closeBrowser() {
	   driver.close();
		
	}
}
