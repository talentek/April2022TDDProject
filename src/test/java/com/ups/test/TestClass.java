package com.ups.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {

	@Test(groups= {"smokeTest"})
	public void test() {
		System.out.println("Default: Passed");
	}

	@Test(groups= {"regressionTest"})
	public void sumTest() {

		int a = 1;
		int b = 2;
		int sum = a + b;
		Assert.assertNotEquals(sum, 3);

	}

}
