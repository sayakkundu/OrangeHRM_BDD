package com.StepDefinitions;

import org.openqa.selenium.WebDriver;

import com.Utils.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	private DriverFactory driverFactory;
	private WebDriver driver;
	
	@Before
	public void startBrowser() {
		
		driverFactory = new DriverFactory();
		driver = driverFactory.initBrowser();
	}
	
	@After
	public void tearDown() {
		
		if(driver!=null) {
			
			driver.quit();
		}
	}
}
