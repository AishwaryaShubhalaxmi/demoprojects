package com.ddf.utility;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelUtility {
	@DataProvider(name="Excel")
	public static Object[][] testDataGenerator() throws Exception{
	FileInputStream file= new FileInputStream("D:\\ExcelSheets\\BookNo2.xlsx");
	XSSFWorkbook wb= new XSSFWorkbook(file);
	XSSFSheet sheet= wb.getSheetAt(0);
	int rownumber= sheet.getPhysicalNumberOfRows();
	Object[][] data= new Object[rownumber][2];
	for(int i=0;i<rownumber;i++) {
		XSSFRow row= sheet.getRow(i);
		XSSFCell username= row.getCell(0);
		XSSFCell password= row.getCell(1);
		data[i][0]=username.getStringCellValue();
		data[i][1]=password.getStringCellValue();
	}
	return data;
	
	}
	

}

