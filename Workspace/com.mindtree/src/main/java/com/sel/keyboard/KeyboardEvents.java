package com.sel.keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KeyboardEvents {
    static WebDriver driver;
	public static void main(String[] args) {
	
		String path="C:\\Users\\M1046926\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		Actions action=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//span[@class='nav-line-1']"));
		action.moveToElement(ele).perform();
		
		By locator=By.id("twotabsearchtextbox");
		WebDriverWait wait=new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		WebElement ele1=driver.findElement(locator);
		action.contextClick(ele1).build().perform();
		
		
		
		

	}

}
