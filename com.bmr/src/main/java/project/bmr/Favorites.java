package project.bmr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Favorites {
	WebDriver driver;
	@Test
	public void testfav() {
		String path="C:\\Users\\M1046926\\Downloads\\chromedriver_win32\\chromedriver.exe";
	     System.setProperty("webdriver.chrome.driver",path);
	     driver= new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://bookmyroomangulardevdotnet.azurewebsites.net/");
	     driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.findElement(By.xpath("//div[@class='form-group']//input[@class='form-control ng-untouched ng-pristine ng-invalid'][@name='UserName'][@ngmodel]")).sendKeys("Harry9");
driver.findElement(By.xpath("//div[@class='form-group']//input[@class='form-control ng-untouched ng-pristine ng-invalid'][@name='Password']" )).sendKeys("Harry@9");
driver.findElement(By.xpath("//button[@class='btn btn-outline-success']")).click();

/*driver.findElement(By.xpath("//button[@type='button'][@class='swal2-confirm swal2-styled'][@aria-label='Thumbs up, great!']")).click();
driver.findElement(By.xpath("//button[@class='mat-raised-button']")).click();
Select sel=new Select(driver.findElement(By.name("hotelCity")));
sel.selectByVisibleText("Chennai");
driver.findElement(By.name("hotelFromDate")).sendKeys("09/21");
driver.findElement(By.name("hotelToDate")).sendKeys("09/23");
Select sel1= new Select(driver.findElement(By.name("hotelRoomType")));
sel1.selectByVisibleText("Single-AC");
driver.findElement(By.name("Search")).click();*/
/*Actions a=new Actions(driver);
		 a.moveToElement(ele).perform();
	     driver.findElement(By.name("Password")).sendKeys("Harry@9");
	     
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	     Actions action2= new Actions(driver);
		 action2.sendKeys(Keys.PAGE_DOWN).build().perform();
	     */
		
	}

}
