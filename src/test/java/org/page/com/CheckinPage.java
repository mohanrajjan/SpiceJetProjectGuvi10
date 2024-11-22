package org.page.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import org.utilities.com.BaseClass;

public class CheckinPage extends BaseClass {

	
	public CheckinPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[text()='check-in']")
	WebElement checkinbutton;
	
	@FindBy(xpath="(//div[text()='PNR Number / Ticket Number']//following::input)[1]")
	WebElement checkinpnrtext;
	
	@FindBy(xpath="(//div[text()='Email ID / Last Name']/following::input)[1]")
	WebElement checkinemailtext;
	
	@FindBy(xpath="(//div[text()='Search Booking']//parent::div)[1]")
	WebElement searchbookinbutton;
	
	public void checkinTc01() {
		SoftAssert sa = new SoftAssert();
		buttonClick(checkinbutton);
		waitExplicit(checkinpnrtext, 2);
		textKey(checkinpnrtext, "h5j5k3");
		textKey(checkinemailtext, "hdjsoo12@gmail.com");
		String actual=title();
		buttonClick(searchbookinbutton);
		sa.assertEquals("SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets", actual);
		sa.assertAll();
	}
	
	
	
	
	
	
}
