package org.page.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import org.utilities.com.BaseClass;

public class BookingPage extends BaseClass{

	public BookingPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[text()='one way']")
	WebElement onewaytrip;
	
	@FindBy(xpath="//div[text()='round trip']")
	WebElement roundwaytrip;
	
	@FindBy(xpath="(//div[text()='From']//following::input)[1]")
	WebElement fromcity;
	
	@FindBy(xpath="(//div[text()='To']//following::input)[1]")
	WebElement tocity;
	
	@FindBy(xpath="//div[@data-testid='to-testID-flip-arrow']")
	WebElement swapcity;
	
	@FindBy(xpath="//div[text()='India']")
	WebElement indiaregion;
	
	@FindBy(xpath="//div[text()='International']")
	WebElement internationalregion;
	
	@FindBy(xpath="(//div[text()='AMD']//parent::div)[1]")
	WebElement ahmedabadcity;
	
	@FindBy(xpath="(//div[text()='MAA']//ancestor::div)[15]")
	WebElement chennaicity;
	
	@FindBy(xpath="(//div[text()='DEL']//parent::div)[1]")
	WebElement delhicity;
	
	@FindBy(xpath="//div[text()='Departure Date']")
	WebElement depaturedate;
	
	@FindBy(xpath="//div[text()='Return Date']")
	WebElement returndate;
	
	@FindBy(xpath="//div[text()='Currency']")
	WebElement currency;
	
	@FindBy(xpath="(//div[text()='INR'])[2]")
	WebElement indiacurrency;
	
	@FindBy(xpath="//div[text()='HKD']")
	WebElement hongkongdollar;
	
	@FindBy(xpath="//div[text()='Passengers']")
	WebElement passengerstab;
	
	@FindBy(xpath="//div[text()='Adult']")
	WebElement adultselect;
	
	@FindBy(xpath="//div[text()='Children']")
	WebElement childrenselect;
	
	@FindBy(xpath="//div[text()='Infant']")
	WebElement infactselect;
	
	@FindBy(xpath="//div[@data-testid='Adult-testID-plus-one-cta']")
	WebElement addpassengers;
	
	@FindBy(xpath="//div[@data-testid='Adult-testID-minus-one-cta']")
	WebElement reducepassangers;
	
	@FindBy(xpath="(//div[text()='Search Flight']//parent::div)[1]")
	WebElement searchflightbutton;
	
	@FindBy(xpath="//div[text()='30']")
	WebElement deptdate;
	
	
	@FindBy(xpath="(//div[text()='Adult']//following::div)[6]")
	WebElement addadult;
	
	@FindBy(xpath="(//div[text()='Adult']//following::div)[3]")
	WebElement reduceadult;
	
	@FindBy(xpath="(//div[text()='Continue']//parent::div)[1]")
	WebElement continuebutton;
	
	@FindBy(xpath="(//div[text()='Mr']//following::div)[9]")
	WebElement mrsselect;
	
	@FindBy(xpath="(//div[text()='Mr']//following::div)[12]")
	WebElement missselect;
	
	@FindBy(xpath="(//div[text()='Mr']//following::div)[1]")
	WebElement titleselect;
	
	@FindBy(xpath="(//div[text()='First and Middle Name*']//following::input)[1]")
	WebElement firstnametext;
	
	@FindBy(xpath="(//div[text()='Last Name*']//following::input)[1]")
	WebElement lastnametext;
	
	@FindBy(xpath="(//div[text()='Contact Number*']//following::input)[1]")
	WebElement contactnumbertext;
	
	@FindBy(xpath="(//div[text()='Email Address*']//following::input)[1]")
	WebElement emailaddresstext;
	
	@FindBy(xpath="(//div[text()='India']//following::div)[1]")
	WebElement countrylist;
	
	@FindBy(xpath="(//div[text()='India']//following::input)[1]")
	WebElement citytext;
	
	@FindBy(xpath="//div[text()='I am flying as the primary passenger']//preceding-sibling::div")
	WebElement checkasprimarypassenger;
	
	@FindBy(xpath="(//div[text()='Continue']//following::div)[5]")
	WebElement continuepaybutton;
	
	@FindBy(xpath="(//div[text()='Continue']//following::div)[5]")
	WebElement skipcomfort;
	
	//payment//iframe 1 to 5
	
	@FindBy(xpath="//input[@id='card_number']")
	WebElement cardnumbertext;
	
	@FindBy(xpath="//input[@id='name_on_card']")
	WebElement nameoncardtext;
	
	@FindBy(xpath="//input[@id='card_exp_month']")
	WebElement cardexpirymonthtext;
	
