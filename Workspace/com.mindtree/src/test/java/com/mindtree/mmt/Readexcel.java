package com.mindtree.mmt;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readexcel {

	
	public static ArrayList<String[]> readData() throws Exception{
		ArrayList<String[]> details= new ArrayList<String[]>();
		File file= new File("D:\\Book2.xlsx");
		FileInputStream excelFile= new FileInputStream(file);
		XSSFWorkbook workbook= new XSSFWorkbook(excelFile);
		XSSFSheet excelSheet= workbook.getSheetAt(0);
		
		String fromCity=excelSheet.getRow(1).getCell(0).getStringCellValue();
		String fromCityCode=excelSheet.getRow(1).getCell(1).getStringCellValue();
		String toCity=excelSheet.getRow(1).getCell(2).getStringCellValue();
		String toCityCode=excelSheet.getRow(1).getCell(3).getStringCellValue();
		String airline=excelSheet.getRow(1).getCell(4).getStringCellValue();
		String[] s= {fromCity,fromCityCode,toCity,toCityCode,airline};
		details.add(s);
		 
		return details;
			
		}
}
