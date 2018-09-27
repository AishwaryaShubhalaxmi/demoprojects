package com.selenium.assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mindtree.sel.SleepClass;

public class MultipleWindowHandle {
     static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SleepClass s= new SleepClass();
		String path="C:\\Users\\M1046926\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		String parent=driver.getWindowHandle(); //Returns the current window handle
		System.out.println("Parent window is" + parent);
    	driver.findElement(By.xpath("//a[@href='http://www.google.com']")).click();
		Set<String> set=driver.getWindowHandles();  //set is the child window handle
    	int count=set.size(); //counts the number of total window handles
    	System.out.println("Total window count" + count);
    	for(String child:set) {
    		if(!parent.equalsIgnoreCase(child)) {
    			driver.switchTo().window(child); //switchTo switches to the next window
    			driver.findElement(By.name("q")).sendKeys("Amazon");
    			driver.findElement(By.xpath("//input[@type='submit']")).click();
    			s.sleep();
    
				}
    			
    		}
    	}
	}


