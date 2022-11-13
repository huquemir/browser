package com.hooks;


import java.io.IOException;

import com.basepage.BaseClass;
import com.util.Utilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

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
	public static void tearDown(Scenario scenario) throws IOException {
		
		if (scenario.isFailed()) {
		    scenario.attach(Utilities.getByteScreenShot(), "image/png", "failed");
		}
		getDriver().quit();
		
		
	}

}
