package com.mindtree.kdf;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions {
	static WebDriver driver;
	public static void openBrowser() {
	
		String path="C:\\Users\\M1046926\\Downloads\\chromedriver_win32\\chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver", path);
	   	driver=new ChromeDriver();
	   	driver.manage().window().maximize();
	}
	
	public static void navigate() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com");
	}
    
	public static void setUsername() {
		driver.findElement(By.name("userName")).sendKeys("mercury"); 
	 
	}
	public static void setPassword() {
	   driver.findElement(By.name("password")).sendKeys("mercury");
	}
	
	public static void click_login() {
	  driver.findElement(By.name("login")).click();
	}
	public static void closeBrowser() {
		driver.close();
	}
}
