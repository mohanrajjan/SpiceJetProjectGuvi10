package org.test.com;

import org.base.com.EngineClass;
import org.page.com.BookingPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;

public class SearchFlightTest extends EngineClass {

	@BeforeTest
	public void setup() throws Exception {
		sheename="spice";
		openProp();
	}
	@Test
	public void Tc01() {
		test=report.createTest("Search For Oneway Trip");
		BookingPage bp = new BookingPage();
		bp.onewaySearch();
		test.log(Status.PASS, "Oneway flights searched successfully");
	}
	
	@Test
	public void Tc02() throws InterruptedException {
		test=report.createTest("Search For Round Trip");
		BookingPage bp = new BookingPage();
		bp.roundTripSearch();
		test.log(Status.PASS, "Round Trip flights searched successfully");
	}
}
