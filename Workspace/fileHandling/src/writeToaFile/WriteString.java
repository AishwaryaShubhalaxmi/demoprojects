package writeToaFile;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   try {
	FileOutputStream fout= new FileOutputStream("D:\\textfiles\\new2.txt");
	String s="Hello world!";
	byte b[]= s.getBytes();
	fout.write(b);
	fout.close();
	System.out.println("Success");
} catch (IOException e) {
	e.printStackTrace();
}
   
	}

}
