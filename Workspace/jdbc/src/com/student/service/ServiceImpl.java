package com.student.service;
import java.util.ArrayList;

import com.student.dao.DaoImpl;
import com.student.entity.Student;


public class ServiceImpl {
 
	
public void insertdata(int student_id,String name, String stream) {
	DaoImpl dao=  new DaoImpl();
	dao.insert(student_id, name, stream);
	}

   public ArrayList<Student> update(String name, int student_id){
    	
    	DaoImpl dao=new DaoImpl();
    	return dao.update(name, student_id);
	
}
	}

