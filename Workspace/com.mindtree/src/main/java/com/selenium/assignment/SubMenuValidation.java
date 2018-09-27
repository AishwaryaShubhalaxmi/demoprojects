package com.selenium.assignment;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SubMenuValidation {
 static WebDriver driver;
 @BeforeTest
 public void before() {
	 String path="C:\\Users\\M1046926\\Downloads\\chromedriver_win32\\chromedriver.exe"; 
     System.setProperty("webdriver.chrome.driver", path);   
     driver= new ChromeDriver();
     driver.manage().window().maximize();
 }
 
 @Test
 public void submenu() {
	 driver.get("https://www.pimcore.org/en/resources/try");
	 driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 boolean line=driver.findElement(By.id("main-nav")).isDisplayed();
	 if(line) {
		 System.out.println("sub menu are present");
	 }
	 else {
		 System.out.println("sub menu are not present");
	 }
		 
 }
 
}
