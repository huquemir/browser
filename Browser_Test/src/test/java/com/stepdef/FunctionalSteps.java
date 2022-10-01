package com.stepdef;

import org.openqa.selenium.By;

import com.basepage.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class FunctionalSteps extends BaseClass {
	
	@Given("This is a test")
	public void this_is_a_test() {
	    driver.findElement(By.id("email")).sendKeys("emailonly");
	    
	}

	@When("I log into the site")
	public void i_log_into_the_site() {
	    
	    
	}

}
