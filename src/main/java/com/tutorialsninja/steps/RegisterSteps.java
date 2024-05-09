package com.tutorialsninja.steps;

import static com.tutorialsninja.utils.Utilities.*;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.tutorialsninja.webdriverfactory.WebDriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSteps {
	WebDriver driver=WebDriverFactory.getDriver();
	
	@Given("User navigate to register page")
	public void NavigateToRegisterPage() {
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Register")).click();
	}
	@When("User enter the details into fields")
	public void enterMandatoryRegisterDetails(DataTable dataTable) {
		Map<String,String>dataMap=dataTable.asMap(String.class, String.class);
		driver.findElement(By.name("firstname")).sendKeys(dataMap.get("firstname"));
		driver.findElement(By.name("lastname")).sendKeys(dataMap.get("lastname"));
		driver.findElement(By.name("email")).sendKeys(createRandomEmailAddr());
		driver.findElement(By.name("telephone")).sendKeys(dataMap.get("telephone"));
		driver.findElement(By.name("password")).sendKeys(dataMap.get("passowrd"));
		driver.findElement(By.name("confirm")).sendKeys(dataMap.get("confirm passowrd"));
		
	}
	@And("User select Privacy Policy")
	public void selectPrivacyPolicy() {
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	}
	@And("User clicks on Continue Button")
	public void clickLoginButton() {
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
	}
	@Then("User Account is Successfully created")
	public void validateAccCreationSuccess() {
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='content']//h1")).getText(),"Your Account Has Been Created!");
	}
	
	
}
