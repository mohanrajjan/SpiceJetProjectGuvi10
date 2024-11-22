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
	
	@FindBy(xpath="//div[text()='From']")
	WebElement fromcityselect;
	
	@FindBy(xpath="//div[text()='To']")
	WebElement tocityselect;
	
	@FindBy(xpath="//div[text()='Flight No.(optional)']")
	WebElement flightno;
	
	@FindBy(xpath="//div[text()='Search Flights']")
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
		buttonClick(fromcityselect);
		waitExplicit(agracity, 2);
		buttonClick(agracity);
		buttonClick(tocityselect);
		waitExplicit(delhicity, 2);
		moveto(delhicity);
		buttonClick(delhicity);
		//goandclick(delhicity);
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
		buttonClick(fromcityselect);
		waitExplicit(delhicity, 2);
		goandclick(delhicity);
		buttonClick(tocityselect);
		waitExplicit(chennaicity, 2);
		goandclick(chennaicity);
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
		buttonClick(fromcityselect);
		waitExplicit(delhicity, 3);
		goandclick(delhicity);
		buttonClick(tocityselect);
		waitExplicit(guwahaticity, 3);
		goandclick(guwahaticity);
		textKey(flightno, "4245");
		buttonClick(flightsearch);
		sa.assertEquals("SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets", actual);
		sa.assertAll();
	}
}
