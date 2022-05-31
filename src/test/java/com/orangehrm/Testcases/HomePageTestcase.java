package com.orangehrm.Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.orangehrm.pages.BaseClass;
import com.orangehrm.pages.HomePage;

public class HomePageTestcase extends BaseClass {
	
	
	
	
	@Test(priority=3, description="Home Page Mainmenu Headers verification")
	public void homepageMainmenu() {
		
		try {
		HomePage menuHeaders = PageFactory.initElements(driver, HomePage.class);
		menuHeaders.mainMenuFunction();
		
		}catch(Exception e) {
			
			System.out.println("Error in the Home Page Test case is: "+ e.getCause());
		}
	}
	
	
	@Test(priority=4, description = "Creating New User testcase verification")
	public void newUserCreation() throws Exception {
		HomePage menuHeaders = PageFactory.initElements(driver, HomePage.class);
		menuHeaders.adminTab();
		menuHeaders.createUser();
		
	}

}
