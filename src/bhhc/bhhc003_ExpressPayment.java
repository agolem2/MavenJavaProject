
/* This Test Script Validates bhhc003_ExpressPayment from the bhhc main express payment webpage against invlaid input and accept alert after 10 seconds

 *  /* 	
 *  Test case ID: bhhc003_ExpressPayment
 * 
 * 	Test priority (High): 

 *	Module Name – bhhc003_ExpressPayment
 *	Test Designed By:
 *		@Author Milo.Onken
 *
 *
 *	Test Designed Date: 
 *		16-OCT-16
 *	Test Executed By: 
 *		Name of tester. (To be filled after test execution)
 *	Test Execution Date: 
 *		Date when test executed.
 *
 *	Test Title/Name: bhhc003_ExpressPayment
 *
 *	Test Summary/Description: 
 *		This Test Script Validates bhhc003_ExpressPayment from the bhhc main webpage 
 *	Pre-condition: Any prerequisite that must be fulfilled before execution of this test case. List all pre-conditions in order to successfully execute this test case.
 *	
 *	Dependencies: 
 *	
 *	Test Steps: List all test execution steps in detail. Write test steps in the order in which these should be executed. Make sure to provide as much details as you can. Tip – to efficiently manage test case with lesser number of fields use this field to describe test conditions, test data and user roles for running test.	
 *	
 *	Step 1 - Navigate to Express Payment WebPage http://www.bhhc.com
 *	Step 2 - Enter Policy ID (Policy ID should be 10 numeric character - no special characters)
 *	Step 3 - Select ENTER
 *
 *	Test Data: Policy Number - No Test Data is needed for the test script
 *				(Use of test data as an input for this test case. You can provide different data sets with exact values to be used as an input.)
 *	
 *	Expected Result:  Accepted 10 diget Numeric ID
 *			(What should be the system output after test execution? Describe the expected result in detail including message/error that should be displayed on screen.)
 *	
 *	Actual result: ERROR - Page is destroyed
 *			(Actual test result should be filled after test execution. Describe system behavior after test execution.)
 *
 *	Pass/Fail: Fail

 *  Result: ERROR - Page is destroyed
 *  
 *  Addtional Data: Console Output
 *  Graphics 6100
FBO Texture Target: TEXTURE_2DThe resource at "https://ssl.google-analytics.com/ga.js" was blocked because tracking protection is enabled.[Learn More]PolicySelection.aspx
ReferenceError: _gat is not defined
Tracker.js:6:9
NetworkError: A network error occurred.(unknown)
Use of getPreventDefault() is deprecated.  Use defaultPrevented instead.jquery-1.6.4.min.js:3:3869
The resource at "https://ssl.google-analytics.com/ga.js" was blocked because tracking protection is enabled.[Learn More]www.bhhc.com
Use of getPreventDefault() is deprecated.  Use defaultPrevented instead.jquery.js:2:48471
downloadable font: download failed (font-family: "LatoBlack" style:normal weight:normal stretch:normal src index:0): status=2147746065 source: https://www.bhhc.com/fonts/Lato-Bla.ttfmain.css:95:12
downloadable font: download failed (font-family: "Lato" style:normal weight:normal stretch:normal src index:0): status=2147746065 source: https://www.bhhc.com/fonts/Lato-Reg.ttfmain.css:90:12
downloadable font: kern: bad table version, table discarded (font-family: "Anton" style:normal weight:normal stretch:normal src index:1) source: https://fonts.gstatic.com/s/anton/v7/TS7BJzhU7AKgPn9R0AejYKCWcynf_cDxXwCLxiixG1c.woff2css:13:12
When cancelling a request for https://web.bhhc.com/favicon.ico because the inner window was destroyed or a new favicon was loaded for it, it was already canceled!
PlacesUIUtils.jsm:109

        
 *  
 *  
 *  */


package bhhc;

import java.sql.Timestamp;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.bhhc_expresspaymenthome;
import PageObjects.bhhc_policy;

public class bhhc003_ExpressPayment {

	private static Logger Log = Logger.getLogger(Logger.class.getName());
    private static StringBuffer verificationErrors = new StringBuffer();

    static java.util.Date date= new java.util.Date();
    static Timestamp t = new Timestamp (date.getTime());
    static String dateNow = t.toString().replace(":","_");
    String obj = "Screenshots";
    String className = this.getClass().getSimpleName();
    
    
    @Before
    public void setUp() throws Exception {
           
       System.out.println("Running Regression Test " +className+dateNow);
       Log.info("Started Test Case Regression Test " +className+dateNow);
       DOMConfigurator.configure("log4j.xml");
            
         // /Users/miloonken/dev
       System.setProperty("webdriver.chrome.driver", "/Users/miloonken/dev/chromedriver");

  		
  		// Create a new instance of the driver
  		WebDriver driver = new ChromeDriver();
  		
  		
  		driver.get("https://www.google.com/");
  		
  		driver.close();
  		
    }

    @Test
    public void ExpressPolicyPayment() throws Exception {

    	
        WebDriver driver = new ChromeDriver();
        
        driver.get((String) bhhc_expresspaymenthome.HomePageURl(obj));
        
        bhhc_policy.PolicyNumber(driver).click();
        bhhc_policy.PolicyNumber(driver).sendKeys("ABCD1234");
        bhhc_policy.PolicyNumber(driver).sendKeys(Keys.RETURN);
        
        WebDriverWait wait = new WebDriverWait(driver, 10);
        @SuppressWarnings("unused")
		WebElement element = (WebElement) wait.until(ExpectedConditions.alertIsPresent());
     
        // Check the presence of alert
        Alert alert = driver.switchTo().alert();
        
        // if present consume the alert
        alert.accept();

        driver.close();
    
    }
	@AfterClass
	 
	public static void  afterClass() throws Exception {
	 
	System.out.println("Finished Test Case");
	
	
	}      
	 
	public static void verification () {
	 
	String verificationErrorString = verificationErrors.toString();
	 
	        if (!"".equals(verificationErrorString)) {
	 
	                }
	        
	       
	}
	 
	 
	@After
	 
	public void tearDown() throws Exception {
	 
	
	}
	
}
