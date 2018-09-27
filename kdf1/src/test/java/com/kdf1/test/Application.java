package com.kdf1.test;

import org.testng.annotations.Test;

import com.kdf1.main.Methods;
import com.kdf1.util.Config;
import com.kdf1.util.ReadExcel;

public class Application {
	
	@Test
	public void kdf() throws Exception {
		String[][] data= ReadExcel.getData("D:\\ExcelSheets\\newtours.xlsx", "Sheet1");
		for(int i=1;i<data.length;i++) {
			switch(data[i][Config.optioncol]) {
			case "openBrowser":
			Methods.openBrowser();
			break;
			
			case "maximizeBrowser":
			Methods.maximize();
			break;
			
			case "implementWait":
		    Methods.implementwait();
		    break;
		    
			case "navigateApplication":
			Methods.navigate(data[i][Config.paramcol]);
			break;
			
			case "enterName":
			Methods.enterUsername(data[i][Config.locatorcol],data[i][Config.valuecol], data[i][Config.paramcol]);
			break;
			
			case "enterPassword":
			Methods.enterPassword(data[i][Config.locatorcol],data[i][Config.valuecol], data[i][Config.paramcol]);
			break;
			
			case "clickButton":
			Methods.click(data[i][Config.locatorcol],data[i][Config.valuecol]);
			break;
			
			case "verifyMessage":
			Methods.verify(data[i][Config.paramcol]);
			break;
			
			
				
			}
		}
	}
	

}
