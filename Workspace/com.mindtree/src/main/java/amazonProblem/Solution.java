package amazonProblem;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Solution {
   static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String path="C:\\Users\\M1046926\\Downloads\\chromedriver_win32\\chromedriver.exe";
       System.setProperty("webdriver.chrome.driver", path);   
	     driver= new ChromeDriver();
	     driver.manage().window().maximize();
	     WebDriverWait web=new WebDriverWait(driver,20);
	     WebElement ele;
	     driver.get("https://www.amazon.com");
	     WebElement element= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		 element.sendKeys("mobiles oppo");
		 ele=web.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='submit']")));
		 ele.click();
	     WebElement product=driver.findElement(By.xpath("//ul[@id='s-results-list-atf'] //li[@data-asin='B073P414X6']"));
	     product.click();
	     WebElement e=driver.findElement(By.xpath("//input[@id='add-to-cart-button']")); 
	     e.click();
	     
	    
	}
}
