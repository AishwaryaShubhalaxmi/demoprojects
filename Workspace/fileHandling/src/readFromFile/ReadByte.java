package readFromFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadByte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  try {
	FileInputStream fin= new FileInputStream("D:\\textfiles\\new2.txt");
	int i=fin.read();
	System.out.println((char)i);
	fin.close();
	
} catch (FileNotFoundException e) {
	
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
