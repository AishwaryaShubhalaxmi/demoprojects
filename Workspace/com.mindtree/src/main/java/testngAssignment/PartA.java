package testngAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartA {
     static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String path="C:\\Users\\M1046926\\Downloads\\chromedriver_win32\\chromedriver.exe";
	      System.setProperty("webdriver.chrome.driver", path);
	      driver= new ChromeDriver();
		  driver.manage().window().maximize();	
		  driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&flowName=GlifWebSignIn&flowEntry=SignUp");
			driver.findElement(By.id("firstName")).sendKeys("Aishwarya");
			driver.findElement(By.id("lastName")).sendKeys("Shubhalaxmi");
	        driver.findElement(By.id("username")).sendKeys("shubhalaxmiaishwarya3");
	        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("As@831996");
	        driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys("As@831996");
	        driver.findElement(By.className("CwaK9")).click();
	      //  driver.findElement(By.xpath("//content[@class='CwaK9")).click();
	}

}
