package com.pom.pages.pomMercury;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pom.report.ExtentReport;
public class BookFlightTest {
     WebDriver driver;
     @BeforeTest
 	public void openBrowser() {
 		String path="C:\\Users\\M1046926\\Downloads\\chromedriver_win32\\chromedriver.exe";
 	   	 System.setProperty("webdriver.chrome.driver", path);
 	   	 driver=new ChromeDriver();
 	   	 driver.manage().window().maximize();
 	   	 driver.get("http://newtours.demoaut.com/");
 	}
	
	
	@Test
	public void bookTicket()  {
		Login_1 lp= new Login_1(driver);
		Flight_Finder2 ff= new Flight_Finder2(driver);
		Select_Flight3 sf= new Select_Flight3(driver);
		BookAFlight4 bf= new BookAFlight4(driver);
		lp.login();
		ff.flightFinder();
		sf.reserveFlight();
		bf.bookFlight("xyz", "abc", "12345");
		String expectedTitle="Flight Confirmation: Mercury Tours";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		ExtentReport r=new ExtentReport();
		r.rep();
		
	}
	 @AfterTest
		public void closeBrowser() {
			driver.close();
		}
	

}
