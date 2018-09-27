package com.ddf.base;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.ddf.utility.Utility;

public class Base {
	final static Logger logger = Logger.getLogger(Base.class);
	public static WebDriver driver;
	Utility util = new Utility();

	@BeforeMethod
	public void openBrowser() {

		try {
			if (util.fetchProperty("browserName").toString().equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\M1046926\\Downloads\\chromedriver_win32\\chromedriver.exe");
				logger.info("Chrome driver loaded");
				driver = new ChromeDriver();

			} else if (util.fetchProperty("browserName").toString().equalsIgnoreCase("internet explorer")) {
				System.setProperty("webdriver.ie.driver",
						"C:\\Users\\M1046926\\Downloads\\IEDriverServer_x64_3.13.0\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			} else {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\M1046926\\Downloads\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
			}

			driver.manage().window().maximize();
			driver.get(util.fetchProperty("url").toString());
		} catch (Exception e) {
			logger.error(e.getMessage());
		}

	}

	@AfterMethod
	public void closeBrowser() {
		logger.info("Closing the driver");
		driver.quit();

	}
}
