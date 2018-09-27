package flipkartProblem;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MainClass {
 static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path="C:\\Users\\M1046926\\Downloads\\chromedriver_win32\\chromedriver.exe"; 
	     System.setProperty("webdriver.chrome.driver", path);   
	     driver= new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.flipkart.com");
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    WebElement element= driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
	    WebElement b=driver.findElement(By.xpath("//span[text()='Electronics']"));
	    element.click();
	    Actions a=new Actions(driver);
	    a.moveToElement(b).perform();
	    Thread.sleep(2000);
	     driver.findElement(By.xpath("//a[@title='Mobiles']")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//img[@alt='Mi']")).click();
	     Thread.sleep(2000);
	     
	     
	     
	}
    
}
