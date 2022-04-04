package com.testng;

import org.testng.annotations.Test;

public class Invocation_Count {

	@Test(invocationCount = 4 )
	private void Womens() {
		System.out.println("Women ");

	}
}
