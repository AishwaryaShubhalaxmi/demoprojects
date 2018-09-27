package com.mindtree.ddf2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelDataConfig {

	XSSFWorkbook wb;
	XSSFSheet sheet1;
	
	public ReadExcelDataConfig(String excelPath) throws IOException {
		 File src= new File(excelPath);
	      FileInputStream file1= new FileInputStream(src);
	       wb= new XSSFWorkbook(file1);
	}
	
	public String readdata(int sheetNumber, int rowNumber, int columnNumber) {
	    
		sheet1= wb.getSheetAt(sheetNumber);
	    String data= sheet1.getRow(rowNumber).getCell(columnNumber).getStringCellValue();
	     return data;
	 	}
 }
	    

