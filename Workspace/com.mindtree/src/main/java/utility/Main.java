package utility;

public class Main {

	public static void main(String[] args) {

		PropertiesUtil.loadProperties();

		ExcelUtil exUtil = new ExcelUtil();

		String[][] data = ExcelUtil.loadData(PropertiesUtil.filePath, PropertiesUtil.sheetName);

		for (String[] arr : data) {

			for (String st : arr) {
				System.out.print(st + " ");
			}
			System.out.println();

		}
	}

}
