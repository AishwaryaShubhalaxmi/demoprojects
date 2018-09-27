/**
 * 
 */
package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author M1046926
 *
 */
public class PropertiesUtil {

	public static String filePath;
	public static String sheetName;

	public static void loadProperties() {
		Properties p = new Properties();
		InputStream input = null;

		try {
			input = new FileInputStream("D:/Data/inputdata.properties");

			p.load(input);
			filePath = p.getProperty("filePath");
			sheetName = p.getProperty("sheetName");
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {

					e.printStackTrace();
				}
			}
		}
	}

}
