package com.mindtree.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstCode {
	static WebDriver driver;     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String path="C:\\Users\\M1046926\\Downloads\\chromedriver_win32\\chromedriver.exe";  //mention the path where chrome driver is located
     System.setProperty("webdriver.chrome.driver", path);   //sets the path of the driver for the respective browser
     driver= new ChromeDriver();
     driver.get("https://www.google.com/");
     driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mindtree");
     driver.findElement(By.xpath("//input[@type='submit']")).click();
     
	}

}
