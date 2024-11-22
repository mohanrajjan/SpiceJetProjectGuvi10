package org.test.com;

import org.base.com.EngineClass;
import org.page.com.CheckinPage;
import org.page.com.FlightStatusPage;
import org.page.com.ManageBookingPage;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class OtherFieldsTest extends EngineClass {

	@Test(groups= {"flight","Regression"})
	public void flightTc01() {
		test=report.createTest("Today Flight Status");
		FlightStatusPage fp= new FlightStatusPage();
		fp.todayFlightStatus();
		test.log(Status.PASS, "Today Flight Status");	
	}
	@Test(groups= {"flight","Regression"})
	public void flightTc02() {
		test=report.createTest("Tomorrow Flight Status");
		FlightStatusPage fp= new FlightStatusPage();
		fp.tomorrowFlightStatus();
		test.log(Status.PASS, "Tomorrow Flight Status");	
	}
	
	@Test(groups= {"flight","Regression"})
	public void flightTc03() {
		test=report.createTest("Yesterday Flight Status");
		FlightStatusPage fp= new FlightStatusPage();
		fp.yesterdayFlightStatus();
		test.log(Status.PASS, "Yesterday Flight Status");	
	}
	
	@Test(groups= {"Manage","Regression"})
	public void manageBooking01() {
		
	test=report.createTest("Manage Booking");
	ManageBookingPage mb = new ManageBookingPage();
	mb.manageBooking();
	test.log(Status.PASS, "Manage Booking");
	}
	
	@Test(groups= {"Check","Regression"})
	public void checkTc01() {
		test=report.createTest("CheckIn");	
		CheckinPage cp = new CheckinPage(driver);
		cp.checkinTc01();
		test.log(Status.PASS, "Checkin Successful");
	}
}
