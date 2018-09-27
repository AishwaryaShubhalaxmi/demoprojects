package com.sel.keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll {
     static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="C:\\Users\\M1046926\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Actions action= new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		action.sendKeys(Keys.PAGE_UP).build().perform();
		driver.findElement(By.id("email")).sendKeys(Keys.SHIFT,"aishwarya");
		
	}

}
