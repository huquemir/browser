package com.runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import com.basepage.BaseClass;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = {"Features/"},
		glue = {"com.stepdef","com.hooks"}
		)


public class MyRunner extends AbstractTestNGCucumberTests {
		
	@Parameters("browserType")
	@BeforeClass
	public static void beforeClass(@Optional("Firefox") String browser) {
		BaseClass.initializepropertyfile();
		
		if(!browser.equals("param-val-not-found")) {
		
		BaseClass.property.get().setProperty("BrowserType", browser);
		
	}
			

}
	
	@AfterClass
	public static void afterClass() {
		
	}
}
