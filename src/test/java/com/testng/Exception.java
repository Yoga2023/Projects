package com.testng;

import org.testng.annotations.Test;

public class Exception {

	@Test(expectedExceptions =Exception.class)
	private void number() {
		System.out.println(10/0);

	}
}
