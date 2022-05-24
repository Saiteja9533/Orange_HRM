package com.orangehrm.Utility;

import java.util.Arrays;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ImageCheck {
	
	
	public static WebDriver imageOnPage(WebDriver driver, WebElement imageFile) {
		
		try {
            boolean imagePresent = (Boolean) ((JavascriptExecutor) driver).executeScript("return (typeof arguments[0].naturalWidth !=\"undefined\" && arguments[0].naturalWidth > 0);", imageFile);

            if (!imagePresent) {
                System.out.println("App Logo/Image is NOT Displayed");
            }
            else {
                System.out.println("App Logo/Image is Displayed");
            }
        }
        catch (Exception ex) {
            System.out.println("Unable to locate Element " + Arrays.toString(ex.getStackTrace()));
        }
		
	      return driver;
	}

}
