package com.selenium.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ValueFromTable {
	static WebDriver driver;
	@Test
	public void tables() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://toolsqa.wpengine.com/automation-practice-table");
		String sCellValue = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[2]")).getText();
		System.out.println(sCellValue);
		driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[6]/a")).click();   
		System.out.println("Link clicked");
		driver.close();
		
		
	}
   @BeforeTest
   public void before() {
	   String path="C:\\Users\\M1046926\\Downloads\\chromedriver_win32\\chromedriver.exe"; 
	     System.setProperty("webdriver.chrome.driver", path);   
	     driver= new ChromeDriver();
	     driver.manage().window().maximize();
   }
}
