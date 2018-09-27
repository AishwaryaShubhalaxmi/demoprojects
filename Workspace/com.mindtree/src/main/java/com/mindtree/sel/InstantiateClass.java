package com.mindtree.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstantiateClass {
	SleepClass s=new SleepClass();
    static WebDriver driver;
	public void instantiate() {
		String path="C:\\Users\\M1046926\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	}
	public void implementation() {
		driver.get("https://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("aishwaryashubhalaxmi8@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
    	WebElement e=driver.findElement(By.xpath("//input[@type='password']"));	
    	e.click();
        s.sleep();    	
    	e.sendKeys("As@831996");
    	driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
   	
	}
}