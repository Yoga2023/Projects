package com.testng;

import org.testng.annotations.Test;

public class Priority {

	@Test(priority=0)
	private void ignite() {
		System.out.println("Switch On the Stove");

	}
	@Test(priority=2)
	private void Vegetables() {
		System.out.println("Cut and add Vegetables");

	}
	@Test(priority=1)
	private void water() {
		System.out.println("Boil_Water");
	}
	@Test(priority=3) 
	private void maggi() {
		System.out.println("Put Maggi in boiled water");
	}
	@Test(priority=6)
	private void off() {
		System.out.println("Switch_off_Stove");

	}
	@Test(priority=4)
	private void masala() {
		System.out.println("Add masala and incredients");
	}
	@Test(priority=5)
	private void time() {
		System.out.println("Wait for 3mins");

	}
	@Test(priority=8)
	private void tasting() {
		System.out.println("YummY");

	}
	@Test(priority=7)
	private void eat() {
		System.out.println("Serve Maggi");
	}
}
