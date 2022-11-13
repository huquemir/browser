package com.stepdef;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.basepage.BaseClass;
import com.util.Utilities;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps extends BaseClass {
	
	@Given("I can open browser")
	public void i_can_open_browser() throws IOException {
		
		
	   getDriver().findElement(By.id("email")).sendKeys("test@email.com"); 
	    
	}

	@When("I click on something")
	public void i_click_on_something() {
	    //getDriver().findElement(By.id("pass")).sendKeys("hello");
	    //Assert.assertTrue(false);
	}

	@Then("I validate")
	public void i_validate() {
	    
	    
	}

}
