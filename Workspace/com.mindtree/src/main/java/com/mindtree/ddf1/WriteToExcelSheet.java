package com.mindtree.ddf1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToExcelSheet {
	
	public static void main(String[] args) throws Exception {

	File src= new File("D:\\ExcelSheets\\BookNo1.xlsx");
    FileInputStream file1= new FileInputStream(src);
    XSSFWorkbook wb= new XSSFWorkbook(file1);
    XSSFSheet sheet1= wb.getSheetAt(0);
    
    sheet1.getRow(0).createCell(2).setCellValue("Pass");
    sheet1.getRow(1).createCell(2).setCellValue("Fail");
    
    FileOutputStream fout= new FileOutputStream(src);
    wb.write(fout);
    System.out.println("Written successfully");
    wb.close();
    
    
	}
}