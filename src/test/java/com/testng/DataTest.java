package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataTest {

	@Test(dataProvider = "IPL")
	private void dataBase(String name,String empid) {
		System.out.println("EMP-Name: "+name);
		System.out.println("EMP_ID: "+ empid);
	}
	
	@DataProvider(name="EMP01")
	private Object[][] name() {
		return new Object [][] {
			{"YOGA","10012022"},
			{"AGOY","10022022"},
		};
	}
	@DataProvider(name="EMP02")
	private Object[][] name2() {
		return new Object [][] {
			{"Uma","10032022"},
			{"Kumaravel","10042022"},
		};
	}	
	@DataProvider(name="EMP03")
	private Object[][] name3() {
		return new Object [][] {
			{"Shivanya","10052022"},
			{"Punitha","10062022"},
		};
	}
	@DataProvider(name="IPL")
	private Object[][] input() {
		return new Object[][] {
			{"TATA_IPL","2022"},{"VIVO_IPL","2021"},{"DLF_IPL","2008"}};
		}

	}
	

