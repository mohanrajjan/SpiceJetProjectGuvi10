package org.test.com;

import org.base.com.EngineClass;
import org.page.com.BookingPage;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class BookingTest extends EngineClass {

	@Test
	public void bookOneWay() throws InterruptedException {
		test=report.createTest("Book oneway ticket");
		BookingPage bp = new BookingPage();
		bp.bookTicket01();
		test.log(Status.PASS, "Oneway Ticket Booked succesfully");
	}
}
