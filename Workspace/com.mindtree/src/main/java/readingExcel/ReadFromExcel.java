package readingExcel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.ExcelUtil;

public class ReadFromExcel {
	WebDriver driver;

	@BeforeTest
	public void openBrowser() {
		String path = "C:\\Users\\M1046926\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
	}

	@Test
	public void readData(String username, String password) {

		String[][] data = ExcelUtil.loadData("D:\\Book1.xlsx", "Sheet1");
		for (int i = 1; i < data.length; i++) {
			String username1 = data[i][0];
			String password1 = data[i][1];
			driver.findElement(By.name("userName")).sendKeys("username");
			driver.findElement(By.name("password")).sendKeys("password");
			driver.findElement(By.name("login")).click();
			driver.navigate().back();
		}
	}
}
