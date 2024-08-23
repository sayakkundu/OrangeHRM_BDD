package com.TestBase;

import org.openqa.selenium.WebDriver;

import com.Utils.DriverFactory;

public class TestBase {

	protected WebDriver driver = DriverFactory.getDriver();
}
