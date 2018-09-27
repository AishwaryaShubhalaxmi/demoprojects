package com.excel.read;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {
    static WebDriver driver;
	public static void main(String[] args) throws InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		ReadFromProperties r= new ReadFromProperties();
		r.readProperties();
		String path=r.chromePath;
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.newtours.demoaut.com");
		ReadFromExcelSheet re= new ReadFromExcelSheet();
		String[][] value=re.readExcel(r.excelPath, r.sheetName);
		String username=value[1][0];
	    String password=value[1][1];
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);;
		driver.findElement(By.name("login")).click();
		

	}

}
