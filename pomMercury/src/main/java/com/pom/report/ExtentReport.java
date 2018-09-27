package com.pom.report;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReport {
	@Test
	public void rep() {
		String extentReportFile = System.getProperty("D:\\ExtentReport\\rep.html");
		ExtentReports extent = new ExtentReports(extentReportFile, false);
        ExtentTest extentTest = extent.startTest("My First Test",
				"Verify WebSite Title");
		/*WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        extentTest.log(LogStatus.INFO, "Browser Launched");
        driver.get("http://newtours.demoaut.com/");
        extentTest.log(LogStatus.INFO, "Navigated to www.techbeamers.com");
        String title = driver.getTitle();
        extentTest.log(LogStatus.INFO, "Get the WebSite title");
		Assert.assertTrue(title.contains("Selenium Webdriver"));
        extentTest.log(LogStatus.PASS, "Title verified");
	    driver.quit();
        extentTest.log(LogStatus.INFO, "Browser closed");*/
        extent.endTest(extentTest);
      	extent.flush();
	}

}
