package mytestngproject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class testngPracticeAssignment {
	static WebDriver driver;
	@BeforeTest 
	public void before() {
		  String path="C:\\Users\\M1046926\\Downloads\\chromedriver_win32\\chromedriver.exe";
	      System.setProperty("webdriver.chrome.driver", path);
	      driver= new ChromeDriver();
		  driver.manage().window().maximize();
	 
	}

}
