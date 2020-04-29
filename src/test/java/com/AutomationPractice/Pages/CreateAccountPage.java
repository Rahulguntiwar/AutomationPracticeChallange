/**
 * 
 */
package com.AutomationPractice.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Rahul
 *
 */
public class CreateAccountPage {

	
	WebDriver driver;
	WebDriverWait wd;
	WebElement radio;
	WebElement dd;
	WebElement mm;
	WebElement yy;
	WebElement country;
	WebElement state;

	
	 
	 @FindBy(how = How.CLASS_NAME, using="login")   //Signin Button on Home page
	 WebElement signinButton;
	 
	 
	 @FindBy(how = How.ID, using="email_create")  //Email address on create account page
	 WebElement enteremail;
	 
	 
	 
	 @FindBy(how = How.ID, using="SubmitCreate") // create account button on create account page
	 WebElement btnCreateAccount;
	 
	 
	 @FindBy(how = How.CSS, using="#id_gender1") // Title ( Mr & Mrs.) 
	 WebElement radioTitle;
	 
	 
	 @FindBy(how = How.ID, using="customer_firstname") //First Name
	 WebElement txtFirstName;
	 
	 @FindBy(how = How.ID, using="customer_lastname") //Last Name
	 WebElement txtLastName;
	 
	 @FindBy(how = How.ID, using="passwd") //Password
	 WebElement txtPassword;
	 
	 
	 @FindBy(how = How.ID, using="days") //Day Dropdown
	 WebElement ddDay;
	 
	  
	 @FindBy(how = How.ID, using="months") //Month Dropdown
	 WebElement ddMonth;
	 
	 @FindBy(how = How.ID, using="years") //Year Dropdown
	 WebElement ddYear;
	 
	 
	 @FindBy(how = How.ID, using="newsletter") //Checkbox newsletter
	 WebElement cbNewsLetter;
	 
	 
	 @FindBy(how = How.ID, using="optin") //Checkbox Option
	 WebElement cbOption;
	 
	 
	 @FindBy(how = How.NAME, using="company") //TextBox Company
	 WebElement txtCompany;
	 
	 
	 @FindBy(how = How.ID, using="address1") //TextBox address1
	 WebElement txtAddress1;
	 
	 
	 @FindBy(how = How.ID, using="address2") //TextBox address2
	 WebElement txtAddress2;
	 
	 
	 @FindBy(how = How.ID, using="city") //TextBox City
	 WebElement txtCity;
	 
	 
	 @FindBy(how = How.ID, using="postcode") //Textbox Postcode
	 WebElement txtPostcode;
	 
	 
	 @FindBy(how = How.ID, using="id_country") //Dropdown Country
	 WebElement ddCountry;
	 
	 @FindBy(how = How.ID, using="id_state") //Dropdown State
	 WebElement ddState;

	 
	 @FindBy(how = How.ID, using="other") //Textbox  Additional Info
	 WebElement txtOther;
	 
	 
	 @FindBy(how = How.ID, using="phone") //Textbox Phone
	 WebElement txtPhone;
	 
	 
	 @FindBy(how = How.ID, using="phone_mobile") //Textbox Mobile phone
	 WebElement txtMobilphone;
	 
	 @FindBy(how = How.ID, using="alias") //Textbox Address Alias
	 WebElement txtAlias;
	 
	 @FindBy(how = How.ID, using="submitAccount") //Register Button 
	 WebElement btnRegister;
	 
	 public CreateAccountPage(WebDriver ldriver)
	 {
		 this.driver = ldriver;
	 }
	 
	 
	 public void createNewAccount()
	 {
		 signinButton.click();
		 wd = new WebDriverWait(driver,10);
		 wd.until(ExpectedConditions.visibilityOf(enteremail));
		 
		 enteremail.sendKeys("MasterTester@gmail.com");
		 btnCreateAccount.click();
		 
		 wd.until(ExpectedConditions.elementToBeClickable(radioTitle));
		 radioTitle.click();	 
		 
		 txtFirstName.sendKeys("Rahul");
         txtLastName.sendKeys("Guntiwar");
		 txtPassword.sendKeys("Automation@12345");
		
		 
		 Select ddSelect = new Select(ddDay);
		 ddSelect.selectByIndex(28);
		 
		
		 Select mmSelect = new Select(ddMonth);
		 mmSelect.selectByIndex(4);
		 
		
		 Select yySelect = new Select(ddYear);
		 yySelect.selectByIndex(30);
		 
		 	 
		 cbNewsLetter.click();
		 cbOption.click();;
		 txtCompany.sendKeys("Fiserv");
		 txtAddress1.sendKeys("Viman Nagar / 121");
		 txtAddress2.sendKeys("Trion Business Park");
		 txtCity.sendKeys("PUne");
		 txtPostcode.sendKeys("32003");
		 
		 Select countrySelect = new Select(ddCountry);
		 countrySelect.selectByIndex(1);
		 
		 Select stateSelect = new Select(ddState);
		 stateSelect.selectByVisibleText("Florida");
		 
		 
		 txtOther.sendKeys("This is an Automation testing practice exercise");
		 txtPhone.sendKeys("9890012345");
		 txtMobilphone.sendKeys("9890012345");
		 txtAlias.clear();
		 txtAlias.sendKeys("NewAccount");
		 btnRegister.click();
		 
	 }
}
