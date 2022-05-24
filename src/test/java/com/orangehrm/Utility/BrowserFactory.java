package com.orangehrm.Utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
	
	
	public static WebDriver startBrowser(WebDriver driver, String browserName, String appUrl) {
		
		if(browserName.equalsIgnoreCase("Chrome")) {
			
			WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();
			
		}else if(browserName.equalsIgnoreCase("Firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			
			driver = new FirefoxDriver();
			
		}else if(browserName.equalsIgnoreCase("IE")) {
			
			WebDriverManager.iedriver().setup();
			
			driver = new InternetExplorerDriver();
			
		}else {
			
			System.out.println("Opps! we can support this browser");
		}
		
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
		
		driver.get(appUrl);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		return driver;
		
	}
	
	
	
	public static void quitBrowser(WebDriver driver) {
		
		driver.quit();
	}

}
