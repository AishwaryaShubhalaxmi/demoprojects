package com.keyword.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelSheet {
       XSSFSheet sheet1;
	public XSSFSheet getSheetData() {
		File src= new File("D:\\ExcelSheets\\KDF.xlsx");
		try {
			FileInputStream file1= new FileInputStream(src);
			XSSFWorkbook wb= new XSSFWorkbook(file1);
			 sheet1= wb.getSheetAt(0);
			
		} catch (FileNotFoundException e) {
			e.getMessage();
		} catch (IOException e) {
			e.getMessage();
		}
		return sheet1;
	}
}
