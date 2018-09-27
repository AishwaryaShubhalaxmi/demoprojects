package com.sel.keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
      static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="C:\\Users\\M1046926\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/droppable/");
		Actions action= new Actions(driver);
		WebElement source= driver.findElement(By.id("draggable"));
		WebElement destination= driver.findElement(By.id("droppable"));
		action.dragAndDrop(source, destination).build().perform();
	}

}
