package com.orangehrm.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.orangehrm.Utility.HighlightElement;

public class HomePage extends HighlightElement{
	
	WebDriver driver;
	
	public HomePage(WebDriver ldriver) {
	
		this.driver = ldriver;
		
	}
	
	
	
	
	//Locating all the elements present in the Home Page
	
	@FindBy(xpath = "//input[@id='MP_link']") WebElement mpButton;
	
	@FindBy(xpath = "//li[@class='main-menu-first-level-list-item']") List <WebElement> mainMenu;
	
	
	
	
	
	//Admin Tab Related Elements
	
	@FindBy(xpath="//input[@id='searchBtn']") WebElement userSearchBut;
	
	@FindBy(xpath = "//input[@id='resetBtn']") WebElement userResetBut;
	
	@FindBy(xpath="//input[@id='btnAdd']") WebElement userAddBut;
	
	@FindBy(xpath="//input[@id='btnDelete']") WebElement userDeleteBut;
	
	
	
	
	//User Creation Fileds in Admin Tab
	
	@FindBy(xpath = "//select[@id='systemUser_userType']") WebElement userRoledropdown;
	
	@FindBy(xpath = "//input[@id='systemUser_employeeName_empName']") WebElement empNameField;
	
	@FindBy(xpath="//li[starts-with(@class,'ac_')]") List <WebElement> SuggestionList;
	
	
	
	
	@FindBy(xpath = "//input[@id='systemUser_userName']") WebElement userNameField;
	
	@FindBy(xpath = "//select[@id='systemUser_status']") WebElement userStatusDropdown;
	
	@FindBy(xpath = "//input[@id='systemUser_password']") WebElement userPasswordField;
	
	@FindBy(xpath = "//input[@id='systemUser_confirmPassword']") WebElement userConfirmPasswordfield;
	
	@FindBy(xpath = "//input[@id='btnSave']") WebElement userSaveBut;
	
	@FindBy(xpath = "//input[@id='btnCancel']") WebElement userCancelBut;
	
	
	
	
	
	
	
	//Verifyinf the Market palce button functionality
	
	public void marketPlace() {
		
		mpButton.click();
		
	}
	
	
	//Printing All main menu tabs in Home page
	public void mainMenuFunction() {
		
		for(int i=0; i<mainMenu.size(); i++) {
			
			String mainMenuHeaders = mainMenu.get(i).getText();
			
			System.out.println("Mainmenu Header names are: "+ mainMenuHeaders);	
			
		}
		
	}
	
	
	
	//Clicking on Admin tab in Home page
	public void adminTab() {
		
		mainMenu.get(0).click();
	}
	
	
	//Create New User in Admin tab
	public void createUser() throws Exception {
		
		
	
		userAddBut.click();
		
		highLighterMethod(driver, userRoledropdown);
		
		Select userRole = new Select(userRoledropdown);
		
		userRole.selectByVisibleText("ESS");
		
		
		highLighterMethod(driver, empNameField);
		
		empNameField.sendKeys("D");
		
		Thread.sleep(2000);
		
		SuggestionList.get(1).click();
		
		
		highLighterMethod(driver, userNameField);
		
		userNameField.sendKeys("SNagendra2");
		
		
		highLighterMethod(driver, userStatusDropdown);
		
		Select userStatus = new Select(userStatusDropdown);
		
		Thread.sleep(1000);
	
		userStatus.selectByIndex(0);
		
		
		highLighterMethod(driver, userPasswordField);
		
		userPasswordField.sendKeys("Snagendra3");
		
		Thread.sleep(1000);
		
		
		highLighterMethod(driver, userConfirmPasswordfield);
		
		userConfirmPasswordfield.sendKeys("Snagendra2");
		
		Thread.sleep(5000);
		
		
		highLighterMethod(driver, userSaveBut);
		
		userSaveBut.click();
		
		Thread.sleep(5000);
		
		
		System.out.println("User has created successfully");	
		
	
	}
	
	
	
	
	
	
	
	
	

}
