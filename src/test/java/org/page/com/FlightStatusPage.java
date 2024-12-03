package org.page.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import org.utilities.com.BaseClass;

public class FlightStatusPage extends BaseClass {
	
	public FlightStatusPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[text()='flight status']")
	WebElement flightstatusbutton;
	
	@FindBy(xpath="(//div[text()='Departure Date']/following::div)[1]")
	WebElement fsdepaturedate;
	
	@FindBy(xpath="//div[text()='Yesterday']")
	WebElement fsdeptyesterday;
	
	@FindBy(xpath="//div[text()='Today']")
	WebElement fsdepttoday;
	
	@FindBy(xpath="//div[text()='Tomorrow']")
	WebElement fsdepttomorrow;
	
	@FindBy(xpath="(//div[text()='From']//following::input)[1]")
	WebElement originselect;
	
	@FindBy(xpath="(//div[text()='To']//following::input)[1]")
	WebElement destinationselect;
	
	@FindBy(xpath="(//div[text()='Flight No.(optional)']//following::input)[1]")
	WebElement flightno;
	
	@FindBy(xpath="(//div[text()='Search Flights']//parent::div)[1]")
	WebElement flightsearch;
	
	@FindBy(xpath="//div[text()='DEL']")
	WebElement delhicity;
	
	@FindBy(xpath="//div[text()='MAA']")
	WebElement chennaicity;
	
	@FindBy(xpath="//div[text()='GAU']")
	WebElement guwahaticity;
	
	@FindBy(xpath="//div[text()='AGR']")
	WebElement agracity;
	
	
	
	
	public void todayFlightStatus() {
		SoftAssert sa= new SoftAssert();
		waitExplicit(flightstatusbutton, 2);
		buttonClick(flightstatusbutton);
		waitExplicit(fsdepaturedate, 2);
		buttonClick(fsdepaturedate);
		String actual = title();
		waitExplicit(fsdepttoday, 2);
		buttonClick(fsdepttoday);
		waitExplicit(originselect, 2);
		textKey(originselect, "Delhi");
		waitExplicit(destinationselect, 2);
		buttonClick(destinationselect);
		buttonClick(chennaicity);
		waitExplicit(flightno, 3);
		textKey(flightno, "4335");
		buttonClick(flightsearch);
		sa.assertEquals("SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets", actual);
		sa.assertAll();
	}
	
	public void yesterdayFlightStatus() {
		SoftAssert sa= new SoftAssert();
		waitExplicit(flightstatusbutton, 2);
		buttonClick(flightstatusbutton);
		waitExplicit(fsdepaturedate, 2);
		buttonClick(fsdepaturedate);
		String actual = title();
		buttonClick(fsdeptyesterday);
		waitExplicit(originselect, 2);
		textKey(originselect, "Chennai");
		waitExplicit(destinationselect, 2);
		textKey(destinationselect, "Delhi");
		textKey(flightno, "4338");
		buttonClick(flightsearch);
		sa.assertEquals("SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets", actual);
		sa.assertAll();
	}
	
	public void tomorrowFlightStatus() {
		SoftAssert sa= new SoftAssert();
		waitExplicit(flightstatusbutton, 2);
		buttonClick(flightstatusbutton);
		waitExplicit(fsdepaturedate, 2);
		buttonClick(fsdepaturedate);
		String actual = title();
		buttonClick(fsdepttomorrow);
		waitExplicit(originselect, 3);
		textKey(originselect, "Delhi");
		waitExplicit(destinationselect,3);
		textKey(destinationselect, "Hyderabad");
		textKey(flightno, "4245");
		buttonClick(flightsearch);
		sa.assertEquals("SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets", actual);
		sa.assertAll();
	}
}
