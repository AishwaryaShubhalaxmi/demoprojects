package com.flight.booking;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.fight.makmytrip.FlightDetails;
import com.fight.makmytrip.FlightSearch;
import com.fight.makmytrip.LaunchBrowser;
import com.fight.util.ReadFromExcel;

public class BookFlight {

	@BeforeTest
	public void openBrowser() {
		LaunchBrowser br= new LaunchBrowser();
		br.open();
	}
	
	@DataProvider
	public Iterator<String[]> readData1() throws Exception {
			ArrayList<String[]> arr=ReadFromExcel.readData();
           return arr.iterator();
	}
	
	@Test(dataProvider="readData1")
	public void selectFlight(String fromCity, String fromCityCode, String toCity, String toCityCode, String airline)
	{
		FlightSearch fs= new FlightSearch();
		fs.selectPlaces(fromCity, fromCityCode, toCity, toCityCode);
		FlightDetails fd= new FlightDetails();
		//fd.selectFlight(fromCity, fromCityCode, toCity, toCityCode, airline);
	}
}
