package hashMapSortByObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;



public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HashMap<String,CampusMind> hm= new HashMap<String,CampusMind>();
     Scanner sc= new Scanner(System.in);
     System.out.println("enter size");
     int count=0;
     int n= sc.nextInt();
     for(int i=0;i<n;i++) {
    	 CampusMind cm= new CampusMind();
    	 System.out.println("Enter mid");
    	 String mid= sc.next();
    	 System.out.println("enter name");
    	 cm.setName(sc.next());
    	 System.out.println("enter track");
    	 cm.setTrack(sc.next());
    	 System.out.println("enter doj");
    	 String date=sc.next();
    	 try {
			Date doj= new SimpleDateFormat("dd/MM/yyyy").parse(date);
			cm.setDoj(doj);
		} catch (ParseException e) {
			e.printStackTrace();
		}
    	 hm.put(mid, cm);
    	 
     }
     System.out.println("Before Sorting:");
     for(Entry<String, CampusMind> m: hm.entrySet()) {
    	 System.out.println("key " + m.getKey());
    	 System.out.println("value " + m.getValue().getName() + m.getValue().getTrack() + m.getValue().getDoj());
     }
     Set<Map.Entry<String,CampusMind>> set= hm.entrySet();
     ArrayList<Map.Entry<String,CampusMind>> arr= new ArrayList<Map.Entry<String,CampusMind>>(set);
     Collections.sort(arr, new CompareByDoj());
     System.out.println("After Sorting:");
     for(Map.Entry<String, CampusMind> cm1:arr) {
    	 System.out.println("key " + cm1.getKey());
     System.out.println("value " + cm1.getValue().getName() + cm1.getValue().getTrack() + cm1.getValue().getDoj());
     }
     System.out.println("The 2nd to 4th position minds are");
     for(Map.Entry<String, CampusMind> cm1:arr) {
    	 count++;
    	 if(count==2 || count==3 || count==4) {
    	 System.out.println("key " + cm1.getKey());
     System.out.println("value " + cm1.getValue().getName() + cm1.getValue().getTrack() + cm1.getValue().getDoj());
     }}
	}

}
