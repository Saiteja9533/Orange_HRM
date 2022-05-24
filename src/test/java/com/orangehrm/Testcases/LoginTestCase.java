package com.orangehrm.Testcases;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import com.orangehrm.pages.BaseClass;
import com.orangehrm.pages.LoginPage;

public class LoginTestCase extends BaseClass{
	
	
	@Test(priority=1, enabled = false, description="Orange HRM Login Functionality verification")
	public void loginApp() {
		
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		
		loginpage.userLogin("Admin", "admin123");
	}
	
	
	
	@Test(priority=2, description="Forgot password link verification")
	public void forgotPasswordlink(){
		
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);

		
		//loginpage.appLogoVerification();
		
		loginpage.forgotLink();
		
		
	}
	
	
	
	
	
	
	

}
