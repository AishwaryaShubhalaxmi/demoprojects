package project.bmr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BMR {
     static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String path="C:\\Users\\M1046926\\Downloads\\chromedriver_win32\\chromedriver.exe";
     System.setProperty("webdriver.chrome.driver",path);
     driver= new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://bookmyroomangulardevdotnet.azurewebsites.net/Home");
     driver.findElement(By.xpath("//button[contains(text(),' Sign Up')]")).click();
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     driver.findElement(By.name("Name")).sendKeys("Aishwarya");
     driver.findElement(By.name("UserName")).sendKeys("Aa8");
     driver.findElement(By.name("Email")).sendKeys("abc@gnil.com");
     driver.findElement(By.name("Password")).sendKeys("12345678");
     Select select=new Select(driver.findElement(By.name("gender")));
     select.selectByVisibleText("Female");
     driver.findElement(By.name("Age")).sendKeys("22");
     driver.findElement(By.name("Mobile_no")).sendKeys("9931178906");
     driver.findElement(By.xpath("//button[@type='submit']")).click();
   
	}

}
