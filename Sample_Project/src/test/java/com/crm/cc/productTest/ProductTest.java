package com.crm.cc.productTest;

import org.testng.annotations.Test;

public class ProductTest {
	@Test(groups = "smokeTest")
	public void Demo() 
	{
		String BROWSER = System.getProperty("browser");
		String ENV = System.getProperty("env");
		System.out.println("BROWSER===========>"+BROWSER);
		System.out.println("BROWSER===========>"+ENV);
		System.out.println("welcome to jenkins");
	}
	
	@Test(groups = "regressionTest")

	public void createProductWithIDTest() {
		System.out.println("execute createProductWithIDTest");
 	}

}
