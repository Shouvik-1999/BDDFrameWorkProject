package com.tutorialsninja.hooks;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.tutorialsninja.webdriverfactory.WebDriverFactory;
import com.tutorialsninja.utils.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks {
	WebDriver driver;
	Properties prop;
	@Before
	public void setup() {
		prop= ConfigReader.initializeConfigFile();
		WebDriverFactory.initializeBrowser(prop.getProperty("Browser"));
		driver=WebDriverFactory.getDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("URL"));
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
}
