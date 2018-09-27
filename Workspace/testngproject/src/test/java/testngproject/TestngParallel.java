package testngproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.*;

public class TestngParallel {

	static WebDriver driver;
	@Parameters("browsers")
	
	@BeforeClass
	public void test(String browsers) {
		if(browsers.equalsIgnoreCase("Internet Explorer")) {
			String path="C:\\Users\\M1046926\\Downloads\\IEDriverServer_x64_3.13.0";
			System.setProperty("webdriver.ie.driver", path);
			driver= new InternetExplorerDriver();
		}
		else if(browsers.equalsIgnoreCase("Chrome")) {
			String path="C:\\Users\\M1046926\\Downloads\\chromedriver_win32\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", path);
			driver=new ChromeDriver();
			}
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&flowName=GlifWebSignIn&flowEntry=SignUp");
	    driver.manage().window().maximize();
	}
	
	@Test
	public void test(String firstname, String lastname, String username, String password) {
		driver.findElement(By.id("firstName")).sendKeys(firstname);
		driver.findElement(By.id("lastName")).sendKeys(lastname);
	    driver.findElement(By.id("username")).sendKeys(username);
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
	    driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys(password);
	    driver.findElement(By.className("CwaK9")).click();
	}
	@AfterClass
	public void after() {
		driver.quit();
	}
}
