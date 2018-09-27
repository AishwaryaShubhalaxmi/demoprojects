package com.mindtree.ddf1;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//read the entire sheet
public class ReadExcelSheet1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    File src= new File("D:\\ExcelSheets\\BookNo1.xlsx");
    FileInputStream file= new FileInputStream(src);
    XSSFWorkbook wb= new XSSFWorkbook(file);
    XSSFSheet sheet1= wb.getSheetAt(0);
    int rowCount= sheet1.getLastRowNum();
    System.out.println("The total no. of rows is:" +(rowCount+1));
  /*  for(int i=0; i<rowCount;i++) {
    	String data= sheet1.getRow(i).getCell(0).getStringCellValue();
    	System.out.println("The data is:" + data);
    }*/
    
    for(int i=0;i<rowCount;i++) {
    	for(int j=0;j<2;j++) {
    		String data=sheet1.getRow(i).getCell(j).getStringCellValue();
    		System.out.print(data + " ");
    	}
    	System.out.println();
    }
    wb.close();
	}

}
