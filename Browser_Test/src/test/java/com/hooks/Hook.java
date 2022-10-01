package com.hooks;


import com.basepage.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends BaseClass {

	
	@Before
	public static void initialize() {
		//When running in parallel, the code below needs to be initialized. 
		//BaseClass.initializepropertyfile();
		//setUp(property.get().getProperty("BrowserType"));
		setUp("firefox");
		getDriver().navigate().to("https://www.facebook.com/");	
		
	}
	
	@After
	public static void tearDown() {
		getDriver().quit();
		
		
	}

}
