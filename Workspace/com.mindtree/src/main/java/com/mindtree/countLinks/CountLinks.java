package com.mindtree.countLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CountLinks {
     static WebDriver driver;
	@BeforeTest
	public void open() {
		String path="C:\\Users\\M1046926\\Downloads\\chromedriver_win32\\chromedriver.exe"; 
	     System.setProperty("webdriver.chrome.driver", path);   
	     driver= new ChromeDriver();
	     driver.manage().window().maximize();
	  
	}
	
	@Test
	public void count() {
		driver.get("http://www.google.com");
		List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println("Total no. of links is: " + links.size());
	}
	
	@AfterTest
	public void close() {
		driver.quit();
	}
}
