package com.fight.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.fight.makmytrip.FlightDetails;

public class WriteToExcel {
	FlightDetails det= new FlightDetails();
	
 public void departureTicket()  {
	 File file= new File("D:\\Book2.xlsx");
	 FileInputStream excelFile;
	try {
		excelFile = new FileInputStream(file);
     XSSFWorkbook workbook=new XSSFWorkbook(excelFile);
	 XSSFSheet excelSheet = workbook.getSheetAt(0);
	 excelSheet.getRow(1).createCell(5).setCellValue(det.index1);
	 FileOutputStream fout= new FileOutputStream("D:\\Book2.xlsx");
	 workbook.write(fout);
	 fout.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
	 
 }
 
 public void returnTicket() {
	 File file= new File("D:\\Book2.xlsx");
	 FileInputStream excelFile;
	try {
		excelFile = new FileInputStream(file);
	 XSSFWorkbook workbook=new XSSFWorkbook(excelFile);
	 XSSFSheet excelSheet = workbook.getSheetAt(0);
	 excelSheet.getRow(1).createCell(6).setCellValue(det.index2);
	 FileOutputStream fout= new FileOutputStream("D:\\Book2.xlsx");
	 workbook.write(fout);
	 fout.close(); 
 }catch(Exception e) {
	  e.printStackTrace();
 }
}
}
