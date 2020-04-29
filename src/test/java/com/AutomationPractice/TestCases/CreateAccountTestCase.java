package com.AutomationPractice.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.AutomationPractice.Pages.CreateAccountPage;

import Helper.BrowserFactory;

public class CreateAccountTestCase {
	
	
	@Test
	public void createNewAccount()
	{
		WebDriver driver = BrowserFactory.startBrowser("Chrome", "http://automationpractice.com/index.php");
		CreateAccountPage cap = PageFactory.initElements(driver, CreateAccountPage.class);
		
		//cap.createNewAccount();
		
	}

}
