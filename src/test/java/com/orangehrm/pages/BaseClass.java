package com.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.orangehrm.Utility.BrowserFactory;

public class BaseClass {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void startApplication() {
		
		driver = BrowserFactory.startBrowser(driver, "chrome", "https://opensource-demo.orangehrmlive.com/");
		
	}
	
	
	@AfterSuite
	public void closeApplication() {
		
		driver.quit();
		
	}

}
