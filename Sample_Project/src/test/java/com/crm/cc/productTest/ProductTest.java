package com.crm.cc.productTest;

import org.testng.annotations.Test;

public class ProductTest {
	@Test(groups = "smokeTest")
	public void Demo() 
	{
		
		System.out.println("welcome to jenkins");
	}
	
	@Test(groups = "regressionTest")

	public void createProductWithIDTest() {
		System.out.println("execute createProductWithIDTest");
 	}

}
