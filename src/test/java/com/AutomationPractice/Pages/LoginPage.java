package com.AutomationPractice.Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage {
	

	WebDriver driver;
	WebDriverWait wd;

	
	 @FindBy(how = How.ID, using="email")   
	 WebElement txtEmailId;
	
	 @FindBy(how = How.ID, using="passwd")   
	 WebElement txtPassword;
	 
	 @FindBy(how = How.ID, using="SubmitLogin")  
	 WebElement btnLogin;
	 
	 @FindBy(how = How.XPATH, using="//a[@title='Women']")  
	 WebElement btnWomen;
	 
	 @FindBy(how = How.XPATH, using="//*[@id='center_column']/ul/li[1]/div/div[1]/div/a[1]/img")   
	 WebElement imgItem;
	
	 @FindBy(how = How.XPATH, using="//*[@id='product']")  
	 WebElement imgWindow;
	 
	 @FindBy(how = How.XPATH, using="//*[@id=\"quantity_wanted_p\"]/a[2]/span/i")   
	 WebElement plusButton;
	 
	 @FindBy(how = How.XPATH, using="//*[@id=\"add_to_cart\"]/button/span")   
	 WebElement btnAddtoCart;
	 								  
	 @FindBy(how = How.XPATH, using="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")   
	 WebElement btnCheckout;
	 
	 @FindBy(how = How.XPATH, using="//*[@id=\"center_column\"]/p[2]/a[1]/span")   
	 WebElement btnProceedToCheckout;
	 
	 @FindBy(how = How.XPATH, using="//*[@id=\"center_column\"]/form/p/button/span")   
	 WebElement btnAgainCheckout;
	 
	 
	 @FindBy(how = How.ID, using="cgv")   
	 WebElement chkChekOut;
	
	 @FindBy(how = How.XPATH, using="//*[@id=\"form\"]/p/button/span")   
	 WebElement btnLastCheckout;
	 
	
	 @FindBy(how = How.XPATH, using="//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")   
	 WebElement btnFinalPayment;
	 
	 @FindBy(how = How.XPATH, using="//*[@id=\"cart_navigation\"]/button")   
	 WebElement btnPayment;
	 
	 @FindBy(how = How.XPATH, using="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")   
	 WebElement clickProfile;
	 
	 
	 @FindBy(how = How.XPATH, using="//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a")   
	 WebElement linkOrderHistory;
	
	 @FindBy(how = How.XPATH, using="//*[@id=\"order-list\"]/tbody/tr[1]/td[3]/span")   
	 WebElement finalvalue;
	 
	
	 
	 public LoginPage(WebDriver driver)
	 {
		 this.driver = driver;
	 }
	 
	 
	 public void LoginToAutomation() 
	 {
		 String price = "$35.02";
		 wd = new WebDriverWait(driver,10);
		 txtEmailId.sendKeys("MasterTester@gmail.com");
		 txtPassword.sendKeys("Automation@12345");
		 btnLogin.click();
		 btnWomen.click();
		 wd.until(ExpectedConditions.elementToBeClickable(imgItem)).click();

		 
		 driver.switchTo().frame(0);
		 plusButton.click();
		 btnAddtoCart.click();
		 wd.until(ExpectedConditions.elementToBeClickable(btnCheckout)).click();
		 
		 wd.until(ExpectedConditions.elementToBeClickable(btnProceedToCheckout)).click();
		
		 wd.until(ExpectedConditions.elementToBeClickable(btnAgainCheckout)).click();
		
		 chkChekOut.click();
		 
		 wd.until(ExpectedConditions.elementToBeClickable(btnLastCheckout)).click();
		 		 
		 btnFinalPayment.click();
		 
		 btnPayment.click();
		 
		 clickProfile.click();

		 linkOrderHistory.click();
		 
		
		 Assert.assertEquals(price, finalvalue.getText());
		 
		 driver.close();
	 }
	 
}
