package testngproject;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class TestngEnter {
    static WebDriver driver;
	@BeforeTest 
	public void before() {
		 String path="C:\\Users\\M1046926\\Downloads\\chromedriver_win32\\chromedriver.exe";
	      System.setProperty("webdriver.chrome.driver", path);
	      driver= new ChromeDriver();
		  driver.manage().window().maximize();	
	}
	
	@Test
	@Parameters({"firstname" ,"lastname","username","password"})
	public void test(@Optional String firstname, String lastname, String username, String password) {
	driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&flowName=GlifWebSignIn&flowEntry=SignUp");
	driver.findElement(By.id("firstName")).sendKeys(firstname);
	driver.findElement(By.id("lastName")).sendKeys(lastname);
    driver.findElement(By.id("username")).sendKeys(username);
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
    driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys(password);
    driver.findElement(By.className("CwaK9")).click();
	}
	
	@AfterTest
	public void after() {
	//	driver.close();
	}
}
