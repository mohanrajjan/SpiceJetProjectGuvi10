package org.test.com;

import org.base.com.EngineClass;
import org.page.com.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class LoginTest  extends EngineClass{
	
	@BeforeTest
	public void setup() throws Exception {
		sheename="spice";
		openProp();
	}
	
	@Test(dataProvider="getvalue")
	public void loginTc01(String email, String password, String mobile) {
		test=report.createTest("Valid Email Login");
		System.out.println(prop.getProperty("URL"));
		LoginPage lp = new LoginPage();
		lp.loginWithEmail(email, password, mobile);
		test.log(Status.PASS, "Email Login sucessfull");
	}
	
	
	@Test(dataProvider="getvalue")
	public void loginTc02(String email, String password, String mobile) {
		test=report.createTest("Valid Mobile Login");
		LoginPage lp = new LoginPage();
		lp.loginWithMobile(email, password, mobile);
		test.log(Status.PASS, "Mobile Login sucessfull");
	}
}
