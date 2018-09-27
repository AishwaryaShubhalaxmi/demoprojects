package mercuryFlightPOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginClass {
	static WebDriver driver;
 
 public void loginVerify() {
	 String path="C:\\Users\\M1046926\\Downloads\\chromedriver_win32\\chromedriver.exe";
   	 System.setProperty("webdriver.chrome.driver", path);
   	 driver=new ChromeDriver();
   	 driver.manage().window().maximize();
   	 driver.get("http://newtours.demoaut.com/");
   	 
   	 WebElements locateElements= PageFactory.initElements(driver, WebElements.class);
   	 locateElements.loginMethod("mercury","mercury");
   	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   	 
 }
}
