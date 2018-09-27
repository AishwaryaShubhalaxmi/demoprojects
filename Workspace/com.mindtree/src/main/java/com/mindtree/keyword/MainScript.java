package com.mindtree.keyword;

import java.lang.reflect.Method;

public class MainScript {
	
	public static Actions actionKeywords;
	public static String sActions;
	public static Method method[];
	
     
	public static void main(String[] args) throws Exception {
	String spath="D:\\ExcelSheets\\kdf1.xlsx";
	ReadFromExcel1 readExcel= new ReadFromExcel1();
	readExcel.setExcelSheet(spath, 0);
	
	 for (int rows=1;rows<7;rows++)
	 {
	 sActions = readExcel.getCellData(rows, 1)	;
	 execute_Actions(); 
	 }
    }
	
	private static void execute_Actions() throws Exception 
	 {
		actionKeywords = new Actions();
		 method = actionKeywords.getClass().getMethods();
		 for(int i = 0;i<method.length;i++)
		 {
			 if(method[i].getName().equals(sActions))
			 {  
			  method[i].invoke(actionKeywords);
			  break;
			 }
			 
			 }
		 }
	 }


