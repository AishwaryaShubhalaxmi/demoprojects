package com.arr.service;

import java.util.Date;
import java.util.Comparator;
import com.arr.entity.Student;

public class CompareByDoj implements Comparator<Student>{
	public int compare(Student s1,Student s2) {
		Date d1= s1.getDate();
		Date d2=s2.getDate();
		
		if(d1.compareTo(d2)>0)
			return 1;
		else if(d1.compareTo(d2)<0)
	        return -1;
		else return 0;

}
}
