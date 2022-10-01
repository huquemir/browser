package com.hooks;


import com.basepage.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends BaseClass {
	
	
	@Before
	public static void initialize() {
	 setUp();
		
	}
	
	@After
	public static void tearDown() {
		driver.quit();
		
		
	}

}
