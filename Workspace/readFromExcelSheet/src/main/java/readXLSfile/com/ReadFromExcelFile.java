package readXLSfile.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcelFile {

	public static void main(String[] args) throws FileNotFoundException {
		File src= new File("D:\\Book1.xlsx");
        FileInputStream f1= new FileInputStream(src);
        try {
			XSSFWorkbook wb= new XSSFWorkbook(f1);
			XSSFSheet sheet1=wb.getSheetAt(0);
			int rowcount=sheet1.getLastRowNum()-sheet1.getFirstRowNum();
			System.out.println("Total rows is " + rowcount+1);
			for(int i=0;i<rowcount+1;i++) {
				Row row=sheet1.getRow(i);
				for(int j=0;j<row.getLastCellNum();j++) {
					System.out.println(row.getCell(j).getStringCellValue() + " ");
				}
			}
			System.out.println();
			wb.close();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
        
        
	}
}
