package org.test.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.page.com.FlightStatusPage;
import org.testng.annotations.Test;
import org.utilities.com.BaseClass;

public class TrailTest extends BaseClass{

	@Test
	public void tc01() {
		FlightStatusPage fp = new FlightStatusPage();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		WebElement flightstatusbutton = driver.findElement(By.xpath("//div[text()='flight status']"));
		waitExplicit(flightstatusbutton, 2);
		buttonClick(flightstatusbutton);
		WebElement fsdepaturedate = driver.findElement(By.xpath("(//div[text()='Departure Date']/following::div)[1]"));
		waitExplicit(fsdepaturedate, 2);
		buttonClick(fsdepaturedate);
		String actual = title();
		
		WebElement fsdepttomorrow= driver.findElement(By.xpath("//div[contains(text(),'Tomorrow')]"));
		waitExplicit(fsdepttomorrow, 2);
		moveto(fsdepttomorrow);
		buttonClick(fsdepttomorrow);
		
		//goandclick(fsdepttomorrow);
		WebElement fromcityselect = driver.findElement(By.xpath("//div[text()='From']"));
		buttonClick(fromcityselect);
		WebElement delhicity = driver.findElement(By.xpath("//div[text()='DEL']"));
		waitExplicit(delhicity, 3);
		//goandclick(delhicity);
		moveto(delhicity);
		buttonClick(delhicity);
		WebElement tocityselect = driver.findElement(By.xpath("//div[text()='To']"));
		buttonClick(tocityselect);
		WebElement guwahaticity = driver.findElement(By.xpath("//div[text()='GAU']"));
		waitExplicit(guwahaticity, 3);
		goandclick(guwahaticity);
		WebElement flightno = driver.findElement(By.xpath("//div[text()='Flight No.(optional)']"));
		textKey(flightno, "4335");
		WebElement flightsearch = driver.findElement(By.xpath("//div[text()='Search Flights']"));
		buttonClick(flightsearch);
	}
}
