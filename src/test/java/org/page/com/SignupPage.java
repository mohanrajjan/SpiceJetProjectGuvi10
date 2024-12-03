package org.page.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import org.utilities.com.BaseClass;

public class SignupPage extends BaseClass {

	public SignupPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[text()='Signup']")
	WebElement signupbuttonicon;
	
	@FindBy(xpath="//option[text()='Select an option']//parent::select")
	WebElement titleoption;
	
	@FindBy(id="first_name")
	WebElement firstmiddlename;
	
	@FindBy(xpath="//select[@class='form-control form-select ']")
	WebElement selectcountry;
	
	@FindBy(id="last_name")
	WebElement lastname;
	
	@FindBy(xpath="//img[@alt='date']")
	WebElement dobcalendar;
	
	@FindBy(xpath="//select[@class='react-datepicker__month-select']")
	WebElement monthofdob;
	
	@FindBy(xpath="//select[@class='react-datepicker__year-select']")
	WebElement yearofdob;
	
	
	  @FindBy(xpath="//div[text()='5']") WebElement dateofdob;
	 
	
	@FindBy(xpath="//input[@type='tel']")
	WebElement mobilenumber;
	
	@FindBy(id="email_id")
	WebElement emailid;
	
	@FindBy(id="new-password")
	WebElement password;
	
	@FindBy(id="c-password")
	WebElement confirmpassword;
	
	@FindBy(id="defaultCheck1")
	WebElement termscondition;
	
	@FindBy(xpath="//button[text()='Submit']")
	WebElement submitbutton;
	
	@FindBy(xpath="//a[text()='Log In']")
	WebElement loginbutton;
	
	@FindBy(xpath="//a[text()='www.spicejet.com']")
	WebElement spicejetlink;
	
	public void signupValid() {
		SoftAssert sa = new SoftAssert();
		String expected="SpiceClub - The frequent flyer program of SpiceJet";
		buttonClick(signupbuttonicon);
		newwindow();
		String actual=title();
		waitExplicit(titleoption, 3);
		buttonClick(titleoption);
		selectDropDownByValue(titleoption, "MR");
		textKey(firstmiddlename, "Andrew");
		textKey(lastname, "Simons");
		buttonClick(dobcalendar);
		waitExplicit(monthofdob, 3);
		buttonClick(monthofdob);
		SelectDropdownByText(monthofdob, "April");
		buttonClick(yearofdob);
		SelectDropdownByText(yearofdob, "1991");
		buttonClick(dateofdob);
		waitExplicit(mobilenumber, 3);
		textKey(mobilenumber, "6864653537");
		waitExplicit(emailid, 2);
		gotoelement(emailid);
		waitExplicit(emailid, 2);
		textKey(emailid, "mani324@gmail.com");
		waitExplicit(password, 2);
		textKey(password, "Money@123");
		textKey(confirmpassword, "Money@123");
		waitExplicit(termscondition, 3);
		goandclick(termscondition);
		goandclick(submitbutton);
		sa.assertAll();
		sa.assertEquals(actual, expected);
	}
	
}
