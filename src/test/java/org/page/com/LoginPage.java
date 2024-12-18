package org.page.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.utilities.com.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[text()='Login']")
	WebElement loginicon;
	
	@FindBy(xpath="//div[text()='Sign Up']")
	WebElement signupbutton;
	
	@FindBy(xpath="//div[text()='Mobile Number']")
	WebElement mobileradiobutton;
	
	@FindBy(xpath="//div[text()='Email']")
	WebElement emailradiobutton;
	
	@FindBy(xpath="(//div[text()=' +91']//following::input)[1]")
	WebElement mobileinputtext;
	
	@FindBy(xpath="(//div[text()='Email']//following::input)[1]")
	WebElement emaillogtext;
	
	@FindBy(xpath="(//div[text()='Password']//following::input)[1]")
	WebElement passwordlogtext;
	
	@FindBy(xpath="(//div[text()='LOGIN']//parent::div)[1]")
	WebElement loginbutton;
	
	@FindBy(xpath="//div[text()='Forgot Password?']")
	 WebElement forgotpasswordlink;
	
	@FindBy(id="react-root")
	WebElement clickpage;
	
	
	public void loginWithMobile(String email, String password, String mobile) {
		SoftAssert sa = new SoftAssert();
	   buttonClick(loginicon);
	   waitExplicit(mobileradiobutton, 3);
	   textKey(mobileinputtext, mobile);
	   textKey(passwordlogtext,password);
	   buttonClick(loginbutton);
	   String expected="SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets";
	   String actual=title();
	   buttonClick(clickpage);
	   sa.assertEquals(expected, actual);
	   sa.assertAll();
	  
	}
	
	
	public void loginWithEmail(String email, String password, String mobile) {
		SoftAssert sa = new SoftAssert();
		   buttonClick(loginicon);
		   waitExplicit(emailradiobutton, 3);
		   buttonClick(emailradiobutton);
		   waitExplicit(emaillogtext, 3);
		   textKey(emaillogtext, email);
		   textKey(passwordlogtext, password);
		   buttonClick(loginbutton);
		   String expected="SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets";
		   String actual=title();
		   buttonClick(clickpage);
		   sa.assertEquals(expected, actual);
		   sa.assertAll();
		   
	}
}
