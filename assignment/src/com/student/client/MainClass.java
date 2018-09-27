package com.student.client;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

import com.student.dao.DaoImpl;
import com.student.entity.Student;
import com.student.service.ServiceImpl;


public class MainClass {
	public static void main(String[] args) {
		ServiceImpl serv= new ServiceImpl();
		serv.storeInList();

	Set<Student> set1= new TreeSet<Student>();
	DaoImpl dao= new DaoImpl();
	dao.insert(set1);

}
}
