package mercuryFlightPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WebElements {

	WebDriver driver;
	@FindBy(name="userName") WebElement username;
	@FindBy(how=How.NAME,using= "password") WebElement password;
	@FindBy(how=How.NAME,using= "login") WebElement login;
	
	public WebElements(WebDriver driver1) {
		this.driver=driver1;
	}
	public void loginMethod(String uid, String pwd) {
		username.sendKeys(uid);
		password.sendKeys(pwd);
		login.click();
	}
	
}
