package com.mindtree.kdf;

public class MainScript {

	public static void main(String[] args) throws Exception {
	ReadFromExcel readExcel= new ReadFromExcel();
	String excelPath= PropertiesData.sheetPath;
	readExcel.setExcelSheet(excelPath, PropertiesData.sheetIndex);
	
	for(int rows=1;rows<PropertiesData.rownum;rows++) {
		String sActions= readExcel.getCellData(rows, PropertiesData.columnNum);
		if(sActions.equals("openBrowser"))
		 { 
		 Actions.openBrowser();
		 }
		 else if(sActions.equals("navigate"))
		 {
		 Actions.navigate();
		 }
		 else if(sActions.equals("input_Username"))
		 {
		 Actions.setUsername();
		 }
		 else if(sActions.equals("input_Password"))
		 {
		 Actions.setPassword();
		 }
		 else if(sActions.equals("click_Login"))
		 {
		 Actions.click_login();
		 } 
		 else if(sActions.equals("closeBrowser"))
		 {
		 Actions.closeBrowser();
		 } 
	
	}

	}

}
