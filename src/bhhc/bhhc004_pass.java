package bhhc;

import static org.junit.Assert.*;

import java.io.File;
import java.sql.Timestamp;
import org.junit.runners.Parameterized;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.TestListener;
import utiity.ScreenShotOnFailure;

@SuppressWarnings("unused")
public class bhhc004_pass {

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

    @Rule
    public ScreenShotOnFailure screenShotRule;
    
    @Test
    public void ExpressPolicyPayment() throws Exception {

    	
        WebDriver driver = new ChromeDriver();
                
        driver.get("https://www.google.com/");
        
        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";
        
        System.out.println(actualTitle);
        Thread.sleep(500);
        
        try {
        	 assertEquals(actualTitle, expectedTitle);
                        
    } catch (Error e) {
            System.out.println("Test Case Error");
            verificationErrors.append(e.toString());
            
   // take the screenshot
    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
   // now save the screenshot to a file some place
    FileUtils.copyFile(scrFile, new File("/Users/miloonken/dev/Documents/screenshot/screenshot"+className+dateNow+".png"));
    
            {
                    Assert.fail("Test failed : " + e.getMessage());
           
                    driver.switchTo().defaultContent();
            }
    }
    
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
	    
	    }

	
}
