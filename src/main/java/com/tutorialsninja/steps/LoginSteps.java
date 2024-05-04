package com.tutorialsninja.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginSteps {
	@Given("User navigate to login page")
	public void userNavigateToLoginPage() {
		
	}
	
	@When(" User enter valid Email address {string} in the Email field")
	public void userEnterEmail(String email) {
		
	}
	
	@And("User enter valid Passowrd {string} in the Password field")
	public void userEnterPass(String password) {
		
	}
	
	@And("User clicks on Login Button")
	public void userClickLogin() {
		
	}
	
	@And("User is able to login")
	public void verifyLoginSuccess() {
		
	}
}

