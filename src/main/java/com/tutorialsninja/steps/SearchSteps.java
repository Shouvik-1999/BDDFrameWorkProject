package com.tutorialsninja.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {
	@Given("User opens the application")
	public void openApplication() {
		
	}
	@When("User enters valid product {string} into searchbox field")
	public void searchItem(String item) {
		
	}
	@And("User clicks search Button")
	public void clickSearchButton() {
		
	}
	@Then("User should get valid product displayed")
	public void validateItemDisplayed() {
		
	}
	@Then("User validate no product matching message")
	public void validateInvalidItemMessage() {
		
	}
}
