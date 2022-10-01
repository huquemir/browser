package com.stepdef;

import org.openqa.selenium.By;

import com.basepage.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps extends BaseClass {
	
	@Given("I can open browser")
	public void i_can_open_browser() {
		
		
	   getDriver().findElement(By.id("email")).sendKeys("test@email.com"); 
	    
	}

	@When("I click on something")
	public void i_click_on_something() {
	    //getDriver().findElement(By.id("pass")).sendKeys("hello");
	    
	}

	@Then("I validate")
	public void i_validate() {
	    
	    
	}

}
