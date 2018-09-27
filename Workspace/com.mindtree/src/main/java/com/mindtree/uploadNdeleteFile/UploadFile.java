package com.mindtree.uploadNdeleteFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {
     static WebDriver driver;
	public static void main(String[] args) {
	
	String path="C:\\Users\\M1046926\\Downloads\\chromedriver_win32\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("http://demo.guru99.com/test/upload/");
	 
	 WebElement e= driver.findElement(By.name("uploadfile_0"));
	 e.sendKeys("D:\\htmlforms\\updateform.html");
	 driver.findElement(By.id("terms")).click();
	 driver.findElement(By.id("submitbutton")).click();
	 System.out.println("File uploaded successfully");

	}

}
