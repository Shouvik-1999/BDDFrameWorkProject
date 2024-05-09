package com.tutorialsninja.steps;

import static com.tutorialsninja.utils.Utilities.*;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.tutorialsninja.webdriverfactory.WebDriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class LoginSteps {
	WebDriver driver=WebDriverFactory.getDriver();
	
	
	@Given("User navigate to login page")
	public void userNavigateToLoginPage() {
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Login")).click();
	}
	
	@When("User enter valid Email address {string} in the Email field")
	public void userEnterEmail(String email) {
		driver.findElement(By.id("input-email")).sendKeys(email);
	}
	
	@And("User enter valid Passowrd {string} in the Password field")
	public void userEnterPass(String password) {
		driver.findElement(By.id("input-password")).sendKeys(password);
	}
	
	@And("User clicks on Login Button")
	public void userClickLogin() {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}
	
	@And("User is able to login")
	public void verifyLoginSuccess() {
		Assert.assertTrue(driver.findElement(By.linkText("Change your password")).isDisplayed());
	}
	@When("User enter invalid Email address {string} in the Email field")
	public void userEnterInvEmail(String Invemail) {
		driver.findElement(By.id("input-email")).sendKeys(createRandomEmailAddr());
	}
	@And("User enter invalid Passowrd {string} in the Password field")
	public void userEnterInvPass(String Invpass) {
		driver.findElement(By.id("input-password")).sendKeys(Invpass);
	}
	@And("User verify Warning message {string}")
	public void validateLoginErrorMessage(String warning) {
		String actual=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
		Assert.assertEquals("Warning Mismatch",warning, actual);
	}
	
}

