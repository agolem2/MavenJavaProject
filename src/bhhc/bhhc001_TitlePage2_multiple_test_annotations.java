
/* 	
 *  Test case ID: bhhc001_TitlePage
 * 
 * 	Test priority (High): 

 *	Module Name – bhhc001_TitlePage
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
 *	Test Title/Name: bhhc001_TitlePage
 *
 *	Test Summary/Description: 
 *		This Test Script Validates bhhc001_TitlePage from the bhhc main webpage 
 *	Pre-condition: Any prerequisite that must be fulfilled before execution of this test case. List all pre-conditions in order to successfully execute this test case.
 *	
 *	Dependencies: 
 *	
 *	Test Steps: List all test execution steps in detail. Write test steps in the order in which these should be executed. Make sure to provide as much details as you can. Tip – to efficiently manage test case with lesser number of fields use this field to describe test conditions, test data and user roles for running test.	
 *	
 *	Step 1 - Navigate to WebPage http://www.bhhc.com
 *	Step 2 - Verify the title of the page as (Home - Berkshire Hathaway Homestate Companies)
 *	Step 3 - Exit/Close the web driver
 *	Step 4 - Exit/Quit the web driver
 *
 *	Test Data: N/A - No Test Data is needed for the test script
 *				(Use of test data as an input for this test case. You can provide different data sets with exact values to be used as an input.)
 *	
 *	Expected Result:  
 *			(What should be the system output after test execution? Describe the expected result in detail including message/error that should be displayed on screen.)
 *	
 *	Actual result: 
 *			(Actual test result should be filled after test execution. Describe system behavior after test execution.)
 *
 *	Pass/Fail: 
 * 
 * */


package bhhc;

import static org.junit.Assert.*;

import java.sql.Timestamp;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.TestListener;
import utiity.ScreenShotOnFailure;
import utiity.WebDriverBrowserFactory;

public class bhhc001_TitlePage2_multiple_test_annotations extends WebDriverBrowserFactory{
	
	private static Logger Log = Logger.getLogger(Logger.class.getName());
	 
    private static StringBuffer verificationErrors = new StringBuffer();

    static java.util.Date date= new java.util.Date();
    static Timestamp t = new Timestamp (date.getTime());
    static String dateNow = t.toString().replace(":","_");
    String obj = "Screenshots";
    String className = this.getClass().getSimpleName();
    String actualTitle; 
   
    @Rule
    public ScreenShotOnFailure ScreenshotRule = new ScreenShotOnFailure();
    public TestName testName = new TestName();
    
    @Before
    public void setUp() throws Exception {
           
       System.out.println("Running Regression Test " +className+dateNow);
       Log.info("Started Test Case Regression Test " +className+dateNow);
       DOMConfigurator.configure("log4j.xml");
            
         // /Users/miloonken/dev
       System.setProperty("webdriver.chrome.driver", "/Users/miloonken/dev/chromedriver");

  		
  		// Create a new instance of the driver
  		WebDriver driver = new ChromeDriver();
  		
  		driver.get("https://www.bhhc.com/");
  		  		
  		 String BuildNumber = driver.findElement(By.cssSelector("#divhlp > p > a:nth-child(1)")).getText();
         System.out.println(" Test Case " + className + "  " + testName.getMethodName() + " Against Build-" + BuildNumber + " Date:  " + dateNow);

  		
    
	}


	@Test
	public void TitlePage() {
		
		// Optional, if not specified, WebDriver will search your path for chromedriver.
		
		// /Users/miloonken/dev
		System.setProperty("webdriver.chrome.driver", "/Users/miloonken/dev/chromedriver");

		
		// Create a new instance of the Firefox driver
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.bhhc.com/");
		
		// This step validates the WebPage is available and the Title Page is consistant without changes. 
		
		// Maximize the window.
		driver.manage().window().maximize();
		
		String actualTitle = driver.getTitle();
  		String expectedTitle = "Home - Berkshire Hathaway Homestate Companies";
  		
  		System.out.println("Running Regression Test " +className+dateNow);
  		System.out.println("ActualTitle is" +actualTitle);
  		
  		assertEquals(actualTitle, expectedTitle);
  	
			
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
	@Ignore
	    public void tearDown() throws Exception {
	String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	        System.out.print(verificationErrorString);
	    }

	    Result result = JUnitCore.runClasses(TestListener.class);
	    System.out.println("Completed Test Case " + className + " Date:  " + dateNow);
	    
	    if (result.wasSuccessful())
	        System.out.println("Test run was successful");
	    else {
	        System.out.println("Test run was NOT successful: ");
	        for (Failure f: result.getFailures())
	            System.out.println(f.getMessage() + " - Trace: " + f.getTrace() + " - Exception: " +
	                f.getException() + " - " + f.getException().getStackTrace());

	       

	    }
	    //WebDriverBrowserFactory.driver.quit();
	   // driver.quit();

	    }

	
}
