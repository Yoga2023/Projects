package com.testng;

import org.testng.annotations.Test;

public class Group {

	@Test(groups="fourwheeler")
	private void swift() {
		System.out.println("SUZUKI");

	}
	@Test(groups="fourwheeler")
	private void altroz() {
		System.out.println("TATA");

	}
	@Test(groups="fourwheeler")
	private void i10() {
		System.out.println("Hyundai");

	}
	@Test(groups="Heavy_vehicle")
	private void eicher() {
		System.out.println("TATA");

	}
	@Test(groups="Heavy_vehicle")
	private void lorry() {
		System.out.println("Ashok_Leyland");

	}
}
