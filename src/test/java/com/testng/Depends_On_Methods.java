package com.testng;

import org.testng.annotations.Test;

public class Depends_On_Methods {
	@Test(priority=2,dependsOnMethods="username")
	private void password() {
		System.out.println("Yoga1234");
	}
	@Test()
	private void username() {
		System.out.println("Yoga1234@gmail.com");

	} 
	@Test(priority=3)
	private void login() {
		System.out.println("Logged_In");

	}
}
