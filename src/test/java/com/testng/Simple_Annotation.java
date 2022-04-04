package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotation {
	@BeforeSuite
	private void property() {
		System.out.println("Set_Property");

	}
	@BeforeTest
	private void browser() {
		System.out.println("Browser_Launch");

	}
	@BeforeClass
	private void url() {
		System.out.println("Url_Launch");

	}
@BeforeMethod
private void sign_In() {
	System.out.println("Sign_IN");

}
@Test
private void dress() {
	System.out.println("Dresses");

}
	@Test
private void womens() {
	System.out.println("Womens");
}
	@Test
	private void tshirts() {
		System.out.println("T-Shirts");

	}
	
	@AfterMethod
	private void signout() {
		System.out.println("Sign_Out");

	}
	@AfterClass
	private void homepage() {
		System.out.println("Home_Page");
	}
	@AfterTest
	private void close() {
		System.out.println("Close");

	}
	@AfterSuite
	private void cookies() {
		System.out.println("Delete_Cookies");

	}
}
