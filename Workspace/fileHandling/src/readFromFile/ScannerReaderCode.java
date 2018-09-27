package readFromFile;
import java.util.*;
import java.io.*;
public class ScannerReaderCode {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
     File file =new File("D:\\textfiles\\new 1.txt");
     Scanner sc= new Scanner(file);
     while(sc.hasNextLine()) {
    	 System.out.println(sc.nextLine());
     }
	}

}
