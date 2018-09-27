package com.jdbc.client;
import java.util.*;

import com.jdbc.dao.DaoImpl;
import com.jdbc.entity.Country;
import com.jdbc.entity.Player;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("1.Insert data in country table");
		System.out.println("2.Insert data in players table");
		System.out.println("3.Select data");
		System.out.println("4.Update data");
		System.out.println("5.Delete data");
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		DaoImpl dao=new DaoImpl();
		Country c= new Country();
		switch(choice) {
		case 1:
			for(int i=0;i<5;i++) {
				System.out.println("enter country id");
				int countryid=sc.nextInt();
				System.out.println("enter country name");
				String countryName=sc.next();
				dao.insertData(countryid, countryName);
			}System.out.println("successfully inserted");
			 break;
		case 2:
			for(int i=0;i<10;i++) {
			System.out.println("Enter player id");
			int playerId=sc.nextInt();
			System.out.println("enter country id");
			int countryId=sc.nextInt();
			System.out.println("enter player name");
			String name= sc.next();
			System.out.println("enter runs made");
			int runs=sc.nextInt();
			System.out.println("enter wickets taken");
			int wickets=sc.nextInt();
			dao.insertDataPlayer(playerId, countryId, name, runs, wickets);
			}System.out.println("Successfully inserted");
			break;
		case 3:
			ArrayList<Player> arr1= new ArrayList<Player>();
			arr1=dao.selectData();
			System.out.println(arr1.toString());
			
			System.out.println("Successful");
			break;
		case 4:
			break;
		}
     
	}

}
