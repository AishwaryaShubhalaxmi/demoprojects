package com.ddf.test;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import com.ddf.base.Base;
import com.ddf.pages.LoginPage;
import com.ddf.utility.ExcelUtility;

public class TestLogin extends Base {
	final static Logger logger = Logger.getLogger(TestLogin.class);

	@Test(dataProvider = "Excel", dataProviderClass = ExcelUtility.class)
	public void loginFunc(String username, String password) {
		logger.info("login test starting");
		LoginPage login = new LoginPage(driver);
		try {
			login.enterEmail(username);
			login.enterPassword(password);
			login.clickButton();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error(e.getMessage());
		}

	}

}
