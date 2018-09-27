package flightbookingRegistration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String path="C:\\Users\\M1046926\\Downloads\\chromedriver_win32\\chromedriver.exe";
      System.setProperty("webdriver.chrome.driver", path);
      driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.cleartrip.com/");
	  driver.findElement(By.id("userAccountLink")).click();
	  driver.findElement(By.className("weak")).click();
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {

		System.out.println(e.getMessage());
	}
	  WebElement web= driver.findElement(By.xpath("//input[@type='email']"));
	  web.sendKeys("aishwaryashubhalaxmi8@gmail.com");	
	  }

}
