package com.mindtree.ddf1;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//to read a word from excel sheet
public class ReadExcelSheet {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
      File src= new File("D:\\ExcelSheets\\BookNo1.xlsx");
      FileInputStream file1= new FileInputStream(src);
      XSSFWorkbook wb= new XSSFWorkbook(file1);
      XSSFSheet sheet1= wb.getSheetAt(0);
      String data=sheet1.getRow(0).getCell(0).getStringCellValue();
      System.out.println("Data read from excel is:" + data);
      wb.close(); // may lead to memory leak, if not closed
	}

}
