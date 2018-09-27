package com.framework.resusable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reusable {
 
	static WebDriver driver;
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M1046926\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		}
	
	public void enter_URL(String URL) {
		driver.navigate().to(URL);
	}
	
	public By Locator(String type, String value) {
		By by;
		switch(type) {
		case "id":
			by= By.id(value);
			break;
		case "name":
			by=By.name(value);
			break;
		case "xpath":
			by=By.xpath(value);
			break;
		case "css":
			by=By.cssSelector(value);
			break;
		case "linktext":
			by=By.linkText(value);
			break;
        default:
        	by= null;
        	break;
		}
		return by;
		}
	
	public void enterText(String type,String value, String text) {
		By locator;
		locator=Locator(type, value);
		WebElement element = driver.findElement(locator);
		element.sendKeys(text);
	}
	public void click(String type,String value) {
		By locator;
		locator=Locator(type,value);
		WebElement element=driver.findElement(locator);
		element.click();
	}
	public void waitTime(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	public void closeBrowser() {
		driver.quit();
	}
	
}
