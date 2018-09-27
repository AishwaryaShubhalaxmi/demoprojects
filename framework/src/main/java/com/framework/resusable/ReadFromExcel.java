package com.framework.resusable;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcel {
      XSSFWorkbook wb;
      XSSFSheet sheet;
	public String[][] readExcel(String filepath, String sheetName) throws Exception {
	  FileInputStream file= new FileInputStream(filepath);
	  wb=new XSSFWorkbook(file);
	  sheet=wb.getSheet(sheetName);
	  int rownum=sheet.getLastRowNum();
	  int colnum=sheet.getRow(0).getLastCellNum();
	  String[][] data= new String[rownum+1][colnum];
	  for(int i=1;i<rownum;i++) {
		  for(int j=0;j<colnum;j++) {
			  String value=sheet.getRow(i).getCell(j).getStringCellValue();
			  data[i][j]=value;
		  }
	  }
	  return data;
	  
	  }
	
	}

