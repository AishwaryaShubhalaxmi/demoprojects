package com.sel.countlinks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountLinks {
	 static WebDriver driver;
	public static void main(String[] args) {
		String path="C:\\Users\\M1046926\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("mindtree");
		driver.findElement(By.xpath("//input[@value='Google Search']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement> ele=driver.findElements(By.tagName("h3"));
		for(WebElement s:ele) {
			System.out.println(s);
			
		}
		System.out.println(ele.size());
		
	}

}
