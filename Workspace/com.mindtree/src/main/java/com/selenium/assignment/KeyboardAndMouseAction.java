package com.selenium.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyboardAndMouseAction {
     static WebDriver driver;
	@Test
	public void keyboardAction() throws InterruptedException {
		String path="C:\\Users\\M1046926\\Downloads\\chromedriver_win32\\chromedriver.exe";
	   	 System.setProperty("webdriver.chrome.driver", path);
	   	 driver=new ChromeDriver();
	   	 driver.manage().window().maximize();
	   	 driver.get("https://www.amazon.com");
	   	 Thread.sleep(2000);
	     WebElement e=driver.findElement(By.id("nav-your-amazon"));
	     e.click();
	     Actions action =new Actions(driver);
	     action.moveToElement(e).perform();
	     Thread.sleep(2000);
	    WebElement em= driver.findElement(By.xpath("//input[@type='email']"));
	    em.sendKeys(Keys.SHIFT,"Aishwarya");
	   //  driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();;
	     /*em.click();
	     action.moveToElement(em).perform();
	     driver.findElement(By.id("ap_customer_name")).sendKeys(Keys.SHIFT,"Aishwarya");
	}*/
	     
	}
}
