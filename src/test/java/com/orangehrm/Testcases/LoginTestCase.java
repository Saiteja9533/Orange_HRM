package com.orangehrm.Testcases;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import com.orangehrm.pages.BaseClass;
import com.orangehrm.pages.HomePage;
import com.orangehrm.pages.LoginPage;

public class LoginTestCase extends BaseClass{
	
	//This is the Login Test case
	@Test(priority=1, enabled = true, description="Orange HRM Login Functionality verification")
	public void loginApp() {
		
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		
		loginpage.userLogin("Admin", "admin123");
	}
	
	
	//This is the Forgot password link test case
	@Test(priority=2, enabled = false, description="Forgot password link verification")
	public void forgotPasswordlink(){
		
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);

		
		//loginpage.appLogoVerification();
		
		loginpage.forgotLink();
		
		
	}
	
	
	
	
	
	

}
