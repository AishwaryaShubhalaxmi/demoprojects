package com.fileHandling.Service;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.fileHandling.Dao.DaoImpl;
import com.fileHandling.entity.User;

public  class ServiceImpl {
	DaoImpl dao= new DaoImpl();
 public String readFromFile() {
	 ArrayList<User> users=null;
	 String[] arr= null;
	 String line=null;
	 try {
		 FileReader file=new FileReader("inputdata.txt");
		 BufferedReader br=new BufferedReader(file);
		 users=new ArrayList<User>();
		 line=br.readLine();
		 line=br.readLine();
		while(line!=null) {
		arr= line.split(",");
		for(int i=0;i<arr.length;) {
		User user=new User();
		user.setMid(arr[i]);
		i++;
		user.setName(arr[i]);
		i++;
		String s= arr[i];
		Date doj=null;
		try {
			doj=new SimpleDateFormat("dd-MM-yyyy").parse(s);
		} catch (ParseException e) {
			System.out.println("Error");
		}  
		user.setDoj(doj);
		i++;
		user.setRole(arr[i]);
		i++;
		users.add(user);
		}
		line=br.readLine();
	      br.close();
	} }catch (Exception e) {
		System.out.println(e);
	}
	 dao.insertData(users);
	 return "File read successfully";
 }
	/* public String writeToFile(String mid) {
		User u= dao.readData(mid);
		try {
			FileWriter fw=new FileWriter("D:\\textfiles\\new2.txt");
			BufferedWriter brOut = new BufferedWriter(fw);
			brOut.write(u.getMid());
			brOut.newLine();
			brOut.write(u.getName());
			brOut.newLine();
			brOut.write(u.getDoj());
			brOut.newLine();
			brOut.write(u.getRole());
			brOut.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return "Data written successfully";
	 }
	 */
 }