	@FindBy(xpath="//input[@id='card_exp_year']")
	WebElement cardexpiryyeartext;
	
	@FindBy(xpath="//input[@id='security_code']")
	WebElement cvvtext;
	
	@FindBy(xpath="(//div[text()='Proceed to pay']//parent::div)[1]")
	WebElement proceedpay;
	

	@FindBy(xpath="(//div[text()='Proceed to pay']//parent::div)[1]")
	WebElement paymentsmethodpage;
	
	public void bookTicket01() throws InterruptedException {
		SoftAssert sa = new SoftAssert();
		/*
		 * waitExplicit(fromcity, 2); buttonClick(fromcity); waitExplicit(chennaicity,
		 * 2); textKey(chennaicity, "Chennai");
		 */
		/*
		 * gotoelement(chennaicity); buttonClick(chennaicity);
		 * 
		 */
		waitExplicit(tocity, 3);
		textKey(tocity, "Chennai");
		/*
		 * buttonClick(tocity); waitExplicit(chennaicity, 2); textKey(chennaicity,
		 * "Chennai");
		 */
		/*
		 * gotoelement(delhicity); buttonClick(delhicity);
		 */
		
		//buttonClick(depaturedate);
		//Thread.sleep(5000);
		buttonClick(deptdate);
		//buttonClick(addpassengers);
		//buttonClick(addadult);
		buttonClick(searchflightbutton);
		waitExplicit(continuebutton, 3);
		buttonClick(continuebutton);
		buttonClick(continuebutton);		 
		buttonClick(titleselect);
		waitExplicit(missselect, 3);
		buttonClick(missselect);
		textKey(firstnametext, "Steffi");
		textKey(lastnametext, "Marco");
		textKey(contactnumbertext, "6649626538");
		textKey(emailaddresstext,"msojio25@gmail.com");
		textKey(citytext, "Pune");
		Thread.sleep(3000);
		gotoelement(checkasprimarypassenger);
		buttonClick(checkasprimarypassenger);
		//goandclick(checkasprimarypassenger);
		buttonClick(continuebutton);
		
		
		try { 
			Thread.sleep(2000);
			driver.findElement(By.
				  xpath("(//div[text()='UNBELIEVABLY LOW PRICES!']//preceding::img)[86]")).
				  click(); }catch(Exception e){ e.printStackTrace(); 
				  System.out.println("No popup message in addons page");
				  }
		waitExplicit(continuebutton, 3);
		buttonClick(continuebutton);
		waitExplicit(paymentsmethodpage, 3);
		try { 
			Thread.sleep(1000);
			driver.findElement(By.
				  xpath("(//div[text()='UNBELIEVABLY LOW PRICES!']//preceding::img)[86]")).
				  click(); }catch(Exception e){ e.printStackTrace();
				  System.out.println("No popup message in paymentpage");}
		framebyindex(0);
		waitExplicit(cardnumbertext, 3);
		textKey(cardnumbertext, "4111111111111111");
		frametowebpage();
		framebyindex(1);
		textKey(nameoncardtext, "Andre marco");
		frametowebpage();
		framebyindex(3);
		textKey(cardexpiryyeartext, "30");
		frametowebpage();
		framebyindex(2);
		textKey(cardexpirymonthtext, "03");
		frametowebpage();
		framebyindex(4);
		textKey(cvvtext, "737");
		frametowebpage();
		buttonClick(proceedpay);
	}
	
	public void onewaySearch() {
		waitExplicit(fromcity, 2);
		buttonClick(fromcity);
		waitExplicit(chennaicity, 2);
		textKey(chennaicity,"Chennai" );
		/*
		 * gotoelement(chennaicity); buttonClick(chennaicity);
		 */
		buttonClick(tocity);
		waitExplicit(delhicity, 2);
		textKey(delhicity, "Delhi");
		/*
		 * gotoelement(delhicity); buttonClick(delhicity);
		 */
		buttonClick(depaturedate);
		buttonClick(deptdate);
		buttonClick(addpassengers);
		buttonClick(addadult);
		buttonClick(searchflightbutton);
	}
	
	public void roundTripSearch() {
		waitExplicit(roundwaytrip, 3);
		buttonClick(roundwaytrip);
		waitExplicit(fromcity, 2);
		buttonClick(fromcity);
		waitExplicit(delhicity, 2);
		gotoelement(delhicity);
		buttonClick(delhicity);
		buttonClick(tocity);
		waitExplicit(chennaicity, 2);
		gotoelement(chennaicity);
		buttonClick(chennaicity);
		buttonClick(depaturedate);
		buttonClick(deptdate);
		buttonClick(addpassengers);
		buttonClick(addadult);
		buttonClick(searchflightbutton);
	}
}
