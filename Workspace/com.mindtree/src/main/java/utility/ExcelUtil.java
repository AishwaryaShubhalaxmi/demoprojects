package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtil {

	public static String[][] loadData(String filePath, String sheetname) {

		Workbook book = null;
		Sheet sheet = null;
		FileInputStream file = null;
		try {
			file = new FileInputStream(filePath);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetname);

		int numberOfRows = sheet.getPhysicalNumberOfRows();
		int numberOfColumns = sheet.getRow(0).getLastCellNum();

		String[][] data = new String[numberOfRows-1][numberOfColumns];
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
			}
		}

		
		return data;
	}
}
