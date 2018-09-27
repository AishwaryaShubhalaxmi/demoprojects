package countFrequency;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HashMap<String,Integer> hm= new HashMap<String,Integer>();
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter a string");
     String str= sc.nextLine();
     String[] arr= str.split(" ");
     Logic logic = new Logic();
     hm= logic.countFrequency(arr);
     for(Map.Entry<String, Integer> hm1: hm.entrySet()) {
    	 System.out.println("key " + hm1.getKey());
    	 System.out.println("value " + hm1.getValue());
     }
	}

}
