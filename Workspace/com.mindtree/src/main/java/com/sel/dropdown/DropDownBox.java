package com.sel.dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDownBox {
     static WebDriver driver;
	public static void main(String[] args) {
	 String path="C:\\Users\\M1046926\\Downloads\\chromedriver_win32\\chromedriver.exe";
	 System.setProperty("webdriver.chrome.driver", path);
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("http://www.newtours.demoaut.com");
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");
	 driver.findElement(By.xpath("//input[@name='login']")).click();
	 
	 List<WebElement> ele= driver.findElements(By.tagName("select"));
	 System.out.println("Number of dropdown boxes= " + ele.size());
	 
	 Select element=new Select(driver.findElement(By.name("fromPort")));
	 element.selectByVisibleText("London");
	 
	 Select element1= new Select(driver.findElement(By.name("toMonth")));
	 element1.selectByIndex(2);
	 
	 Select element3= new Select(driver.findElement(By.name("toPort")));
	 List<WebElement> element4=element3.getOptions();
	 for(int i=0;i<element4.size();i++) {
		 System.out.println(element4.get(i).getText());
	 }
	 
	 
	 
	 
	 
	 

	}

}
