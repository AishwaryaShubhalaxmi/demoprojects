package com.sdet.client;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import com.sdet.entity.Employee;
import com.sdet.service.EmployeeService;

public class MainClass {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> list = new ArrayList<Employee>();
		ArrayList<Employee> list1 = new ArrayList<Employee>();
		
		System.out.println("enter the size");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
		    Employee e = new Employee();
			System.out.println("enter id");
			//int id = sc.nextInt();
			//e.setId(id);
			e.setId(sc.nextInt());
			System.out.println("enter name");
			String name = sc.next();
			e.setName(name);
			System.out.println("enter a date");
			String s = sc.next();
			Date date = new SimpleDateFormat("dd/MM/yyyy").parse(s);
			e.setDoj(date);
			list.add(e);
		}
		System.out.println("Before Sorting");
		Iterator it=list.iterator();
		while(it.hasNext()) {
		Employee employee=(Employee) it.next();
		System.out.println(employee.getName() + " " + employee.getId() + " " + employee.getDoj());
		}
	/*	for(Employee em: list) {
			System.out.println(em.getName()+ " " + em.getId() + " " + em.getDoj());
		} */
		System.out.println("After sorting");
		EmployeeService service = new EmployeeService();
		list1 = service.processEmployee(list);
		Iterator iter = list1.iterator();
		while (iter.hasNext()) {
		   Employee emp = (Employee) iter.next();
			System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getDoj());
		}

	}

}
