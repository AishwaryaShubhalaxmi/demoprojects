package com.selenium.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ValueDynamicXpath {
	static WebDriver driver;
	
 @BeforeTest
 public void before() {
	 String path="C:\\Users\\M1046926\\Downloads\\chromedriver_win32\\chromedriver.exe"; 
     System.setProperty("webdriver.chrome.driver", path);   
     driver= new ChromeDriver();
     driver.manage().window().maximize();
 }
 
 @Test
 public void value() {
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://toolsqa.wpengine.com/automation-practice-table");
		String row = "1";
		String col = "2";
		String cellValue = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[" + row + "]/td[" + col + "]")).getText();
		System.out.println(cellValue);
		String sRowValue = "Clock Tower Hotel";
		for (int i=1;i<=5;i++){
			String sValue = null;
			sValue = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[" + i + "]/th")).getText();
				if(sValue.equalsIgnoreCase(sRowValue)){
			
					for (int j=1;j<=5;j++){
						String sColumnValue= driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[" + i + "]/td["+ j +"]")).getText();
						System.out.println(sColumnValue);
					}
				break;
				}
			}
		driver.close();
 }
}
