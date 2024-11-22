package org.test.com;

import org.base.com.EngineClass;
import org.page.com.SignupPage;
import org.testng.annotations.Test;
import org.utilities.com.BaseClass;

import com.aventstack.extentreports.Status;

public class SignupTest extends EngineClass {

	@Test
	public void Tc01() {
		
		SignupPage sp =new SignupPage();
		test=report.createTest("Signup valid data");
		sp.signupValid();
		test.log(Status.PASS, "Signup done successfully");
	}
}