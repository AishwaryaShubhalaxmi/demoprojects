package TreeSetBasic;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class SetPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     TreeSet<String> tree= new TreeSet<String>();
     Scanner sc= new Scanner(System.in);
     for(int i=0;i<3;i++) {
    	 System.out.println("enter string");
    	 String str= sc.next();
    	 tree.add(str);
     }
     Iterator itr= tree.iterator();
     while(itr.hasNext()) {
    	 System.out.println(itr.next());
     }
//     tree.add("one");
//     tree.add("two");
//     tree.add("three");
//     for(String s:tree) {
//    	 System.out.println(s);
//     }
	}

}
