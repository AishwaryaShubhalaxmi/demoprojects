package com.mindtree.ddfDataProvider;
import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataConfig {
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	

 public DataConfig(String excelPath) throws Exception {
	 File src= new File(excelPath);
     FileInputStream file1= new FileInputStream(src);
     wb= new XSSFWorkbook(file1);
	 }
 
 public String getData(int SheetIndex, int row, int column) {
	 sheet1=wb.getSheetAt(SheetIndex);
	 String data= sheet1.getRow(row).getCell(column).getStringCellValue();
	 return data;
	}
 public int getRowCount(int SheetIndex) {
	 int rowCount= wb.getSheetAt(SheetIndex).getLastRowNum();
	 rowCount=rowCount+1;
	 return rowCount;
	 
	 
 }
}
