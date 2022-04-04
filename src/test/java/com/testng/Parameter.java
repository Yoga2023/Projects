package com.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
@Parameters("Name")
	@Test
	private void inputData(@Optional("YOGA")String name) {
		System.out.println("Name: "+name);

	}
}
