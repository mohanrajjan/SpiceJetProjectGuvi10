package org.page.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import org.utilities.com.BaseClass;

public class ManageBookingPage extends BaseClass {

	public ManageBookingPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[text()='manage booking']")
	WebElement managebookingbutton;
	
	@FindBy(xpath="(//div[text()='PNR Number / Ticket Number']//following::input)[1]")
	WebElement mbpnrtext;
	
	@FindBy(xpath="(//div[text()='Email ID / Last Name']//following::input)[1]")
	WebElement mbemailtext;
	
	@FindBy(xpath="(//div[text()='Search Booking']//parent::div)[1]")
	WebElement searchbookinbutton;
	
	public void manageBooking() {
		SoftAssert sa = new SoftAssert();
		waitExplicit(managebookingbutton, 2);
		buttonClick(managebookingbutton);
		waitExplicit(mbpnrtext, 2);
		textKey(mbpnrtext, "j9g7g6");
		textKey(mbemailtext, "dinkd12@gmail.com");
		String actual = title();
		waitExplicit(searchbookinbutton, 2);
		buttonClick(searchbookinbutton);
		sa.assertEquals("SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets", actual);
		sa.assertAll();
		
		
	}
}
