package com.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.orangehrm.Utility.BrowserFactory;

public class BaseClass {
	
	public WebDriver driver;
	
	@BeforeClass
	public void startApplication() {
		
		driver = BrowserFactory.startBrowser(driver, "chrome", "https://opensource-demo.orangehrmlive.com/");
		
	}
	
	
	
	public void closeApplication() {
		
		driver.quit();
		
	}

}
