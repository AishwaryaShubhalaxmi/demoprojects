package readFromFile;
import java.io.*;
public class FileReaderCode {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
     FileReader file =new FileReader("D:\\textfiles\\new 1.txt");
     int i;
     try {
		while((i=file.read())!= -1) {
			System.out.print((char)i); 
		 }
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     
	}

}
