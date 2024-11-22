package org.utilities.com;

import java.io.File;
import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.logging.FileHandler;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseClass extends JavaUtility{

	public static WebDriver driver;
	public static ExtentSparkReporter Htmlreport= null;
	public static ExtentReports report= null;
	public static ExtentTest test= null;
	public static Actions aa;
	
	public void browserLaunch(String browser) {
		
		if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		else {
			driver = new ChromeDriver();
		}
	}
	public static void buttonClick(WebElement element) {
		waitExplicit(element, 2);
		element.click();
		}
	public static void textKey(WebElement element, String value) {

		element.sendKeys(value);

	}

	public static void waitExplicit(WebElement element, int value) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(value));
		wait.until(ExpectedConditions.visibilityOf(element));}
	
	public static String elementText(WebElement element) {

		waitExplicit(element, 5);
		String value = element.getText();
		return value;
	}
	public static void waitImplicit(int value) {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(value));
	}
public static String takeScreenshot() {
		
		String location = System.getProperty("user.dir") + "/LoginPage.png";
		try {
		TakesScreenshot tss = (TakesScreenshot) driver;
		File source = tss.getScreenshotAs(OutputType.FILE);
		File destination = new File(location);
		org.openqa.selenium.io.FileHandler.copy(source, destination);
		} catch (Exception e) {

			e.printStackTrace();
		}
		return location;

	}
     public static String getURL() {

	String value = driver.getCurrentUrl();

	return value;
    }
     public static String title() {
    	 String value=driver.getTitle();
    	 return value;
     }
     public static String messageAlert() {

 		try {
 			Thread.sleep(2000);
 		} catch (Exception e) {
 			
 			e.printStackTrace();
 		}
 		String value = driver.switchTo().alert().getText();
 		driver.switchTo().alert().accept();
 		return value;
 	}
     public static String dismissAlert() {

  		try {
  			Thread.sleep(2000);
  		} catch (Exception e) {
  			
  			e.printStackTrace();
  		}
  		String value = driver.switchTo().alert().getText();
  		driver.switchTo().alert().dismiss();
  		return value;
  	}
     
     public static void radiobutton(WebElement element) {
    	 try {
    	element.click(); 
     }catch(Exception e) {
    	 e.printStackTrace();
     }
     }
     
     public static void gotoelement(WebElement element) {
     	
    	    JavascriptExecutor jj = (JavascriptExecutor) driver;
    	    jj.executeScript("arguments[0].scrollIntoView(true);", element);
    	}
     
    public static void goandclick(WebElement element) {
    	
    JavascriptExecutor jj = (JavascriptExecutor) driver;
    
	jj.executeScript("arguments[0].click();", element);
}
    
    public void selectDropDownByValue(WebElement ele, String value) {
		Select s = new Select(ele);
		s.selectByValue(value);
	}
    
    public void SelectDropdownByIndex(WebElement ele, int x) {
		Select s = new Select(ele);
		s.deselectByIndex(x);
	}
    
    public void SelectDropdownByText(WebElement ele, String value) {
		Select s = new Select(ele);
		s.selectByVisibleText(value);
	}
    
    public void moveto(WebElement element) {
    	aa = new Actions(driver);
    	aa.moveToElement(element).perform();
    }
    
    public void rclick(WebElement ele) {
		aa= new Actions(driver);
		aa.contextClick(ele).perform();
	}
	
    public void newwindow() {
		String parent =	driver.getWindowHandle();	
		Set<String> alw = driver.getWindowHandles();
		for (String string : alw) {
			if(!parent.equals(alw))	{
				driver.switchTo().window(string);
		}
		}
	}
    
    public void parentWindow() {
		String parentwindow = driver.getWindowHandle();
		Set<String> allwindow = driver.getWindowHandles();
		driver.switchTo().window(parentwindow);
	}
    
    public void multiWindow(short x) {
		Set<String> all = driver.getWindowHandles();
		List<String> ls = new LinkedList<String>(all);
		driver.switchTo().window(ls.get(x));
	}
    
    public void framebyindex(int x) {
    	try {
 			Thread.sleep(2000);
 		} catch (Exception e) {
 			
 			e.printStackTrace();
 		}
    	driver.switchTo().frame(x);
    }
    
    public void framebyname(String name) {
    	try {
 			Thread.sleep(2000);
 		} catch (Exception e) {
 			
 			e.printStackTrace();
 		}
    	driver.switchTo().frame(name);
    }
    
    public void framebyid(String id) {
    	try {
 			Thread.sleep(2000);
 		} catch (Exception e) {
 			
 			e.printStackTrace();
 		}
    	driver.switchTo().frame(id);
    }
    public void frametowebpage() {
    	try {
 			Thread.sleep(2000);
 		} catch (Exception e) {
 			
 			e.printStackTrace();
 		}
    	driver.switchTo().defaultContent();
    }
    
    public void beforeframe() {
    	try {
 			Thread.sleep(2000);
 		} catch (Exception e) {
 			
 			e.printStackTrace();
 		}
    	driver.switchTo().parentFrame();
    }
}
