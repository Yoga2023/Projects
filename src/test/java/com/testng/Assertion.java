package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {

	// hard_Assert

	@Test
	private void name() {
		String expected = "I am Boy";
		String actual = "Boy";
		Assert.assertEquals(actual, expected);

	}

	// Soft_Assert
	@Test
	private void shopping() {
		SoftAssert sa = new SoftAssert();
		String expected = "Going for Shopping";
		String actual = "Went Shopping";
		sa.assertEquals(actual, expected);
		System.out.println("Shopping_Over");
		sa.assertAll();
	}
}
