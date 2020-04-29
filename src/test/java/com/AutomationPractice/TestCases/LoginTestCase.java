package com.AutomationPractice.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.AutomationPractice.Pages.LoginPage;

import Helper.BrowserFactory;

public class LoginTestCase {
	
	@Test
	public void Login() 
	{
		WebDriver driver = BrowserFactory.startBrowser("Chrome", "http://automationpractice.com/index.php?controller=authentication&back=my-account");
		LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
		
		lp.LoginToAutomation();
		
	}

}
