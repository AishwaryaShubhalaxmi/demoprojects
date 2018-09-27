package com.mindtree.kdf;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcel {
	 
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	public void setExcelSheet(String path,int Sheetindex) throws Exception {
		FileInputStream file1 = new FileInputStream(path);
		 wb = new XSSFWorkbook(file1);
		 sheet1 = wb.getSheetAt(Sheetindex);
	}
	
	public String getCellData(int row,int column) {
		String cellData= sheet1.getRow(row).getCell(column).getStringCellValue();
		return cellData;
	}

}
