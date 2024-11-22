package org.base.com;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.utilities.com.BaseClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class EngineClass extends BaseClass {

	@BeforeSuite(alwaysRun=true)
	public void beforeSuite() {
		browserLaunch("chromes");
		Htmlreport = new ExtentSparkReporter(System.getProperty("user.dir")+"\\reports\\index.html");
		report = new ExtentReports();
		report.attachReporter(Htmlreport);
		report.setSystemInfo("Tester", "Mohanraj");
			}
	
	@BeforeTest(alwaysRun=true)
	public void beforeTest() {
		waitImplicit(10);
		driver.manage().window().maximize();
		driver.get(openProp("URL"));
	}
	
	
	@AfterTest(alwaysRun=true)
	public void afterMethod() {
		report.flush();
	}
		
	@AfterMethod()
	public void getResult(ITestResult result) throws IOException {
		if(result.getStatus()==ITestResult.FAILURE)
		test.log(Status.FAIL,result.getThrowable());
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String screenshotpath=System.getProperty("user.dir")+"//FailedScreenshot"+"ss"+".png";
		FileHandler.copy(source, new File(screenshotpath));
		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(screenshotpath).build());
		}
		
	@AfterSuite(alwaysRun=true)
	 public void afterSuite() {
		//driver.close();
	}
	//https://github.com/mohanrajjan/SpiceJetProjectGuvi10.git
}
