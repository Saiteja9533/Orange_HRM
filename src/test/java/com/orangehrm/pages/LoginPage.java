package com.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.orangehrm.Utility.ImageCheck;


public class LoginPage {
	
	WebDriver driver;
	
	
	public LoginPage(WebDriver ldriver) {
		
		this.driver = ldriver;
				
	}
	
	
// Login Page Elements locations
	
	@FindBy(id="txtUsername") WebElement uName;
	
	@FindBy(id="txtPassword") WebElement pwd;
	
	@FindBy(id="btnLogin") WebElement loginBut;
	
	@FindBy(xpath="//a[@href='/index.php/auth/requestPasswordResetCode']") WebElement forgotPassword;
	
	@FindBy(xpath="//img[@src='/webres_6285eab07ce040.69349353/themes/default/images/login/logo.png']") WebElement appLogo;
	
	
	
	
	//Login Functionality verification
	public void userLogin(String userName, String Password) {
		
		uName.sendKeys(userName);
		
		pwd.sendKeys(Password);
		
		loginBut.click();
		
	}
	
	
	//Application Logo verification
	public void appLogoVerification() {
		
		ImageCheck.imageOnPage(driver, appLogo);
		
	}
	
	
	//Forgot password link verification
	public void forgotLink() {
		
		System.out.println("Forgot Password link Displyed : "+forgotPassword.isDisplayed());
		
		forgotPassword.click();
		
	}
	
	

	
	
	
	
	
}
