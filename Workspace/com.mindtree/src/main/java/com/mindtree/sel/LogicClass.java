package com.mindtree.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
public class LogicClass {
      
	static WebDriver driver;
	SleepClass s= new SleepClass();
	
	public void implementation() {
		driver.get("https://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("aishwaryashubhalaxmi8@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
	     s.sleep();
    	WebElement e=driver.findElement(By.xpath("//input[@type='password']"));	
    	e.click();
        s.sleep();    	
    	e.sendKeys("as@831996");
    	driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
    	
	}
	}

