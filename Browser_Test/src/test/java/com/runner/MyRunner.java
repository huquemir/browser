package com.runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.basepage.BaseClass;
import com.hooks.Hook;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = {"Features/"},
		glue = {"com.stepdef","com.hooks"},
		monochrome = true
		)


public class MyRunner extends AbstractTestNGCucumberTests {
		
	@Parameters("browserType")
	@BeforeClass
	public static void beforeClass(@Optional ("edge") String browser) {
		BaseClass.initializepropertyfile();
		
		if(!browser.equals("param-val-not-found")) {
		
		BaseClass.property.get().setProperty("BrowserType", browser);
		
	}
			

}
	
//	@Override
//	@DataProvider(parallel = false)
//	public Object[][] scenarios() {
//		return super.scenarios();
//	}
	
	@AfterClass
	public static void afterClass() {
		
	}
}
