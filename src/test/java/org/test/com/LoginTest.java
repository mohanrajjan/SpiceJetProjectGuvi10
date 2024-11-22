package org.test.com;

import org.base.com.EngineClass;
import org.page.com.LoginPage;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class LoginTest  extends EngineClass{

	@Test
	public void loginTc01() {
		test=report.createTest("Valid Login");
		LoginPage lp = new LoginPage();
		lp.loginWithEmail();
		test.log(Status.PASS, "Login sucessfull");
	}
}
