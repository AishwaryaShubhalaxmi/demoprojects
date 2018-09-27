package com.mindtree.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {

	static WebDriver driver;
	@Test
	@Parameters("browser")
	public void verifyTitle(String browserName) {
		
		if(browserName.equalsIgnoreCase("chrome")) {
			String path="C:\\Users\\M1046926\\Downloads\\chromedriver_win32\\chromedriver.exe";
	    	 System.setProperty("webdriver.chrome.driver", path);
	    	 driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("internet explorer")) {
			
			 String path1="C:\\Users\\M1046926\\Downloads\\IEDriverServer_x64_3.13.0\\IEDriverServer.exe";
	    	 System.setProperty("webdriver.ie.driver", path1);
	    	 driver=new InternetExplorerDriver();
		}
		
		 driver.manage().window().maximize();
    	 driver.get("https://www.google.com");
    	 System.out.println(driver.getTitle());
    	 driver.close();
    	 
	}
}
