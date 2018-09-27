package readFromFile;

import java.io.*;
/*
 * Reading text input from a file using BufferedReader
 */

public class BufferedReaderCode {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
      File file =new File("D:\\textfiles\\new 1.txt");
      BufferedReader br= new BufferedReader(new FileReader(file));
      
      String st;
      try {
		while((st=br.readLine()) !=null) {
			  System.out.println(st);
		  }
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
