package com.mindtree.ddf2;

import java.io.IOException;

public class ReadExcelData {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ReadExcelDataConfig data1= new ReadExcelDataConfig("D:\\ExcelSheets\\BookNo1.xlsx");
		System.out.println(data1.readdata(0, 0, 0));
	}

}
