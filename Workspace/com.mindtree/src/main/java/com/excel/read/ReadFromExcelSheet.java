package com.excel.read;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcelSheet {
   public String[][] readExcel(String filename, String sheetname) throws InvalidFormatException, IOException {
	   File file1= new File(filename);
	   FileInputStream input1= new FileInputStream(file1);
	   XSSFWorkbook wb= new XSSFWorkbook(file1);
	   XSSFSheet sheet=wb.getSheet(sheetname);
	   int rowcount=sheet.getLastRowNum();
	   int colcount=sheet.getRow(0).getLastCellNum();
	   String[][] data= new String[rowcount+1][colcount];
	   for(int i=1;i<=rowcount;i++) {
		   for(int j=0;j<colcount;j++) {
			   String value= sheet.getRow(i).getCell(j).getStringCellValue();
			   data[i][j]=value;
			   System.out.println(value);
		   }
	   }
//	   
//	   for(int i=0;i<data.length;i++) {
//		   for(int j=0;j<data[i].length;j++) {
//			   System.out.println(data[i][j]);
//		   }
//	   }
	   return data;
	   
	   
   }
}
