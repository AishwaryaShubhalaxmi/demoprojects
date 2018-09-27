package com.ddf.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
  
	public static String[][] getData(String filename,String sheetname) throws Exception{
	  File file= new File(filename);
		FileInputStream input= new FileInputStream(file);
		XSSFWorkbook wb= new XSSFWorkbook(input);
		XSSFSheet sh= wb.getSheet(sheetname);
		int rownum=sh.getLastRowNum()+1;
		int colnum=sh.getRow(0).getLastCellNum();
		String[][] data= new String[rownum][colnum];
		for(int i=0;i<rownum;i++) {
			for(int j=0;j<colnum;j++) {
				String value=sh.getRow(i).getCell(j).getStringCellValue();
				data[i][j]=value;
			}
		} 
	    return data;
	  
	
	}
	}
